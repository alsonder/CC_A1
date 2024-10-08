import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// Directly use the hardcoded filename
		String filename = "prog.txt";

		// Create a CharStream to read the contents of prog.txt
		CharStream input = CharStreams.fromFileName(filename);

		// Create a lexer and parser for the provided grammar
		ccLexer lexer = new ccLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ccParser parser = new ccParser(tokens);

		// Parse the input file based on the "start" rule
		ParseTree parseTree = parser.start();

		// Create a PrettyPrintVisitor instance and generate the HTML content
		PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
		String htmlContent = prettyPrintVisitor.visit(parseTree);


		// Save the generated HTML to a file
		try (PrintWriter out = new PrintWriter("output.html")) {
			out.println(htmlContent);
		}
		System.out.println("HTML output generated successfully: output.html");
	}
}

class PrettyPrintVisitor extends AbstractParseTreeVisitor<String> implements ccVisitor<String> {

	public StringBuilder htmlContent;

	public PrettyPrintVisitor() {
		htmlContent = new StringBuilder();
		// Initialize the HTML content with necessary headers and boilerplate
		htmlContent.append("<!DOCTYPE html>\n<html><head><title>Hardware Specification</title>\n");
		htmlContent.append("<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n");
		htmlContent.append("<script type=\"text/javascript\" id=\"MathJax-script\" async ");
		htmlContent.append("src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\"></script>\n");
		htmlContent.append("</head><body>\n");
	}

	@Override
	public String visitStart(ccParser.StartContext ctx) {
		// Visit all children of the start rule to collect HTML content
		visitChildren(ctx);
		htmlContent.append("</body></html>\n"); // Close the HTML body and document
		return htmlContent.toString();
	}

	@Override
	public String visitName(ccParser.NameContext ctx) {
		//Add the name as an <H1> heading
		String name = ctx.IDENT().getText();
		htmlContent.append("<h1>").append(name).append("</h1>\n");
		return null;
	}

	@Override
	public String visitInputs(ccParser.InputsContext ctx) {
        htmlContent.append("<h2>Inputs</h2>\n");
        for (var id : ctx.IDENT()) {
            htmlContent.append(id.getText()).append("<br>\n");
        }
        return null;

	}

	@Override
	public String visitOutputs(ccParser.OutputsContext ctx) {
		htmlContent.append("<h2>Outputs</h2>\n");
		for (var id : ctx.IDENT()) {
			htmlContent.append(id.getText()).append("<br>\n");
		}
		return null;
	}

	@Override
	public String visitLatches(ccParser.LatchesContext ctx) {
		htmlContent.append("<h2>Latches</h2>\n");
		for (var id : ctx.IDENT()) {
			htmlContent.append(id.getText()).append("<br>\n");
		}
		return null;
	}

	@Override
	public String visitDef(ccParser.DefContext ctx) {
		// Display the definition in LaTeX format
		String func = ctx.f.getText();
		String expression = visit(ctx.e);
		htmlContent.append("<h2>Definitions</h2>\n");
		htmlContent.append("\\(\\mathit{").append(func).append("} = ").append(expression).append("\\)<br>\n");
		return null;
	}

	@Override
	public String visitUpdates(ccParser.UpdatesContext ctx) {
		htmlContent.append("<h2>Updates</h2>\n");
		for (var stmt : ctx.st) {
			htmlContent.append(visit(stmt)).append("<br>\n");
		}
		return null;
	}

	@Override
	public String visitSiminputs(ccParser.SiminputsContext ctx) {
		htmlContent.append("<h2>Simulation Inputs</h2>\n");
		for (var stmt : ctx.st) {
			htmlContent.append("<b>").append(stmt.getChild(0).getText()).append("</b>: ");
			htmlContent.append(stmt.getChild(2).getText()).append("<br>\n");
		}
		return null;
	}

	@Override
	public String visitAssignFunction(ccParser.AssignFunctionContext ctx) {

		return null;
	}

	@Override
	public String visitFuncAssign(ccParser.FuncAssignContext ctx) {
		return null;
	}

	@Override
	public String visitAssignExp(ccParser.AssignExpContext ctx) {
		String varName = ctx.x.getText();
		String expr = visit(ctx.e1);
		return "\\( \\mathrm{" + varName + "} \\leftarrow " + expr + " \\)";
	}

	@Override
	public String visitFunctionCall(ccParser.FunctionCallContext ctx) {
		String functionName = ctx.x.getText();
		String args = visit(ctx.e1);
		return "\\mathit{" + functionName + "}(" + args + ")";
	}


	public String visitSingleArgFunctionCall(ccParser.SingleArgFunctionCallContext ctx) {
		return null;
	}

	@Override
	public String visitExpressionsList(ccParser.ExpressionsListContext ctx) {
		StringBuilder exprs = new StringBuilder();
		for (int i = 0; i < ctx.exp().size(); i++) {
			exprs.append(visit(ctx.exp(i)));
			if (i < ctx.exp().size() - 1) {
				exprs.append(", ");
			}
		}
		return exprs.toString();
	}

	@Override
	public String visitPlusExp(ccParser.PlusExpContext ctx) {
		return null;
	}

	@Override
	public String visitNotExp(ccParser.NotExpContext ctx) {
		return "(\\neg " + visit(ctx.e1) + ")";
	}

	@Override
	public String visitAndExp(ccParser.AndExpContext ctx) {
		return "(" + visit(ctx.e1) + " \\wedge " + visit(ctx.e2) + ")";
	}

	@Override
	public String visitOrExp(ccParser.OrExpContext ctx) {
		return "(" + visit(ctx.e1) + " \\vee " + visit(ctx.e2) + ")";
	}

	@Override
	public String visitIdentExp(ccParser.IdentExpContext ctx) {
		return "\\mathrm{" + ctx.getText() + "}";
	}

	@Override
	public String visitConstExp(ccParser.ConstExpContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitParenthesizedExp(ccParser.ParenthesizedExpContext ctx) {
		return "(" + visit(ctx.e1) + ")";
	}

	@Override
	public String visitAssignIdentFunc(ccParser.AssignIdentFuncContext ctx) {
		String varName = ctx.x.getText();
		String funcCall = visit(ctx.f);
		return "\\( \\mathrm{" + varName + "} \\leftarrow " + funcCall + " \\)";
	}

}

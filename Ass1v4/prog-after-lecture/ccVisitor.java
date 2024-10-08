// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ccParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ccParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(ccParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(ccParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(ccParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#siminputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFunction(ccParser.AssignFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncAssign}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAssign(ccParser.FuncAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(ccParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignIdentFunc}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIdentFunc(ccParser.AssignIdentFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link ccParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ccParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleArgFunctionCall}
	 * labeled alternative in {@link ccParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgFunctionCall(ccParser.SingleArgFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionsList}
	 * labeled alternative in {@link ccParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsList(ccParser.ExpressionsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExp(ccParser.PlusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(ccParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(ccParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(ccParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(ccParser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExp(ccParser.ParenthesizedExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExp(ccParser.IdentExpContext ctx);
}
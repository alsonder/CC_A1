// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccParser}.
 */
public interface ccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ccParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ccParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ccParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ccParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(ccParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(ccParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(ccParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(ccParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(ccParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(ccParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(ccParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#siminputs}.
	 * @param ctx the parse tree
	 */
	void enterSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#siminputs}.
	 * @param ctx the parse tree
	 */
	void exitSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunction(ccParser.AssignFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunction(ccParser.AssignFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncAssign}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncAssign(ccParser.FuncAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncAssign}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncAssign(ccParser.FuncAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(ccParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(ccParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignIdentFunc}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignIdentFunc(ccParser.AssignIdentFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignIdentFunc}
	 * labeled alternative in {@link ccParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignIdentFunc(ccParser.AssignIdentFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link ccParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ccParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link ccParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ccParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleArgFunctionCall}
	 * labeled alternative in {@link ccParser#func}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgFunctionCall(ccParser.SingleArgFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleArgFunctionCall}
	 * labeled alternative in {@link ccParser#func}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgFunctionCall(ccParser.SingleArgFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionsList}
	 * labeled alternative in {@link ccParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsList(ccParser.ExpressionsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionsList}
	 * labeled alternative in {@link ccParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsList(ccParser.ExpressionsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlusExp(ccParser.PlusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlusExp(ccParser.PlusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(ccParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(ccParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(ccParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(ccParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(ccParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(ccParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(ccParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(ccParser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExp(ccParser.ParenthesizedExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExp(ccParser.ParenthesizedExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdentExp(ccParser.IdentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdentExp(ccParser.IdentExpContext ctx);
}
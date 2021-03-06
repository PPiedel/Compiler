// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PParser}.
 */
public interface PListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(PParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(PParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(PParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(PParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(PParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(PParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#indexingExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexingExpression(PParser.IndexingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#indexingExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexingExpression(PParser.IndexingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#returnst}.
	 * @param ctx the parse tree
	 */
	void enterReturnst(PParser.ReturnstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#returnst}.
	 * @param ctx the parse tree
	 */
	void exitReturnst(PParser.ReturnstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(PParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(PParser.ReadContext ctx);
}
package main;// Generated from /home/ppiedel/IdeaProjects/Compiler/src/main/jfk/P.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link PParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(PParser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(PParser.Variable_definitionContext ctx);
}
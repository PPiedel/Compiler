// Generated from /home/ppiedel/IdeaProjects/Front/front/src/run/P.g4 by ANTLR 4.7
package main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a run tree produced by
 * {@link PParser}.
 */
public interface PListener extends ParseTreeListener {
	/**
	 * Enter a run tree produced by {@link PParser#program}.
	 * @param ctx the run tree
	 */
	void enterProgram(PParser.ProgramContext ctx);
	/**
	 * Exit a run tree produced by {@link PParser#program}.
	 * @param ctx the run tree
	 */
	void exitProgram(PParser.ProgramContext ctx);
	/**
	 * Enter a run tree produced by {@link PParser#body}.
	 * @param ctx the run tree
	 */
	void enterBody(PParser.BodyContext ctx);
	/**
	 * Exit a run tree produced by {@link PParser#body}.
	 * @param ctx the run tree
	 */
	void exitBody(PParser.BodyContext ctx);
	/**
	 * Enter a run tree produced by {@link PParser#statement}.
	 * @param ctx the run tree
	 */
	void enterStatement(PParser.StatementContext ctx);
	/**
	 * Exit a run tree produced by {@link PParser#statement}.
	 * @param ctx the run tree
	 */
	void exitStatement(PParser.StatementContext ctx);
	/**
	 * Enter a run tree produced by {@link PParser#expression}.
	 * @param ctx the run tree
	 */
	void enterExpression(PParser.ExpressionContext ctx);
	/**
	 * Exit a run tree produced by {@link PParser#expression}.
	 * @param ctx the run tree
	 */
	void exitExpression(PParser.ExpressionContext ctx);
	/**
	 * Enter a run tree produced by {@link PParser#assignment}.
	 * @param ctx the run tree
	 */
	void enterAssignment(PParser.AssignmentContext ctx);
	/**
	 * Exit a run tree produced by {@link PParser#assignment}.
	 * @param ctx the run tree
	 */
	void exitAssignment(PParser.AssignmentContext ctx);
	/**
	 * Enter a run tree produced by {@link PParser#variable_declaration}.
	 * @param ctx the run tree
	 */
	void enterVariable_declaration(PParser.Variable_declarationContext ctx);
	/**
	 * Exit a run tree produced by {@link PParser#variable_declaration}.
	 * @param ctx the run tree
	 */
	void exitVariable_declaration(PParser.Variable_declarationContext ctx);
}
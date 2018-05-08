// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PParser#variable_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(PParser.Variable_definitionContext ctx);
}
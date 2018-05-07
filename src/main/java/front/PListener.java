// Generated from /home/ppiedel/IdeaProjects/Compiler/src/main/java/P.g4 by ANTLR 4.7
package front;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PParser}.
 */
public interface PListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PParser.VariableContext ctx);
}
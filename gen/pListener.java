// Generated from /home/ppiedel/IdeaProjects/Compiler/src/p.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pParser}.
 */
public interface pListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(pParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(pParser.VariableContext ctx);
}
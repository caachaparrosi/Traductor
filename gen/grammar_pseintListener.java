// Generated from C:/Users/Camilo/IdeaProjects/Traductor/grammar\grammar_pseint.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammar_pseintParser}.
 */
public interface grammar_pseintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammar_pseintParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(grammar_pseintParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pseintParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(grammar_pseintParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pseintParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(grammar_pseintParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pseintParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(grammar_pseintParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pseintParser#asignment_var}.
	 * @param ctx the parse tree
	 */
	void enterAsignment_var(grammar_pseintParser.Asignment_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pseintParser#asignment_var}.
	 * @param ctx the parse tree
	 */
	void exitAsignment_var(grammar_pseintParser.Asignment_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pseintParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammar_pseintParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pseintParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammar_pseintParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pseintParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(grammar_pseintParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pseintParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(grammar_pseintParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_pseintParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grammar_pseintParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_pseintParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grammar_pseintParser.FactorContext ctx);
}
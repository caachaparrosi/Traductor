// Generated from C:/Users/Camilo/IdeaProjects/Traductor/grammar\grammar_pseint.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammar_pseintParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammar_pseintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammar_pseintParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(grammar_pseintParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pseintParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(grammar_pseintParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pseintParser#asignment_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignment_var(grammar_pseintParser.Asignment_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pseintParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grammar_pseintParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pseintParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(grammar_pseintParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammar_pseintParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(grammar_pseintParser.FactorContext ctx);
}
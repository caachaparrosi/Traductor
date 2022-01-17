import com.sun.xml.internal.bind.v2.model.core.ID;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Traductor extends grammar_pseintBaseListener {
    @Override
    public void enterTest(grammar_pseintParser.TestContext ctx) {
        System.out.println("def " + ctx.ID() + ":");
    }

    @Override
    public void exitTest(grammar_pseintParser.TestContext ctx) {

    }

    @Override
    public void enterAsignment_var(grammar_pseintParser.Asignment_varContext ctx) {
        super.enterAsignment_var(ctx);
    }

    @Override
    public void enterInstructions(grammar_pseintParser.InstructionsContext ctx) {

    }

    @Override
    public void exitInstructions(grammar_pseintParser.InstructionsContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}

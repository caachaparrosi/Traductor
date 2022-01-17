import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try{
            grammar_pseintLexer lexer;
            if (args.length>0)
                lexer = new grammar_pseintLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new grammar_pseintLexer(CharStreams.fromStream(System.in));

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            grammar_pseintParser parser = new grammar_pseintParser(tokens);

            ParseTree tree = parser.test();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new Traductor(), tree);
            System.out.println(); // print a \n after translation


        } catch (Exception e){
            System.err.println("Error (Main)" + e);
        }
    }
}
    
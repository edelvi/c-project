package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import abstractInterpreter.CLangLexer;
import abstractInterpreter.CLangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import interpreter.VisitorInterpreter;

public class Main {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(currentDir);
        int r = chooser.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileReader reader = new FileReader(file);
                ANTLRInputStream input = new ANTLRInputStream(reader);
                CLangLexer lexer = new CLangLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CLangParser parser = new CLangParser(tokens);
                ParseTree tree = parser.program();
               VisitorInterpreter int_visitor = new VisitorInterpreter();
                int_visitor.visit(tree);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //System.out.println(tree.toStringTree(parser));
        }
        System.exit(0);



            }


}

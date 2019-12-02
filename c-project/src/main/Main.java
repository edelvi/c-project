package main;

import java.io.File;
import java.io.FileReader;

import abstractInterpreter.CLangLexer;
import abstractInterpreter.CLangParser;
import interpreter.VisitorInterpreter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        File file = new File("src/test/test2.c");
        FileReader reader = new FileReader(file);
        ANTLRInputStream input = new ANTLRInputStream(reader);
        CLangLexer lexer = new CLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLangParser parser = new CLangParser(tokens);
        ParseTree tree = parser.program();
        VisitorInterpreter interpeterVisitor = new VisitorInterpreter();
        interpeterVisitor.visit(tree);
        System.exit(0);


    }

}

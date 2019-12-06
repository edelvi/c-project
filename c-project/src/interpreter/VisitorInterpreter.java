package interpreter;

import abstractInterpreter.CLangParser;
import symbolTable.*;

import symbolTable.STNode;
import symbolTable.STNodeType;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import abstractInterpreter.CLangBaseVisitor;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static abstractInterpreter.CLangParser.*;



public class VisitorInterpreter extends CLangBaseVisitor<STNode> {

    private HashMap<String, ParseTree> userMethods;
    private Scope<STNode> globalScope = new Scope<>(), actualScope = globalScope;



    @Override
    public STNode visitProgram(ProgramContext ctx) {
        System.out.println("Starting interpreter...");
        visitChildren(ctx);
        System.out.println("Ending interpreter...");
        return null;
    }

    @Override
    public STNode visitPrintfStatement(PrintfStatementContext ctx) {

        System.out.println("Salida printf = "+ctx.expression().getText());
        System.out.println(visit(ctx.expression()));
        return null;
    }

    //Checked
    @Override
    public STNode visitScanfStatement(CLangParser.ScanfStatementContext ctx) {
        Scanner s = new Scanner(System.in);
        STNode node;
        System.out.println("Scanff visited");
        int n = ctx.argumentScanf().getChildCount();
        int v = 0;
        System.out.println("childrens of ArgumentsScanf " + n);
        //getToken(CLangParser.ID, i
       for (int i = 0; i < n; i++) {
           //System.out.println(ctx.argumentScanf().getChild(i).toString().charAt(0));
           if(ctx.argumentScanf().getChild(i).toString().charAt(0) != ',') {
               //System.out.println("Veces que entra");
               //System.out.println("id" + ctx.argumentScanf().ID(v).toString());
               TerminalNode id = ctx.argumentScanf().ID(v);
              // System.out.println("ARGS" + id.getText());
               String line = s.nextLine().trim();
               try {//int
                   node = new STNode(STNodeType.INT, Integer.parseInt(line));
               } catch (java.lang.NumberFormatException exInt) {
                   try {//testing if the given input is a float
                       node = new STNode(STNodeType.FLOAT, Float.parseFloat(line));
                   } catch (java.lang.NumberFormatException exFloat) {
                       try {//testing if the given input is a Double
                           node = new STNode(STNodeType.DOUBLE, Double.parseDouble(line));
                       } catch (java.lang.NumberFormatException exDouble) {
                           try {//testing if the given input is a Short

                               node = new STNode(STNodeType.SHORT, Short.parseShort(line));
                           } catch (java.lang.NumberFormatException exShort) {
                               try {//testing if the given input is a long
                                   node = new STNode(STNodeType.LONG, Long.parseLong(line));
                               } catch (java.lang.NumberFormatException exLong) {
                                   node = new STNode(STNodeType.CHAR, line);
                               }
                           }
                       }
                   }

               }
               actualScope.put(id.getText(), node);
               System.out.println("Valor guardado en el scope para variable: " + id.getText() + " Valor: " + actualScope.get(id.getText()).getValue().toString());
               ++v;
           } else
               continue;

           }

        return null;

    }

    //Test Break and Continue (These visit still doesn't work properly)
    @Override
    public STNode visitBreakStatement(CLangParser.BreakStatementContext ctx) {
        System.out.println("BreakStatement visited");
        if (ctx.BREAK() != null) {

            System.out.println("Parent text: --- " + ctx.getParent().getText());
            /*
            for (int i = 0; i < ctx.getParent().getChildCount(); i++){
                System.out.println(ctx.getParent().getChild(i).getText());
            }*/

        } else
            visit(ctx.CONTINUE());
        return null;
    }


    //Checked
    @Override
    public STNode visitWhileStatement(WhileStatementContext ctx) {
        System.out.println("WhileStatement Visited");
        STNode exp = visit(ctx.expression());
        while (!(exp.getValue().equals(0))) {
            visit(ctx.statement());
            exp = visit(ctx.expression());
        }
        return null;
    }


    //Checked
    @Override
    public STNode visitExprParenthesis(CLangParser.ExprParenthesisContext ctx) {
        System.out.println("[ExprParenthesis visited] ");
        return visit(ctx.expression());
    }

    //Checked (but we see the other version )
    @Override
    public STNode visitExprCnt(CLangParser.ExprCntContext ctx) {
        System.out.println("[Constante visited] ");
        return visit(ctx.constant());

    }

    //Checked
    @Override
    public STNode visitIntCnt(CLangParser.IntCntContext ctx) {
        System.out.println("IntConstant visited");
        return new STNode(STNodeType.INT, Integer.parseInt(ctx.INT_CONSTANT().getText()));
    }
    //Checked
    @Override
    public STNode visitCharCnt(CLangParser.CharCntContext ctx) {
        System.out.println("CharConstant visited");
        return new STNode(STNodeType.CHAR, ctx.CHAR_CONSTANT().getText());
    }
    //Checked
    @Override
    public STNode visitFloatCnt(CLangParser.FloatCntContext ctx) {
        System.out.println("FloatConstant visited");
        return new STNode(STNodeType.FLOAT, ctx.FLOAT_CONSTANT().getText());
    }
    //When a string constant is visited, we don't get an STNode because String isn't a C data type
    @Override
    public STNode visitStrLCnt(CLangParser.StrLCntContext ctx){
        System.out.println("StrLiteralConstant visited");
        System.out.println(ctx.STRING_LITERAL().getText().substring(1,ctx.STRING_LITERAL().getText().length()-1));
        return null;
    }

    //Checked
    @Override
    public STNode visitExprId(CLangParser.ExprIdContext ctx) {
        String ecc = ctx.ID().getText();
        System.out.println("[ID visited] " + ecc);

        return actualScope.get(ecc);

    }

    //Checked
    @Override
    public STNode visitExprRel(CLangParser.ExprRelContext ctx) {
        System.out.println("ExprRel visited");
        STNode left = visit(ctx.left);
        STNode right = visit(ctx.right);

        int rest = 0;
        String op = ctx.op.getText();
        double left_val;
        double right_val;

        if (left.getType() == STNodeType.CHAR || right.getType() == STNodeType.CHAR) {
            left_val = (int) left.getValue().toString().charAt(0);
            right_val = (int) right.getValue().toString().charAt(0);
        } else {
            left_val = ((Number) left.getValue()).doubleValue();
            right_val = ((Number) right.getValue()).doubleValue();
        }

        if (op.equals(">")) {
            rest = left_val > right_val ? 1 : 0;

        } else if (op.equals(">=")) {
            rest = left_val >= right_val ? 1 : 0;

        } else if (op.equals("<")) {
            rest = left_val < right_val ? 1 : 0;

        } else if (op.equals("<=")) {
            rest = left_val <= right_val ? 1 : 0;

        } else if (op.equals("==")) {
            rest = left_val == right_val ? 1 : 0;

        } else {
            rest = left_val != right_val ? 1 : 0;

        }


        return new STNode(STNodeType.INT, rest);

    }

    //Checked
    @Override
    public STNode visitExprAnd(ExprAndContext ctx) {
        STNode node_1 = visit(ctx.expression(0));
        STNode node_2 = visit(ctx.expression(1));

        return new STNode(STNodeType.INT, ((int) node_1.getValue() != 0 && (int) node_2.getValue() != 0) ? 1 : 0);
    }

    //Checked
    @Override
    public STNode visitIfStatement(IfStatementContext ctx) {
        System.out.println("Visiting IfStatement");
        System.out.println("Children of IfStatement " + ctx.getChildCount());
        STNode exp = visit(ctx.expression());
        int value = (int) exp.getValue();

        if (value != 0) {
            System.out.println("[IfStatement visited]");
            visit(ctx.statement(0));
        } else if (ctx.ELSE() != null) {
            System.out.println("[Else visited]");
            visit(ctx.statement(1));
        }
        return null;

    }

    //Checked
    @Override
    public STNode visitExprArit(CLangParser.ExprAritContext ctx) {
        System.out.println("ExprArit visited");
        STNode left = visit(ctx.left);
        STNode right = visit(ctx.right);
        double rest = 0;
        String op = ctx.op.getText();
        switch (op.charAt(0)) {
            case '*': {
                rest = (((Number) left.getValue()).doubleValue() * ((Number) right.getValue()).doubleValue());
                break;
            }
            case '/': {
                rest = ((Number) left.getValue()).doubleValue() / ((Number) right.getValue()).doubleValue();
                break;
            }
            case '%': {
                rest = ((Number) left.getValue()).doubleValue() % ((Number) right.getValue()).doubleValue();
                break;
            }
            case '+': {
                rest = ((Number) left.getValue()).doubleValue() + ((Number) right.getValue()).doubleValue();
                break;
            }
            case '-': {
                rest = ((Number) left.getValue()).doubleValue() - ((Number) right.getValue()).doubleValue();
                break;
            }

        }

        if (left.getType() == STNodeType.DOUBLE || right.getType() == STNodeType.DOUBLE) {
            return new STNode(STNodeType.DOUBLE, rest);
        } else {
            if (left.getType() == STNodeType.FLOAT || right.getType() == STNodeType.FLOAT) {
                return new STNode(STNodeType.FLOAT, (float) rest);
            } else {
                if (left.getType() == STNodeType.LONG || right.getType() == STNodeType.LONG) {
                    return new STNode(STNodeType.LONG, (long) rest);
                } else {
                    if (((left.getType() == STNodeType.INT) || (left.getType() == STNodeType.CHAR)) || ((right.getType() == STNodeType.INT) || (right.getType() == STNodeType.CHAR))) {
                        return new STNode(STNodeType.INT, (int) rest);
                    }

                }
            }
        }


        return new STNode(STNodeType.SHORT, (short) rest);

    }


    //Checked
    @Override
    public STNode visitVarWithoutExpDeclaration(VarWithoutExpDeclarationContext ctx) {
        String varId = ctx.ID().getText();
        STNode newNode = null;
        VarDeclarationContext parent_cont = (VarDeclarationContext) ctx.getParent();
        switch (parent_cont.TYPE().getText()) {
            case "short":
                newNode = new STNode(STNodeType.SHORT, actualScope);
                break;
            case "int":
                newNode = new STNode(STNodeType.INT, actualScope);
                break;
            case "long":
                newNode = new STNode(STNodeType.LONG, actualScope);
                break;
            case "float":
                newNode = new STNode(STNodeType.FLOAT, actualScope);
                break;
            case "double":
                newNode = new STNode(STNodeType.DOUBLE, actualScope);
                break;
            case "char":
                newNode = new STNode(STNodeType.CHAR, actualScope);
                break;
        }
        actualScope.put(varId, newNode);



        System.out.println("VarWithoutExpDeclaration visited");
        return null;
    }

    //Checked
    @Override
    public STNode visitVarWithExpDeclaration(VarWithExpDeclarationContext ctx) {

        Scope thisScope;
        String varId;
        STNode newNode;
        thisScope = actualScope;
        varId = ctx.ID().getText();
        newNode = null;
        STNode node = visit(ctx.expression());
        VarDeclarationContext parent_cont = (VarDeclarationContext) ctx.getParent();
        switch (parent_cont.TYPE().getText()) {
            case "short":
                newNode = new STNode(STNodeType.SHORT, (short) node.getValue(), thisScope);
                break;
            case "int":
                newNode = new STNode(STNodeType.INT, (int) node.getValue(), thisScope);
                break;
            case "long":
                newNode = new STNode(STNodeType.LONG, (long) node.getValue(), thisScope);
                break;
            case "float":
                newNode = new STNode(STNodeType.FLOAT, (float) node.getValue(), thisScope);
                break;
            case "double":
                newNode = new STNode(STNodeType.DOUBLE, (double) node.getValue(), thisScope);
                break;
            case "char":
                newNode = new STNode(STNodeType.CHAR, (char) node.getValue(), thisScope);
                break;
        }
        thisScope.put(varId, newNode);

        System.out.println("VarWithExpDeclaration visited");
        return null;
    }

    //Checked
    //(It is pending the assignment to arrays in these way -> char a[] = "test\0")
    //In these way, u have first to declare the array with its size (Ex: char a[20];) and then u can give it values filling in one by one of the array's indexes (Ex: a[0] = 1;...etc)
    @Override
    public STNode visitArrayDeclaration(ArrayDeclarationContext ctx) {
        STNode newNode;
        String varId = null;


        newNode = null;
        STNode node = null;
        for (int i = 0; i < ctx.ID().size(); i++) {
            varId = ctx.ID(i).getText();
            node = visit(ctx.expression(i));
            switch (ctx.TYPE().getText()) {
                case "short":
                    newNode = new STNode(STNodeType.SHORT, new Short[(int) node.getValue()], actualScope);
                    break;
                case "int":
                    newNode = new STNode(STNodeType.INT, new Integer[(int) node.getValue()], actualScope);
                    break;
                case "long":
                    newNode = new STNode(STNodeType.LONG, new Long[(int) node.getValue()], actualScope);
                    break;
                case "float":
                    newNode = new STNode(STNodeType.FLOAT, new Float[(int) node.getValue()], actualScope);
                    break;
                case "double":
                    newNode = new STNode(STNodeType.DOUBLE, new Double[(int) node.getValue()], actualScope);
                    break;
                case "char":
                    newNode = new STNode(STNodeType.CHAR, new Character[(int) node.getValue()], actualScope);
                    break;
            }
            System.out.println("Array declaration visited");
            actualScope.put(varId, newNode);
        }
        return null;
    }


    //It works but is pending to inprove the code in order to add more type checks
    //These code is temporal
    public STNode visitAssignmentExpression(AssignmentExpressionContext ctx) {

        System.out.println("visiting assignment expression");
        STNode exp = visit(ctx.expression());
        STNode node;
        Object exp_value = new Object();
        exp_value = exp.getValue();
        Object id_value = new Object();

        String id;
        String op = ctx.assignmentOperator().getText();
        char type;
        Number type_value_exp;//para simplificar los try catch
        Number type_value_id;

        if (ctx.unaryExpression().ID() != null){
            id_value = actualScope.get((ctx.unaryExpression().ID().getText())).getValue();
            id = ctx.unaryExpression().ID().getText();

            try {
                 type_value_exp = (int) exp_value;
                 type_value_id = (int) id_value;
                 type = 'i';
            } catch (java.lang.NumberFormatException extInt) {
                try {
                     type_value_exp = (double) exp_value;
                     type_value_id = (double) id_value;
                     type = 'd';
                } catch (java.lang.NumberFormatException extDouble){
                    try {
                        type_value_exp = (long) exp_value;
                        type_value_id = (long) id_value;
                        type = 'l';
                    } catch (java.lang.NumberFormatException extLong){
                        type_value_exp = (float) exp_value;
                        type_value_id = (float) id_value;
                        type = 'f';
                    }

                }

            }


            switch (op){
                case "=": {
                    actualScope.put(id, exp);
                    System.out.println("test = " + exp.getValue().toString());
                    break;
                }
                case "*=":{
                    if (type == 'i'){
                        node = new STNode(STNodeType.INT, (int)type_value_exp * (int)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test *= Int " + node.getValue().toString());
                    }else if (type == 'd'){
                        node = new STNode(STNodeType.DOUBLE, (double)type_value_exp * (double)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test *= Double " + node.getValue().toString());
                    }else if (type == 'l'){
                        node = new STNode(STNodeType.LONG, (long)type_value_exp * (long)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test *= Long " + node.getValue().toString());
                    }else {
                        node = new STNode(STNodeType.FLOAT, (float)type_value_exp * (float)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test *= Float " + node.getValue().toString());
                    }
                    break;
                }
                case "/=":{
                    if (type == 'i'){
                        node = new STNode(STNodeType.INT, (int)type_value_exp / (int)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test /= Int " + node.getValue().toString());
                    }else if (type == 'd'){
                        node = new STNode(STNodeType.DOUBLE, (double)type_value_exp / (double)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test /= Double " + node.getValue().toString());
                    }else if (type == 'l'){
                        node = new STNode(STNodeType.LONG, (long)type_value_exp / (long)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test /= Long " + node.getValue().toString());
                    }else {
                        node = new STNode(STNodeType.FLOAT, (float)type_value_exp / (float)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test /= Float " + node.getValue().toString());
                    }
                    break;
                }
                case "%=":{
                    if (type == 'i'){
                        node = new STNode(STNodeType.INT, (int)type_value_exp % (int)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test %= Int " + node.getValue().toString());
                    }else if (type == 'd'){
                        node = new STNode(STNodeType.DOUBLE, (double)type_value_exp % (double)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test %= Double " + node.getValue().toString());
                    }else if (type == 'l'){
                        node = new STNode(STNodeType.LONG, (long)type_value_exp % (long)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test %= Long " + node.getValue().toString());
                    }else {
                        node = new STNode(STNodeType.FLOAT, (float)type_value_exp % (float)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test %= Float " + node.getValue().toString());
                    }
                    break;
                }
                case "+=":{
                    if (type == 'i'){
                        node = new STNode(STNodeType.INT, (int)type_value_exp + (int)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test += Int " + node.getValue().toString());
                    }else if (type == 'd'){
                        node = new STNode(STNodeType.DOUBLE, (double)type_value_exp  + (double)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test += Double " + node.getValue().toString());
                    }else if (type == 'l'){
                        node = new STNode(STNodeType.LONG, (long)type_value_exp + (long)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test += Long " + node.getValue().toString());
                    }else {
                        node = new STNode(STNodeType.FLOAT, (float)type_value_exp + (float)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test += Float " + node.getValue().toString());
                    }
                    break;
                }
                case "-=":{
                    if (type == 'i'){
                        node = new STNode(STNodeType.INT, (int)type_value_exp - (int)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test -= Int " + node.getValue().toString());
                    }else if (type == 'd'){
                        node = new STNode(STNodeType.DOUBLE, (double)type_value_exp - (double)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test -= Double " + node.getValue().toString());
                    }else if (type == 'l'){
                        node = new STNode(STNodeType.LONG, (long)type_value_exp - (long)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test -= Long " + node.getValue().toString());
                    }else {
                        node = new STNode(STNodeType.FLOAT, (float)type_value_exp - (float)type_value_id);
                        actualScope.put(id, node);
                        System.out.println("test -= Float " + node.getValue().toString());
                    }
                    break;
                }
            }

        }else {//asignacion a un arreglo
                int index = (int) visit(ctx.unaryExpression().arrayIndexExpression().expression()).getValue();//index of the array
                node = actualScope.get(ctx.unaryExpression().arrayIndexExpression().ID().getText());//getting the node id[] from SymbolTable
                Object[] array = (Object[]) node.getValue();//saving the value of id[](couse the value is an array, see ArrayDeclaration)


                //try catch
            if (array[index] != null) {
                try {
                    type_value_exp = (int) exp_value;
                    type_value_id = (int) array[index];
                    type = 'i';
                } catch (java.lang.NumberFormatException extInt) {
                    try {
                        type_value_exp = (double) exp_value;
                        type_value_id = (double) array[index];
                        type = 'd';
                    } catch (java.lang.NumberFormatException extDouble) {
                        try {
                            type_value_exp = (long) exp_value;
                            type_value_id = (long) array[index];
                            type = 'l';
                        } catch (java.lang.NumberFormatException extLong) {
                            type_value_exp = (float) exp_value;
                            type_value_id = (float) array[index];
                            type = 'f';
                        }

                    }

                }

                switch (op){
                    case "=": {
                        array[index] = exp.getValue();//putting the new value on the right index
                        node.setValue(array);//updating node id[index] with the new value
                        actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                        System.out.println("test = array " + array[index].toString());
                        break;
                    }
                    case "*=":{//array[index] = array[index]*exp.getValue
                        if (type == 'i'){
                            array[index] = (int)array[index] * (int)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test *= array " + node.getValue().toString());
                        }else if (type == 'd'){
                            array[index] = (double)array[index] * (double)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test *= array " + node.getValue().toString());
                        }else if (type == 'l'){
                            array[index] = (long)array[index] * (long)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test *= array " + node.getValue().toString());
                        }else {
                            array[index] = (float)array[index] * (float)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test *= array " + node.getValue().toString());
                        }
                        break;
                    }
                    case "/=":{//array[index] = array[index]*exp.getValue
                        if (type == 'i'){
                            array[index] = (int)array[index] / (int)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test /= array " + node.getValue().toString());
                        }else if (type == 'd'){
                            array[index] = (double)array[index] / (double)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test /= array " + node.getValue().toString());
                        }else if (type == 'l'){
                            array[index] = (long)array[index] / (long)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test /= array " + node.getValue().toString());
                        }else {
                            array[index] = (float)array[index] / (float)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test /= array " + node.getValue().toString());
                        }
                        break;
                    }
                    case "%=":{//array[index] = array[index]*exp.getValue
                        if (type == 'i'){
                            array[index] = (int)array[index] % (int)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test %= array " + node.getValue().toString());
                        }else if (type == 'd'){
                            array[index] = (double)array[index] % (double)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test %= array " + node.getValue().toString());
                        }else if (type == 'l'){
                            array[index] = (long)array[index] % (long)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test %= array " + node.getValue().toString());
                        }else {
                            array[index] = (float)array[index] % (float)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test %= array " + node.getValue().toString());
                        }
                        break;
                    }
                    case "+=":{//array[index] = array[index]*exp.getValue
                        if (type == 'i'){
                            array[index] = (int)array[index] + (int)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test += array " + node.getValue().toString());
                        }else if (type == 'd'){
                            array[index] = (double)array[index] + (double)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test += array " + node.getValue().toString());
                        }else if (type == 'l'){
                            array[index] = (long)array[index] + (long)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test += array " + node.getValue().toString());
                        }else {
                            array[index] = (float)array[index] + (float)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test += array " + node.getValue().toString());
                        }
                        break;
                    }
                    case "-=":{//array[index] = array[index]*exp.getValue
                        if (type == 'i'){
                            array[index] = (int)array[index] - (int)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test -= array " + node.getValue().toString());
                        }else if (type == 'd'){
                            array[index] = (double)array[index] - (double)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test -= array " + node.getValue().toString());
                        }else if (type == 'l'){
                            array[index] = (long)array[index] - (long)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test -= array " + node.getValue().toString());
                        }else {
                            array[index] = (float)array[index] - (float)exp_value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            System.out.println("test -= array " + node.getValue().toString());
                        }
                        break;
                    }
                }

            }else {//si es null lo unico q puedo hacer es asignarle valor con =
                if (op.charAt(0) == '=') {
                    array[index] = exp.getValue();//putting the new value on the right index
                    node.setValue(array);//updating node id[index] with the new value
                    actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                    System.out.println("test = array " + array[index].toString());
                } else {
                    System.out.println("op " + op);
                    System.out.println("Operation denied over empty array");
                }

            }
            }


        /*
        if (ctx.unaryExpression().ID() != null) {
            switch (ctx.assignmentOperator().getText()) {
                case "=": {
                    actualScope.put(id, exp);
                    System.out.println("test = " + exp.getValue().toString());
                    break;
                }
                case "*=": {//add mult in here
                    try {//EN CASO QUE PONGAN CHAR YA LOS PARSEA COMO INT
                        int value = (int) exp_value * (int) id_value;
                        node = new STNode(STNodeType.INT, value);
                        actualScope.put(id, node);
                        System.out.println("test *= " + node.getValue().toString());
                    } catch (java.lang.NumberFormatException exInt) {
                        try {
                            double value = (double) exp_value * (double) id_value;
                            node = new STNode(STNodeType.DOUBLE, value);
                            actualScope.put(id, node);
                            System.out.println("test *= " + node.getValue().toString());
                        } catch (java.lang.NumberFormatException exDouble) {
                            try{
                                float value = (float) exp_value * (float) id_value;
                                node = new STNode(STNodeType.FLOAT, value);
                                actualScope.put(id, node);
                                System.out.println("test *= " + node.getValue().toString());
                            }catch (java.lang.NumberFormatException exFloat){
                                    long value = (long) exp_value * (long) id_value;
                                    node = new STNode(STNodeType.LONG, value);
                                    actualScope.put(id, node);
                                    System.out.println("test *= " + node.getValue().toString());

                            }//FALTA PARA SHORT PQ DA ERROR


                        }

                    }
                    break;
                }
                case "/=": {//add mult in here
                    try {//EN CASO QUE PONGAN CHAR YA LOS PARSEA COMO INT
                        int value = (int) exp_value / (int) id_value;
                        node = new STNode(STNodeType.INT, value);
                        actualScope.put(id, node);
                        System.out.println("test /= " + node.getValue().toString());
                    } catch (java.lang.NumberFormatException exInt) {
                        try {
                            double value = (double) exp_value / (double) id_value;
                            node = new STNode(STNodeType.DOUBLE, value);
                            actualScope.put(id, node);
                            System.out.println("test /= " + node.getValue().toString());
                        } catch (java.lang.NumberFormatException exDouble) {
                            try{
                                float value = (float) exp_value / (float) id_value;
                                node = new STNode(STNodeType.FLOAT, value);
                                actualScope.put(id, node);
                                System.out.println("test /= " + node.getValue().toString());
                            }catch (java.lang.NumberFormatException exFloat){
                                long value = (long) exp_value / (long) id_value;
                                node = new STNode(STNodeType.LONG, value);
                                actualScope.put(id, node);
                                System.out.println("test /= " + node.getValue().toString());

                            }//FALTA PARA SHORT PQ DA ERROR


                        }

                    }
                    break;
                }
                case "+=": {//add mult in here
                    try {//EN CASO QUE PONGAN CHAR YA LOS PARSEA COMO INT
                        int value = (int) exp_value + (int) id_value;
                        node = new STNode(STNodeType.INT, value);
                        actualScope.put(id, node);
                        System.out.println("test += " + node.getValue().toString());
                    } catch (java.lang.NumberFormatException exInt) {
                        try {
                            double value = (double) exp_value + (double) id_value;
                            node = new STNode(STNodeType.DOUBLE, value);
                            actualScope.put(id, node);
                            System.out.println("test += " + node.getValue().toString());
                        } catch (java.lang.NumberFormatException exDouble) {
                            try{
                                float value = (float) exp_value + (float) id_value;
                                node = new STNode(STNodeType.FLOAT, value);
                                actualScope.put(id, node);
                                System.out.println("test += " + node.getValue().toString());
                            }catch (java.lang.NumberFormatException exFloat){
                                long value = (long) exp_value + (long) id_value;
                                node = new STNode(STNodeType.LONG, value);
                                actualScope.put(id, node);
                                System.out.println("test += " + node.getValue().toString());

                            }//FALTA PARA SHORT PQ DA ERROR


                        }

                    }
                    break;
                }
                case "-=": {//add mult in here
                    try {//EN CASO QUE PONGAN CHAR YA LOS PARSEA COMO INT
                        int value = (int) exp_value - (int) id_value;
                        node = new STNode(STNodeType.INT, value);
                        actualScope.put(id, node);
                        System.out.println("test -= " + node.getValue().toString());
                    } catch (java.lang.NumberFormatException exInt) {
                        try {
                            double value = (double) exp_value - (double) id_value;
                            node = new STNode(STNodeType.DOUBLE, value);
                            actualScope.put(id, node);
                            System.out.println("test -= " + node.getValue().toString());
                        } catch (java.lang.NumberFormatException exDouble) {
                            try{
                                float value = (float) exp_value - (float) id_value;
                                node = new STNode(STNodeType.FLOAT, value);
                                actualScope.put(id, node);
                                System.out.println("test -= " + node.getValue().toString());
                            }catch (java.lang.NumberFormatException exFloat){
                                long value = (long) exp_value - (long) id_value;
                                node = new STNode(STNodeType.LONG, value);
                                actualScope.put(id, node);
                                System.out.println("test -= " + node.getValue().toString());

                            }//FALTA PARA SHORT PQ DA ERROR


                        }

                    }
                    break;
                }
                case "%=": {//add mult in here
                    try {//EN CASO QUE PONGAN CHAR YA LOS PARSEA COMO INT
                        int value = (int) exp_value % (int) id_value;
                        node = new STNode(STNodeType.INT, value);
                        actualScope.put(id, node);
                        System.out.println("test %= " + node.getValue().toString());
                    } catch (java.lang.NumberFormatException exInt) {
                        try {
                            double value = (double) exp_value % (double) id_value;
                            node = new STNode(STNodeType.DOUBLE, value);
                            actualScope.put(id, node);
                            System.out.println("test %= " + node.getValue().toString());
                        } catch (java.lang.NumberFormatException exDouble) {
                            try{
                                float value = (float) exp_value % (float) id_value;
                                node = new STNode(STNodeType.FLOAT, value);
                                actualScope.put(id, node);
                                System.out.println("test %= " + node.getValue().toString());
                            }catch (java.lang.NumberFormatException exFloat){
                                long value = (long) exp_value % (long) id_value;
                                node = new STNode(STNodeType.LONG, value);
                                actualScope.put(id, node);
                                System.out.println("test %= " + node.getValue().toString());

                            }//FALTA PARA SHORT PQ DA ERROR


                        }

                    }
                    break;
                }

            }//end switch

        }

           /*

        }*/

        return null;
    }

    //Checked
    @Override
    public STNode visitArrayIndexExpression(ArrayIndexExpressionContext ctx) {
        int index = (int) visit(ctx.expression()).getValue();
        Object[] array = (Object[]) actualScope.get(ctx.ID().getText()).getValue();
        return new STNode(actualScope.get(ctx.ID().getText()).getType(), array[index]);//returning the node on id[index]

    }





}
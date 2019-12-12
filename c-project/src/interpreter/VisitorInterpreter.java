package interpreter;

import abstractInterpreter.CLangParser;
import symbolTable.*;

import symbolTable.STNode;
import symbolTable.STNodeType;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

import abstractInterpreter.CLangBaseVisitor;

import javax.swing.plaf.nimbus.State;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import static abstractInterpreter.CLangParser.*;


public class VisitorInterpreter extends CLangBaseVisitor<STNode> {

    private HashMap<String, ParseTree> userMethods;
    private Scope<STNode> globalScope, actualScope;
    private boolean breakVis = false;
    private boolean continueVisit = false;


    public VisitorInterpreter() {
        globalScope = new Scope<>();
        actualScope = new Scope<>();
        userMethods = new HashMap<>();
        actualScope.parent = globalScope;
    }


    @Override
    public STNode visitProgram(ProgramContext ctx) {
        System.out.println("Starting interpreter...");
        visitChildren(ctx);
        System.out.println("Ending interpreter...");
        return null;
    }

    //Checked
    @Override
    public STNode visitPrintfStatement(PrintfStatementContext ctx) {

        System.out.println("Salida printf = " + ctx.expression().getText());
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
            if (ctx.argumentScanf().getChild(i).toString().charAt(0) != ',') {
                //System.out.println("Veces que entra");
                //System.out.println("id" + ctx.argumentScanf().ID(v).toString());
                TerminalNode id = ctx.argumentScanf().ID(v);
                // System.out.println("ARGS" + id.getText());
                String line = s.nextLine().trim();
                try {//int
                    node = new STNode(STNodeType.INT, Integer.parseInt(line));
                } catch (java.lang.NumberFormatException exInt) {
                    try {//testing if the given input is a char
                        node = new STNode(STNodeType.CHAR, line);
                    } catch (java.lang.NumberFormatException exFloat) {
                        try {//testing if the given input is a short
                            node = new STNode(STNodeType.SHORT, Short.parseShort(line));
                        } catch (java.lang.NumberFormatException exDouble) {
                            try {//testing if the given input is a float
                                node = new STNode(STNodeType.LONG, Long.parseLong(line));
                            } catch (java.lang.NumberFormatException exShort) {
                                try {//testing if the given input is a long
                                    node = new STNode(STNodeType.FLOAT, Float.parseFloat(line));
                                } catch (java.lang.NumberFormatException exLong) {
                                    node = new STNode(STNodeType.DOUBLE, Double.parseDouble(line));
                                }
                            }
                        }
                    }

                }
                actualScope.put(id.getText(), node);
                System.out.println("Valor guardado en el scope para variable: " + id.getText() + " Valor: " + actualScope.get(id.getText()).getValue().toString() + "Type" + actualScope.get(id.getText()).getType().toString());
                ++v;
            } else
                continue;

        }

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
    public STNode visitForStatement(CLangParser.ForStatementContext ctx) {
        //System.out.println("For Statement");
        visit(ctx.expressionList());

        while (!(visit(ctx.condExpression()).getValue().equals(0))) {
            visit(ctx.statement());
            if (breakVis)
                break;
            breakVis = false;
            visit(ctx.iterExpression());
        }

        return null;
    }

    //Checked
    @Override
    public STNode visitExprParenthesis(CLangParser.ExprParenthesisContext ctx) {
        System.out.println("[ExprParenthesis visited] ");
        return visit(ctx.expression());
    }

    //Checked
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
        return new STNode(STNodeType.CHAR, (char) (ctx.CHAR_CONSTANT().getText()).charAt(1));
    }

    //Checked
    @Override
    public STNode visitFloatCnt(CLangParser.FloatCntContext ctx) {
        System.out.println("FloatConstant visited");
        return new STNode(STNodeType.FLOAT, Float.parseFloat(ctx.FLOAT_CONSTANT().getText()));
    }

    //When a string constant is visited, we don't get an STNode because String isn't a C data type
    @Override
    public STNode visitStrLCnt(CLangParser.StrLCntContext ctx) {
        System.out.println("StrLiteralConstant visited");
        System.out.println(ctx.STRING_LITERAL().getText().substring(1, ctx.STRING_LITERAL().getText().length() - 1));
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
    public STNode visitExprOr(ExprOrContext ctx) {
        STNode node_1 = visit(ctx.expression(0));
        STNode node_2 = visit(ctx.expression(1));

        return new STNode(STNodeType.INT, ((int) node_1.getValue() != 0 || (int) node_2.getValue() != 0) ? 1 : 0);
    }

    //Checked
    @Override
    public STNode visitIfStatement(IfStatementContext ctx) {
//        System.out.println("Visiting IfStatement");
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
                if (left.getType() == STNodeType.CHAR && right.getType() == STNodeType.CHAR) {
                    rest = (Double.valueOf(left.getValue().toString().charAt(0)) * Double.valueOf(right.getValue().toString().charAt(0)));
                } else {
                    if (left.getType() == STNodeType.CHAR) {
                        rest = (Double.valueOf(left.getValue().toString().charAt(0)) * ((Number) right.getValue()).doubleValue());
                    } else {
                        if (right.getType() == STNodeType.CHAR) {
                            rest = (((Number) left.getValue()).doubleValue() * Double.valueOf(right.getValue().toString().charAt(0)));
                        } else {
                            rest = (((Number) left.getValue()).doubleValue() * ((Number) right.getValue()).doubleValue());
                        }
                    }
                }
                break;
            }
            case '/': {
                if (left.getType() == STNodeType.CHAR && right.getType() == STNodeType.CHAR) {
                    rest = (Double.valueOf(left.getValue().toString().charAt(0)) / Double.valueOf(right.getValue().toString().charAt(0)));
                } else {
                    if (left.getType() == STNodeType.CHAR) {
                        rest = (Double.valueOf(left.getValue().toString().charAt(0)) / ((Number) right.getValue()).doubleValue());
                    } else {
                        if (right.getType() == STNodeType.CHAR) {
                            rest = (((Number) left.getValue()).doubleValue() / Double.valueOf(right.getValue().toString().charAt(0)));
                        } else {
                            rest = (((Number) left.getValue()).doubleValue() / ((Number) right.getValue()).doubleValue());
                        }
                    }
                }
                break;
            }
            case '%': {
                if (left.getType() == STNodeType.CHAR && right.getType() == STNodeType.CHAR) {
                    rest = (Double.valueOf(left.getValue().toString().charAt(0)) % Double.valueOf(right.getValue().toString().charAt(0)));
                } else {
                    if (left.getType() == STNodeType.CHAR) {
                        rest = (Double.valueOf(left.getValue().toString().charAt(0)) % ((Number) right.getValue()).doubleValue());
                    } else {
                        if (right.getType() == STNodeType.CHAR) {
                            rest = (((Number) left.getValue()).doubleValue() % Double.valueOf(right.getValue().toString().charAt(0)));
                        } else {
                            rest = (((Number) left.getValue()).doubleValue() % ((Number) right.getValue()).doubleValue());
                        }
                    }
                }
                break;
            }
            case '+': {
                if (left.getType() == STNodeType.CHAR && right.getType() == STNodeType.CHAR) {
                    rest = (Double.valueOf(left.getValue().toString().charAt(0)) + Double.valueOf(right.getValue().toString().charAt(0)));
                } else {
                    if (left.getType() == STNodeType.CHAR) {
                        rest = (Double.valueOf(left.getValue().toString().charAt(0)) + ((Number) right.getValue()).doubleValue());
                    } else {
                        if (right.getType() == STNodeType.CHAR) {
                            rest = (((Number) left.getValue()).doubleValue() + Double.valueOf(right.getValue().toString().charAt(0)));
                        } else {
                            rest = (((Number) left.getValue()).doubleValue() + ((Number) right.getValue()).doubleValue());
                        }
                    }
                }
                break;
            }
            case '-': {
                if (left.getType() == STNodeType.CHAR && right.getType() == STNodeType.CHAR) {
                    rest = (Double.valueOf(left.getValue().toString().charAt(0)) - Double.valueOf(right.getValue().toString().charAt(0)));
                } else {
                    if (left.getType() == STNodeType.CHAR) {
                        rest = (Double.valueOf(left.getValue().toString().charAt(0)) - ((Number) right.getValue()).doubleValue());
                    } else {
                        if (right.getType() == STNodeType.CHAR) {
                            rest = (((Number) left.getValue()).doubleValue() - Double.valueOf(right.getValue().toString().charAt(0)));
                        } else {
                            rest = (((Number) left.getValue()).doubleValue() - ((Number) right.getValue()).doubleValue());
                        }
                    }
                }
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
                    } else {
                        return new STNode(STNodeType.SHORT, (short) rest);
                    }

                }
            }
        }

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


       // System.out.println("VarWithoutExpDeclaration visited");
        return null;
    }

    //Checked
    @Override
    public STNode visitVarWithExpDeclaration(VarWithExpDeclarationContext ctx) {
        String varId;
        STNode newNode = null;
        varId = ctx.ID().getText();
        STNode node = visit(ctx.expression());

        Number aux = 0;
        VarDeclarationContext parent_cont = (VarDeclarationContext) ctx.getParent();
        switch (parent_cont.TYPE().getText()) {
            case "short":
                if (node.getType() == STNodeType.CHAR) {//saving the numerical value of a character
                    // newNode = new STNode(STNodeType.SHORT, Short.parseShort(node.getValue().toString().charAt(0)), thisScope);
                } else {
                    //Integer cast to the resulting type of the given expression
                    if (node.getType().compareTo(STNodeType.SHORT) > 0) {
                        if (node.getType() == STNodeType.INT) {
                            aux = Integer.valueOf((int) node.getValue()).shortValue();
                        } else {
                            if (node.getType() == STNodeType.LONG) {
                                aux = Long.valueOf((long) node.getValue()).shortValue();
                            } else {
                                if (node.getType() == STNodeType.FLOAT) {
                                    aux = Float.valueOf((float) node.getValue()).shortValue();
                                } else
                                    aux = Double.valueOf((double) node.getValue()).shortValue();
                            }
                        }

                        newNode = new STNode(STNodeType.SHORT, aux, actualScope);
                    } else
                        newNode = new STNode(STNodeType.SHORT, Short.parseShort(node.getValue().toString()), actualScope);
                }
                break;
            case "int":

                if (node.getType() == STNodeType.CHAR) {//saving the numerical value of a character
                    newNode = new STNode(STNodeType.INT, Integer.valueOf(node.getValue().toString().charAt(0)), actualScope);
                } else {
                    //Integer cast over the resulting type of the given expression
                    if (node.getType().compareTo(STNodeType.INT) > 0) {//cases when i have to specify the donwn casting
                        if (node.getType() == STNodeType.FLOAT)
                            aux = Float.valueOf((float) node.getValue()).intValue();
                        else {
                            if (node.getType() == STNodeType.LONG)
                                aux = Long.valueOf((long) node.getValue()).intValue();
                            else
                                aux = Double.valueOf((double) node.getValue()).intValue();
                        }
                        newNode = new STNode(STNodeType.INT, aux, actualScope);
                    } else {
                        //Here is included the cast to a Short type(because short is shorter than Int, no down casting needed)
                        newNode = new STNode(STNodeType.INT, Integer.valueOf(node.getValue().toString()), actualScope);
                    }
                }
                break;
            case "long":
                if (node.getType() == STNodeType.CHAR) {//saving the numerical value of a character
                    newNode = new STNode(STNodeType.LONG, Long.valueOf(node.getValue().toString().charAt(0)), actualScope);
                } else {
                    //Integer cast to the resulting type of the given expression
                    if (node.getType().compareTo(STNodeType.LONG) > 0) {
                        if (node.getType() == STNodeType.FLOAT)
                            aux = Float.valueOf((float) node.getValue()).longValue();
                        else
                            aux = Double.valueOf((double) node.getValue()).longValue();

                        newNode = new STNode(STNodeType.LONG, aux, actualScope);
                    } else
                        newNode = new STNode(STNodeType.LONG, Long.valueOf(node.getValue().toString()), actualScope);
                }
                break;
            case "float":
                if (node.getType() == STNodeType.CHAR) {//saving the numerical value of a character
                    newNode = new STNode(STNodeType.FLOAT, Float.valueOf(node.getValue().toString().charAt(0)), actualScope);
                } else {
                    //Integer cast to the resulting type of the given expression
                    newNode = new STNode(STNodeType.FLOAT, Float.valueOf(node.getValue().toString()), actualScope);
                }
                break;
            case "double":
                if (node.getType() == STNodeType.CHAR) {//saving the numerical value of a character
                    newNode = new STNode(STNodeType.DOUBLE, Double.valueOf(node.getValue().toString().charAt(0)), actualScope);
                } else {
                    //Integer cast to the resulting type of the given expression
                    newNode = new STNode(STNodeType.DOUBLE, Double.valueOf(node.getValue().toString()), actualScope);
                }
                break;
            case "char":
                try {
                    newNode = new STNode(STNodeType.CHAR, (char) node.getValue(), actualScope);
                    break;
                } catch (NumberFormatException ConvertionTypeExcep) {

                }
        }
        actualScope.put(varId, newNode);

        //System.out.println("VarWithExpDeclaration visited");
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

    //Checked
    public STNode visitAssignmentExpression(AssignmentExpressionContext ctx) {
        System.out.println("visiting assignment expression");
        STNode exp = visit(ctx.expression());
        STNode node;
        Object exp_value = new Object();
        exp_value = exp.getValue();
        Object id_value = new Object();
        STNodeType id_type;
        String id;
        String op = ctx.assignmentOperator().getText();
        double value = 0;

        if (ctx.unaryExpression().ID() != null) {
            id_value = actualScope.get((ctx.unaryExpression().ID().getText())).getValue();
            id_type = actualScope.get((ctx.unaryExpression().ID().getText())).getType();
            id = ctx.unaryExpression().ID().getText();

            if (id_type.compareTo(exp.getType()) > 0 || id_type.compareTo(exp.getType()) == 0) {

                switch (op) {
                    case "=": {
                        if (exp.getType() == STNodeType.CHAR) {
                            value = Double.valueOf(exp.getValue().toString().charAt(0));
                        } else {
                            value = ((Number) exp_value).doubleValue();
                        }
                        break;
                    }
                    case "*=": {
                        if (exp.getType() == STNodeType.CHAR) {
                            value = ((Number) id_value).doubleValue() * Double.valueOf(exp.getValue().toString().charAt(0));
                        } else {
                            value = ((Number) id_value).doubleValue() * ((Number) exp_value).doubleValue();
                        }
                        break;
                    }
                    case "/=": {
                        if (exp.getType() == STNodeType.CHAR) {
                            value = ((Number) id_value).doubleValue() / Double.valueOf(exp.getValue().toString().charAt(0));
                        } else {
                            value = ((Number) id_value).doubleValue() / ((Number) exp_value).doubleValue();
                        }
                        break;
                    }
                    case "%=": {
                        if (exp.getType() == STNodeType.CHAR) {
                            value = ((Number) id_value).doubleValue() % Double.valueOf(exp.getValue().toString().charAt(0));
                        } else {
                            value = ((Number) id_value).doubleValue() % ((Number) exp_value).doubleValue();
                        }
                        break;
                    }
                    case "+=": {
                        if (exp.getType() == STNodeType.CHAR) {
                            value = ((Number) id_value).doubleValue() + Double.valueOf(exp.getValue().toString().charAt(0));
                        } else {
                            value = ((Number) id_value).doubleValue() + ((Number) exp_value).doubleValue();
                        }
                        break;
                    }
                    case "-=": {
                        if (exp.getType() == STNodeType.CHAR) {
                            value = ((Number) id_value).doubleValue() - Double.valueOf(exp.getValue().toString().charAt(0));
                        } else {
                            value = ((Number) id_value).doubleValue() - ((Number) exp_value).doubleValue();
                        }
                        break;
                    }
                }

                if (id_type == STNodeType.DOUBLE) {
                    actualScope.get(id).setValue((double) value);
                    //System.out.println(value);
                } else {
                    if (id_type == STNodeType.FLOAT) {
                        actualScope.get(id).setValue((float) value);
                       // System.out.println("out" + value);
                    } else {
                        if (id_type == STNodeType.LONG) {
                            actualScope.get(id).setValue((long) value);
                            //System.out.println(value);
                        } else {
                            if (id_type == STNodeType.SHORT) {
                                actualScope.get(id).setValue((short) value);
                               // System.out.println(value);
                            } else {
                                if (id_type == STNodeType.INT) {//id_type != char
                                    actualScope.get(id).setValue((int) value);
                                   // System.out.println("out " + actualScope.get(id).getValue().toString());
                                }
                            }
                        }
                    }
                }

            } else {
                throw new NumberFormatException("You can't save a value on a smaller size variable");
            }

        } else {//Array assignment
            //System.out.println("Visiting array Assignment");
            int index = (int) visit(ctx.unaryExpression().arrayIndexExpression().expression()).getValue();//index of the array
            node = actualScope.get(ctx.unaryExpression().arrayIndexExpression().ID().getText());//getting the node id[] from SymbolTable
            Object[] array = (Object[]) node.getValue();//saving the value of id[](couse the value is an array, see ArrayDeclaration)

            if (node.getType().compareTo(exp.getType()) > 0 || node.getType().compareTo(exp.getType()) == 0) {

                if (op.charAt(0) == '=') {
                    if (exp.getType() == STNodeType.CHAR) {
                        value = Double.valueOf(exp.getValue().toString().charAt(0));
                    } else {
                        value = ((Number) exp.getValue()).doubleValue();
                    }


                } else {
                    if (array[index] != null) {
                        switch (op) {
                            case "*=": {
                                if (exp.getType() == STNodeType.CHAR) {
                                    System.out.println(Double.valueOf(exp.getValue().toString().charAt(0)));
                                    System.out.println(array[index].toString());
                                    value = ((Number) array[index]).doubleValue() * Double.valueOf(exp.getValue().toString().charAt(0));
                                } else {
                                    value = ((Number) array[index]).doubleValue() * ((Number) exp.getValue()).doubleValue();
                                }
                                break;
                            }
                            case "/=": {
                                if (exp.getType() == STNodeType.CHAR) {
                                    value = ((Number) array[index]).doubleValue() / Double.valueOf(exp.getValue().toString().charAt(0));
                                } else {
                                    value = ((Number) array[index]).doubleValue() / ((Number) exp.getValue()).doubleValue();
                                }
                                break;
                            }
                            case "%=": {
                                if (exp.getType() == STNodeType.CHAR) {
                                    value = ((Number) array[index]).doubleValue() % Double.valueOf(exp.getValue().toString().charAt(0));
                                } else {
                                    value = ((Number) array[index]).doubleValue() % ((Number) exp.getValue()).doubleValue();
                                }
                                break;
                            }
                            case "+=": {
                                if (exp.getType() == STNodeType.CHAR) {
                                    value = ((Number) array[index]).doubleValue() + Double.valueOf(exp.getValue().toString().charAt(0));
                                } else {
                                    value = ((Number) array[index]).doubleValue() + ((Number) exp.getValue()).doubleValue();
                                }
                                break;
                            }
                            case "-=": {
                                if (exp.getType() == STNodeType.CHAR) {
                                    value = ((Number) array[index]).doubleValue() - Double.valueOf(exp.getValue().toString().charAt(0));
                                } else {
                                    value = ((Number) array[index]).doubleValue() - ((Number) exp.getValue()).doubleValue();
                                }
                                break;
                            }
                        }
                    } else
                        throw new NullPointerException("You can't execute an arithmetic operation with a null value");
                }

                if (node.getType() == STNodeType.DOUBLE) {
                    array[index] = (double) value;
                    node.setValue(array);
                    actualScope.get(ctx.unaryExpression().arrayIndexExpression().ID().getText()).setValue(node.getValue());
                   // System.out.println("ArrayOut: " + actualScope.get(ctx.unaryExpression().arrayIndexExpression().ID().getText()).getValue().toString());

                } else {
                    if (node.getType() == STNodeType.FLOAT) {
                        array[index] = (float) value;
                        node.setValue(array);
                        actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                        //System.out.println("float value on array = " + node.getValue());
                    } else {
                        if (node.getType() == STNodeType.LONG) {
                            array[index] = (long) value;
                            node.setValue(array);
                            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                            //System.out.println(node.getValue());
                        } else {
                            if (node.getType() == STNodeType.SHORT) {
                                array[index] = (short) value;
                                node.setValue(array);
                                actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                                //System.out.println(node.getValue());
                            } else {
                                if (node.getType() == STNodeType.INT) {//id_type != char
                                    array[index] = (int) value;
                                    node.setValue(array);
                                    actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
                                   // System.out.println(array[index].toString());
                                }
                            }
                        }
                    }
                }
            } else
                throw new NumberFormatException("You can't save a value on a smaller size variable");


        }


        return null;
    }


    //Checked
    @Override
    public STNode visitArrayIndexExpression(ArrayIndexExpressionContext ctx) {
        int index = (int) visit(ctx.expression()).getValue();
        Object[] array = (Object[]) actualScope.get(ctx.ID().getText()).getValue();
        return new STNode(actualScope.get(ctx.ID().getText()).getType(), array[index]);//returning the node on id[index]

    }

    // TODO: void return type declaration

    //Checked
    @Override
    public STNode visitFunctionDeclaration(CLangParser.FunctionDeclarationContext ctx) {
        HashMap<String, STNodeType> paramList = new HashMap<>();
        STNode node;
        int c = 0;
        if (ctx.TYPE() != null) {

            if (ctx.parameterList() != null) {
                for (int i = 0; i < ctx.parameterList().getChildCount(); i++) {


                    if (ctx.parameterList().getChild(i).toString().charAt(0) != ',') {
                        paramList.put(ctx.parameterList().parameterDeclaration(c).ID().getText(), STNodeType.valueOf(ctx.parameterList().parameterDeclaration(c).TYPE().getText().toUpperCase()));

                        ++c;
                    } else continue;

                }
                //System.out.println("Fuction with parameterList saved in here");
                globalScope.put(ctx.ID().getText(), new STNode(STNodeType.valueOf(ctx.TYPE().getText().toUpperCase()), paramList, globalScope));//saving
            } else {
                if (ctx.typeList() != null) {
                    node = visit(ctx.typeList());
                    globalScope.put(ctx.ID().getText(), node);
                } else {

                    globalScope.put(ctx.ID().getText(), new STNode(STNodeType.valueOf(ctx.TYPE().getText().toUpperCase()), globalScope));
                   // System.out.println("Fuction without parameters: " + globalScope.get(ctx.ID().getText()).getType().toString());
                }
            }
        }

        return null;
    }

    //Checked
    @Override
    public STNode visitFunctionDefinition(CLangParser.FunctionDefinitionContext ctx) {

        if (ctx.ID().getText().compareTo("main") == 0) {
            for (int i = 0; i < ctx.statementCombination().statement().size(); ++i)
                visit(ctx.statementCombination().statement(i));
        }
        userMethods.put(ctx.ID().getText(), ctx);
        return null;
    }

    //Checked
    @Override
    public STNode visitExprFunctionCall(CLangParser.ExprFunctionCallContext ctx) {
        STNode out = null;
        List<String> parametersId = new ArrayList<String>();
        FunctionDefinitionContext funcContext = (FunctionDefinitionContext) userMethods.get(ctx.functionCall().ID().getText());
        int c = 0;
        int v = 0;
        Scope<STNode> current = actualScope;
        actualScope = new Scope<STNode>(actualScope);

        HashMap<String, STNodeType> paramList = new HashMap<>();
        for (int i = 0; i < funcContext.parameterList().getChildCount(); i++) {
            if (funcContext.parameterList().getChild(i).toString().charAt(0) != ',') {
                paramList.put(funcContext.parameterList().parameterDeclaration(v).ID().getText(), STNodeType.valueOf(funcContext.parameterList().parameterDeclaration(v).TYPE().getText().toUpperCase()));
                ++v;
            } else
                continue;
        }

        paramList.forEach((id, type) -> {
            parametersId.add(id);
            System.out.println(id);
        });

        for (int i = 0; i < ctx.functionCall().expressionList().getChildCount(); ++i) {
            if (ctx.functionCall().expressionList().getChild(i).toString().charAt(0) != ',') {
                //System.out.println("asigning parameters values");
                actualScope.put(parametersId.get(c), new STNode(visit(ctx.functionCall().expressionList().expression(c))));
                ++c;
            } else
                continue;
        }

        for (int i = 0; i < funcContext.statementCombination().statement().size(); ++i) {
            out = visit(funcContext.statementCombination().statement(i));

        }

        actualScope = current;

        return out;
    }

    //Checked
    @Override
    public STNode visitParameterDeclaration(CLangParser.ParameterDeclarationContext ctx) {

        STNode node = new STNode(STNodeType.valueOf(ctx.TYPE().getText().toUpperCase()), globalScope);//the actualScope here is the scope of the fuction definition
        return node;
    }

    //Checked
    @Override
    public STNode visitTypeList(CLangParser.TypeListContext ctx) {
        int c = 0;
        FunctionDeclarationContext parent_ctx = (FunctionDeclarationContext) ctx.getParent();
        List<STNodeType> typeList = new ArrayList<STNodeType>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).toString().charAt(0) != ',') {
                System.out.println(ctx.TYPE(c));
                typeList.add(STNodeType.valueOf(ctx.TYPE(c).getText().toUpperCase()));
                ++c;
            } else
                continue;

        }

        return new STNode(STNodeType.valueOf(parent_ctx.TYPE().getText().toUpperCase()), typeList, globalScope);
    }

    //Used in CompoundStatement
    @Override
    public STNode visitStatementCombination(CLangParser.StatementCombinationContext ctx) {
        for (StatementContext state : ctx.statement()) {
            visit(state);
        }
        return null;
    }

    //Used in CompoundStatement
    @Override
    public STNode visitDeclarCombination(CLangParser.DeclarCombinationContext ctx) {
        STNode node = null;
        for (DeclarationContext dcl : ctx.declaration()) {
            node = visit(dcl);
        }
        return node;
    }

    //Checked
    @Override
    public STNode visitStatement(CLangParser.StatementContext ctx) {
        STNode node = null;

        if (ctx.compoundStatement() != null)
            node = visit(ctx.compoundStatement());
        else {
            if (ctx.expression() != null) {
                node = visit(ctx.expression());
            } else {
                if (ctx.declaration() != null) {
                    node = visit(ctx.declaration());
                } else {
                    if (ctx.ifStatement() != null) {
                        node = visit(ctx.ifStatement());
                    } else {
                        if (ctx.whileStatement() != null) {
                            node = visit(ctx.whileStatement());
                        } else {
                            if (ctx.printfStatement() != null) {
                                node = visit(ctx.printfStatement());
                            } else {
                                if (ctx.returnStatement() != null) {
                                    node = visit(ctx.returnStatement());
                                } else {
                                    if (ctx.scanfStatement() != null) {
                                        node = visit(ctx.scanfStatement());
                                    } else {
                                        if (ctx.forStatement() != null) {
                                            node = visit(ctx.forStatement());
                                        } else {
                                            if (ctx.breakStatement() != null)
                                                node = visit(ctx.breakStatement());
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }

        }
        return node;
    }

    //Checked
    @Override
    public STNode visitReturnStatement(CLangParser.ReturnStatementContext ctx) {
        return visit(ctx.expression());
    }

    //Only break works
    @Override
    public STNode visitBreakStatement(CLangParser.BreakStatementContext ctx) {
        if (ctx.BREAK() != null) {
            breakVis = true;
            return new STNode(STNodeType.INT, Integer.MIN_VALUE);
        }
        return null;
    }

    //Checked
    @Override
    public STNode visitExprUnaryOpPre(ExprUnaryOpPreContext ctx) {
        STNode node = actualScope.get(ctx.ID().getText());

        STNode newNode = new STNode(node);
        switch (ctx.unaryOperator.getText()) {
            case "++":
                newNode.setValue((int) newNode.getValue() + 1);
                actualScope.put(ctx.ID().getText(), newNode);
                break;
            case "--":
                newNode.setValue((int) newNode.getValue() - 1);
                actualScope.put(ctx.ID().getText(), newNode);
        }
        return node;
    }
    //Checked
   @Override
    public STNode visitExprUnaryOpPost(ExprUnaryOpPostContext ctx) {

        STNode node = actualScope.get(ctx.ID().getText());

        switch (ctx.unaryOperator.getText()) {
            case "-":
                node.setValue((-1) * ((int) node.getValue()));
                break;
            case "++":
                node.setValue((int) node.getValue() + 1);
                actualScope.put(ctx.ID().getText(), node);
                break;
            case "--":
                node.setValue((int) node.getValue() - 1);
                actualScope.put(ctx.ID().getText(), node);
                break;
            case "!":
                if ((int) node.getValue() == 0) {
                    node.setValue(1);
                } else {
                    node.setValue(0);
                }
            case "~": //NOT bit a bit
                node.setValue(~((long) node.getValue()));
                actualScope.put(ctx.ID().getText(), node);
        }
        return node;
    }

    //Checked
    @Override
    public STNode visitCompoundStatement(CLangParser.CompoundStatementContext ctx) {
        Scope<STNode> current = actualScope;
        actualScope = new Scope<STNode>(actualScope);
        STNode node = null;
        if (ctx.declarCombination() != null && ctx.statementCombination() != null) {
            visit(ctx.declarCombination());
            node = visit(ctx.statementCombination());

        } else {
            if (ctx.statementCombination() != null) {
                node = visit(ctx.statementCombination());
            } else {
                if (ctx.declarCombination() != null) {
                    visit(ctx.declarCombination());
                }

            }


        }
        actualScope = current;
        return node;
    }
}
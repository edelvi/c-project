package interpreter;


import abstractInterpreter.*;
import abstractInterpreter.CLangParser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.*;

import java.util.HashMap;

public class VisitorInterpreter extends CLangBaseVisitor<STNode> {

    private HashMap<String, ParseTree> userMethods;
    private Scope<STNode> globalScope = new Scope<>(), actualScope = globalScope;


    @Override
    public STNode visitExprAnd(ExprAndContext ctx) {
        STNode node_1 = visit(ctx.expression(0));
        STNode node_2 = visit(ctx.expression(1));

        return new STNode(STNodeType.INT, ((int) node_1.getValue() != 0 && (int) node_2.getValue() != 0) ? 1 : 0);
    }

    @Override
    public STNode visitPrintfStatement(PrintfStatementContext ctx) {
        System.out.println(visit(ctx.expression()));
        return null;
    }

    @Override
    public STNode visitExprCnt(ExprCntContext ctx) {
        String value = ctx.CONSTANT().getText();
        try {
            return new STNode(STNodeType.INT, Integer.parseInt(value));
        } catch (NumberFormatException ie) {
            try {
                return new STNode(STNodeType.DOUBLE, Double.parseDouble(value));
            } catch (NumberFormatException de) {
                return new STNode(null, value);
            }
        }
    }


    @Override
    public STNode visitVariableWithoutExpDeclaration(VariableWithoutExpDeclarationContext ctx) {
        VarDeclarationContext parCtx = (VarDeclarationContext) ctx.getParent();

        String varId = ctx.ID().getText();
        STNode newNode = null;
        switch (parCtx.TYPE().getText()) {
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
        System.err.println("Visit");
        return null;
    }

    @Override
    public STNode visitVariableWithExpDeclaration(VariableWithExpDeclarationContext ctx) {
        Scope thisScope;
        String varId;
        STNode newNode;
        thisScope = actualScope;
        varId = ctx.ID().getText();
        newNode = null;
        STNode node = visit(ctx.expression());
        VarDeclarationContext parCtx = (VarDeclarationContext) ctx.getParent();


        switch (parCtx.TYPE().getText()) {
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
        return null;
    }

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
            actualScope.put(varId, newNode);
        }
        return null;
    }

    @Override
    public STNode visitExprId(ExprIdContext ctx) {
        return actualScope.get(ctx.ID().getText());
    }


    private STNode assignmentOperator(AssignmentExpressionContext ctx) {
        //Only works for = operator
        STNode exp = visit(ctx.expression());

        if (ctx.unaryExpression().ID() != null) {
            actualScope.put(ctx.unaryExpression().ID().getText(), exp);
        } else {
            int index = (int) visit(ctx.unaryExpression().arrayIndexExpression().expression()).getValue();
            STNode node = actualScope.get(ctx.unaryExpression().arrayIndexExpression().ID().getText());

            Object[] array = (Object[]) node.getValue();
            array[index] = exp.getValue();
            node.setValue(array);
            actualScope.put(ctx.unaryExpression().arrayIndexExpression().ID().getText(), node);
        }
        return null;
    }

    @Override
    public STNode visitArrayIndexExpression(ArrayIndexExpressionContext ctx) {
        int index = (int) visit(ctx.expression()).getValue();
        Object[] array = (Object[]) actualScope.get(ctx.ID().getText()).getValue();
        return new STNode(actualScope.get(ctx.ID().getText()).getType(), array[index]);

    }

}
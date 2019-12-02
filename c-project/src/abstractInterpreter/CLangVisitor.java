// Generated from F:/Estudio/Universidad/4to a�o/Complementos de Compilaci�n/09 Trabajo de Edelvi/c-project/src\CLang.g4 by ANTLR 4.7.2
package abstractInterpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(CLangParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(CLangParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link CLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CLangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link CLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(CLangParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#variableWithExpDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWithExpDeclaration(CLangParser.VariableWithExpDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#variableWithoutExpDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWithoutExpDeclaration(CLangParser.VariableWithoutExpDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CLangParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CLangParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CLangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CLangParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(CLangParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CLangParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CLangParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(CLangParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#printfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfStatement(CLangParser.PrintfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#formatString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(CLangParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#scanfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanfStatement(CLangParser.ScanfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#argumentScanf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentScanf(CLangParser.ArgumentScanfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CLangParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnaryOp}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryOp(CLangParser.ExprUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDivMod(CLangParser.ExprMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCnt}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCnt(CLangParser.ExprCntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(CLangParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEq}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEq(CLangParser.ExprEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(CLangParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(CLangParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall(CLangParser.ExprFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRel}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRel(CLangParser.ExprRelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(CLangParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrayIndex}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayIndex(CLangParser.ExprArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(CLangParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(CLangParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CLangParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CLangParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#arrayIndexExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexExpression(CLangParser.ArrayIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CLangParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CLangParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CLangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CLangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLangParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CLangParser.UnaryOperatorContext ctx);
}
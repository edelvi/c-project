// Generated from C:/Users/Aice/IdeaProjects/c-project/src\CLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLangParser}.
 */
public interface CLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(CLangParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(CLangParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(CLangParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(CLangParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CLangParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CLangParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CLangParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CLangParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CLangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CLangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CLangParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CLangParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(CLangParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(CLangParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CLangParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CLangParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(CLangParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(CLangParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintfStatement(CLangParser.PrintfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintfStatement(CLangParser.PrintfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(CLangParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(CLangParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(CLangParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(CLangParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsList(CLangParser.ArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsList(CLangParser.ArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CLangParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CLangParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#commonStr}.
	 * @param ctx the parse tree
	 */
	void enterCommonStr(CLangParser.CommonStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#commonStr}.
	 * @param ctx the parse tree
	 */
	void exitCommonStr(CLangParser.CommonStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#scanfStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanfStatement(CLangParser.ScanfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#scanfStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanfStatement(CLangParser.ScanfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#argumentScanf}.
	 * @param ctx the parse tree
	 */
	void enterArgumentScanf(CLangParser.ArgumentScanfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#argumentScanf}.
	 * @param ctx the parse tree
	 */
	void exitArgumentScanf(CLangParser.ArgumentScanfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CLangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CLangParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnaryOp}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryOp(CLangParser.ExprUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnaryOp}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryOp(CLangParser.ExprUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDivMod(CLangParser.ExprMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDivMod(CLangParser.ExprMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCnt}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCnt(CLangParser.ExprCntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCnt}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCnt(CLangParser.ExprCntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(CLangParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(CLangParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEq}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprEq(CLangParser.ExprEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEq}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprEq(CLangParser.ExprEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CLangParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CLangParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(CLangParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(CLangParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(CLangParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(CLangParser.ExprFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRel}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRel(CLangParser.ExprRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRel}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRel(CLangParser.ExprRelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(CLangParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(CLangParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayIndex}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayIndex(CLangParser.ExprArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayIndex}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayIndex(CLangParser.ExprArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(CLangParser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(CLangParser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprId(CLangParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprId(CLangParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CLangParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CLangParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CLangParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CLangParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CLangParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CLangParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CLangParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CLangParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLangParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CLangParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLangParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CLangParser.UnaryOperatorContext ctx);
}
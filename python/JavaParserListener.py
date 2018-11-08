# Generated from /home/franciscone/Faculdade/Codigos/compilers/compiler/src/parser/JavaParser.g4 by ANTLR 4.7
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JavaParser import JavaParser
else:
    from JavaParser import JavaParser

# This class defines a complete listener for a parse tree produced by JavaParser.
class JavaParserListener(ParseTreeListener):

    # Enter a parse tree produced by JavaParser#compilationUnit.
    def enterCompilationUnit(self, ctx:JavaParser.CompilationUnitContext):
        pass

    # Exit a parse tree produced by JavaParser#compilationUnit.
    def exitCompilationUnit(self, ctx:JavaParser.CompilationUnitContext):
        print("program")

    # Enter a parse tree produced by JavaParser#packageDeclaration.
    def enterPackageDeclaration(self, ctx:JavaParser.PackageDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#packageDeclaration.
    def exitPackageDeclaration(self, ctx:JavaParser.PackageDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#importDeclarations.
    def enterImportDeclarations(self, ctx:JavaParser.ImportDeclarationsContext):
        pass

    # Exit a parse tree produced by JavaParser#importDeclarations.
    def exitImportDeclarations(self, ctx:JavaParser.ImportDeclarationsContext):
        pass


    # Enter a parse tree produced by JavaParser#importDeclaration.
    def enterImportDeclaration(self, ctx:JavaParser.ImportDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#importDeclaration.
    def exitImportDeclaration(self, ctx:JavaParser.ImportDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#typeDeclarations.
    def enterTypeDeclarations(self, ctx:JavaParser.TypeDeclarationsContext):
        pass

    # Exit a parse tree produced by JavaParser#typeDeclarations.
    def exitTypeDeclarations(self, ctx:JavaParser.TypeDeclarationsContext):
        pass


    # Enter a parse tree produced by JavaParser#typeDeclaration.
    def enterTypeDeclaration(self, ctx:JavaParser.TypeDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#typeDeclaration.
    def exitTypeDeclaration(self, ctx:JavaParser.TypeDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#classDeclaration.
    def enterClassDeclaration(self, ctx:JavaParser.ClassDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#classDeclaration.
    def exitClassDeclaration(self, ctx:JavaParser.ClassDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#classModifiers.
    def enterClassModifiers(self, ctx:JavaParser.ClassModifiersContext):
        pass

    # Exit a parse tree produced by JavaParser#classModifiers.
    def exitClassModifiers(self, ctx:JavaParser.ClassModifiersContext):
        pass


    # Enter a parse tree produced by JavaParser#classModifier.
    def enterClassModifier(self, ctx:JavaParser.ClassModifierContext):
        pass

    # Exit a parse tree produced by JavaParser#classModifier.
    def exitClassModifier(self, ctx:JavaParser.ClassModifierContext):
        pass


    # Enter a parse tree produced by JavaParser#superRule.
    def enterSuperRule(self, ctx:JavaParser.SuperRuleContext):
        pass

    # Exit a parse tree produced by JavaParser#superRule.
    def exitSuperRule(self, ctx:JavaParser.SuperRuleContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaces.
    def enterInterfaces(self, ctx:JavaParser.InterfacesContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaces.
    def exitInterfaces(self, ctx:JavaParser.InterfacesContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceTypeList.
    def enterInterfaceTypeList(self, ctx:JavaParser.InterfaceTypeListContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceTypeList.
    def exitInterfaceTypeList(self, ctx:JavaParser.InterfaceTypeListContext):
        pass


    # Enter a parse tree produced by JavaParser#classBody.
    def enterClassBody(self, ctx:JavaParser.ClassBodyContext):
        pass

    # Exit a parse tree produced by JavaParser#classBody.
    def exitClassBody(self, ctx:JavaParser.ClassBodyContext):
        pass


    # Enter a parse tree produced by JavaParser#classBodyDeclarations.
    def enterClassBodyDeclarations(self, ctx:JavaParser.ClassBodyDeclarationsContext):
        pass

    # Exit a parse tree produced by JavaParser#classBodyDeclarations.
    def exitClassBodyDeclarations(self, ctx:JavaParser.ClassBodyDeclarationsContext):
        pass


    # Enter a parse tree produced by JavaParser#classBodyDeclaration.
    def enterClassBodyDeclaration(self, ctx:JavaParser.ClassBodyDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#classBodyDeclaration.
    def exitClassBodyDeclaration(self, ctx:JavaParser.ClassBodyDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#classMemberDeclaration.
    def enterClassMemberDeclaration(self, ctx:JavaParser.ClassMemberDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#classMemberDeclaration.
    def exitClassMemberDeclaration(self, ctx:JavaParser.ClassMemberDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#staticInitializer.
    def enterStaticInitializer(self, ctx:JavaParser.StaticInitializerContext):
        pass

    # Exit a parse tree produced by JavaParser#staticInitializer.
    def exitStaticInitializer(self, ctx:JavaParser.StaticInitializerContext):
        pass


    # Enter a parse tree produced by JavaParser#constructorDeclaration.
    def enterConstructorDeclaration(self, ctx:JavaParser.ConstructorDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#constructorDeclaration.
    def exitConstructorDeclaration(self, ctx:JavaParser.ConstructorDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#constructorModifiers.
    def enterConstructorModifiers(self, ctx:JavaParser.ConstructorModifiersContext):
        pass

    # Exit a parse tree produced by JavaParser#constructorModifiers.
    def exitConstructorModifiers(self, ctx:JavaParser.ConstructorModifiersContext):
        pass


    # Enter a parse tree produced by JavaParser#constructorModifier.
    def enterConstructorModifier(self, ctx:JavaParser.ConstructorModifierContext):
        pass

    # Exit a parse tree produced by JavaParser#constructorModifier.
    def exitConstructorModifier(self, ctx:JavaParser.ConstructorModifierContext):
        pass


    # Enter a parse tree produced by JavaParser#constructorDeclarator.
    def enterConstructorDeclarator(self, ctx:JavaParser.ConstructorDeclaratorContext):
        pass

    # Exit a parse tree produced by JavaParser#constructorDeclarator.
    def exitConstructorDeclarator(self, ctx:JavaParser.ConstructorDeclaratorContext):
        pass


    # Enter a parse tree produced by JavaParser#formalParameterList.
    def enterFormalParameterList(self, ctx:JavaParser.FormalParameterListContext):
        pass

    # Exit a parse tree produced by JavaParser#formalParameterList.
    def exitFormalParameterList(self, ctx:JavaParser.FormalParameterListContext):
        pass


    # Enter a parse tree produced by JavaParser#formalParameter.
    def enterFormalParameter(self, ctx:JavaParser.FormalParameterContext):
        pass

    # Exit a parse tree produced by JavaParser#formalParameter.
    def exitFormalParameter(self, ctx:JavaParser.FormalParameterContext):
        pass


    # Enter a parse tree produced by JavaParser#throwsRule.
    def enterThrowsRule(self, ctx:JavaParser.ThrowsRuleContext):
        pass

    # Exit a parse tree produced by JavaParser#throwsRule.
    def exitThrowsRule(self, ctx:JavaParser.ThrowsRuleContext):
        pass


    # Enter a parse tree produced by JavaParser#classTypeList.
    def enterClassTypeList(self, ctx:JavaParser.ClassTypeListContext):
        pass

    # Exit a parse tree produced by JavaParser#classTypeList.
    def exitClassTypeList(self, ctx:JavaParser.ClassTypeListContext):
        pass


    # Enter a parse tree produced by JavaParser#constructorBody.
    def enterConstructorBody(self, ctx:JavaParser.ConstructorBodyContext):
        pass

    # Exit a parse tree produced by JavaParser#constructorBody.
    def exitConstructorBody(self, ctx:JavaParser.ConstructorBodyContext):
        pass


    # Enter a parse tree produced by JavaParser#explicitConstructorInvocation.
    def enterExplicitConstructorInvocation(self, ctx:JavaParser.ExplicitConstructorInvocationContext):
        pass

    # Exit a parse tree produced by JavaParser#explicitConstructorInvocation.
    def exitExplicitConstructorInvocation(self, ctx:JavaParser.ExplicitConstructorInvocationContext):
        pass


    # Enter a parse tree produced by JavaParser#fieldDeclaration.
    def enterFieldDeclaration(self, ctx:JavaParser.FieldDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#fieldDeclaration.
    def exitFieldDeclaration(self, ctx:JavaParser.FieldDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#fieldModifiers.
    def enterFieldModifiers(self, ctx:JavaParser.FieldModifiersContext):
        pass

    # Exit a parse tree produced by JavaParser#fieldModifiers.
    def exitFieldModifiers(self, ctx:JavaParser.FieldModifiersContext):
        pass


    # Enter a parse tree produced by JavaParser#fieldModifier.
    def enterFieldModifier(self, ctx:JavaParser.FieldModifierContext):
        pass

    # Exit a parse tree produced by JavaParser#fieldModifier.
    def exitFieldModifier(self, ctx:JavaParser.FieldModifierContext):
        pass


    # Enter a parse tree produced by JavaParser#variableDeclarators.
    def enterVariableDeclarators(self, ctx:JavaParser.VariableDeclaratorsContext):
        pass

    # Exit a parse tree produced by JavaParser#variableDeclarators.
    def exitVariableDeclarators(self, ctx:JavaParser.VariableDeclaratorsContext):
        pass


    # Enter a parse tree produced by JavaParser#variableDeclarator.
    def enterVariableDeclarator(self, ctx:JavaParser.VariableDeclaratorContext):
        pass

    # Exit a parse tree produced by JavaParser#variableDeclarator.
    def exitVariableDeclarator(self, ctx:JavaParser.VariableDeclaratorContext):
        pass


    # Enter a parse tree produced by JavaParser#variableDeclaratorId.
    def enterVariableDeclaratorId(self, ctx:JavaParser.VariableDeclaratorIdContext):
        pass

    # Exit a parse tree produced by JavaParser#variableDeclaratorId.
    def exitVariableDeclaratorId(self, ctx:JavaParser.VariableDeclaratorIdContext):
        pass


    # Enter a parse tree produced by JavaParser#variableInitializer.
    def enterVariableInitializer(self, ctx:JavaParser.VariableInitializerContext):
        pass

    # Exit a parse tree produced by JavaParser#variableInitializer.
    def exitVariableInitializer(self, ctx:JavaParser.VariableInitializerContext):
        pass


    # Enter a parse tree produced by JavaParser#methodDeclaration.
    def enterMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#methodDeclaration.
    def exitMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#methodHeader.
    def enterMethodHeader(self, ctx:JavaParser.MethodHeaderContext):
        pass

    # Exit a parse tree produced by JavaParser#methodHeader.
    def exitMethodHeader(self, ctx:JavaParser.MethodHeaderContext):
        pass


    # Enter a parse tree produced by JavaParser#resultType.
    def enterResultType(self, ctx:JavaParser.ResultTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#resultType.
    def exitResultType(self, ctx:JavaParser.ResultTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#methodModifiers.
    def enterMethodModifiers(self, ctx:JavaParser.MethodModifiersContext):
        pass

    # Exit a parse tree produced by JavaParser#methodModifiers.
    def exitMethodModifiers(self, ctx:JavaParser.MethodModifiersContext):
        pass


    # Enter a parse tree produced by JavaParser#methodModifier.
    def enterMethodModifier(self, ctx:JavaParser.MethodModifierContext):
        pass

    # Exit a parse tree produced by JavaParser#methodModifier.
    def exitMethodModifier(self, ctx:JavaParser.MethodModifierContext):
        pass


    # Enter a parse tree produced by JavaParser#methodDeclarator.
    def enterMethodDeclarator(self, ctx:JavaParser.MethodDeclaratorContext):
        pass

    # Exit a parse tree produced by JavaParser#methodDeclarator.
    def exitMethodDeclarator(self, ctx:JavaParser.MethodDeclaratorContext):
        pass


    # Enter a parse tree produced by JavaParser#methodBody.
    def enterMethodBody(self, ctx:JavaParser.MethodBodyContext):
        pass

    # Exit a parse tree produced by JavaParser#methodBody.
    def exitMethodBody(self, ctx:JavaParser.MethodBodyContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceDeclaration.
    def enterInterfaceDeclaration(self, ctx:JavaParser.InterfaceDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceDeclaration.
    def exitInterfaceDeclaration(self, ctx:JavaParser.InterfaceDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceModifiers.
    def enterInterfaceModifiers(self, ctx:JavaParser.InterfaceModifiersContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceModifiers.
    def exitInterfaceModifiers(self, ctx:JavaParser.InterfaceModifiersContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceModifier.
    def enterInterfaceModifier(self, ctx:JavaParser.InterfaceModifierContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceModifier.
    def exitInterfaceModifier(self, ctx:JavaParser.InterfaceModifierContext):
        pass


    # Enter a parse tree produced by JavaParser#extendsInterfaces.
    def enterExtendsInterfaces(self, ctx:JavaParser.ExtendsInterfacesContext):
        pass

    # Exit a parse tree produced by JavaParser#extendsInterfaces.
    def exitExtendsInterfaces(self, ctx:JavaParser.ExtendsInterfacesContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceBody.
    def enterInterfaceBody(self, ctx:JavaParser.InterfaceBodyContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceBody.
    def exitInterfaceBody(self, ctx:JavaParser.InterfaceBodyContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceMemberDeclarations.
    def enterInterfaceMemberDeclarations(self, ctx:JavaParser.InterfaceMemberDeclarationsContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceMemberDeclarations.
    def exitInterfaceMemberDeclarations(self, ctx:JavaParser.InterfaceMemberDeclarationsContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceMemberDeclaration.
    def enterInterfaceMemberDeclaration(self, ctx:JavaParser.InterfaceMemberDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceMemberDeclaration.
    def exitInterfaceMemberDeclaration(self, ctx:JavaParser.InterfaceMemberDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#constantDeclaration.
    def enterConstantDeclaration(self, ctx:JavaParser.ConstantDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#constantDeclaration.
    def exitConstantDeclaration(self, ctx:JavaParser.ConstantDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#constantModifiers.
    def enterConstantModifiers(self, ctx:JavaParser.ConstantModifiersContext):
        pass

    # Exit a parse tree produced by JavaParser#constantModifiers.
    def exitConstantModifiers(self, ctx:JavaParser.ConstantModifiersContext):
        pass


    # Enter a parse tree produced by JavaParser#abstractMethodDeclaration.
    def enterAbstractMethodDeclaration(self, ctx:JavaParser.AbstractMethodDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#abstractMethodDeclaration.
    def exitAbstractMethodDeclaration(self, ctx:JavaParser.AbstractMethodDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#abstractMethodModifiers.
    def enterAbstractMethodModifiers(self, ctx:JavaParser.AbstractMethodModifiersContext):
        pass

    # Exit a parse tree produced by JavaParser#abstractMethodModifiers.
    def exitAbstractMethodModifiers(self, ctx:JavaParser.AbstractMethodModifiersContext):
        pass


    # Enter a parse tree produced by JavaParser#abstractMethodModifier.
    def enterAbstractMethodModifier(self, ctx:JavaParser.AbstractMethodModifierContext):
        pass

    # Exit a parse tree produced by JavaParser#abstractMethodModifier.
    def exitAbstractMethodModifier(self, ctx:JavaParser.AbstractMethodModifierContext):
        pass


    # Enter a parse tree produced by JavaParser#arrayInitializer.
    def enterArrayInitializer(self, ctx:JavaParser.ArrayInitializerContext):
        pass

    # Exit a parse tree produced by JavaParser#arrayInitializer.
    def exitArrayInitializer(self, ctx:JavaParser.ArrayInitializerContext):
        pass


    # Enter a parse tree produced by JavaParser#variableInitializers.
    def enterVariableInitializers(self, ctx:JavaParser.VariableInitializersContext):
        pass

    # Exit a parse tree produced by JavaParser#variableInitializers.
    def exitVariableInitializers(self, ctx:JavaParser.VariableInitializersContext):
        pass


    # Enter a parse tree produced by JavaParser#type.
    def enterType(self, ctx:JavaParser.TypeContext):
        pass

    # Exit a parse tree produced by JavaParser#type.
    def exitType(self, ctx:JavaParser.TypeContext):
        pass


    # Enter a parse tree produced by JavaParser#primitiveType.
    def enterPrimitiveType(self, ctx:JavaParser.PrimitiveTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#primitiveType.
    def exitPrimitiveType(self, ctx:JavaParser.PrimitiveTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#numericType.
    def enterNumericType(self, ctx:JavaParser.NumericTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#numericType.
    def exitNumericType(self, ctx:JavaParser.NumericTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#integralType.
    def enterIntegralType(self, ctx:JavaParser.IntegralTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#integralType.
    def exitIntegralType(self, ctx:JavaParser.IntegralTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#referenceType.
    def enterReferenceType(self, ctx:JavaParser.ReferenceTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#referenceType.
    def exitReferenceType(self, ctx:JavaParser.ReferenceTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#classOrInterfaceType.
    def enterClassOrInterfaceType(self, ctx:JavaParser.ClassOrInterfaceTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#classOrInterfaceType.
    def exitClassOrInterfaceType(self, ctx:JavaParser.ClassOrInterfaceTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#classType.
    def enterClassType(self, ctx:JavaParser.ClassTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#classType.
    def exitClassType(self, ctx:JavaParser.ClassTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#interfaceType.
    def enterInterfaceType(self, ctx:JavaParser.InterfaceTypeContext):
        pass

    # Exit a parse tree produced by JavaParser#interfaceType.
    def exitInterfaceType(self, ctx:JavaParser.InterfaceTypeContext):
        pass


    # Enter a parse tree produced by JavaParser#block.
    def enterBlock(self, ctx:JavaParser.BlockContext):
        pass

    # Exit a parse tree produced by JavaParser#block.
    def exitBlock(self, ctx:JavaParser.BlockContext):
        pass


    # Enter a parse tree produced by JavaParser#blockStatements.
    def enterBlockStatements(self, ctx:JavaParser.BlockStatementsContext):
        pass

    # Exit a parse tree produced by JavaParser#blockStatements.
    def exitBlockStatements(self, ctx:JavaParser.BlockStatementsContext):
        pass


    # Enter a parse tree produced by JavaParser#blockStatement.
    def enterBlockStatement(self, ctx:JavaParser.BlockStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#blockStatement.
    def exitBlockStatement(self, ctx:JavaParser.BlockStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#localVariableDeclarationStatement.
    def enterLocalVariableDeclarationStatement(self, ctx:JavaParser.LocalVariableDeclarationStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#localVariableDeclarationStatement.
    def exitLocalVariableDeclarationStatement(self, ctx:JavaParser.LocalVariableDeclarationStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#localVariableDeclaration.
    def enterLocalVariableDeclaration(self, ctx:JavaParser.LocalVariableDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#localVariableDeclaration.
    def exitLocalVariableDeclaration(self, ctx:JavaParser.LocalVariableDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#statement.
    def enterStatement(self, ctx:JavaParser.StatementContext):
        pass

    # Exit a parse tree produced by JavaParser#statement.
    def exitStatement(self, ctx:JavaParser.StatementContext):
        pass


    # Enter a parse tree produced by JavaParser#statementNoShortIf.
    def enterStatementNoShortIf(self, ctx:JavaParser.StatementNoShortIfContext):
        pass

    # Exit a parse tree produced by JavaParser#statementNoShortIf.
    def exitStatementNoShortIf(self, ctx:JavaParser.StatementNoShortIfContext):
        pass


    # Enter a parse tree produced by JavaParser#statementWithoutTrailingSubstatement.
    def enterStatementWithoutTrailingSubstatement(self, ctx:JavaParser.StatementWithoutTrailingSubstatementContext):
        pass

    # Exit a parse tree produced by JavaParser#statementWithoutTrailingSubstatement.
    def exitStatementWithoutTrailingSubstatement(self, ctx:JavaParser.StatementWithoutTrailingSubstatementContext):
        pass


    # Enter a parse tree produced by JavaParser#labeledStatement.
    def enterLabeledStatement(self, ctx:JavaParser.LabeledStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#labeledStatement.
    def exitLabeledStatement(self, ctx:JavaParser.LabeledStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#labeledStatementNoShortIf.
    def enterLabeledStatementNoShortIf(self, ctx:JavaParser.LabeledStatementNoShortIfContext):
        pass

    # Exit a parse tree produced by JavaParser#labeledStatementNoShortIf.
    def exitLabeledStatementNoShortIf(self, ctx:JavaParser.LabeledStatementNoShortIfContext):
        pass


    # Enter a parse tree produced by JavaParser#expressionStatement.
    def enterExpressionStatement(self, ctx:JavaParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#expressionStatement.
    def exitExpressionStatement(self, ctx:JavaParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#statementExpression.
    def enterStatementExpression(self, ctx:JavaParser.StatementExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#statementExpression.
    def exitStatementExpression(self, ctx:JavaParser.StatementExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#ifThenStatement.
    def enterIfThenStatement(self, ctx:JavaParser.IfThenStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#ifThenStatement.
    def exitIfThenStatement(self, ctx:JavaParser.IfThenStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#ifThenElseStatement.
    def enterIfThenElseStatement(self, ctx:JavaParser.IfThenElseStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#ifThenElseStatement.
    def exitIfThenElseStatement(self, ctx:JavaParser.IfThenElseStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#ifThenElseStatementNoShortIf.
    def enterIfThenElseStatementNoShortIf(self, ctx:JavaParser.IfThenElseStatementNoShortIfContext):
        pass

    # Exit a parse tree produced by JavaParser#ifThenElseStatementNoShortIf.
    def exitIfThenElseStatementNoShortIf(self, ctx:JavaParser.IfThenElseStatementNoShortIfContext):
        pass


    # Enter a parse tree produced by JavaParser#switchStatement.
    def enterSwitchStatement(self, ctx:JavaParser.SwitchStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#switchStatement.
    def exitSwitchStatement(self, ctx:JavaParser.SwitchStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#switchBlock.
    def enterSwitchBlock(self, ctx:JavaParser.SwitchBlockContext):
        pass

    # Exit a parse tree produced by JavaParser#switchBlock.
    def exitSwitchBlock(self, ctx:JavaParser.SwitchBlockContext):
        pass


    # Enter a parse tree produced by JavaParser#switchBlockStatementGroups.
    def enterSwitchBlockStatementGroups(self, ctx:JavaParser.SwitchBlockStatementGroupsContext):
        pass

    # Exit a parse tree produced by JavaParser#switchBlockStatementGroups.
    def exitSwitchBlockStatementGroups(self, ctx:JavaParser.SwitchBlockStatementGroupsContext):
        pass


    # Enter a parse tree produced by JavaParser#switchBlockStatementGroup.
    def enterSwitchBlockStatementGroup(self, ctx:JavaParser.SwitchBlockStatementGroupContext):
        pass

    # Exit a parse tree produced by JavaParser#switchBlockStatementGroup.
    def exitSwitchBlockStatementGroup(self, ctx:JavaParser.SwitchBlockStatementGroupContext):
        pass


    # Enter a parse tree produced by JavaParser#switchLabels.
    def enterSwitchLabels(self, ctx:JavaParser.SwitchLabelsContext):
        pass

    # Exit a parse tree produced by JavaParser#switchLabels.
    def exitSwitchLabels(self, ctx:JavaParser.SwitchLabelsContext):
        pass


    # Enter a parse tree produced by JavaParser#switchLabel.
    def enterSwitchLabel(self, ctx:JavaParser.SwitchLabelContext):
        pass

    # Exit a parse tree produced by JavaParser#switchLabel.
    def exitSwitchLabel(self, ctx:JavaParser.SwitchLabelContext):
        pass


    # Enter a parse tree produced by JavaParser#whileStatement.
    def enterWhileStatement(self, ctx:JavaParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#whileStatement.
    def exitWhileStatement(self, ctx:JavaParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#whileStatementNoShortIf.
    def enterWhileStatementNoShortIf(self, ctx:JavaParser.WhileStatementNoShortIfContext):
        pass

    # Exit a parse tree produced by JavaParser#whileStatementNoShortIf.
    def exitWhileStatementNoShortIf(self, ctx:JavaParser.WhileStatementNoShortIfContext):
        pass


    # Enter a parse tree produced by JavaParser#doStatement.
    def enterDoStatement(self, ctx:JavaParser.DoStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#doStatement.
    def exitDoStatement(self, ctx:JavaParser.DoStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#forStatement.
    def enterForStatement(self, ctx:JavaParser.ForStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#forStatement.
    def exitForStatement(self, ctx:JavaParser.ForStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#forStatementNoShortIf.
    def enterForStatementNoShortIf(self, ctx:JavaParser.ForStatementNoShortIfContext):
        pass

    # Exit a parse tree produced by JavaParser#forStatementNoShortIf.
    def exitForStatementNoShortIf(self, ctx:JavaParser.ForStatementNoShortIfContext):
        pass


    # Enter a parse tree produced by JavaParser#forInit.
    def enterForInit(self, ctx:JavaParser.ForInitContext):
        pass

    # Exit a parse tree produced by JavaParser#forInit.
    def exitForInit(self, ctx:JavaParser.ForInitContext):
        pass


    # Enter a parse tree produced by JavaParser#forUpdate.
    def enterForUpdate(self, ctx:JavaParser.ForUpdateContext):
        pass

    # Exit a parse tree produced by JavaParser#forUpdate.
    def exitForUpdate(self, ctx:JavaParser.ForUpdateContext):
        pass


    # Enter a parse tree produced by JavaParser#statementExpressionList.
    def enterStatementExpressionList(self, ctx:JavaParser.StatementExpressionListContext):
        pass

    # Exit a parse tree produced by JavaParser#statementExpressionList.
    def exitStatementExpressionList(self, ctx:JavaParser.StatementExpressionListContext):
        pass


    # Enter a parse tree produced by JavaParser#breakStatement.
    def enterBreakStatement(self, ctx:JavaParser.BreakStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#breakStatement.
    def exitBreakStatement(self, ctx:JavaParser.BreakStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#continueStatement.
    def enterContinueStatement(self, ctx:JavaParser.ContinueStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#continueStatement.
    def exitContinueStatement(self, ctx:JavaParser.ContinueStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#returnStatement.
    def enterReturnStatement(self, ctx:JavaParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#returnStatement.
    def exitReturnStatement(self, ctx:JavaParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#throwsRuleStatement.
    def enterThrowsRuleStatement(self, ctx:JavaParser.ThrowsRuleStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#throwsRuleStatement.
    def exitThrowsRuleStatement(self, ctx:JavaParser.ThrowsRuleStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#synchronizedStatement.
    def enterSynchronizedStatement(self, ctx:JavaParser.SynchronizedStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#synchronizedStatement.
    def exitSynchronizedStatement(self, ctx:JavaParser.SynchronizedStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#tryStatement.
    def enterTryStatement(self, ctx:JavaParser.TryStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#tryStatement.
    def exitTryStatement(self, ctx:JavaParser.TryStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#catches.
    def enterCatches(self, ctx:JavaParser.CatchesContext):
        pass

    # Exit a parse tree produced by JavaParser#catches.
    def exitCatches(self, ctx:JavaParser.CatchesContext):
        pass


    # Enter a parse tree produced by JavaParser#catchClause.
    def enterCatchClause(self, ctx:JavaParser.CatchClauseContext):
        pass

    # Exit a parse tree produced by JavaParser#catchClause.
    def exitCatchClause(self, ctx:JavaParser.CatchClauseContext):
        pass


    # Enter a parse tree produced by JavaParser#finallyRule.
    def enterFinallyRule(self, ctx:JavaParser.FinallyRuleContext):
        pass

    # Exit a parse tree produced by JavaParser#finallyRule.
    def exitFinallyRule(self, ctx:JavaParser.FinallyRuleContext):
        pass


    # Enter a parse tree produced by JavaParser#constantExpression.
    def enterConstantExpression(self, ctx:JavaParser.ConstantExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#constantExpression.
    def exitConstantExpression(self, ctx:JavaParser.ConstantExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#expression.
    def enterExpression(self, ctx:JavaParser.ExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#expression.
    def exitExpression(self, ctx:JavaParser.ExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#assignmentExpression.
    def enterAssignmentExpression(self, ctx:JavaParser.AssignmentExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#assignmentExpression.
    def exitAssignmentExpression(self, ctx:JavaParser.AssignmentExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#assignment.
    def enterAssignment(self, ctx:JavaParser.AssignmentContext):
        pass

    # Exit a parse tree produced by JavaParser#assignment.
    def exitAssignment(self, ctx:JavaParser.AssignmentContext):
        pass


    # Enter a parse tree produced by JavaParser#leftHandSide.
    def enterLeftHandSide(self, ctx:JavaParser.LeftHandSideContext):
        pass

    # Exit a parse tree produced by JavaParser#leftHandSide.
    def exitLeftHandSide(self, ctx:JavaParser.LeftHandSideContext):
        pass


    # Enter a parse tree produced by JavaParser#assignmentOperator.
    def enterAssignmentOperator(self, ctx:JavaParser.AssignmentOperatorContext):
        pass

    # Exit a parse tree produced by JavaParser#assignmentOperator.
    def exitAssignmentOperator(self, ctx:JavaParser.AssignmentOperatorContext):
        pass


    # Enter a parse tree produced by JavaParser#conditionalExpression.
    def enterConditionalExpression(self, ctx:JavaParser.ConditionalExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#conditionalExpression.
    def exitConditionalExpression(self, ctx:JavaParser.ConditionalExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#conditionalOrExpression.
    def enterConditionalOrExpression(self, ctx:JavaParser.ConditionalOrExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#conditionalOrExpression.
    def exitConditionalOrExpression(self, ctx:JavaParser.ConditionalOrExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#conditionalAndExpression.
    def enterConditionalAndExpression(self, ctx:JavaParser.ConditionalAndExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#conditionalAndExpression.
    def exitConditionalAndExpression(self, ctx:JavaParser.ConditionalAndExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#inclusiveOrExpression.
    def enterInclusiveOrExpression(self, ctx:JavaParser.InclusiveOrExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#inclusiveOrExpression.
    def exitInclusiveOrExpression(self, ctx:JavaParser.InclusiveOrExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#exclusiveOrExpression.
    def enterExclusiveOrExpression(self, ctx:JavaParser.ExclusiveOrExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#exclusiveOrExpression.
    def exitExclusiveOrExpression(self, ctx:JavaParser.ExclusiveOrExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#andExpression.
    def enterAndExpression(self, ctx:JavaParser.AndExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#andExpression.
    def exitAndExpression(self, ctx:JavaParser.AndExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#equalityExpression.
    def enterEqualityExpression(self, ctx:JavaParser.EqualityExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#equalityExpression.
    def exitEqualityExpression(self, ctx:JavaParser.EqualityExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#relationalExpression.
    def enterRelationalExpression(self, ctx:JavaParser.RelationalExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#relationalExpression.
    def exitRelationalExpression(self, ctx:JavaParser.RelationalExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#shiftExpression.
    def enterShiftExpression(self, ctx:JavaParser.ShiftExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#shiftExpression.
    def exitShiftExpression(self, ctx:JavaParser.ShiftExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#additiveExpression.
    def enterAdditiveExpression(self, ctx:JavaParser.AdditiveExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#additiveExpression.
    def exitAdditiveExpression(self, ctx:JavaParser.AdditiveExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#multiplicativeExpression.
    def enterMultiplicativeExpression(self, ctx:JavaParser.MultiplicativeExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#multiplicativeExpression.
    def exitMultiplicativeExpression(self, ctx:JavaParser.MultiplicativeExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#castExpression.
    def enterCastExpression(self, ctx:JavaParser.CastExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#castExpression.
    def exitCastExpression(self, ctx:JavaParser.CastExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#unaryExpression.
    def enterUnaryExpression(self, ctx:JavaParser.UnaryExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#unaryExpression.
    def exitUnaryExpression(self, ctx:JavaParser.UnaryExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#preDecrementExpression.
    def enterPreDecrementExpression(self, ctx:JavaParser.PreDecrementExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#preDecrementExpression.
    def exitPreDecrementExpression(self, ctx:JavaParser.PreDecrementExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#preIncrementExpression.
    def enterPreIncrementExpression(self, ctx:JavaParser.PreIncrementExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#preIncrementExpression.
    def exitPreIncrementExpression(self, ctx:JavaParser.PreIncrementExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#unaryExpressionNotPlusMinus.
    def enterUnaryExpressionNotPlusMinus(self, ctx:JavaParser.UnaryExpressionNotPlusMinusContext):
        pass

    # Exit a parse tree produced by JavaParser#unaryExpressionNotPlusMinus.
    def exitUnaryExpressionNotPlusMinus(self, ctx:JavaParser.UnaryExpressionNotPlusMinusContext):
        pass


    # Enter a parse tree produced by JavaParser#postdecrementExpression.
    def enterPostdecrementExpression(self, ctx:JavaParser.PostdecrementExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#postdecrementExpression.
    def exitPostdecrementExpression(self, ctx:JavaParser.PostdecrementExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#postincrementExpression.
    def enterPostincrementExpression(self, ctx:JavaParser.PostincrementExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#postincrementExpression.
    def exitPostincrementExpression(self, ctx:JavaParser.PostincrementExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#postfixExpression.
    def enterPostfixExpression(self, ctx:JavaParser.PostfixExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#postfixExpression.
    def exitPostfixExpression(self, ctx:JavaParser.PostfixExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#methodInvocation.
    def enterMethodInvocation(self, ctx:JavaParser.MethodInvocationContext):
        pass

    # Exit a parse tree produced by JavaParser#methodInvocation.
    def exitMethodInvocation(self, ctx:JavaParser.MethodInvocationContext):
        pass


    # Enter a parse tree produced by JavaParser#fieldAccess.
    def enterFieldAccess(self, ctx:JavaParser.FieldAccessContext):
        pass

    # Exit a parse tree produced by JavaParser#fieldAccess.
    def exitFieldAccess(self, ctx:JavaParser.FieldAccessContext):
        pass


    # Enter a parse tree produced by JavaParser#primary.
    def enterPrimary(self, ctx:JavaParser.PrimaryContext):
        pass

    # Exit a parse tree produced by JavaParser#primary.
    def exitPrimary(self, ctx:JavaParser.PrimaryContext):
        pass


    # Enter a parse tree produced by JavaParser#primaryNoNewArray.
    def enterPrimaryNoNewArray(self, ctx:JavaParser.PrimaryNoNewArrayContext):
        pass

    # Exit a parse tree produced by JavaParser#primaryNoNewArray.
    def exitPrimaryNoNewArray(self, ctx:JavaParser.PrimaryNoNewArrayContext):
        pass


    # Enter a parse tree produced by JavaParser#classInstanceCreationExpression.
    def enterClassInstanceCreationExpression(self, ctx:JavaParser.ClassInstanceCreationExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#classInstanceCreationExpression.
    def exitClassInstanceCreationExpression(self, ctx:JavaParser.ClassInstanceCreationExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#argumentlist.
    def enterArgumentlist(self, ctx:JavaParser.ArgumentlistContext):
        pass

    # Exit a parse tree produced by JavaParser#argumentlist.
    def exitArgumentlist(self, ctx:JavaParser.ArgumentlistContext):
        pass


    # Enter a parse tree produced by JavaParser#arrayCreationExpression.
    def enterArrayCreationExpression(self, ctx:JavaParser.ArrayCreationExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#arrayCreationExpression.
    def exitArrayCreationExpression(self, ctx:JavaParser.ArrayCreationExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#dimExprs.
    def enterDimExprs(self, ctx:JavaParser.DimExprsContext):
        pass

    # Exit a parse tree produced by JavaParser#dimExprs.
    def exitDimExprs(self, ctx:JavaParser.DimExprsContext):
        pass


    # Enter a parse tree produced by JavaParser#dimExpr.
    def enterDimExpr(self, ctx:JavaParser.DimExprContext):
        pass

    # Exit a parse tree produced by JavaParser#dimExpr.
    def exitDimExpr(self, ctx:JavaParser.DimExprContext):
        pass


    # Enter a parse tree produced by JavaParser#dims.
    def enterDims(self, ctx:JavaParser.DimsContext):
        pass

    # Exit a parse tree produced by JavaParser#dims.
    def exitDims(self, ctx:JavaParser.DimsContext):
        pass


    # Enter a parse tree produced by JavaParser#arrayAccess.
    def enterArrayAccess(self, ctx:JavaParser.ArrayAccessContext):
        pass

    # Exit a parse tree produced by JavaParser#arrayAccess.
    def exitArrayAccess(self, ctx:JavaParser.ArrayAccessContext):
        pass


    # Enter a parse tree produced by JavaParser#packageName.
    def enterPackageName(self, ctx:JavaParser.PackageNameContext):
        pass

    # Exit a parse tree produced by JavaParser#packageName.
    def exitPackageName(self, ctx:JavaParser.PackageNameContext):
        pass


    # Enter a parse tree produced by JavaParser#typeName.
    def enterTypeName(self, ctx:JavaParser.TypeNameContext):
        pass

    # Exit a parse tree produced by JavaParser#typeName.
    def exitTypeName(self, ctx:JavaParser.TypeNameContext):
        pass


    # Enter a parse tree produced by JavaParser#simpleTypeName.
    def enterSimpleTypeName(self, ctx:JavaParser.SimpleTypeNameContext):
        pass

    # Exit a parse tree produced by JavaParser#simpleTypeName.
    def exitSimpleTypeName(self, ctx:JavaParser.SimpleTypeNameContext):
        pass


    # Enter a parse tree produced by JavaParser#expressionName.
    def enterExpressionName(self, ctx:JavaParser.ExpressionNameContext):
        pass

    # Exit a parse tree produced by JavaParser#expressionName.
    def exitExpressionName(self, ctx:JavaParser.ExpressionNameContext):
        pass


    # Enter a parse tree produced by JavaParser#methodName.
    def enterMethodName(self, ctx:JavaParser.MethodNameContext):
        pass

    # Exit a parse tree produced by JavaParser#methodName.
    def exitMethodName(self, ctx:JavaParser.MethodNameContext):
        pass


    # Enter a parse tree produced by JavaParser#ambiguousName.
    def enterAmbiguousName(self, ctx:JavaParser.AmbiguousNameContext):
        pass

    # Exit a parse tree produced by JavaParser#ambiguousName.
    def exitAmbiguousName(self, ctx:JavaParser.AmbiguousNameContext):
        pass


    # Enter a parse tree produced by JavaParser#literal.
    def enterLiteral(self, ctx:JavaParser.LiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#literal.
    def exitLiteral(self, ctx:JavaParser.LiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#integerLiteral.
    def enterIntegerLiteral(self, ctx:JavaParser.IntegerLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#integerLiteral.
    def exitIntegerLiteral(self, ctx:JavaParser.IntegerLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#decimalIntegerLiteral.
    def enterDecimalIntegerLiteral(self, ctx:JavaParser.DecimalIntegerLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#decimalIntegerLiteral.
    def exitDecimalIntegerLiteral(self, ctx:JavaParser.DecimalIntegerLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#hexIntegerLiteral.
    def enterHexIntegerLiteral(self, ctx:JavaParser.HexIntegerLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#hexIntegerLiteral.
    def exitHexIntegerLiteral(self, ctx:JavaParser.HexIntegerLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#octalIntegerLiteral.
    def enterOctalIntegerLiteral(self, ctx:JavaParser.OctalIntegerLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#octalIntegerLiteral.
    def exitOctalIntegerLiteral(self, ctx:JavaParser.OctalIntegerLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#decimalNumeral.
    def enterDecimalNumeral(self, ctx:JavaParser.DecimalNumeralContext):
        pass

    # Exit a parse tree produced by JavaParser#decimalNumeral.
    def exitDecimalNumeral(self, ctx:JavaParser.DecimalNumeralContext):
        pass


    # Enter a parse tree produced by JavaParser#digits.
    def enterDigits(self, ctx:JavaParser.DigitsContext):
        pass

    # Exit a parse tree produced by JavaParser#digits.
    def exitDigits(self, ctx:JavaParser.DigitsContext):
        pass


    # Enter a parse tree produced by JavaParser#floatingPointLiteral.
    def enterFloatingPointLiteral(self, ctx:JavaParser.FloatingPointLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#floatingPointLiteral.
    def exitFloatingPointLiteral(self, ctx:JavaParser.FloatingPointLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#exponentPart.
    def enterExponentPart(self, ctx:JavaParser.ExponentPartContext):
        pass

    # Exit a parse tree produced by JavaParser#exponentPart.
    def exitExponentPart(self, ctx:JavaParser.ExponentPartContext):
        pass


    # Enter a parse tree produced by JavaParser#exponentIndicator.
    def enterExponentIndicator(self, ctx:JavaParser.ExponentIndicatorContext):
        pass

    # Exit a parse tree produced by JavaParser#exponentIndicator.
    def exitExponentIndicator(self, ctx:JavaParser.ExponentIndicatorContext):
        pass


    # Enter a parse tree produced by JavaParser#signedInteger.
    def enterSignedInteger(self, ctx:JavaParser.SignedIntegerContext):
        pass

    # Exit a parse tree produced by JavaParser#signedInteger.
    def exitSignedInteger(self, ctx:JavaParser.SignedIntegerContext):
        pass


    # Enter a parse tree produced by JavaParser#sign.
    def enterSign(self, ctx:JavaParser.SignContext):
        pass

    # Exit a parse tree produced by JavaParser#sign.
    def exitSign(self, ctx:JavaParser.SignContext):
        pass


    # Enter a parse tree produced by JavaParser#floatTypeSuffix.
    def enterFloatTypeSuffix(self, ctx:JavaParser.FloatTypeSuffixContext):
        pass

    # Exit a parse tree produced by JavaParser#floatTypeSuffix.
    def exitFloatTypeSuffix(self, ctx:JavaParser.FloatTypeSuffixContext):
        pass


    # Enter a parse tree produced by JavaParser#booleanLiteral.
    def enterBooleanLiteral(self, ctx:JavaParser.BooleanLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#booleanLiteral.
    def exitBooleanLiteral(self, ctx:JavaParser.BooleanLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#characterLiteral.
    def enterCharacterLiteral(self, ctx:JavaParser.CharacterLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#characterLiteral.
    def exitCharacterLiteral(self, ctx:JavaParser.CharacterLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#stringLiteral.
    def enterStringLiteral(self, ctx:JavaParser.StringLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#stringLiteral.
    def exitStringLiteral(self, ctx:JavaParser.StringLiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#nullLiteral.
    def enterNullLiteral(self, ctx:JavaParser.NullLiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#nullLiteral.
    def exitNullLiteral(self, ctx:JavaParser.NullLiteralContext):
        pass



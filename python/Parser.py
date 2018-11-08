from antlr4 import *
from JavaParserListener import *
class Parser(JavaParserListener):
    def exitCompilationUnit(self, ctx:JavaParser.CompilationUnitContext):
        print("programa")
import sys
from antlr4 import *
from JavaLexer import JavaLexer
from JavaParser import JavaParser
from Parser import *
 
def main(argv):
    input = FileStream(argv[1])
    lexer = JavaLexer(input)
    stream = CommonTokenStream(lexer)
    parser = JavaParser(stream)
    tree = parser.compilationUnit()
    printer = Parser()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
 
if __name__ == '__main__':
    main(sys.argv)
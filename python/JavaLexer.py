# Generated from /home/franciscone/Faculdade/Codigos/compilers/compiler/src/scanner/JavaLexer.g4 by ANTLR 4.7
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2i")
        buf.write("\u02ef\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%")
        buf.write("\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.")
        buf.write("\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64")
        buf.write("\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:")
        buf.write("\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\t")
        buf.write("C\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\t")
        buf.write("L\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT\4U\t")
        buf.write("U\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4")
        buf.write("^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4")
        buf.write("g\tg\4h\th\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\3\2\3\2\3\3\3")
        buf.write("\3\3\4\3\4\3\5\3\5\3\6\6\6\u00e5\n\6\r\6\16\6\u00e6\3")
        buf.write("\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ef\n\7\f\7\16\7\u00f2\13")
        buf.write("\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fc\n\b\3\b\7")
        buf.write("\b\u00ff\n\b\f\b\16\b\u0102\13\b\3\t\3\t\6\t\u0106\n\t")
        buf.write("\r\t\16\t\u0107\3\n\3\n\7\n\u010c\n\n\f\n\16\n\u010f\13")
        buf.write("\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16")
        buf.write("\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23")
        buf.write("\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013b")
        buf.write("\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25")
        buf.write("\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27")
        buf.write("\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30")
        buf.write("\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31")
        buf.write("\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33")
        buf.write("\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35")
        buf.write("\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36")
        buf.write("\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3")
        buf.write(" \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"")
        buf.write("\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3")
        buf.write("#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3")
        buf.write("&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3")
        buf.write("(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3")
        buf.write("+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3")
        buf.write(",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3")
        buf.write("\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63")
        buf.write("\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66")
        buf.write("\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3")
        buf.write("<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3")
        buf.write("B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3")
        buf.write("J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3")
        buf.write("Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3")
        buf.write("Z\3Z\3[\3[\3[\3[\3[\5[\u027d\n[\3\\\3\\\3\\\3]\3]\3]\3")
        buf.write("]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3")
        buf.write("`\3`\3`\3`\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3d\3")
        buf.write("d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3")
        buf.write("f\3f\3f\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3")
        buf.write("i\3i\3i\3j\3j\3k\3k\3k\3k\3k\7k\u02d7\nk\fk\16k\u02da")
        buf.write("\13k\3k\3k\3l\3l\3l\3l\7l\u02e2\nl\fl\16l\u02e5\13l\3")
        buf.write("m\3m\3m\3m\7m\u02eb\nm\fm\16m\u02ee\13m\2\2n\3\2\5\2\7")
        buf.write("\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35")
        buf.write("\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65")
        buf.write("\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(")
        buf.write("W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65q\66s\67u8w9y:{")
        buf.write(";}<\177=\u0081>\u0083?\u0085@\u0087A\u0089B\u008bC\u008d")
        buf.write("D\u008fE\u0091F\u0093G\u0095H\u0097I\u0099J\u009bK\u009d")
        buf.write("L\u009fM\u00a1N\u00a3O\u00a5P\u00a7Q\u00a9R\u00abS\u00ad")
        buf.write("T\u00afU\u00b1V\u00b3W\u00b5\2\u00b7X\u00b9Y\u00bbZ\u00bd")
        buf.write("[\u00bf\\\u00c1]\u00c3^\u00c5_\u00c7`\u00c9a\u00cbb\u00cd")
        buf.write("c\u00cfd\u00d1e\u00d3f\u00d5g\u00d7h\u00d9i\3\2\t\4\2")
        buf.write("C\\c|\5\2\62;CHch\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2")
        buf.write("NNnn\6\2FFHHffhh\4\2GGgg\2\u02fe\2\13\3\2\2\2\2\r\3\2")
        buf.write("\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2")
        buf.write("\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2")
        buf.write("\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2")
        buf.write("\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61")
        buf.write("\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2")
        buf.write("\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3")
        buf.write("\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M")
        buf.write("\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2")
        buf.write("W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2")
        buf.write("\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2")
        buf.write("\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2")
        buf.write("\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3")
        buf.write("\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2")
        buf.write("\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b")
        buf.write("\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2")
        buf.write("\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099")
        buf.write("\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2")
        buf.write("\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7")
        buf.write("\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2")
        buf.write("\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b7")
        buf.write("\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2")
        buf.write("\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5")
        buf.write("\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2")
        buf.write("\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3")
        buf.write("\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2")
        buf.write("\2\3\u00db\3\2\2\2\5\u00dd\3\2\2\2\7\u00df\3\2\2\2\t\u00e1")
        buf.write("\3\2\2\2\13\u00e4\3\2\2\2\r\u00ea\3\2\2\2\17\u00fb\3\2")
        buf.write("\2\2\21\u0103\3\2\2\2\23\u0109\3\2\2\2\25\u0110\3\2\2")
        buf.write("\2\27\u0112\3\2\2\2\31\u0114\3\2\2\2\33\u0116\3\2\2\2")
        buf.write("\35\u011c\3\2\2\2\37\u0121\3\2\2\2!\u0125\3\2\2\2#\u012a")
        buf.write("\3\2\2\2%\u013a\3\2\2\2\'\u013c\3\2\2\2)\u0144\3\2\2\2")
        buf.write("+\u0148\3\2\2\2-\u0150\3\2\2\2/\u0157\3\2\2\2\61\u015d")
        buf.write("\3\2\2\2\63\u0168\3\2\2\2\65\u016d\3\2\2\2\67\u0173\3")
        buf.write("\2\2\29\u017c\3\2\2\2;\u0182\3\2\2\2=\u0189\3\2\2\2?\u0191")
        buf.write("\3\2\2\2A\u019b\3\2\2\2C\u01a3\3\2\2\2E\u01ae\3\2\2\2")
        buf.write("G\u01b5\3\2\2\2I\u01ba\3\2\2\2K\u01c0\3\2\2\2M\u01ca\3")
        buf.write("\2\2\2O\u01d3\3\2\2\2Q\u01d9\3\2\2\2S\u01e0\3\2\2\2U\u01e5")
        buf.write("\3\2\2\2W\u01f2\3\2\2\2Y\u01f9\3\2\2\2[\u0203\3\2\2\2")
        buf.write("]\u0205\3\2\2\2_\u0208\3\2\2\2a\u020b\3\2\2\2c\u020e\3")
        buf.write("\2\2\2e\u0211\3\2\2\2g\u0215\3\2\2\2i\u0219\3\2\2\2k\u021e")
        buf.write("\3\2\2\2m\u0221\3\2\2\2o\u0224\3\2\2\2q\u0227\3\2\2\2")
        buf.write("s\u0229\3\2\2\2u\u022b\3\2\2\2w\u022d\3\2\2\2y\u022f\3")
        buf.write("\2\2\2{\u0232\3\2\2\2}\u0235\3\2\2\2\177\u0238\3\2\2\2")
        buf.write("\u0081\u023b\3\2\2\2\u0083\u023e\3\2\2\2\u0085\u0241\3")
        buf.write("\2\2\2\u0087\u0244\3\2\2\2\u0089\u0246\3\2\2\2\u008b\u0248")
        buf.write("\3\2\2\2\u008d\u024a\3\2\2\2\u008f\u024c\3\2\2\2\u0091")
        buf.write("\u024e\3\2\2\2\u0093\u0251\3\2\2\2\u0095\u0254\3\2\2\2")
        buf.write("\u0097\u0257\3\2\2\2\u0099\u025b\3\2\2\2\u009b\u025d\3")
        buf.write("\2\2\2\u009d\u025f\3\2\2\2\u009f\u0261\3\2\2\2\u00a1\u0263")
        buf.write("\3\2\2\2\u00a3\u0265\3\2\2\2\u00a5\u0267\3\2\2\2\u00a7")
        buf.write("\u0269\3\2\2\2\u00a9\u026b\3\2\2\2\u00ab\u026d\3\2\2\2")
        buf.write("\u00ad\u026f\3\2\2\2\u00af\u0271\3\2\2\2\u00b1\u0273\3")
        buf.write("\2\2\2\u00b3\u0275\3\2\2\2\u00b5\u027c\3\2\2\2\u00b7\u027e")
        buf.write("\3\2\2\2\u00b9\u0281\3\2\2\2\u00bb\u0286\3\2\2\2\u00bd")
        buf.write("\u028b\3\2\2\2\u00bf\u0293\3\2\2\2\u00c1\u029a\3\2\2\2")
        buf.write("\u00c3\u029d\3\2\2\2\u00c5\u02a3\3\2\2\2\u00c7\u02a7\3")
        buf.write("\2\2\2\u00c9\u02ad\3\2\2\2\u00cb\u02b6\3\2\2\2\u00cd\u02bd")
        buf.write("\3\2\2\2\u00cf\u02c1\3\2\2\2\u00d1\u02c7\3\2\2\2\u00d3")
        buf.write("\u02cf\3\2\2\2\u00d5\u02d1\3\2\2\2\u00d7\u02dd\3\2\2\2")
        buf.write("\u00d9\u02e6\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc\4\3\2\2")
        buf.write("\2\u00dd\u00de\4\62;\2\u00de\6\3\2\2\2\u00df\u00e0\4\62")
        buf.write("9\2\u00e0\b\3\2\2\2\u00e1\u00e2\t\3\2\2\u00e2\n\3\2\2")
        buf.write("\2\u00e3\u00e5\t\4\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6")
        buf.write("\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7")
        buf.write("\u00e8\3\2\2\2\u00e8\u00e9\b\6\2\2\u00e9\f\3\2\2\2\u00ea")
        buf.write("\u00eb\7\61\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00f0\3\2\2")
        buf.write("\2\u00ed\u00ef\n\5\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2")
        buf.write("\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1")
        buf.write("\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\7\2\2")
        buf.write("\u00f4\16\3\2\2\2\u00f5\u00f6\7\62\2\2\u00f6\u00f7\7z")
        buf.write("\2\2\u00f7\u00fc\5\t\5\2\u00f8\u00f9\7\62\2\2\u00f9\u00fa")
        buf.write("\7Z\2\2\u00fa\u00fc\5\t\5\2\u00fb\u00f5\3\2\2\2\u00fb")
        buf.write("\u00f8\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\5\t\5\2")
        buf.write("\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3")
        buf.write("\2\2\2\u0100\u0101\3\2\2\2\u0101\20\3\2\2\2\u0102\u0100")
        buf.write("\3\2\2\2\u0103\u0105\7\62\2\2\u0104\u0106\5\7\4\2\u0105")
        buf.write("\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2")
        buf.write("\u0107\u0108\3\2\2\2\u0108\22\3\2\2\2\u0109\u010d\5\5")
        buf.write("\3\2\u010a\u010c\5\5\3\2\u010b\u010a\3\2\2\2\u010c\u010f")
        buf.write("\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e")
        buf.write("\24\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\t\6\2\2\u0111")
        buf.write("\26\3\2\2\2\u0112\u0113\t\7\2\2\u0113\30\3\2\2\2\u0114")
        buf.write("\u0115\t\b\2\2\u0115\32\3\2\2\2\u0116\u0117\7u\2\2\u0117")
        buf.write("\u0118\7j\2\2\u0118\u0119\7q\2\2\u0119\u011a\7t\2\2\u011a")
        buf.write("\u011b\7v\2\2\u011b\34\3\2\2\2\u011c\u011d\7d\2\2\u011d")
        buf.write("\u011e\7{\2\2\u011e\u011f\7v\2\2\u011f\u0120\7g\2\2\u0120")
        buf.write("\36\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123")
        buf.write("\u0124\7v\2\2\u0124 \3\2\2\2\u0125\u0126\7n\2\2\u0126")
        buf.write("\u0127\7q\2\2\u0127\u0128\7p\2\2\u0128\u0129\7i\2\2\u0129")
        buf.write("\"\3\2\2\2\u012a\u012b\7e\2\2\u012b\u012c\7j\2\2\u012c")
        buf.write("\u012d\7c\2\2\u012d\u012e\7t\2\2\u012e$\3\2\2\2\u012f")
        buf.write("\u0130\7h\2\2\u0130\u0131\7n\2\2\u0131\u0132\7q\2\2\u0132")
        buf.write("\u0133\7c\2\2\u0133\u013b\7v\2\2\u0134\u0135\7f\2\2\u0135")
        buf.write("\u0136\7q\2\2\u0136\u0137\7w\2\2\u0137\u0138\7d\2\2\u0138")
        buf.write("\u0139\7n\2\2\u0139\u013b\7g\2\2\u013a\u012f\3\2\2\2\u013a")
        buf.write("\u0134\3\2\2\2\u013b&\3\2\2\2\u013c\u013d\7d\2\2\u013d")
        buf.write("\u013e\7q\2\2\u013e\u013f\7q\2\2\u013f\u0140\7n\2\2\u0140")
        buf.write("\u0141\7g\2\2\u0141\u0142\7c\2\2\u0142\u0143\7p\2\2\u0143")
        buf.write("(\3\2\2\2\u0144\u0145\7p\2\2\u0145\u0146\7g\2\2\u0146")
        buf.write("\u0147\7y\2\2\u0147*\3\2\2\2\u0148\u0149\7r\2\2\u0149")
        buf.write("\u014a\7c\2\2\u014a\u014b\7e\2\2\u014b\u014c\7m\2\2\u014c")
        buf.write("\u014d\7c\2\2\u014d\u014e\7i\2\2\u014e\u014f\7g\2\2\u014f")
        buf.write(",\3\2\2\2\u0150\u0151\7k\2\2\u0151\u0152\7o\2\2\u0152")
        buf.write("\u0153\7r\2\2\u0153\u0154\7q\2\2\u0154\u0155\7t\2\2\u0155")
        buf.write("\u0156\7v\2\2\u0156.\3\2\2\2\u0157\u0158\7e\2\2\u0158")
        buf.write("\u0159\7q\2\2\u0159\u015a\7p\2\2\u015a\u015b\7u\2\2\u015b")
        buf.write("\u015c\7v\2\2\u015c\60\3\2\2\2\u015d\u015e\7k\2\2\u015e")
        buf.write("\u015f\7p\2\2\u015f\u0160\7u\2\2\u0160\u0161\7v\2\2\u0161")
        buf.write("\u0162\7c\2\2\u0162\u0163\7p\2\2\u0163\u0164\7e\2\2\u0164")
        buf.write("\u0165\7g\2\2\u0165\u0166\7q\2\2\u0166\u0167\7h\2\2\u0167")
        buf.write("\62\3\2\2\2\u0168\u0169\7i\2\2\u0169\u016a\7q\2\2\u016a")
        buf.write("\u016b\7v\2\2\u016b\u016c\7q\2\2\u016c\64\3\2\2\2\u016d")
        buf.write("\u016e\7e\2\2\u016e\u016f\7n\2\2\u016f\u0170\7c\2\2\u0170")
        buf.write("\u0171\7u\2\2\u0171\u0172\7u\2\2\u0172\66\3\2\2\2\u0173")
        buf.write("\u0174\7c\2\2\u0174\u0175\7d\2\2\u0175\u0176\7u\2\2\u0176")
        buf.write("\u0177\7v\2\2\u0177\u0178\7t\2\2\u0178\u0179\7c\2\2\u0179")
        buf.write("\u017a\7e\2\2\u017a\u017b\7v\2\2\u017b8\3\2\2\2\u017c")
        buf.write("\u017d\7h\2\2\u017d\u017e\7k\2\2\u017e\u017f\7p\2\2\u017f")
        buf.write("\u0180\7c\2\2\u0180\u0181\7n\2\2\u0181:\3\2\2\2\u0182")
        buf.write("\u0183\7r\2\2\u0183\u0184\7w\2\2\u0184\u0185\7d\2\2\u0185")
        buf.write("\u0186\7n\2\2\u0186\u0187\7k\2\2\u0187\u0188\7e\2\2\u0188")
        buf.write("<\3\2\2\2\u0189\u018a\7r\2\2\u018a\u018b\7t\2\2\u018b")
        buf.write("\u018c\7k\2\2\u018c\u018d\7x\2\2\u018d\u018e\7c\2\2\u018e")
        buf.write("\u018f\7v\2\2\u018f\u0190\7g\2\2\u0190>\3\2\2\2\u0191")
        buf.write("\u0192\7r\2\2\u0192\u0193\7t\2\2\u0193\u0194\7q\2\2\u0194")
        buf.write("\u0195\7v\2\2\u0195\u0196\7g\2\2\u0196\u0197\7e\2\2\u0197")
        buf.write("\u0198\7v\2\2\u0198\u0199\7g\2\2\u0199\u019a\7f\2\2\u019a")
        buf.write("@\3\2\2\2\u019b\u019c\7g\2\2\u019c\u019d\7z\2\2\u019d")
        buf.write("\u019e\7v\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7p\2\2\u01a0")
        buf.write("\u01a1\7f\2\2\u01a1\u01a2\7u\2\2\u01a2B\3\2\2\2\u01a3")
        buf.write("\u01a4\7k\2\2\u01a4\u01a5\7o\2\2\u01a5\u01a6\7r\2\2\u01a6")
        buf.write("\u01a7\7n\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7o\2\2\u01a9")
        buf.write("\u01aa\7g\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7v\2\2\u01ac")
        buf.write("\u01ad\7u\2\2\u01adD\3\2\2\2\u01ae\u01af\7u\2\2\u01af")
        buf.write("\u01b0\7v\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7v\2\2\u01b2")
        buf.write("\u01b3\7k\2\2\u01b3\u01b4\7e\2\2\u01b4F\3\2\2\2\u01b5")
        buf.write("\u01b6\7v\2\2\u01b6\u01b7\7j\2\2\u01b7\u01b8\7k\2\2\u01b8")
        buf.write("\u01b9\7u\2\2\u01b9H\3\2\2\2\u01ba\u01bb\7u\2\2\u01bb")
        buf.write("\u01bc\7w\2\2\u01bc\u01bd\7r\2\2\u01bd\u01be\7g\2\2\u01be")
        buf.write("\u01bf\7t\2\2\u01bfJ\3\2\2\2\u01c0\u01c1\7v\2\2\u01c1")
        buf.write("\u01c2\7t\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7p\2\2\u01c4")
        buf.write("\u01c5\7u\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7g\2\2\u01c7")
        buf.write("\u01c8\7p\2\2\u01c8\u01c9\7v\2\2\u01c9L\3\2\2\2\u01ca")
        buf.write("\u01cb\7x\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7n\2\2\u01cd")
        buf.write("\u01ce\7c\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7k\2\2\u01d0")
        buf.write("\u01d1\7n\2\2\u01d1\u01d2\7g\2\2\u01d2N\3\2\2\2\u01d3")
        buf.write("\u01d4\7v\2\2\u01d4\u01d5\7j\2\2\u01d5\u01d6\7t\2\2\u01d6")
        buf.write("\u01d7\7q\2\2\u01d7\u01d8\7y\2\2\u01d8P\3\2\2\2\u01d9")
        buf.write("\u01da\7v\2\2\u01da\u01db\7j\2\2\u01db\u01dc\7t\2\2\u01dc")
        buf.write("\u01dd\7q\2\2\u01dd\u01de\7y\2\2\u01de\u01df\7u\2\2\u01df")
        buf.write("R\3\2\2\2\u01e0\u01e1\7x\2\2\u01e1\u01e2\7q\2\2\u01e2")
        buf.write("\u01e3\7k\2\2\u01e3\u01e4\7f\2\2\u01e4T\3\2\2\2\u01e5")
        buf.write("\u01e6\7u\2\2\u01e6\u01e7\7{\2\2\u01e7\u01e8\7p\2\2\u01e8")
        buf.write("\u01e9\7e\2\2\u01e9\u01ea\7j\2\2\u01ea\u01eb\7t\2\2\u01eb")
        buf.write("\u01ec\7q\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee\7k\2\2\u01ee")
        buf.write("\u01ef\7|\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1\7f\2\2\u01f1")
        buf.write("V\3\2\2\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7c\2\2\u01f4")
        buf.write("\u01f5\7v\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7x\2\2\u01f7")
        buf.write("\u01f8\7g\2\2\u01f8X\3\2\2\2\u01f9\u01fa\7k\2\2\u01fa")
        buf.write("\u01fb\7p\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7g\2\2\u01fd")
        buf.write("\u01fe\7t\2\2\u01fe\u01ff\7h\2\2\u01ff\u0200\7c\2\2\u0200")
        buf.write("\u0201\7e\2\2\u0201\u0202\7g\2\2\u0202Z\3\2\2\2\u0203")
        buf.write("\u0204\7?\2\2\u0204\\\3\2\2\2\u0205\u0206\7,\2\2\u0206")
        buf.write("\u0207\7?\2\2\u0207^\3\2\2\2\u0208\u0209\7\61\2\2\u0209")
        buf.write("\u020a\7?\2\2\u020a`\3\2\2\2\u020b\u020c\7\'\2\2\u020c")
        buf.write("\u020d\7?\2\2\u020db\3\2\2\2\u020e\u020f\7-\2\2\u020f")
        buf.write("\u0210\7?\2\2\u0210d\3\2\2\2\u0211\u0212\7>\2\2\u0212")
        buf.write("\u0213\7>\2\2\u0213\u0214\7?\2\2\u0214f\3\2\2\2\u0215")
        buf.write("\u0216\7@\2\2\u0216\u0217\7@\2\2\u0217\u0218\7?\2\2\u0218")
        buf.write("h\3\2\2\2\u0219\u021a\7@\2\2\u021a\u021b\7@\2\2\u021b")
        buf.write("\u021c\7@\2\2\u021c\u021d\7?\2\2\u021dj\3\2\2\2\u021e")
        buf.write("\u021f\7(\2\2\u021f\u0220\7?\2\2\u0220l\3\2\2\2\u0221")
        buf.write("\u0222\7`\2\2\u0222\u0223\7?\2\2\u0223n\3\2\2\2\u0224")
        buf.write("\u0225\7~\2\2\u0225\u0226\7?\2\2\u0226p\3\2\2\2\u0227")
        buf.write("\u0228\7-\2\2\u0228r\3\2\2\2\u0229\u022a\7/\2\2\u022a")
        buf.write("t\3\2\2\2\u022b\u022c\7,\2\2\u022cv\3\2\2\2\u022d\u022e")
        buf.write("\7\61\2\2\u022ex\3\2\2\2\u022f\u0230\7-\2\2\u0230\u0231")
        buf.write("\7-\2\2\u0231z\3\2\2\2\u0232\u0233\7/\2\2\u0233\u0234")
        buf.write("\7/\2\2\u0234|\3\2\2\2\u0235\u0236\7~\2\2\u0236\u0237")
        buf.write("\7~\2\2\u0237~\3\2\2\2\u0238\u0239\7(\2\2\u0239\u023a")
        buf.write("\7(\2\2\u023a\u0080\3\2\2\2\u023b\u023c\7?\2\2\u023c\u023d")
        buf.write("\7?\2\2\u023d\u0082\3\2\2\2\u023e\u023f\7@\2\2\u023f\u0240")
        buf.write("\7?\2\2\u0240\u0084\3\2\2\2\u0241\u0242\7>\2\2\u0242\u0243")
        buf.write("\7?\2\2\u0243\u0086\3\2\2\2\u0244\u0245\7@\2\2\u0245\u0088")
        buf.write("\3\2\2\2\u0246\u0247\7>\2\2\u0247\u008a\3\2\2\2\u0248")
        buf.write("\u0249\7(\2\2\u0249\u008c\3\2\2\2\u024a\u024b\7~\2\2\u024b")
        buf.write("\u008e\3\2\2\2\u024c\u024d\7`\2\2\u024d\u0090\3\2\2\2")
        buf.write("\u024e\u024f\7#\2\2\u024f\u0250\7?\2\2\u0250\u0092\3\2")
        buf.write("\2\2\u0251\u0252\7@\2\2\u0252\u0253\7@\2\2\u0253\u0094")
        buf.write("\3\2\2\2\u0254\u0255\7>\2\2\u0255\u0256\7>\2\2\u0256\u0096")
        buf.write("\3\2\2\2\u0257\u0258\7@\2\2\u0258\u0259\7@\2\2\u0259\u025a")
        buf.write("\7@\2\2\u025a\u0098\3\2\2\2\u025b\u025c\7]\2\2\u025c\u009a")
        buf.write("\3\2\2\2\u025d\u025e\7_\2\2\u025e\u009c\3\2\2\2\u025f")
        buf.write("\u0260\7}\2\2\u0260\u009e\3\2\2\2\u0261\u0262\7\177\2")
        buf.write("\2\u0262\u00a0\3\2\2\2\u0263\u0264\7*\2\2\u0264\u00a2")
        buf.write("\3\2\2\2\u0265\u0266\7+\2\2\u0266\u00a4\3\2\2\2\u0267")
        buf.write("\u0268\7\60\2\2\u0268\u00a6\3\2\2\2\u0269\u026a\7.\2\2")
        buf.write("\u026a\u00a8\3\2\2\2\u026b\u026c\7A\2\2\u026c\u00aa\3")
        buf.write("\2\2\2\u026d\u026e\7#\2\2\u026e\u00ac\3\2\2\2\u026f\u0270")
        buf.write("\7<\2\2\u0270\u00ae\3\2\2\2\u0271\u0272\7B\2\2\u0272\u00b0")
        buf.write("\3\2\2\2\u0273\u0274\7=\2\2\u0274\u00b2\3\2\2\2\u0275")
        buf.write("\u0276\7\u0080\2\2\u0276\u00b4\3\2\2\2\u0277\u027d\5\u00a9")
        buf.write("U\2\u0278\u027d\5\u00abV\2\u0279\u027d\5\u00adW\2\u027a")
        buf.write("\u027d\5\u00afX\2\u027b\u027d\5\u00b1Y\2\u027c\u0277\3")
        buf.write("\2\2\2\u027c\u0278\3\2\2\2\u027c\u0279\3\2\2\2\u027c\u027a")
        buf.write("\3\2\2\2\u027c\u027b\3\2\2\2\u027d\u00b6\3\2\2\2\u027e")
        buf.write("\u027f\7k\2\2\u027f\u0280\7h\2\2\u0280\u00b8\3\2\2\2\u0281")
        buf.write("\u0282\7g\2\2\u0282\u0283\7n\2\2\u0283\u0284\7u\2\2\u0284")
        buf.write("\u0285\7g\2\2\u0285\u00ba\3\2\2\2\u0286\u0287\7e\2\2\u0287")
        buf.write("\u0288\7c\2\2\u0288\u0289\7u\2\2\u0289\u028a\7g\2\2\u028a")
        buf.write("\u00bc\3\2\2\2\u028b\u028c\7f\2\2\u028c\u028d\7g\2\2\u028d")
        buf.write("\u028e\7h\2\2\u028e\u028f\7c\2\2\u028f\u0290\7w\2\2\u0290")
        buf.write("\u0291\7n\2\2\u0291\u0292\7v\2\2\u0292\u00be\3\2\2\2\u0293")
        buf.write("\u0294\7u\2\2\u0294\u0295\7y\2\2\u0295\u0296\7k\2\2\u0296")
        buf.write("\u0297\7v\2\2\u0297\u0298\7e\2\2\u0298\u0299\7j\2\2\u0299")
        buf.write("\u00c0\3\2\2\2\u029a\u029b\7f\2\2\u029b\u029c\7q\2\2\u029c")
        buf.write("\u00c2\3\2\2\2\u029d\u029e\7y\2\2\u029e\u029f\7j\2\2\u029f")
        buf.write("\u02a0\7k\2\2\u02a0\u02a1\7n\2\2\u02a1\u02a2\7g\2\2\u02a2")
        buf.write("\u00c4\3\2\2\2\u02a3\u02a4\7h\2\2\u02a4\u02a5\7q\2\2\u02a5")
        buf.write("\u02a6\7t\2\2\u02a6\u00c6\3\2\2\2\u02a7\u02a8\7d\2\2\u02a8")
        buf.write("\u02a9\7t\2\2\u02a9\u02aa\7g\2\2\u02aa\u02ab\7c\2\2\u02ab")
        buf.write("\u02ac\7m\2\2\u02ac\u00c8\3\2\2\2\u02ad\u02ae\7e\2\2\u02ae")
        buf.write("\u02af\7q\2\2\u02af\u02b0\7p\2\2\u02b0\u02b1\7v\2\2\u02b1")
        buf.write("\u02b2\7k\2\2\u02b2\u02b3\7p\2\2\u02b3\u02b4\7w\2\2\u02b4")
        buf.write("\u02b5\7g\2\2\u02b5\u00ca\3\2\2\2\u02b6\u02b7\7t\2\2\u02b7")
        buf.write("\u02b8\7g\2\2\u02b8\u02b9\7v\2\2\u02b9\u02ba\7w\2\2\u02ba")
        buf.write("\u02bb\7t\2\2\u02bb\u02bc\7p\2\2\u02bc\u00cc\3\2\2\2\u02bd")
        buf.write("\u02be\7v\2\2\u02be\u02bf\7t\2\2\u02bf\u02c0\7{\2\2\u02c0")
        buf.write("\u00ce\3\2\2\2\u02c1\u02c2\7e\2\2\u02c2\u02c3\7c\2\2\u02c3")
        buf.write("\u02c4\7v\2\2\u02c4\u02c5\7e\2\2\u02c5\u02c6\7j\2\2\u02c6")
        buf.write("\u00d0\3\2\2\2\u02c7\u02c8\7h\2\2\u02c8\u02c9\7k\2\2\u02c9")
        buf.write("\u02ca\7p\2\2\u02ca\u02cb\7c\2\2\u02cb\u02cc\7n\2\2\u02cc")
        buf.write("\u02cd\7n\2\2\u02cd\u02ce\7{\2\2\u02ce\u00d2\3\2\2\2\u02cf")
        buf.write("\u02d0\7)\2\2\u02d0\u00d4\3\2\2\2\u02d1\u02d8\7$\2\2\u02d2")
        buf.write("\u02d7\5\3\2\2\u02d3\u02d7\7\"\2\2\u02d4\u02d7\5\5\3\2")
        buf.write("\u02d5\u02d7\5\u00b5[\2\u02d6\u02d2\3\2\2\2\u02d6\u02d3")
        buf.write("\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7")
        buf.write("\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2")
        buf.write("\u02d9\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc\7")
        buf.write("$\2\2\u02dc\u00d6\3\2\2\2\u02dd\u02e3\5\3\2\2\u02de\u02e2")
        buf.write("\5\3\2\2\u02df\u02e2\5\5\3\2\u02e0\u02e2\7a\2\2\u02e1")
        buf.write("\u02de\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e0\3\2\2\2")
        buf.write("\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3")
        buf.write("\2\2\2\u02e4\u00d8\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02ec")
        buf.write("\5\5\3\2\u02e7\u02eb\5\5\3\2\u02e8\u02eb\5\3\2\2\u02e9")
        buf.write("\u02eb\5\u00b5[\2\u02ea\u02e7\3\2\2\2\u02ea\u02e8\3\2")
        buf.write("\2\2\u02ea\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea")
        buf.write("\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u00da\3\2\2\2\u02ee")
        buf.write("\u02ec\3\2\2\2\21\2\u00e6\u00f0\u00fb\u0100\u0107\u010d")
        buf.write("\u013a\u027c\u02d6\u02d8\u02e1\u02e3\u02ea\u02ec\3\b\2")
        buf.write("\2")
        return buf.getvalue()


class JavaLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    ESPACO = 1
    COMENTARIO = 2
    HEX_NUMERAL = 3
    OCTAL_NUMERAL = 4
    NUMERO = 5
    INTEGER_TYPE_SUFFIX = 6
    FLOAT_s = 7
    EXP = 8
    SHORT = 9
    BYTE = 10
    INT = 11
    LONG = 12
    CHAR = 13
    FLOAT = 14
    LOGICAL = 15
    NEW = 16
    PACKAGE = 17
    IMPORT = 18
    CONST = 19
    INSTANCEOF = 20
    GOTO = 21
    CLASS = 22
    ABSTRACT = 23
    FINAL = 24
    PUBLIC = 25
    PRIVATE = 26
    PROTECTED = 27
    EXTENDS = 28
    IMPLEMENTS = 29
    STATIC = 30
    THIS = 31
    SUPER = 32
    TRANSIENT = 33
    VOLATILE = 34
    THROW = 35
    THROWS = 36
    VOID = 37
    SYNCHNOZED = 38
    NATIVE = 39
    INTERFACE = 40
    IGUAL_ATRIB = 41
    MULT_ATRIB = 42
    DIV_ATRIB = 43
    MOD_ATRIB = 44
    ADD_ATRIB = 45
    BIT_LEFT_ATRIB = 46
    BIT_RIGHT_ATRIB = 47
    U_BIT_RIGHT_ATRIB = 48
    AND_ATRIB = 49
    XOR_ATRIB = 50
    OR_ATRIB = 51
    ADD = 52
    SUB = 53
    MULT = 54
    DIV = 55
    INC = 56
    DEC = 57
    OR = 58
    AND = 59
    IGUAL = 60
    MAIOR_IGUAL = 61
    MENOR_IGUAL = 62
    MAIOR = 63
    MENOR = 64
    BITAND = 65
    BITOR = 66
    CARET = 67
    DIF = 68
    SHIFT_RIGHT = 69
    SHIFT_LEFT = 70
    U_SHIFT_RIGHT = 71
    AC = 72
    FC = 73
    ACH = 74
    FCH = 75
    AP = 76
    FP = 77
    PONTO = 78
    VIRGULA = 79
    INTERROGACAO = 80
    EXCLAMACAO = 81
    DOIS_PONTOS = 82
    ARROBA = 83
    PONTOV = 84
    NOT = 85
    IF = 86
    ELSE = 87
    CASE = 88
    DEFAULT = 89
    SWITCH = 90
    DO = 91
    WHILE = 92
    FOR = 93
    BREAK = 94
    CONTINUE = 95
    RETURN = 96
    TRY = 97
    CATCH = 98
    FINALLY = 99
    ASPAS = 100
    STRING = 101
    ID = 102
    ERRO = 103

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'short'", "'byte'", "'int'", "'long'", "'char'", "'boolean'", 
            "'new'", "'package'", "'import'", "'const'", "'instanceof'", 
            "'goto'", "'class'", "'abstract'", "'final'", "'public'", "'private'", 
            "'protected'", "'extends'", "'implements'", "'static'", "'this'", 
            "'super'", "'transient'", "'volatile'", "'throw'", "'throws'", 
            "'void'", "'synchronized'", "'native'", "'interface'", "'='", 
            "'*='", "'/='", "'%='", "'+='", "'<<='", "'>>='", "'>>>='", 
            "'&='", "'^='", "'|='", "'+'", "'-'", "'*'", "'/'", "'++'", 
            "'--'", "'||'", "'&&'", "'=='", "'>='", "'<='", "'>'", "'<'", 
            "'&'", "'|'", "'^'", "'!='", "'>>'", "'<<'", "'>>>'", "'['", 
            "']'", "'{'", "'}'", "'('", "')'", "'.'", "','", "'?'", "'!'", 
            "':'", "'@'", "';'", "'~'", "'if'", "'else'", "'case'", "'default'", 
            "'switch'", "'do'", "'while'", "'for'", "'break'", "'continue'", 
            "'return'", "'try'", "'catch'", "'finally'", "'''" ]

    symbolicNames = [ "<INVALID>",
            "ESPACO", "COMENTARIO", "HEX_NUMERAL", "OCTAL_NUMERAL", "NUMERO", 
            "INTEGER_TYPE_SUFFIX", "FLOAT_s", "EXP", "SHORT", "BYTE", "INT", 
            "LONG", "CHAR", "FLOAT", "LOGICAL", "NEW", "PACKAGE", "IMPORT", 
            "CONST", "INSTANCEOF", "GOTO", "CLASS", "ABSTRACT", "FINAL", 
            "PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", "IMPLEMENTS", "STATIC", 
            "THIS", "SUPER", "TRANSIENT", "VOLATILE", "THROW", "THROWS", 
            "VOID", "SYNCHNOZED", "NATIVE", "INTERFACE", "IGUAL_ATRIB", 
            "MULT_ATRIB", "DIV_ATRIB", "MOD_ATRIB", "ADD_ATRIB", "BIT_LEFT_ATRIB", 
            "BIT_RIGHT_ATRIB", "U_BIT_RIGHT_ATRIB", "AND_ATRIB", "XOR_ATRIB", 
            "OR_ATRIB", "ADD", "SUB", "MULT", "DIV", "INC", "DEC", "OR", 
            "AND", "IGUAL", "MAIOR_IGUAL", "MENOR_IGUAL", "MAIOR", "MENOR", 
            "BITAND", "BITOR", "CARET", "DIF", "SHIFT_RIGHT", "SHIFT_LEFT", 
            "U_SHIFT_RIGHT", "AC", "FC", "ACH", "FCH", "AP", "FP", "PONTO", 
            "VIRGULA", "INTERROGACAO", "EXCLAMACAO", "DOIS_PONTOS", "ARROBA", 
            "PONTOV", "NOT", "IF", "ELSE", "CASE", "DEFAULT", "SWITCH", 
            "DO", "WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "TRY", 
            "CATCH", "FINALLY", "ASPAS", "STRING", "ID", "ERRO" ]

    ruleNames = [ "LETRA", "DIGITO", "Octal_digit", "Hex_digit", "ESPACO", 
                  "COMENTARIO", "HEX_NUMERAL", "OCTAL_NUMERAL", "NUMERO", 
                  "INTEGER_TYPE_SUFFIX", "FLOAT_s", "EXP", "SHORT", "BYTE", 
                  "INT", "LONG", "CHAR", "FLOAT", "LOGICAL", "NEW", "PACKAGE", 
                  "IMPORT", "CONST", "INSTANCEOF", "GOTO", "CLASS", "ABSTRACT", 
                  "FINAL", "PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", 
                  "IMPLEMENTS", "STATIC", "THIS", "SUPER", "TRANSIENT", 
                  "VOLATILE", "THROW", "THROWS", "VOID", "SYNCHNOZED", "NATIVE", 
                  "INTERFACE", "IGUAL_ATRIB", "MULT_ATRIB", "DIV_ATRIB", 
                  "MOD_ATRIB", "ADD_ATRIB", "BIT_LEFT_ATRIB", "BIT_RIGHT_ATRIB", 
                  "U_BIT_RIGHT_ATRIB", "AND_ATRIB", "XOR_ATRIB", "OR_ATRIB", 
                  "ADD", "SUB", "MULT", "DIV", "INC", "DEC", "OR", "AND", 
                  "IGUAL", "MAIOR_IGUAL", "MENOR_IGUAL", "MAIOR", "MENOR", 
                  "BITAND", "BITOR", "CARET", "DIF", "SHIFT_RIGHT", "SHIFT_LEFT", 
                  "U_SHIFT_RIGHT", "AC", "FC", "ACH", "FCH", "AP", "FP", 
                  "PONTO", "VIRGULA", "INTERROGACAO", "EXCLAMACAO", "DOIS_PONTOS", 
                  "ARROBA", "PONTOV", "NOT", "SIMBOLOS", "IF", "ELSE", "CASE", 
                  "DEFAULT", "SWITCH", "DO", "WHILE", "FOR", "BREAK", "CONTINUE", 
                  "RETURN", "TRY", "CATCH", "FINALLY", "ASPAS", "STRING", 
                  "ID", "ERRO" ]

    grammarFileName = "JavaLexer.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None



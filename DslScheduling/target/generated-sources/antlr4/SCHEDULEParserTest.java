import java.io.File;
import java.util.Scanner;
 
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
 
public class SCHEDULEParserTest
{
 
	public static void main(String[] args) throws Exception 
	{
	    String content = new Scanner(new File("target/generated-sources/antlr4/scheduleSample.txt")).useDelimiter("\\Z").next();
	    System.out.println( "SCHEDULE:\n" + content + "\n\n");
	    
		ANTLRInputStream input = new ANTLRInputStream( content );
		
		SCHEDULELexer lexer = new SCHEDULELexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SCHEDULEParser parser = new SCHEDULEParser(tokens);
		
		ParseTree tree = parser.scheduling();
		
		System.out.println( "ParseTree:\n" + tree.toStringTree( parser ) + "\n"); 
	}
 
}
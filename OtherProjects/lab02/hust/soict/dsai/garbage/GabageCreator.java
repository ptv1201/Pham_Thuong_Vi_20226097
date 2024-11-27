package hust.soict.dsai.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class GabageCreator {
	public static void main(String[] args)throws IOException{
	String filename = "C:\\Users\\Admin\\eclipse-workspace\\OtherProjects\\lab02\\hust\\soict\\dsai\\garbage\\test.txt";
	byte[] inputBytes = { 0 };
	long startTime, endTime; 
	inputBytes=Files.readAllBytes(Paths.get(filename));
	startTime=System.currentTimeMillis();
	String outputString = "";
	for(byte b: inputBytes)
	{
		outputString += (char) b;
	}
	endTime=System.currentTimeMillis();
	System.out.println(endTime-startTime);
}
}

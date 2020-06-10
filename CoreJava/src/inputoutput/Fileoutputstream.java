package inputoutput;
import java.io.*;
public class Fileoutputstream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("E:\\mahesh.txt");
		
		String s = "Selenium is a test automation tool!";
		
		byte b[]=s.getBytes();
		
		fout.write(b);
		
		fout.close();

	}

}

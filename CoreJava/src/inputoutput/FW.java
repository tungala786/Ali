package inputoutput;
import java.io.*;
public class FW {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:\\mahesh.doc");
		
		fw.write("Hello everybody out there,its hot!");
		
		fw.close();

	}

}

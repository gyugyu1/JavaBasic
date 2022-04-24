import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class HexaViewer {

	public static void main(String[] args) {
		try {
			File f = new File(args[0]);
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(f);
			
			PrintStream ps = new PrintStream(fos);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

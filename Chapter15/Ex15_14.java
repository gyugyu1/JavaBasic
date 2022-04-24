import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex15_14 {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);
			
		} catch (Exception e) {
		}
		System.out.println("hell by systme");
	}

}

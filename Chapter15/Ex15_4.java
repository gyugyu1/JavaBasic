import java.io.FileInputStream;

public class Ex15_4 {

	public static void main(String[] args) {
		FileInputStream fis = new FileInputStream("./src/FileViewer.java");
		
		
		int data = 0;
		
		while((data = fis.read())!= -1) {
			char c = (char)data;
			System.out.print(c);
		}
		
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;import java.nio.file.FileSystemNotFoundException;

public class Ex15_12 {

	public static void main(String[] args) {
		String line = "";
		
		try {s
			BufferedReader br = new BufferedReader(isr);
			System.out.println("사용중인 OS의 인코딩 : "+ isr.getEncoding());
			
			do {
				System.out.println("문장을 입력하세요. 마치시려면 q를 입력하세요.>");
				line = br.readLine();
				System.out.println("입력하신 문장 : " + line);
				
			}while (!line.equalsIgnoreCase("q"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

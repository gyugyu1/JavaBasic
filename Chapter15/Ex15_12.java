import java.io.BufferedReader;
import java.io.InputStreamReader;import java.nio.file.FileSystemNotFoundException;

public class Ex15_12 {

	public static void main(String[] args) {
		String line = "";
		
		try {s
			BufferedReader br = new BufferedReader(isr);
			System.out.println("������� OS�� ���ڵ� : "+ isr.getEncoding());
			
			do {
				System.out.println("������ �Է��ϼ���. ��ġ�÷��� q�� �Է��ϼ���.>");
				line = br.readLine();
				System.out.println("�Է��Ͻ� ���� : " + line);
				
			}while (!line.equalsIgnoreCase("q"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

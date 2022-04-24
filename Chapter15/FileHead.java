import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHead {
	public static void main(String[] args) {
		int re = Integer.parseInt(args[1]);
		String FileName = args[0];
		String line = "";
		
		if(args.length != 2) {
			System.out.println("Usage : Java FileHead 10 FILENAME");
			System.exit(0);
		}
		File f = new File(FileName);
		if(f.isDirectory() || !f.exists()) {
			System.out.println(args[0] +"은 디렉토리이거나, 존재하지 않는 파일입니다");
			System.exit(0);
		}else {
			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				for(int i = 0 ; i < re ; i++) {
					line = br.readLine();
					System.out.println(line);
				}
				
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	
	}
}

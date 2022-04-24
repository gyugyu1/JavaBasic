import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class FileMergeTest {

	public static void main(String[] args) throws Exception {
		Vector files = new Vector();
		SequenceInputStream in = null;
		FileOutputStream out = null;
		int data = 0;
			if( args.length == 0) {
				System.out.println("��ĥ ������ �������ּ���");
				System.exit(0);
				}
			
			for(int j = 1; j < args.length ; j++ ) {
				if( new File(args[j]).isDirectory() || !new File(args[j]).exists() ) {
					System.out.println( args[j] + "������ �ٽ� Ȯ���� �ּ���");
					System.exit(0);
					}else {
						files.add(new FileInputStream(args[j]));
				}
			}
			in = new SequenceInputStream(files.elements());
			out = new FileOutputStream(args[0]);
			while((data =in.read()) != -1) {
				out.write(data);
			}
			
				in.close();
				out.close();
	}

}

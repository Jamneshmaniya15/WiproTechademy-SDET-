package JamneshManiya;
import java.io.IOException;
import java.io.FileReader;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader r = new FileReader("Tech1.txt");
			int ch;
			while((ch=r.read())!=-1) {
				System.out.print((char) ch);
				
			}
			r.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
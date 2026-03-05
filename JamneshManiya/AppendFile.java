package JamneshManiya;
import java.io.IOException;
import java.io.FileWriter;

public class AppendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter w = new FileWriter("Tech1.txt",true);
			w.write("\nNew Hello World ");
			w.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

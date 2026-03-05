package JamneshManiya;
import java.io.IOException;
import java.io.FileWriter;
public class WriteinFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter w = new FileWriter("Tech1.txt");
			w.write("Hello World ");
			w.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

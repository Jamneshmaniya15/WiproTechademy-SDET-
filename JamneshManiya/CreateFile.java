package JamneshManiya;
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("Tech1.txt");
			
			if(file.createNewFile()) {
				System.out.println("File Created Sucessfully.");
			}else {
				System.out.println("File Already Exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

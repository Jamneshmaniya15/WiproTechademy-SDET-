package JamneshManiya;
import java.io.File;
import java.io.IOException;
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File file = new File("Tech.txt");
			
			if(file.delete()) {
				System.out.println("File Deleted");
			}else {
			System.out.println("File not Found");
			}
	}

}

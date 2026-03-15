package file_handling;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {

			File file = new File("Tech.txt");
			
			if(file.delete()) {
				System.out.println("File Deleted");
			}else {
			System.out.println("File not Found");
			}
	}

}

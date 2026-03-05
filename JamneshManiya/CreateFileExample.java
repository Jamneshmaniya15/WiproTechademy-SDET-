package JamneshManiya;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class CreateFileExample
{
	public static void main(String[] args)
		{
			try
			{
				FileWriter w=new FileWriter("Tech.txt");
				w.write("Hello World,");
				w.close();
				
			}
			
			
			catch(IOException e)
				{
					e.printStackTrace();
				}
			try {
				FileReader r = new FileReader("Tech.txt");
				int ch;
				
				while((ch = r.read())!=-1) {
					System.out.print((char) ch);
				}
				r.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			try {
				FileWriter fw = new FileWriter("Tech.txt");
				fw.write("\nNew line added");
				fw.close();
				
				System.out.println("Data added");
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				FileReader r = new FileReader("Tech.txt");
				int ch;
				
				while((ch = r.read())!=-1) {
					System.out.print((char) ch);
				}
				r.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

		}
	
 
}
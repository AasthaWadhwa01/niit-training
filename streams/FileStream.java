package streams;

//import java.awt.image.ImagingOpException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	public static void main(String[] args) {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		try{
			fi= new FileInputStream("D:/inputFile.txt");
			fo= new FileOutputStream("D:/outputFile.txt");
			try{
				while(fi.read() != -1) {
					fo.write(fi.read());
					System.out.println(fi.read());
					
					System.out.println((char)fi.read());
				}
			} catch (IOException e){
				e.printStackTrace();
			}
			} catch(FileNotFoundException e){
				e.printStackTrace();
			} finally{
				if (fi != null){
					try{
						fi.close();
					} catch(IOException e){
						e.printStackTrace();
						
					}
				}
			}
		}
	}


package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewFile {
	
	public static void main(String[] args) {
		
		try(BufferedReader reader= new BufferedReader(new FileReader("D:/charStreamSource.txt"));
			BufferedWriter writer= new BufferedWriter(new FileWriter("D:/charStreamDest.txt"))){
			String str = null;
			
				while((str =reader.readLine()) != null) {
					writer.write(str);
					System.out.println(str);
				}
			} catch(FileNotFoundException e){
				e.printStackTrace();
			} catch(IOException e){
			e.printStackTrace();
					}
				}
			}


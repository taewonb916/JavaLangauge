import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file = Paths.get("C://javaStudy//Simple3.txt");
		
		try (BufferedWriter writer = Files.newBufferedWriter(file)){
			writer.write('A');							
			writer.write('Z'); 							
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

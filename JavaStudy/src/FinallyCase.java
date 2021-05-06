import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

class FinallyCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file = Paths.get("C://javaStudy//Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);		// IOException �߻�����
			writer.write('A');							// IOException �߻�����
			writer.write('Z'); 							// IOException �߻�����
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(writer != null)
					writer.close();							// IOException �߻�����
			}
			catch(IOException e) {
				e.printStackTrace();			}
		}
	}

}

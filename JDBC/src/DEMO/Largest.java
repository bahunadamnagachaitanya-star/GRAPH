package DEMO;
import java.io.File;
import java.io.IOException;

public class Largest {
	public static void main(String[] args) {
		try {
			File file = new File("example.txt");
			if(file.createNewFile()) {
				System.out.println("File created Successfully");
			}else {
				System.out.println("File is already exist");
			}
		}catch(IOException e) {
			System.out.println("An error occurred");
		}
	}

}

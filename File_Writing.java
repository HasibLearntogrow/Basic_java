package finalexam;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Writing {
public static void main(String[] args) {
	try {
	 FileWriter F1= new FileWriter("C://Users//User//Documents//input.txt");
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Write into file:");
	 String string = sc.nextLine();
	 F1.write(string);
	 F1.close();
	 System.out.println("Successfully Read");
	}
	catch (IOException e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}

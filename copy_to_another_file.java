package finalexam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.ECFieldF2m;

public class copy_to_another_file {
public static void main(String[] args) {
	try {
	FileReader F1= new FileReader("C://Users//User//Documents//input.txt");
	FileWriter F2= new FileWriter("C://Users//User//Documents//output.txt");
	int i;
	while((i=F1.read())!=-1) {
		F2.write((char)i);
	}
	F1.close();
	F2.close();
	}
	catch(IOException e) {
		System.out.println(e);
	}
	
	System.out.println("Data Copy Successfull");
	}
		
	
	
}


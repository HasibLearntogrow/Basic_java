package finalexam;
//Question-7:
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Read_Write_File_in_java {

	public static void main(String[] args) {
		List<Double> ls= new ArrayList<Double>();
		try(BufferedReader fR= new BufferedReader(new FileReader("hasib.txt")))
		{
			String line;
			 while ((line = fR.readLine()) != null) {
	                String[] parts = line.split(" ");
	                for(String y: parts)
	                {
		                double value = Double.parseDouble(y);
		                ls.add(value);
	                }

	               
			 }
		
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		for(Double x: ls)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("After Reverse:");
		Collections.reverse(ls);
		for(Double x: ls)
		{
			System.out.print(x+" ");
		}
		try(BufferedWriter fr = new BufferedWriter(new FileWriter("rever.txt")))
		{
			for(Double m: ls)
			{
				
				fr.write(m.toString()+" ");
			}
			
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}

}

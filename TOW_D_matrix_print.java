//Print Matrix:
package finalexam;

import java.util.Scanner;

public class TOW_D_matrix_print {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value of Colam:");
		int col=sc.nextInt();
		System.out.println("Enter Value of Row:");
		int row=sc.nextInt();
		int[][] mat= new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print 2D Matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Print 1D Matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			
		}
		
	}

}

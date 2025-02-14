/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[][] array1={{1,2,3},{3,4,5}};
		int[][] array2={{10,20,30},{36,47,51}};
	

		for (int i =0;i<2;i++){
		    for (int j =0;j<3;j++){
		        array1[i][j]+=array2[i][j];
		        
		
		    }
	
		}
	
	    for (int i =0;i<2;i++){
	        System.out.print("{");
	        
		    for (int j =0;j<3;j++){
		        System.out.print(array1[i][j]);
		        System.out.print(",");
		        
		
		    }
		     System.out.print("}");
	
		}	       

	 
	}
	
	
}

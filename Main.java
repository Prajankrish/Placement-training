/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[][] array={{1,2,3},{3,4,5}};
	

		for (int i =0;i<2;i++){
		    for (int j =0;j<3;j++){
		        array[i][j]=array[i][j]*2;
		        
		
		    }
	
		}
	
	    for (int i =0;i<2;i++){
	        System.out.print("{");
	        
		    for (int j =0;j<3;j++){
		        System.out.print(array[i][j]);
		        System.out.print(",");
		        
		
		    }
		     System.out.print("}");
	
		}	       

	 
	}
	
	
}


public class Rotate90Matrix {

	public static void main(String[] args) {
		int mat[][] =
	        {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
		int b[][]= new int[4][4];
		int k=0;
		 for (int i = 3; i>=0; i--)
	        {
	            for (int j = 0; j <=3; j++)
	            {
	            	b[k][j]=mat[j][i];
	            	System.out.print(" "+ b[k][j]);
	            }
	        k++;
	        System.out.print("\n");
	        }
		 
	/*	 for (int i = 0; i <=3; i++)
	        {
	            for (int j = 0; j <=3; j++){
	                System.out.print(" " + mat[i][j]);
	            }
	            System.out.print("\n");
	        }
	        System.out.print("\n");*/
	    }

	}


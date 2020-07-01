public class TransposeMatrix2DArray {
    public static void main(String[] args)
    {

        int array1[][] = {	//	array with members
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int rows = array1.length;
        int cols = array1[0].length;

        int array2[][] = new int[cols][rows];	//	Declare array  for reverse dimensions


        for(int i = 0; i < cols; i++){		//	for loop to control array members
            for(int j = 0; j < rows; j++)	//	Converts the row of original matrix into column of transposed matrix
            {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("Transpose of given matrix: ");
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
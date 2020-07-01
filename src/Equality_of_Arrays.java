public class Equality_of_Arrays {
    public static void main(String[] args)
    {
        int row1, col1, row2, col2;
        boolean found = true;
        int array1[][] = {  //  2D array-1
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int array2[][] = {  //  2D array-2
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        row1 = array1.length;//calculate numbers of row and column for 2D array-1
        col1 = array1[0].length;

        row2 = array2.length;//Calculates  numbers of rows and columns for 2D array-2
        col2 = array2[0].length;

        if(row1 != row2 || col1 != col2)//apply if condition and check both matrix are equal or not
        {
            System.out.println("Array Matrix are not equal");   //  print statement
        }
        else {
            for(int i = 0; i < row1; i++){  //for loop to control 2D array-1 row members
                for(int j = 0; j < col1; j++){  //  for loop to control 2D array-1 column members
                    if(array1[i][j] != array2[i][j]){   //  if condition to compare both 2d array members
                        found = false;
                        break;
                    }
                }
            }
            if(found)
                System.out.println("Matrices are equal");   //  print statement
            else
                System.out.println("Matrices are not equal");   //   print statement
        }
    }
}
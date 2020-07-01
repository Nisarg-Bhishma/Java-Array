public class FindDuplicate {
    public static void main(String[] args)
    {
        int array1[] = {1, 2, 5, 5, 6, 6, 7, 2};    // int array with duplicate members

        for (int i = 0; i < array1.length-1; i++)   //  for loop to control array
            for (int j = i+1; j < array1.length; j++)   // for loop to control array members
                if ((array1[i] == array1[j]))   //  if condition to compare value of members array with each other
                System.out.println("Duplicate member of array : "+ array1[j]);  //  print statement with duplicate value of array member
    }
}
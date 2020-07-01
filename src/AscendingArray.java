public class AscendingArray {
    public static void main(String[] args)
    {
        int array1[] = new int[]{7,65,1,4,89,200,105};  //  array with members
        for (int i = 0; i < array1.length; i++) //  for loop to control array members
        {
            for (int j = i + 1; j < array1.length; j++) {   //for loop to control array members
                if (array1[i] > array1[j])  //  if condition to compare value of the array members, which is grater
                {
                    int temp = array1[i];   //  store grater value of member to temporary variable
                    array1[i] = array1[j];  //  re-arranging array member by its value, lower to grater
                    array1[j] = temp;
                }
            }
        }
        System.out.print("Array numbers in Ascending Order: ");
        for (int i = 0; i < array1.length ; i++)    //  for loop to control array
        {
            System.out.print(array1[i]+" ");    //  print array members by its value, lower to grater
        }
    }
}

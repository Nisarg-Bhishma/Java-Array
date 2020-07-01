public class FindValue {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5}; //  array with int variables

        int toFind = 3; //  int variable
        boolean found = false;  //  variable to store boolean value
        for (int i =0; i<=array1.length;i++) {  //  for loop to control array members
            if (i == toFind) {  //  if condition to compare value of array member with
                found = true;   //  condition is true, then boolean variable will store value for true
                break;
            }
        }
        if(found)
            System.out.println(toFind + " is found.");  //  print statement, if boolean is true
        else
            System.out.println(toFind + " is not found.");  //  print statement, if boolean is false
    }
}
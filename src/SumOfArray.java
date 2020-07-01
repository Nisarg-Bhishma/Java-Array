public class SumOfArray {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //  array with int variables
        int sum = 0;    //  int variable to store value of total

        for (int i =0; i<=array1.length;i++)    //  loop to control array variables
            sum += i;   //  adding values to variable
        System.out.println("The sum of all the members of provided array is: " + sum); // printing value of sum
    }
}
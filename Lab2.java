import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {

  /*1.Write a program to find all of the longest word in a given dictionary.
  Example:
{ "cat", "dog", "red", "is", "am" }
Expected Output:
"cat", "dog", "red" */

  /*  public static void main(String[] args) {
        String[] arr=new String[]{"cat", "dog", "red", "is", "m" };
        String max=" ";

      for ( String word : arr){
          if (word.length() > max.length()){
              max=word;
          } }

      for ( String word : arr ){
          if (word.length() == max.length()){
              System.out.println(" the longest : "+ word);
          } } }   */






 /*2. Write a program that displays the number of occurrences of an element in the array.
Original Array:
[1,1,1,3,3,5]
Sample Output:
3 occurs 2 times
1 occurs 3 times
9 occurs 0 time  */


      /*  public static void main(String[] args) {
            int[] array = {1, 1, 1, 3, 3, 5};
            Scanner scanner = new Scanner(System.in);
            System.out.print("User enter a number: ");
            int userNumber = scanner.nextInt();
            count(array, userNumber);
        }
        public static void count(int[] array, int userNumber) {
            int count = 0;
            for (int num : array) {
                if (num == userNumber) {
                    count++;
                } }
            System.out.println(userNumber+" occurs "+count+" time"); } */


/*3.Write a program to find the k largest elements in a given array.
Elements in the array can be in
any order.
Original Array:
[1, 4, 17, 7, 25, 3, 100]
Expected Output:
3 largest elements of the said array are:
100 25 17 */

   /* public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 17, 7, 25, 3, 100 };
        Arrays.sort(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" eneter k ");
        int k = scanner.nextInt();
        int[] result = new int[k];

        for (int i = arr.length - 1, j = 0; j < k; i--, j++) {
            result[j] = arr[i]; }

        System.out.println(" " + k + " largest elements of the array are:");
        for (int num : result) {
            System.out.print(num + " ");
        } }    */




/* 4. Create a method to reverse an array of integers. Implement the method without creating a new
array.
Original Array:
[5,4,3,2,1]
Expected Output:
Reversed Array: 1 2 3 4 5  */

   /* public  static void revers( int[] arr ) {
        for (int i = 0, j= arr.length -1 ; i<j ; i++, j--) {
           int temp = arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
        }}
    public static void main(String[] args) {
         int[] arr = new int[]{5,4,3,2,1};
        revers(arr);
        System.out.println(Arrays.toString(arr));    }    */






/* 5. Write a menu driven Java program with following option:
1. Accept elements of an array
2. Display elements of an array
3. Search the element within array
4. Sort the array
5. To Stop
the size of the array should be entered by the user.
 */

     /*  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            int choice;

            do {
                System.out.println("Array Menu:");
                System.out.println("1. Enter elements of an array");
                System.out.println("2. Display elements of an array");
                System.out.println("3. Search the element within array");
                System.out.println("4. Sort the array");
                System.out.println("5. Stop");
                System.out.print("Enter choice (1-5): ");
                choice = scanner.nextInt();

                switch (choice) {
        case 1:
                 System.out.println("Enter the elements of array:");
                 for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
                 }
                 break;
          case 2:
                System.out.println("Elements of the array:");
                for (int num : arr) {
                System.out.print(num + " ");
                }
               System.out.println();
               break;
       case 3:
                System.out.print("Enter the element to search: ");
                 int searchElement = scanner.nextInt();
                 int index = -1;
            for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
              index = i;
                break;
                    } }
             if (index == -1) {
                System.out.println("not found in array.");
                } else {
               System.out.println("Element found at index: " + index);
                 }
                 break;
         case 4:
                 Arrays.sort(arr);
                 System.out.println("Array sorted ");
                 break;
           case 5:
                 System.out.println(" Out program...");
                 break;
                 default:
                 System.out.println("Invalid choice. Please try again.");
                 break; }
            } while (choice != 5);
        } */

    
    
    

  /* 6. Create a method that generates a random number within a given range. Allow the user to
specify the range and call the method to display random numbers.
Hint: use Random clas
Sample Output:
Enter the minimum value of the range: 10
Enter the maximum value of the range: 100
Enter the number of random numbers to generate: 5
Random numbers within the specified range: 71 - 98 - 96 - 71 - 71  */

     /*   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter minimum of the range: ");
            int min = scanner.nextInt();
            System.out.print("Enter the maximum of the range: ");
            int max = scanner.nextInt();
            System.out.print("Enter the number of random numbers to generate: ");
            int numRandoms = scanner.nextInt();
            generate(min, max, numRandoms);
        }
        public static void generate(int min, int max, int num) {
            Random rand = new Random();
            System.out.println("Random numbers within range:");
                for (int i = 0; i < num; i++) {
                int randomNumber = rand.nextInt(max - min + 1) + min;
                System.out.print(randomNumber + " , ");
            }
            System.out.println();
        }  */



    
    
    
    
    
    

/*7. Write a program that checks the strength of a password. Create a method that evaluates a
password based on criteria like length, inclusion of special characters, and uppercase/lowercase
letters.
- We have three methods: checkLength, checkSpecialCharacters, and
checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
- The totalScore is calculated by adding the scores from these methods.
- Classify the password as strong (8 or more), moderately strong (5 or more), or weak
based on the totalScore.
- The criteria for scoring:
• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
(3 points).
• Special characters: Absence (0 points), Presence (2 points).
• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
points) */

     /*   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Write password: ");
            String password = scanner.nextLine();
            int totalScore = checkLength(password)+checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
            classifyPassword(totalScore);
        }
    public static int checkLength(String password) {
            int length = password.length();
            if (length < 6) {
                return 0;
            } else if (length >= 6 && length <= 7) {
                return 2;
            } else {
                return 3;
            } }
     public static int checkSpecialCharacters(String password) {
            boolean specialChar= false;
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    specialChar=true;
                    break;
                } }
            return specialChar ? 2 : 0; }

        public static int checkUpperCaseLowerCase(String password) {
            boolean upperCase = false;
            boolean lowerCase = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    lowerCase = true;
                } }
            return (upperCase&&lowerCase) ? 3 : 0; }

        public static void classifyPassword(int totalScore) {
            if (totalScore >= 8) {
                System.out.println(" strong !! ");
            } else if (totalScore >= 5) {
                System.out.println(" moderately strong !! ");
            } else {
                System.out.println("  weak !! ");
            } }  */




  /*8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
and each subsequent number in the sequence is the sum of the two preceding ones
 Example:
Enter the number of Fibonacci terms to generate: 10
Expected Output:
Fibonacci sequence with 10 terms:
0 1 1 2 3 5 8 13 21 34*/

  /* public static void fibonaccii(int num) {
        if (num <= 0) {
            System.out.println("Number must be positive.");
            return;  }

        int[] fibonacci = new int[num];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < num; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int i = 0; i < num; i++) {
        System.out.print(fibonacci[i] + " ");
        } System.out.println(); }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the number of Fibonacci terms to generate:  ");
        int input= scanner.nextInt();
        fibonaccii(input);
    }   */









}

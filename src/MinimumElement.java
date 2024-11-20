import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        //System.out.println(findMin(readIntegers()));

        int[] firstIntArray = readIntegers();
        System.out.println(Arrays.toString(firstIntArray));

        System.out.println("Minimum integer = " + findMin(firstIntArray));

    }


    public static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! This program will return the smallest element of an array of Integers!");
        System.out.println("How many integers are you comparing?");
        // takes the user defined info and instantiates a new Array with that length
        int intCount = scanner.nextInt();
        int[] intArray = new int[intCount];
        // for loop that populates the array
        for(int i = 0; i < intCount; i++) {
            if(i != 0) {
                System.out.println("Enter your next integer!");
            } else {
                System.out.println("Enter an Integer!");
            }
            intArray[i] = scanner.nextInt();
        }
        return intArray;


//        String input = scanner.nextLine();
//        String[] splits = input.split(",");
//        int[] values = new int[splits.length];

    }

    private static int findMin(int[] intArray) {

//        Arrays.sort(intArray);
//        return intArray[0];

        int min = Integer.MAX_VALUE;
        for(int el : intArray) {
            if (el < min) {
                min = el;
            }
        }

        return min;

    }

}

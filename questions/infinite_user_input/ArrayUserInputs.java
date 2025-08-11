// Infinite array inputs from user

package questions.infinite_user_input;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUserInputs {
    public static void main(String[] args) {

        // Initialization an empty ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array");

        while (true){
            String str = sc.next(); // Taking String input to "stop" input
            if (str.equalsIgnoreCase("q")){
                break;
            }
            try {
                int num = Integer.parseInt(str); // try to convert to int
                arr.add(num);
            }catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter an integer or 'stop'.");
            }
        }

        // Iterate value one by one
        for (int i : arr){
            System.out.print(i+" ");
        }

    }
}

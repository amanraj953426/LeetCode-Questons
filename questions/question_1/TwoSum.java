// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.

// Example:

// Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].



package questions.question_1;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        System.out.println("Enter an Array");
        Scanner sc = new Scanner(System.in);

        while (true){
            String str = sc.next();

                if (str.equalsIgnoreCase("q")){
                    break;
                }
                try {
                    int num = Integer.parseInt(str);
                    a1.add(num);
                }catch (NumberFormatException e){
                    System.out.println("Invalid input! Please enter an integer or 'stop'.");
                }

        }
        for (int i : a1){
            System.out.println(i);
        }
    }
}
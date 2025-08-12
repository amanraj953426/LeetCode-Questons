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

import java.util.*;

public class TwoSum {
    public static int[] search(int[] arr, int target){
        // Initialize HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        // Traversing in array
        for (int i=0; i<arr.length; i++){
            int num = target - arr[i]; // find second number
            if (hm.containsKey(num)){ // containsKey() search num is present in map?
                return new int[] {hm.get(num),i}; // if yes then return the index
            }
            hm.put(arr[i],i); // if not present in the Map then add number and their index in Map
        }
        return new int[] {-1,-1}; // if not then return false
    }
    public static void main(String[] args) {

        // Take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size = sc.nextInt(); // size of array
        System.out.println("Enter "+size+" array" );
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt(); // input an array
        }

        // Print an array
        for (int j : arr){
            System.out.print(j+" ");

        }

        System.out.println();
        System.out.println("Enter target");
        int target = sc.nextInt();

        // call search method
        int[] res = search(arr, target);
        System.out.println("Index "+res[0]+" "+res[1]);


    }
}
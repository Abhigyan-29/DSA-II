package Stacks;

import java.util.*;

public class NextGreaterElement {
    public static void findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];  // Array to store results
        Stack<Integer> stack = new Stack<>();  // Stack to keep track of elements

        // Traverse the array from the right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            } else {
                result[i] = -1;  // No greater element to the right
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        // Print the results
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " --> " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 7, 8};
        findNextGreaterElements(arr);
    }
}

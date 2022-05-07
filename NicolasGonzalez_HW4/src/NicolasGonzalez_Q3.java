// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q3
// Description: Determines the runtime difference between linearsearch and binsearch

import java.util.Arrays;

public class NicolasGonzalez_Q3 {
    public static void main(String[] args) {

        int[] arr = new int[100000];

        for(int i = 0; i < 100000; i++)
            arr[i] = (int)(Math.random() * 100000) + 1;

        int key = (int)(Math.random() * 100000) + 1;

        long startTime = System.currentTimeMillis();
        int index = linearSearch(arr, key);
        long endTime = System.currentTimeMillis();

        System.out.printf("%d and %d and %d\n", startTime, endTime, endTime - startTime);

        long executionTime = endTime - startTime;

        if(index >= 0)
            System.out.println("LinearSearch: The key: "+ key +" was found at index: "+ index +" the total runtime was: " + executionTime);
        else
            System.out.println("LinearSearch: The key: "+ key +" was not found. The total runtime was: " + executionTime);

        Arrays.sort(arr);
        startTime = System.currentTimeMillis();
        index = binarySearch(arr, key);
        endTime = System.currentTimeMillis();
        System.out.printf("%d and %d and %d\n", startTime, endTime, endTime - startTime);
        executionTime = startTime - endTime;

        if(index >= 0)
            System.out.println("BinSearch: The key: "+ key +" was found at index: "+ index +" the total runtime was: " + executionTime);
        else
            System.out.println("BinSearch: The key: "+ key +" was not found. The total runtime was: " + executionTime);


    }
    public static int linearSearch(int[] arr, int key) {

        int length = arr.length;

        for(int i = 0; i < length; i++) {
            if(arr[i] == key)
                return i;
        }

        return -1;
    }
    public static int binarySearch(int[] arr, int key) {

        int start = 0,
            end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(key < arr[mid])
                end = mid - 1;
            else if(key > arr[mid])
                start = mid + 1;
            else
                return mid;

        }

        return -1;
    }
}

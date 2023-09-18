package org.example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10));
    }

    //create missingNumber method
    public static int findMissingNumber(int arr[], int maxNum){
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        for(int i = 1; i <= maxNum; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        // no missing number
        if(arr.length == maxNum && arr[maxNum -1] == maxNum){
            return 0;
        }
        return 0;
    }


}

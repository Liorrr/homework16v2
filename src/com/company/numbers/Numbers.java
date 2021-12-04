package com.company.numbers;

import java.util.Arrays;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {

        int[] arr1 = new int[]{4,1,5,7,1,12,17};
        int[] arr2 = new int[]{4,1,5,7,11,15,3,12};
        getUniques(arr1,arr2);
        int[] randomArr = new int[10];
        fillWithRandomNum(randomArr);
        sumAllNumbers(randomArr);

    }

    //---------------------------------------------------------------------------------------
    // Method that takes in an array (assuming that this array only contains numbers from 0 to 9)
    // and returns a number made from all of these digits.
    //---------------------------------------------------------------------------------------
    public static int sumAllNumbers (int[] x){
        int sum = 0;
        for (int i=0; i < x.length; i++){
            sum += x[i];
        }
        System.out.println(sum);
        return sum;

    }

    //---------------------------------------------------------------------------------------
    // Method that takes in 2 arrays and returns an array that contains the numbers that only appear in one of the arrays
    // (If you have extra space in the array, you can fill it with -99)
    //---------------------------------------------------------------------------------------
    public static void getUniques (int[] x, int[] y) {
        //create a new array with length of the two other array in case all numbers are uniques.
        int[] z = new int[x.length+ y.length];
        //add general index for all loops to populate the new array accordingly
        int zIndex = 0;
        //sort array x & y for efficiency
        Arrays.stream(x).sorted(); Arrays.stream(y).sorted();
        //start checking number in first array
        for (int i = 0; i < x.length; i++){
            //check y mid-range length
            int mirrorIndex = y.length/2;
            //create a mirrorIndex for y according to mid-range index
            if (x[i] == y[mirrorIndex]){
                break;
            }
            //check if current index value is higher or lower than current number
            //in case of higher
            else if (x[i] > y[mirrorIndex]) {
               //check for next y index to the last if current x index is equals to it.
                for ( mirrorIndex = mirrorIndex + 1 ; mirrorIndex < y.length; mirrorIndex++){
                    if (x[i]==y[mirrorIndex]){

                        break;
                    }

                    else if (mirrorIndex==y.length) {
                        //populate new array if we've reached the last index of y
                        z[zIndex]=x[i];
                        zIndex++;
                        break;
                    }
                    else {
                        continue;
                    }
                }

            }
            else {
                //Same check as before check in descending order until mirrorIndex reach 0.
                for ( mirrorIndex = mirrorIndex - 1 ; mirrorIndex > 0; mirrorIndex--){
                    if (x[i]==y[mirrorIndex]){

                        break;
                    }

                    else if (mirrorIndex==0) {
                        //populate new array if we've reached the last index of y
                        z[zIndex]=x[i];
                        zIndex++;
                        break;
                    }
                    else {
                        continue;
                    }
                }

            }
        }
        //start checking number in second array
        for (int i = 0; i < y.length; i++){
            //check x mid-range length
            int mirrorIndex = x.length/2;
            //create a mirrorIndex for x according to mid-range index
            if (y[i] == x[mirrorIndex]){
                break;
            }
            //check if current index value is higher or lower than current number
            //in case of higher
            else if (y[i] > x[mirrorIndex]) {
                //check for next x index to the last if current y index is equals to it.
                for ( mirrorIndex = mirrorIndex + 1 ; mirrorIndex < x.length; mirrorIndex++){
                    if (y[i]==x[mirrorIndex]){

                        break;
                    }

                    else if (mirrorIndex==x.length) {
                        //populate new array if we've reached the last index of y
                        z[zIndex]=y[i];
                        zIndex++;
                        break;
                    }
                    else {
                        continue;
                    }
                }

            }
            else {
                //Same check as before check in descending order until mirrorIndex reach 0.
                for ( mirrorIndex = mirrorIndex - 1 ; mirrorIndex > 0; mirrorIndex--){
                    if (y[i]==x[mirrorIndex]){

                        break;
                    }

                    else if (mirrorIndex==0) {
                        //populate new array if we've reached the last index of x
                        z[zIndex]=y[i];
                        zIndex++;
                        break;
                    }
                    else {
                        continue;
                    }
                }

            }
        }
        //populate new array missing values with -99
        for (int i = z.length - 1; i > 0; i--){
            if (z[i]==0){
                z[i]= -99;
            }
            else {
                break;
            }
        }
        System.out.println(Arrays.toString(z));

    }

    //---------------------------------------------------------------------------------------
    // Method that fill any int array with numbers up tp 10 in case current index == 0
    //---------------------------------------------------------------------------------------
    public static void fillWithRandomNum (int[] x){
        Random random = new Random();
        for (int i=0; i < x.length; i++){
            if (x[i] == 0){
                x[i] = random.nextInt(10);
            }
            else {
                continue;
            }
        }
    //print the new array values to console.
        System.out.println(Arrays.toString(x));
    }
}

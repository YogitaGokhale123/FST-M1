package activities;

import java.util.*;
public class Activity2 {
        public static void main(String[] args) {
            int[] numArry = {10, 77, 10, 54, -11, 10};
            System.out.println("Original Array: " + Arrays.toString(numArry));

            int findNum = 10;
            int sumNum = 30;
            System.out.println("Result : " + bResult(numArry,findNum,sumNum));
        }
        public static boolean bResult(int[] numbers, int findNum, int sumNum) {
            int numTemp = 0;
            for (int number : numbers) {
                if (number == findNum) {
                    numTemp += findNum;
                }

                if (numTemp > sumNum) {
                    break;
                }
            }
            return numTemp == sumNum;
        }

}

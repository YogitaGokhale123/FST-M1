package activities;

import java.util.Arrays;

public class Activity4 {
        public static void main(String args[]){
            int[] nNumbers={9,5,1,3,2,4};
            ascendingSort(nNumbers);
            System.out.println("Sorted array is ascending order : ");
            System.out.println(Arrays.toString(nNumbers));
        }
        static void ascendingSort(int array[]){
            int nSize = array.length, i;
            for (i=1; i< nSize;i++){
                int key =array[i];
                int j = i-1;
                while (j>=0 && key< array[j]){
                    array[j+1]= array[j];
                    --j;
                }
                array[j+1]=key;
            }
        }
    }

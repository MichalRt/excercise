package Excercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ArraysExcercise
{   public static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int myValues[] = getintegers(5);
        int myValues2[] = comparator(myValues);
        printArray(myValues2);




    }

    public static int[] getintegers(int size) {
        System.out.println("GIV me numbers!!!!!");
        int[] value = new int[size];
        for (int i=0; i<value.length;i++) {
            value[i]=scanner.nextInt();
        }
        return value;
    }

    public static void printArray(int [] arrayInt) {
        for (int i = 0; i <arrayInt.length ; i++) {
            System.out.println(arrayInt[i]);
        }
    }
    public static int[] comparator(int[] values) {
        int[] sortedArray = Arrays.copyOf(values,values.length);

        boolean flag =true;
        int temp;
        while (flag) {
            flag=false;
            for (int i = 0; i <sortedArray.length-1 ; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

}

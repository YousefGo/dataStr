package week2;

import java.util.Scanner;

public class NumberArray {

   static Scanner kp = new Scanner(System.in);
    int[] array;
    public NumberArray(int size){
        array = new int[size];
    }
    public void inputData() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Element " + (i + 1));
            array[i] = kp.nextInt();
        }
    }

    public void printArray() {
        System.out.print("(");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(")");
    }

    public void square() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
    }

    public int sumOfArray() {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int max() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int min() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int SD() {
        int sum = sumOfArray();
        int avg = sum / array.length;
        int finalSum = 0;
        for (int s = 0; s < array.length; s++) {
            int temp = Math.abs(array[s] - avg);
            finalSum = (int) Math.pow(temp, 2);
        }
        return (int) Math.sqrt(finalSum);
    }

    public static void main(String[] args) {
        System.out.println("Enter Size of Array ");
        int size = kp.nextInt();
        NumberArray s = new NumberArray(size);
        s.inputData();
        System.out.println("Max Elemnt" + s.max());
        System.out.println("Min elemnt " + s.min());
        System.out.println("Sum elemnt" + s.sumOfArray());
        System.out.println("Standart Disvion " + s.SD());
        s.printArray();

    }

}

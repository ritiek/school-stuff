package javaapplication1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner take_input = new Scanner(System.in);  
        int array[] = new int[5];
        
        for (int i=0; i<array.length; i++) {
            System.out.println("Enter element no. " + i + ": ");
            array[i] = take_input.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println("Ascending order:");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        
        System.out.println("Descending order:");
        for (int i=array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
    } 
}
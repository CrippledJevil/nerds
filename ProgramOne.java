import java.io.*;
import java.util.*;
import java.math.*;
import java.util.Random;

public class CrayonTime {
    String[] stringArrya = generateRandomStringArray(5, 10);
    System.out.println("original randomly generated array");
    printArray(randomArray);

    modifyArray(randomArray);
    System.out.println("Changed Array");
    printArray(randomArray);
}

public static void modifyArray(String[] array) {
    for(int i = 0; i < array.length;i++){
        if(!array[i].isEmpty() && array[i].charAt(0) >= 'P') {
            array[i] = "Z" + array[i].substring(1); 
        }
    }
}

public static void printArray(String[] array){
    for (String str : array){
        System.out.println(str);
    }
}

public static String[] generateRandomStringArray(int size){
    String[] randomArray = new String[size];
    Random random = new Random();
    for(int i =  0; i < size; i++){
        String
    }
}
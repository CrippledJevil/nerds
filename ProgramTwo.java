import java.util.Random;

public class ProgramTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(Integer.MAX_VALUE); 
        int[] arr = new int[x];
        for(int i = 0; i < arr.length; i++)
        {
            int y = random.nextInt(Integer.MAX_VALUE); 
            arr[i] = y; 
            System.out.println(arr[i]);

        }
    }
}
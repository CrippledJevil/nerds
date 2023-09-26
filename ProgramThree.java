import java.util.Random;

public class ProgramThree {
    public static void main(String[] args) {
        Random random = new Random();
        int u = random.nextInt(4); 
        System.out.println(u);
        if(u == 0){
            u = 1;
        }
        int x = random.nextInt(Integer.MAX_VALUE); 
        int[] arr = new int[x];
        for(int i = 0; i < arr.length; i++)
        {
            int y = random.nextInt(Integer.MAX_VALUE); 
            arr[i] = y; 
            if(u == 1)
            {
                arr[i] = 999; 
            }
            else if(u == 2)
            {
                if(i%2 == 0)
                {
                    arr[i] = 555;
                }
            }
            else if(u == 3){
                if(i%2 == 0){
                    arr[i] = 444;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
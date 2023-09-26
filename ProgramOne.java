
public class ProgramOne{
    public static void main(String[] args) {
        int strx = (new Double(Math.random()*100)).intValue();
        String[] strs = new String[strx];
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int b = 0;
        for(int i = 0; i < strs.length; i++)
        {
            strs[i] = "";
            for(int j = 0; j < (new Double((Math.random()*10)+1)).intValue(); j++)
            {
                b = (new Double(Math.random()*26)).intValue();
                strs[i] += abc.charAt(b);
            }
        }
        swapLetterOne(strs);
        for(int i = 0; i < strs.length; i++)
        {
            System.out.println(strs[i]);
        }
    }
    public static void swapLetterOne(String[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(((int) arr[i].charAt(0)) >= 80)
            {
                arr[i] = arr[i].substring(1);
                arr[i] = "Z" + arr[i];
            }
        }
    }
}

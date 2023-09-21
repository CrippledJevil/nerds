import java.io.*;
import java.util.*;
import java.math.*;

public class CrayonTime {
    int x = math.random;
    int strx = math.random()*100;
    String[] strs = new String[strx];
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int a = 0;
    int b = 0;
    for(int i = 0; i < strs.length; i++)
    {
        for(int j = 0; j < math.random()*10; j++)
        {
            b = (int) math.random()*26;
            strs[i] += abc.charAt(b);
            if(i==0)
            {
                a = b;
            }
        }
        if(b>=15)
        {
            strs[i].deleteCharAt(0);
            strs[i] = "z" + strs[i];
        }
    }
}

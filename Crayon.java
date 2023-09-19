import java.io.*;
import java.util.*;
import java.math.*;

public class CrayonTime {
    int x = math.random;
    int strx = math.random()*100;
    String[] strs = new String[strx];
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for(int i = 0; i < strs.length; i++)
    {
        for(int j = 0; j < math.random()*10; j++)
        {
            strs[i] += abc.charAt((int) math.random()*26);
        }
    }
}

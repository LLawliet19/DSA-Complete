package completeDSA;

import java.util.*;
import java.io.*;
import java.lang.*;

class reverse
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}


class Reverse
{
    // Complete the function
    // str: input string
	

    
    public static String reverseWord(String str)
    {
        // Reverse the string str
    	String reverse = "";
        int len = str.length();
       // System.out.println("the length is :" + len);
        for (int i = len - 1 ; i>= 0 ; i--)
        {
        	//System.out.println("len = "+ i);
        	 reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
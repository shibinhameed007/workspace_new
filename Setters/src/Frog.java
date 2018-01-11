import java.io.*;

//sum needs to contain atleast 2 elements
public class Frog
{
    public static long count = 0;
    public static void main(String[] args) throws IOException
    {
        Frog br = new Frog();
        long num = 100;
        //driver(num);
        func(num);
        System.out.println("count = " + count);
    }


    public static void func(long num)
    {
        long temp,i,j;
        long limit = (num / 2);
        for(i = 1 ; i <= limit ; i++)
        {
            temp = num;
            j = i;
            while(j < temp)
            {
                temp = temp - j;
                j++;
            }
            if(j == temp)
            {
                count++;
            }
        }
    }

}
import java.util.*;
public class one{
    public static void main(String[] arg)
    {
       Scanner read=new Scanner(System.in);
       int a=read.nextInt();
       System.out.printf("%d Hour(s) %d Minute(s)",a/60,a%60);
    }
}
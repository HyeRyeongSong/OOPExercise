/**
 * Created by HyeRyeongSong on 2017. 3.28..
 */

import java.util.Scanner;

public class Exercise4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] iArray = new int[10];
        System.out.println("정수 10개를 입력하세요");
        for(int i=0; i<iArray.length; ++i)
        {
            iArray[i] = scanner.nextInt();
        }
        for(int i=0; i<iArray.length -1; ++i)
        {
            for(int j=0; j<iArray.length -1; ++j)
            {
                if(iArray[j] > iArray[j+1])
                {
                    int iTmp = iArray[j];
                    iArray[j] = iArray[j + 1];
                    iArray[j+1] = iTmp;
                }
            }
        }
        for(int e: iArray)
        {
            System.out.print(e + "\t");
        }
    }
}
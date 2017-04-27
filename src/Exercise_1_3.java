/**
 * Created by HyeRyeongSong on 2017. 3. 21..
 */
import java.util.*;

public class Exercise_1_3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("1~99 사이의 정수를 입력하시오 >> ");
            int iNum = scanner.nextInt();
            int iCheck;
            boolean bExist = false;
            iCheck = iNum % 10;
            iNum = iNum / 10;
            if (iNum == 3 || iNum == 6 || iNum == 9)
            {
                bExist = true;
            }
            if (iCheck == 3 || iCheck == 6 || iCheck == 9)
            {
                if (bExist)
                {
                    System.out.println("박수짝짝");
                } else
                {
                    System.out.println("박수짝");
                }
            } else if (bExist)
            {
                System.out.println("박수짝");
            }
        }
    }
}

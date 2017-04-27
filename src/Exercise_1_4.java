/**
 * Created by HyeRyeongSong on 2017. 3. 21..
 */
import java.util.*;

public class Exercise_1_4
{
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("년도를 입력하세요.");
            Scanner scanner = new Scanner(System.in);
            int iYear = scanner.nextInt();
            boolean bCheck = false;

            if (iYear % 4 == 0)
            {
                if (iYear % 100 == 0)
                {
                    if (iYear % 400 == 0)
                    {
                        bCheck = true;
                    }
                } else
                {
                    bCheck = true;
                }
            }

            if (bCheck)
            {
                System.out.println("윤년입니다.");
            } else
            {
                System.out.println("윤년이 아닌 평년입니다.");
            }
            System.out.println();
        }
    }
}

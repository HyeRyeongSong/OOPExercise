import java.util.*;

/**
 * Created by HyeRyeongSong on 2017. 3. 28..
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        System.out.print("두 점 (x1, y1), (x2, y2)의 좌표를 입력하시오>> ");
        Scanner scanner = new Scanner(System.in);
        int iX1 = scanner.nextInt();
        int iY1 = scanner.nextInt();
        int iX2 = scanner.nextInt();
        int iY2 = scanner.nextInt();

        if(iX1 >= 50 && iX1 <= 100)
        {
            if(iY1 >= 50 && iY1 <= 100)
            {
                System.out.println("사각형이 겹칩니다.");
            }
        }

        else if(iX2 >= 50 && iX2 <= 100)
        {
            if(iY2 >= 50 && iY2 <= 100)
            {
                System.out.println("사각형이 겹칩니다.");
            }
        }

    }
}

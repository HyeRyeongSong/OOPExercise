import java.util.Scanner;

/**
 * Created by HyeRyeongSong on 2017. 3.28..
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요>> ");
        int iNum1 = scanner.nextInt();
        int iNum2 = scanner.nextInt();
        int gcd = iNum1 < iNum2 ? iNum1 : iNum2;
        for(int i=gcd; i>0; --i)
        {
            if(iNum1 % i == 0 && iNum2 % i == 0)
            {
                System.out.println("최대공약수: " + i);
                break;
            }
        }
    }
}

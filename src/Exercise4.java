/**
 * Created by HyeRyeongSong on 2017. 4. 4..
 */
import java.util.*;
public class Exercise4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] hexa2bin = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
        System.out.print("16진수 문자열을 입력하시오: ");
        String str = scanner.next();
        str = str.toLowerCase();
        char[] cArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for(int i=0; i<str.length(); ++i)
        {
            char c  = str.charAt(i);
            for(int j=0; j<cArray.length; ++j)
            {
                if(c == cArray[j])
                {
                    System.out.print(hexa2bin[j] + "\t");
                }
            }
        }
    }
}
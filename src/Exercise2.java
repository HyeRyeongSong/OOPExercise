import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HyeRyeongSong on 2017. 3.28..
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int iIndex;
        System.out.print("알파벳 한 문자를 입력하시오>> ");
        InputStreamReader rd = new InputStreamReader(System.in);
        char c = 0;
        try
        {
            c = (char) rd.read();
        } catch (IOException e)
        {
            System.out.println("키보드 입력 중 오류가 발생했습니다.");
        }
        for(int i=0; i<str.length(); ++i)
        {
            if(c == str.charAt(i))
            {
                for(int j=i; j>=0; --j)
                {
                    for(int k=0; k<=j; ++k)
                    {
                        System.out.print(str.charAt(k));
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}

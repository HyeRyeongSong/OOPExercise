import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HyeRyeongSong on 2017. 3. 28..
 */
public class Exercise2_1
{
    public static void main(String[] args)
    {
        String sAlphabet = "abcdefghijklmnopqrstuvwxyz";
        int iNum = 0;
        System.out.print("알파벳 한 문자를 입력하시오>> ");
        InputStreamReader rd = new InputStreamReader(System.in);
        char c = 0;
        try{
            c = (char)rd.read();
        }catch(IOException e){
            System.out.println("키보드 입력 중 오류가 발생했습니다.");
        }
        for(int i=0; i< sAlphabet.length(); ++i)
        {
            if(c == sAlphabet.charAt(i))
            {
                iNum = i+1;
                break;
            }
        }
        for(int i= iNum; i>=0; --i)
        {
            String str = sAlphabet.substring(0, i);
            System.out.println(str);
        }
    }
}

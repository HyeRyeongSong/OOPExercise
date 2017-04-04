/**
 * Created by HyeRyeongSong on 2017. 4. 4..
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        int[] prime = new int[1001];
        int iCheck = 0;
        for(int i=2; i<prime.length; ++i)
        {
            prime[i] = 1;
        }
        for(int i=2; i<prime.length; ++i)
        {
            for(int j=i+1; j<prime.length; ++j)
            {
                if(j % i == 0)
                {
                    prime[j] = 0;
                }
            }
        }
        for(int i=0; i<prime.length; ++i)
        {
            if(prime[i] == 1)
            {
                System.out.print(i + "\t");
                ++iCheck;
            }
            if(iCheck != 0 && iCheck % 20 == 0)
            {
                System.out.println();
            }
        }
    }
}

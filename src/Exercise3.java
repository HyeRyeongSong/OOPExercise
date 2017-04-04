/**
 * Created by HyeRyeongSong on 2017. 4. 4..
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        int[][] iArray = new int[10][];
        int iNum = 0;
        for(int i=0; i<iArray.length; ++i)
        {
            iArray[i] = new int[i+1];
            for(int j=0; j<iArray[i].length; ++j)
            {
                iNum = factorial(i) / (factorial(j) * factorial(i-j));
                System.out.print(iNum + "\t");
            }
            System.out.println();
        }
    }
    public static int factorial(int i)
    {
        if(i == 1 || i == 0)
            return 1;
        else
            return i * factorial(i-1);
    }
}

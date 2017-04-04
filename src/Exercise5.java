/**
 * Created by HyeRyeongSong on 2017. 4. 4..
 */
public class Exercise5
{
    public static void main(String[] args)
    {
        int[][] iArray = new int[4][4];
        boolean[] bArray = new boolean[16];
        int iNum1 = 0, iNum2 = 0;
        int iLocation =0;
        for(boolean e: bArray)
        {
            e = false;
        }
        for(int i=0; i<8; ++i)
        {
            while (true)
            {
                iLocation = (int) Math.round(Math.random() * 15 + 1);
                if (bArray[iLocation] == false)
                {
                    bArray[iLocation] = true;
                    iNum1 = iLocation / 4;
                    iNum2 = iLocation % 4;
                    break;
                }
            }
            iArray[iNum1][iNum2] = (int) Math.round(Math.random() * 9 + 1);
        }
        for(int i=0; i<iArray.length; ++i)
        {
            for(int j=0; j<iArray[i].length; ++j)
            {
                System.out.print(iArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

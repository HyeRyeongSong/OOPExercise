/**
 * Created by HyeRyeongSong on 2017. 4. 4..
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        int[][] iArray = {{78, 48, 78, 98},{99, 92},{29, 64, 83}, {34, 78, 92, 56}};
        int iSum = 0;
        double dAverage = 0;
        for(int i=0; i<iArray.length; ++i)
        {
            iSum = 0;
            for(int j=0; j<iArray[i].length; ++j)
            {
                System.out.println("(" + i + ", " + j + ") = " + iArray[i][j]);
                iSum += iArray[i][j];
            }
            dAverage = (double)iSum / iArray[i].length;
            System.out.println(i + "번째 행의 합: " + iSum);
            System.out.println(i + "번째 행의 평균: " + dAverage);
            System.out.println();
        }
    }
}

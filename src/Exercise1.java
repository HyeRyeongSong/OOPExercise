/**
 * Created by HyeRyeongSong on 2017. 5. 2..
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        int[] s1 = {4,2,4,5};
        int[] s2 = {3,4,7};

        System.out.println("concat()의 결과");

        int[] newString = ArrayUtility.concat(s1, s2);

        for(int i=0; i<newString.length; ++i)
            System.out.println(i + ": " + newString[i]);

        System.out.println("\nremove()의 결과");

        newString = ArrayUtility.remove(s1, s2);

        for(int i=0; i<newString.length; ++i)
            System.out.println(i + ": " + newString[i]);
    }
}

class ArrayUtility
{
    public static int[] concat(int[] s1, int[] s2)
    {
        int[] newString = new int[s1.length + s2.length];
        for(int i=0;i<s1.length; ++i)
        {
            newString[i] = s1[i];
        }
        for(int i=s1.length, j=0; i<s2.length + s1.length; ++i, ++j)
        {
            newString[i] = s2[j];
        }

        return newString;
    }

    public static int[] remove(int[] s1, int[] s2)
    {
        boolean[] bIsSame = new boolean[s1.length];
        int iCount = 0;

        for(int i=0; i<bIsSame.length; ++i)
            bIsSame[i] = false;

        for(int i=0; i<s2.length; ++i)
        {
            for(int j=0; j<s1.length; ++j)
            {
                if(s2[i] == s1[j])
                    bIsSame[j] = true;
            }
        }

        for(int i=0; i<bIsSame.length; ++i)
            if(bIsSame[i])
                ++iCount;

        int[] iNewArray = new int[iCount];

        for(int i=1, j =0; i<bIsSame.length; ++i)
        {
            if(!(bIsSame[i]))
            {
                iNewArray[j++] = s1[i];
            }
        }

        return iNewArray;
    }
}

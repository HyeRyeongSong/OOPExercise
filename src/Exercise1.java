/**
 * Created by HyeRyeongSong on 2017. 4. 18..
 */
public class Exercise1
{
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1, 1, 2, 3);
        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if(r.equals(s))
        {
            System.out.println("두 사각형은 같습니다.");
        }
    }
}

class Rectangle
{
    int x1, y1, x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public  Rectangle()
    {}

    void set(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    int square()
    {
        int iNumOfx = x1 - x2;
        int iNumOfy = y1 - y2;
        if(x1 < x2)
        {
            iNumOfx *= (-1);
        }
        if(y1 < y2)
        {
            iNumOfy *= (-1);
        }
        return iNumOfx * iNumOfy;
    }

    void show()
    {
        System.out.println("(x1, y1) = (" + x1 + ", " + y1 + ")");
        System.out.println("(x2, y2) = (" + x2 + ", " + y2 + ")");
        System.out.println("사각형의 넓이 = " + square());
    }

    boolean equals(Rectangle r)
    {
        if(square() == r.square())
            return true;

        return false;
    }
}

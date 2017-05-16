/**
 * Created by HyeRyeongSong on 2017. 5. 2..
 */

//toString() 오버라이딩
public class Exercise2
{
    public static void main(String[] args)
    {
        CPoint a, b;
        a = new CPoint(2, 3);
        b = new CColorPoint(3, 4, "red");
        a.show();
        b.show();
        System.out.println(a);
        System.out.println(b);

    }

}

class CPoint
{
    private int x;
    private int y;
    protected String strColor;

    public CPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.strColor = new String();
    }

    void show()
    {
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        if(this.strColor == null)
            return "(" + x + ", " + y + ")";
        return "(" + x + ", " + y + ")" + this.strColor;
    }
}

class CColorPoint extends CPoint
{

    public CColorPoint(int x, int y, String strColor)
    {
        super(x, y);
        this.strColor.equals(strColor);
        System.out.println(this.strColor);
    }

}

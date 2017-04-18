/**
 * Created by HyeRyeongSong on 2017. 4. 18..
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        Complex x = new Complex(3.4, 4.5);
        Complex y = new Complex(5.2, -2.4);
        Complex resultAdd = x.add(x, y);
        Complex resultSub = x.sub(x, y);
        System.out.print("x, y를 더한 결과: ");
        resultAdd.print();
        System.out.print("x, y를 뺀 결과: ");
        resultSub.print();
        System.out.println("x의 절대값: " + x.abs());
        System.out.println("y의 절대값: " + y.abs());
    }
}

class Complex
{
    private double dNum1;  //실수부
    private double dNum2;  //허수부

    Complex(double dNum1, double dNum2)
    {
        this.dNum1 = dNum1;
        this.dNum2 = dNum2;
    }

    public static Complex add(Complex c1, Complex c2)
    {
        double dNum1 = c1.dNum1 + c2.dNum1;
        double dNum2 = c1.dNum2 + c2.dNum2;
        Complex c3 = new Complex(dNum1, dNum2);
        return c3;
    }

    public static Complex sub(Complex c1, Complex c2)
    {
        double dNum1 = c1.dNum1 - c2.dNum1;
        double dNum2 = c1.dNum2 - c2.dNum2;
        Complex c3 = new Complex(dNum1, dNum2);
        return c3;
    }

    double abs()
    {
        return Math.sqrt((dNum1*dNum1) + (dNum2 * dNum2));
    }

    void print()
    {
        System.out.println(dNum1 + " + " + dNum2 + "i");
    }
}

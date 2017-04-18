/**
 * Created by HyeRyeongSong on 2017. 4. 18..
 */
public class Exercise4
{
    public static void main(String[] args)
    {
        Cylinder cylinder = new Cylinder(2.8, 5.6);
        Circle circle = new Circle(2.8);
        Cylinder cylinder1 = new Cylinder(circle, 5.6);
        System.out.println("부피: " + cylinder.getVolume());
        System.out.println("부피: " + cylinder1.getVolume());


    }
}

class Cylinder
{
    private Circle circle;
    private double dheight;

    Cylinder(Circle circle, double dheight)
    {
        this.circle = circle;
        this.dheight = dheight;
    }

    Cylinder(double radius, double dheight)
    {
        this.circle = new Circle(radius);
        this.dheight = dheight;
    }

    double getVolume()
    {
        return circle.PI * circle.radius * circle.radius * dheight;
    }
}
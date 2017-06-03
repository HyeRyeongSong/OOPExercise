/**
 * Created by HyeRyeongSong on 2017. 5. 23..
 */

abstract class Fruits{
    abstract void print();
}

class Grape extends Fruits
{
    void print()
    {
        System.out.println("나는 포도이다");
    }
}

class Apple extends Fruits
{
    void print()
    {
        System.out.println("나는 사과이다");
    }
}

class Pear extends Fruits
{
    void print()
    {
        System.out.println("나는 배이다");
    }
}
public class Exercise2
{
    public static void main(String[] args)
    {
        Fruits fAry[] = {new Grape(), new Apple(), new Pear()};
        for(Fruits f: fAry)
            f.print();
    }
}

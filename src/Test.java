/**
 * Created by HyeRyeongSong on 2017. 5. 16..
 */
class A implements I1, I2   //최소 하나라도 구현이 된 애들 중에 default 메소드가 있으면 이름 충돌이 난다
{
    public void f()
    {
        System.out.println("f in A");
    }

    //해결책을 이를 새로 구현해야함
    //이름이 겹치는 게 하나라도 있으면 구현 클래스에서 명시적으로 이름 겹치는 것을 만들어주는 것이 해결책임
    public void f2()
    {
        I1.super.f2();
        System.out.println("f2 in A");
    }

}


interface I1
{
    void f();
    default void f2()
    {
        System.out.println("f2 in I1");
    }
    static I1 getI1()
    {
        return new A();
    }
}

interface I2
{
    void f();
    void f2();
}

public class Test
{
    public static void main(String[] args)
    {
        I1 vari1 = I1.getI1();

        A var = new A();
        var.f2();

        //I2 vari2 = new A();
        //vari2.f2(); //정의가 안되어 있으므로 불가
    }
}


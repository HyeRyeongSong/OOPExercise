/**
 * Created by HyeRyeongSong on 2017. 5. 23..
 */
import java.util.*;

abstract class DObject{
    String a = new String();
    static DObject head;
    static DObject current;
    DObject next;

    abstract void draw();
}
class Line extends DObject{
    void draw()
    {
        a = "Line";
    }
}
class Rect extends DObject{
    void draw()
    {
        a = "Rect";
    }
}
class Circle extends DObject{
    void draw()
    {
        a = "Circle";
    }
}

class Put{
    DObject x;

    public Put(int a){
        switch(a){
            case 1 :
                x = new Line();
                x.draw();
                break;
            case 2 :
                x = new Rect();
                x.draw();
                break;
            case 3 :
                x = new Circle();
                x.draw();
                break;
            default :
                System.out.println("ERROR");
        }
    }
    public void PutList(DObject x)
    {
        if(DObject.head == null)
        {
            DObject.head = x;
        }
        else
        {
            for(DObject.current = DObject.head; DObject.current.next != null; DObject.current = DObject.current.next)
                ;
            DObject.current.next = x;
        }
    }
}
class Manage{
    public void Watch()
    {
        for(DObject.current = DObject.head; DObject.current != null; DObject.current = DObject.current.next)
            System.out.println(DObject.current.a);
    }
    public void Pop(int a)
    {
        if(a != 0)
        {
            DObject.current = DObject.head;
            for(int b = 0; b < a - 1; b++)
            {
                if(DObject.current.next != null)
                    DObject.current = DObject.current.next;
                else
                {
                    System.out.println("ERROR");
                    break;
                }
            }
            if(DObject.current.next != null)
                DObject.current.next = DObject.current.next.next;
        }
        else
            DObject.head = DObject.head.next;
    }
}
public class Exercise3{
    public static void main(String args[])
    {
        Scanner rd = new Scanner(System.in);
        Manage m = new Manage();

        int a = 0;
        int b = 0;
        while(a != 4)
        {
            System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
            a = rd.nextInt();
            switch(a)
            {
                case 1 :
                    System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
                    b = rd.nextInt();
                    Put put = new Put(b);
                    put.PutList(put.x);
                    break;
                case 2 :
                    System.out.print("삭제할 도형의 위치>>");
                    b = rd.nextInt();
                    m.Pop(b);
                    break;
                case 3 :
                    m.Watch();
                    break;
                default :
                    break;
            }
        }
    }
}
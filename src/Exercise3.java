/**
 * Created by HyeRyeongSong on 2017. 5. 2..
 */
import java.util.*;
public class Exercise3
{
    public static void main(String[] args)
    {
        Reservation reservation = new Reservation();
        Scanner scanner = new Scanner(System.in);
        int iNum;
        int iNumOfSeat;
        int iSeatNumber;
        String strName;
        while (true)
        {
            System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >>");
            iNum = scanner.nextInt();
            switch (iNum)
            {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3) >>");
                    iNumOfSeat = scanner.nextInt();
                    switch (iNumOfSeat)
                    {
                        case 1:
                            reservation.PrintSeatS();
                            break;
                        case 2:
                            reservation.PrintSeatA();
                            break;
                        case 3:
                            reservation.PrintSeatB();
                            break;
                        default:
                            System.out.println("없는 좌석 타입입니다.");
                    }
                    System.out.print("이름>>");
                    strName = scanner.next();
                    System.out.print("번호>>");
                    iSeatNumber = scanner.nextInt();

                    if (iSeatNumber > 10 || iSeatNumber < 1)
                    {
                        System.out.println("없는 좌석입니다.\n예약을 진행할 수 없습니다.");
                        break;
                    }

                    switch (iNumOfSeat)
                    {
                        case 1:
                            S s = new S(strName);
                            reservation.ReserveSeatS(s, iSeatNumber);
                            break;
                        case 2:
                            A a = new A(strName);
                            reservation.ReserveSeatA(a, iSeatNumber);
                            break;
                        case 3:
                            B b = new B(strName);
                            reservation.ReserveSeatB(b, iSeatNumber);
                            break;
                    }
                    break;
                case 2:
                    reservation.PrintSeatS();
                    reservation.PrintSeatA();
                    reservation.PrintSeatB();
                    System.out.println("<<<조회를 완료하였습니다>>>");
                    break;
                case 3:
                    System.out.print("좌석구분 S(1), A(2), B(3) >>");
                    iNumOfSeat = scanner.nextInt();
                    switch(iNumOfSeat)
                    {
                        case 1:
                            reservation.PrintSeatS();
                            System.out.print("이름>>");
                            strName = scanner.next();
                            reservation.DeleteInfo(iNumOfSeat, strName);
                            break;
                        case 2:
                            reservation.PrintSeatA();
                            System.out.print("이름>>");
                            strName = scanner.next();
                            reservation.DeleteInfo(iNumOfSeat, strName);
                            break;
                        case 3:
                            reservation.PrintSeatB();
                            System.out.print("이름>>");
                            strName = scanner.next();
                            reservation.DeleteInfo(iNumOfSeat, strName);
                            break;
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("없는 메뉴 번호입니다");
            }
        }
    }
}

class S
{
    private String strName;

    public S(String strName)
    {
        this.strName = new String();
        this.strName = strName;
    }

    public void printInfo()
    {
        System.out.print(this.strName + " ");
    }

    public boolean CompareName(String strName)
    {
        if(strName.equals(this.strName))
            return true;
        return false;
    }
}

class A
{
    private String strName;

    public A(String strName)
    {
        this.strName = new String();
        this.strName = strName;
    }

    public void printInfo()
    {
        System.out.print(this.strName + " ");
    }

    public boolean CompareName(String strName)
    {
        if(strName.equals(this.strName))
            return true;
        return false;
    }

}

class B
{
    private String strName;

    public B(String strNamae)
    {
        this.strName = new String();
        this.strName = strName;
    }

    public void printInfo()
    {
        System.out.print(this.strName + " ");
    }

    public boolean CompareName(String strName)
    {
        if(strName.equals(this.strName))
            return true;
        return false;
    }

}

class Reservation
{
    private S[] s;
    private A[] a;
    private B[] b;

    public Reservation()
    {
        s = new S[10];
        a = new A[10];
        b = new B[10];
    }

    public void ReserveSeatS(S s, int iNumOfSeat)
    {
        if(this.s[iNumOfSeat-1] != null)
        {
            System.out.println("이미 예약된 좌석입니다.\n예약을 진행할 수 없습니다.");
            return;
        }
        this.s[iNumOfSeat-1] = s;
    }

    public void ReserveSeatA(A a, int iNumOfSeat)
    {
        if(this.a[iNumOfSeat-1] != null)
        {
            System.out.println("이미 예약된 좌석입니다.\n예약을 진행할 수 없습니다.");
            return;
        }
        this.a[iNumOfSeat-1] = a;
    }

    public void ReserveSeatB(B b, int iNumOfSeat)
    {
        if(this.b[iNumOfSeat-1] != null)
        {
            System.out.println("이미 예약된 좌석입니다.\n예약을 진행할 수 없습니다.");
            return;
        }
        this.b[iNumOfSeat-1] = b;
    }

    public void PrintSeatS()
    {
        System.out.print("S>> ");
        for(S s: s)
        {
            if(s == null)
                System.out.print("--- ");
            else
                s.printInfo();
        }
        System.out.println();
    }

    public void PrintSeatA()
    {
        System.out.print("A>> ");
        for(A a: a)
        {
            if(a == null)
                System.out.print("--- ");
            else
                a.printInfo();
        }
        System.out.println();
    }

    public void PrintSeatB()
    {
        System.out.print("B>> ");
        for(B b: b)
        {
            if(b == null)
                System.out.print("--- ");
            else
                b.printInfo();
        }
        System.out.println();
    }

    public void DeleteInfo(int iNum, String strName)
    {
        if(iNum ==1)
        {
            for (int i = 0; i < 10; ++i)
            {
                if(s[i] != null)
                {
                    if (s[i].CompareName(strName))
                    {
                        s[i] = null;
                        return;
                    }
                }
            }
        }
        else if(iNum == 2)
        {
            for (int i = 0; i < 10; ++i)
            {
                if(a[i] != null)
                {
                    if (a[i].CompareName(strName))
                    {
                        a[i] = null;
                        return;
                    }
                }
            }
        }
        else if(iNum == 3)
        {
            for (int i = 0; i < 10; ++i)
            {
                if(b[i] != null)
                {
                    if (b[i].CompareName(strName))
                    {
                        b[i] = null;
                        return;
                    }
                }
            }
        }

        else
        {
            System.out.println("없는 좌석번호를 입력하셨습니다");
            return;
        }

        System.out.println("해당 이름이 없습니다.\n취소를 할 수 없습니다.");
    }

}

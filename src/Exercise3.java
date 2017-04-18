/**
 * Created by HyeRyeongSong on 2017. 4. 18..
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        Car mycar = new Car(300);
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp(-50);
        mycar.speedUp(50);
        mycar.speedDown(-30);
        mycar.speedDown(30);
        mycar.speedDown(30);
        mycar.speedDown(30);
        mycar.speedUp(100);
        mycar.speedUp(300);
        mycar.speedDown();
    }
}

class Car
{
    private int maxSpeed;
    private int speed = 0;
    public Car(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public void speedUp()
    {
        System.out.print("speedUp() 호출: ");
        speed += 5;
        if(speed > maxSpeed)
            speed = maxSpeed;
        System.out.println("최대속도: " + maxSpeed + ", 현재속도: " + speed);
    }

    public void speedUp(int iNum)
    {
        System.out.print("speedUp(" + iNum + ") 호출: ");
        if((iNum + speed)  > maxSpeed)
        {
            speed = maxSpeed;
            System.out.println("최대속도보다 높아 최대속도로 지정, 최대속도: " + maxSpeed + ", 현재속도: " + speed);
            return;
        }

        if(iNum < 0)
        {
            System.out.println("오류: 속도가 음수라 0으로 지정: 최대속도: " + maxSpeed + ", 현재속도: " + speed);
            return;
        }

        speed += iNum;
        System.out.println("최대속도: " + maxSpeed + ", 현재속도: " + speed);

    }

    public  void speedDown()
    {
        System.out.print("speedDown() 호출: ");
        speed -= 5;
        System.out.println("최대속도: " + maxSpeed + ", 현재속도: " + speed);
    }

    public void speedDown(int iNum)
    {
        System.out.print("speedDown(" + iNum + ") 호출: ");

        if((speed - iNum)  < 0)
        {
            speed = 0;
            System.out.println("속도가 0보다 작아져 0으로 지정, 최대속도: " + maxSpeed + ", 현재속도: " + speed);
            return;
        }


        if(iNum < 0)
        {
            System.out.println("오류: 속도가 음수라 0으로 지정: 최대속도: " + maxSpeed + ", 현재속도: " + speed);
            return;
        }

        speed -= iNum;
        System.out.println("최대속도: " + maxSpeed + ", 현재속도: " + speed);


    }
}
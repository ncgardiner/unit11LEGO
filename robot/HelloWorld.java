import lejos.nxt.Button;
import lejos.nxt.Motor;
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("wee woo wee woo");
        Button.waitForAnyPress();
        System.out.println("it's the sexy police");
        Button.waitForAnyPress();
        Motor.B.forward();
        Motor.C.forward();
        Button.waitForAnyPress();
    }
}
import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
public class HelloWorld
{
    public static void main(String[] args)
    {
        DifferentialPilot pilot = new DifferentialPilot(2.2,2.2,6.5,Motor.B,Motor.C,false);
        TouchSensor touch = new TouchSensor(SensorPort.S2);
        Button.waitForAnyPress();
        pilot.travel(12);
        Button.waitForAnyPress();
        pilot.rotate(360);
        Button.waitForAnyPress();
        while (!touch.isPressed()){}
        System.out.println("YEET");
        Button.waitForAnyPress();
    }
}



















































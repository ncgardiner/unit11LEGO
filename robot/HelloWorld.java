import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
public class HelloWorld
{
    public static void main(String[] args)
    {
        DifferentialPilot pilot = new DifferentialPilot(2.2,2.2,6.5,Motor.B,Motor.C,false);
        LightSensor light = new LightSensor(SensorPort.S3);
        TouchSensor touch = new TouchSensor(SensorPort.S2);
        light.setFloodlight(false);
        Button.waitForAnyPress();
        while (!touch.isPressed())
        {
            System.out.println(light.readNormalizedValue());
        }
        System.out.println("YEET"); 
        Button.waitForAnyPress();
    }
}
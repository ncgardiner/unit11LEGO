import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
public class ActionPerformer
{
    
    public static void main(String[] args)
    {
        DifferentialPilot pilot = new DifferentialPilot(2.2,2.2,6.5,Motor.B,Motor.C,false);
        LightSensor light = new LightSensor(SensorPort.S3);
        TouchSensor touch = new TouchSensor(SensorPort.S2);
        escapeBox(pilot,light,touch);
        pilot.stop();
        //travelCircle();
        System.out.println("Done");
        Button.waitForAnyPress();
    }
    public static void escapeBox(DifferentialPilot pilot,LightSensor light,TouchSensor touch)
    {
        boolean escaped = false;
        int count = 0;
        while (!escaped)
        {
            pilot.forward();
            while (!touch.isPressed())
            {
                count++;
                if (light.readNormalizedValue()>300)
                    return;//The light level is high enough so that the robot has escaped
            }
            //Touch has been pressed
            pilot.stop();
            pilot.backward();
            while (count>0)
                count--;
            pilot.stop();
            pilot.rotate(45);
        }
    }
    public void travelCircle()
    {
        
    }
}
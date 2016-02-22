
/**
 * A class to test changes.
 * 
 * @author (Edward) 
 * @version (02.22.16)
 */
public class testTimeDisplay
{
   

    /**
     * Constructor for objects of class Test
     */
    public testTimeDisplay()
    {
    }

    /**
     * Constructor for objects of class TestClockDisplay
     */
    public void test()
    {
       ClockDisplay clock = new ClockDisplay();
       
       clock.setTime(22, 00);
       System.out.println(clock.getTime());
       
 
    }
}
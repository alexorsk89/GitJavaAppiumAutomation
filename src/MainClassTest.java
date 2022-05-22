import jdk.nashorn.internal.parser.JSONParser;
import org.junit.Test;

public class MainClassTest
{
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        int number = mainClass.getLocalNumber();
        if (number == 14) {
            System.out.println("Test success " + number);
        } else {
            System.out.println("Test failed " + number);
        }
    }
    @Test
    public void testGetClassNumber()
    {
        if (mainClass.getClassNumber() > 45) {
            System.out.println("Test success: " + mainClass.getClassNumber() + " > 45");
        } else {
            System.out.println("Test failed: " + mainClass.getClassNumber() + " < 45");
        }
    }

    @Test
    public void testGetClassString()
    {
        if (mainClass.getClassString().contains("hello") || mainClass.getClassString().contains("Hello")){
            System.out.println("Test success: " + mainClass.getClassString());
        } else {
            System.out.println("Test failed: " + mainClass.getClassString());
        }
    }
}

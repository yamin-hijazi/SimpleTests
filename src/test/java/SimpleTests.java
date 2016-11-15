import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;


/**
 * Created by gadiel on 15/11/2016.
 */
public class SimpleTests {

   @Test
   public void alwaysPass1()
   {
       assertEquals(1,1);
   }

    @Test
    public void alwaysPass2()
    {
        assertEquals(1,1);
    }

    @Test
    public void alwaysFail1()
    {
        assertEquals(1,0);
    }

    @Test
    public void alwaysFail2()
    {
        assertEquals(1,0);
    }

    @Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        assertEquals(smallerThanFifee,true);
    }

    @Test
    public void sometimesPass2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        assertEquals(smallerThanFifee,true);
    }
}

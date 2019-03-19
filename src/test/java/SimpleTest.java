import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;
                                                                                       
/**                                         
 *  Created by gadiel on 15/11/2016.                   
 */ 
   
// commit 1   
                             
public class SimpleTest { 
				 
  @Test  
   public void alwaysPass1()
   { 
       Assert.assertEquals(1, 1);
   } 
  
   @Test
    public void alwaysPass2()
    {
        Assert.assertEquals(2, 2);
    }


    @Test
    public void alwaysFail1()
    {
        Assert.assertEquals(1, 2);   
    }

   @Test
    public void alwaysFail2()
    {
        Assert.assertEquals(1, 2);
    }
	      
 
    @Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }

    @Test  
    public void sometimesPass2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
    @Test  
    public void sometimesPass3()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
    @Test  
    public void sometimesPass4()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
    @Test  
    public void sometimesPass5()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	
	@Test
	@Ignore
    public void ignored1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	 
	@Test
	@Ignore
    public void ignored2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	
	
} 
 
 

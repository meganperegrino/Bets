package project;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testJUnit {
	
   String message = "Hello World";	
   messageUtil messageUtil = new messageUtil(message);

   @Test
   public void testPrintMessage() {	  
      assertEquals(message,messageUtil.printMessage());
   }
}
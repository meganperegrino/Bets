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
   
   @Test
   public void test1() {
	   assertEquals(7, bets.bets(8, 0));
   }
   
   @Test
   public void test2() {
	   assertEquals(6, bets.bets(18, 2));
   }
   
   @Test
   public void test3() {
	   assertEquals(4, bets.bets(10, 10));
   }
   
   @Test
   public void test4() {
	   assertEquals(0, bets.bets(1, 0));
   }
   
   @Test
   public void test5() {
	   assertEquals(3, bets.bets(8, 3));
   }
   
}
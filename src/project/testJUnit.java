package project;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testJUnit {
   
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
   
   @Test
   public void test1It() {
	   assertEquals(7, bets.betsIt(8, 0));
   }
   
   @Test
   public void test2It() {
	   assertEquals(6, bets.betsIt(18, 2));
   }
   
   @Test
   public void test3It() {
	   assertEquals(4, bets.betsIt(10, 10));
   }
   
   @Test
   public void test4It() {
	   assertEquals(0, bets.betsIt(1, 0));
   }
   
   @Test
   public void test5It() {
	   assertEquals(3, bets.betsIt(8, 3));
   }
   
}
package tanmay.sarkar;

import tanmay.sarkar.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
	@Test
	public void test0(){
    	System.out.println(" Hello Test 0");
    	Assert.assertIt("My testing msg ","hi", "hi");
    	Assert.assertIt("My testing msg ","hi", "hi2");
    	Assert.assertIt("My testing msg ","hi", "hi3");
    	Assert.assertIt("My testing msg ","hi", "hi");
    	Assert.assertIt("My testing msg ","hi", "hi5");
    	Assert.assertIt("My testing msg ","hi", "hi");
    	Assert.assertIt("My testing msg ","hi", "hi7");
    	Assert.assertIt("My testing msg ","hi", "hi");
    	Assert.assertIt("My testing msg ","hi", "hi9");
    	System.out.println("This is sprint 9a code");
    }
	@Test
	public void test1(){
    	System.out.println(" Hello Test 1");
    }
    @Test
	public void test2(){
    	System.out.println(" Hello Test 2");
    }
    @Test
	public void test3(){
    	System.out.println(" Hello Test 3");
    }
    @Test
	public void test4(){
    	System.out.println(" Hello Test 4");
    }
    @Test
	public void test5(){
    	System.out.println(" Hello Test 5");
    }
    @Test
	public void test6(){
    	System.out.println(" Hello Test 6 with modified sprint 9a");
    }
    @Test
	public void test7(){
    	System.out.println(" Hello Test 7");
    }
    @Test
	public void test8(){
    	System.out.println(" Hello Test 8");
    }
    @Test
	public void test9(){
    	System.out.println(" Hello Test 9");
    } 
    @Test
	public void test10(){
    	System.out.println(" Hello Test 10 fro sprint9a");
    } 
}

package two_elements_add_up_to_k;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	
	@Test
	void testMain1() 
	{
		int[] array = {10,5,4,7};
		boolean output = Main.addUpTok(17, array);
		assertEquals(true, output);
	}
	
	@Test
	void testMain2() 
	{
		int[] array = {10,5,4,7};
		boolean output = Main.addUpTok(19, array);
		assertEquals(false, output);
	}
	
	@Test
	void testMain3() 
	{
		int[] array = {0,1,4,3};
		boolean output = Main.addUpTok(0, array);
		assertEquals(false, output);
	}
	
	@Test
	void testMain4() 
	{
		int[] array = {3,0,4,0};
		boolean output = Main.addUpTok(0, array);
		assertEquals(true, output);
	}
	
	@Test
	void testMain5() 
	{
		int[] array = {-3,-1,0,-10};
		boolean output = Main.addUpTok(-13, array);
		assertEquals(true, output);
	}

}

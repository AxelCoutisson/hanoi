package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dTall = new Disque(2);

	@Test
	public void compareTo_SmallTall_False(){
		int expected = -1;
		int actual = dSmall.compareTo(dTall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_TallSmall_False(){
		int expected = 1;
		int actual = dTall.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_SmallSmall_True(){
		int expected = 0;
		int actual = dSmall.compareTo(dSmall);
		assertEquals(expected, actual);
	}
}

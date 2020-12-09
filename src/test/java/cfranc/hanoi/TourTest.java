package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	Disque d1 = new Disque(1);
	Disque d3 = new Disque(3);

	@Test
	public void testEmplier_TourNonVideEtDisquePlusPetit_Vraie(){
		Tour tourNonVide = new Tour(2);

		tourNonVide.empiler(d3);

		boolean expected =  true;
		boolean actual = tourNonVide.empiler(d1);

		assertEquals(expected, actual);
	}

	@Test
	public void testEmplier_TourNonVideEtDisquePlusGrand_False(){


		Tour tourNonVide = new Tour(2);

		tourNonVide.empiler(d1);

		boolean expected =  false;
		boolean actual = tourNonVide.empiler(d3);

		assertEquals(expected, actual);
	}

	@Test
	public void testEmplier_TourPleineEtUnDisque_False(){


		Tour tourNonVide = new Tour(1);

		tourNonVide.empiler(d1);

		boolean expected =  false;
		boolean actual = tourNonVide.empiler(d3);

		assertEquals(expected, actual);
	}

}

package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	Disque d1 = new Disque(1);
	Disque d2 = new Disque(2);
	Tour _TourNonVide = new Tour(3);

	@Test
	//GIVEN_WHEN_THEN
	public void testEmpiler_TourPleine_FALSE() {
		Tour _TourPleine = new Tour(1);
		_TourPleine.empiler(d2);

		boolean expected = false;
		boolean actual = _TourPleine.empiler(d1);

		assertEquals(expected, actual);
	}

	@Test
	//GIVEN_WHEN_THEN
	public void testEmpiler_TourNonVideDisquePlusPetit_TRUE() {
		_TourNonVide.empiler(d2);

		boolean expected = true;
		boolean actual = _TourNonVide.empiler(d1);

		assertEquals(expected, actual);
	}

	@Test
	public void testEmpiler_TourNonVideDisquePlusGrand_FALSE() {
		_TourNonVide.empiler(d1);

		boolean expected = false;
		boolean actual = _TourNonVide.empiler(d2);

		assertEquals(expected, actual);
	}

	@Test
	public void testEmpiler_TourVide_TRUE(){
		Tour _TourVide = new Tour(2);
		boolean expected = true;
		boolean actual = _TourVide.empiler(d1);
		assertEquals( expected, actual);
	}

}

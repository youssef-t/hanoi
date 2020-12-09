package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dTall = new Disque(3);

	@Test
	public void compareTo_SmallMedium_Negative(){
		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_MediumTall_Negative(){
		int expected = -1;
		int actual = dMedium.compareTo(dTall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_SmallTall_Negative(){
		int expected = -1;
		int actual = dSmall.compareTo(dTall);
		assertEquals(expected, actual);
	}
	@Test
	public void compareTo_TallSmall_Positive(){
		int expected = 1;
		int actual = dTall.compareTo(dSmall);
		assertEquals(expected, actual);
	}
	@Test
	public void compareTo_TallMedium_Positive(){
		int expected = 1;
		int actual = dTall.compareTo(dMedium);
		assertEquals(expected, actual);
	}
	@Test
	public void compareTo_MediumSmall_Positive(){
		int expected = 1;
		int actual = dMedium.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	//ces trois tests ne sont pas utiles pour la tour d'Hanoi(disques de taille différente)
	@Test
	public void compareTo_TallTall_Null(){
		int expected = 0;
		int actual = dTall.compareTo(dTall);
		assertEquals(expected, actual);
	}
	@Test
	public void compareTo_MediumMedium_Null(){
		int expected = 0;
		int actual = dMedium.compareTo(dMedium);
		assertEquals(expected, actual);
	}
	@Test
	public void compareTo_SmallSmall_Null(){
		int expected = 0;
		int actual = dSmall.compareTo(dSmall);
		assertEquals(expected, actual);
	}

}


package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Testiranje klase AutoGuma
 * 
 * @author Dejan Milovanovic
 *
 */
public class AutoGumaTest {

	AutoGuma a;

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Pirelli");

		assertEquals("Pirelli", a.getMarkaModel());

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelLength() {
		a.setMarkaModel("pi");

	}

	// Test treba da baci izuzetak, ali to ne radi. Jer je greska u logici koda.
	// Umesto && treba u uslovu da stoji ||.
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikUnder() {
		a.setPrecnik(1);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikOver() {
		a.setPrecnik(26);
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);

		assertEquals(15, a.getPrecnik());
	}

	// Test treba da baci izuzetak, ali to ne radi. Jer je greska u logici koda.
	// Umesto && treba u uslovu da stoji ||.
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaUnder() {
		a.setSirina(1);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaOver() {
		a.setSirina(400);
	}

	@Test
	public void testSetSirina() {
		a.setSirina(250);

		assertEquals(250, a.getSirina());
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);

		assertEquals(50, a.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaUnder() {
		a.setVisina(1);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaOver() {
		a.setVisina(100);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Miselin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(90);

		assertEquals(
				"AutoGuma [markaModel=" + "Miselin" + ", precnik=" + 20 + ", sirina=" + 200 + ", visina=" + 90 + "]",
				a.toString());
	}

	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Miselin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(90);

		AutoGuma a1 = new AutoGuma();

		a1.setMarkaModel("Miselin");
		a1.setPrecnik(20);
		a1.setSirina(200);
		a1.setVisina(90);

		assertTrue(a.equals(a1));
	}

	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Miselin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(90);

		AutoGuma a1 = new AutoGuma();

		a1.setMarkaModel("Pireli");
		a1.setPrecnik(20);
		a1.setSirina(200);
		a1.setVisina(90);

		assertFalse(a.equals(a1));
	}

}

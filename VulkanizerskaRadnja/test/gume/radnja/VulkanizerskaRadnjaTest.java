package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja v;
	AutoGuma a;

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
		a.setMarkaModel("Miselin");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(80);

	}

	@After
	public void tearDown() throws Exception {
		v = null;
		a = null;
	}

	@Test
	public void testDodajGumu() {
		v.dodajGumu(a);

		assertEquals(v.gume.get(v.gume.size() - 1), a);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumu2Times() {
		v.dodajGumu(a);
		v.dodajGumu(a);

	}

	// Vraca null umesto da baci exception
	@Test(expected = java.lang.NullPointerException.class)
	public void testPronadjiGumuNull() {
		v.pronadjiGumu(null);
	}

	@Test
	public void testPronadjiGumuKojaNijeUListi() {
		LinkedList<AutoGuma> nova = v.pronadjiGumu("Tigar");
		assertEquals(0, nova.size());

	}

	// Greska u logici equals metode
	// Poredi cele objekte,a ne po nazivu marke i modela.
	@Test
	// ovo
	public void testPronadjiGumuIsteMarkeDrugihDimenzija() {
		v.dodajGumu(a);
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Miselin");
		b.setPrecnik(20);
		b.setSirina(210);
		b.setVisina(90);
		v.dodajGumu(b);

		assertEquals(v.gume.get(v.gume.size() - 1).getMarkaModel(), a.getMarkaModel());
	}

	@Test

	public void testPronadjiGumu() {
		v.dodajGumu(a);

		assertEquals(v.gume.get(v.gume.size() - 1), a);

	}
}

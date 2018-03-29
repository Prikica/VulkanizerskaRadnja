package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Klasa koja reprezentuje vulkanizersku radnju.
 * 
 * @author Dejan Milovanovic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista AutoGuma pod nazivom gume.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda koja dodaje gumu u listu.
	 * 
	 * @param a
	 *            koji predstavlja instancu klase AutoGuma.
	 * @throws java.lang.NullPointerException.NullPointerException
	 *             <ul>
	 *             <li>Ako je prosledjeni parametar za gumu null.
	 *             </ul>
	 * 
	 * @throws java.lang.RuntimeException
	 *             <ul>
	 *             <li>Ako guma vec postoji u listi.
	 *             </ul>
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Metoda koja na osnovu marke modela izlistava sve modele guma iz asortimana
	 * vulkanizerske radnje.
	 * 
	 * @param markaModel
	 *            predstavlja marku koja se trazi u asortimanu
	 * @return modele u asortimanu kao LinkedList ili null ukoliko je prosledjena
	 *         marka null.
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}

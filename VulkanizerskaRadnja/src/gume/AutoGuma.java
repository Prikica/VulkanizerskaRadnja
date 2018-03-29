package gume;

/**
 * Klasa koja predstavlja gume za automobile.
 * 
 * @author Dejan Milovanovic
 * @version 1.0
 *
 */
public class AutoGuma {
	/**
	 * Marka i model gume.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume.
	 */
	private int precnik = 0;
	/**
	 * Sirina gume.
	 */
	private int sirina = 0;
	/**
	 * Visina gume.
	 */
	private int visina = 0;

	/**
	 * Vraca marku i model gume.
	 * 
	 * @return marku i model gume kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja vrednost za marku i model gume.
	 * 
	 * @param markaModel
	 *            koji predstavlja vrednost za marku i model gume.
	 * @throws RuntimeException
	 *             ako je markaModel ima null vrednost ili ako String ima manje od 3
	 *             karaktera.
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost precnika gume.
	 * 
	 * @return precnik gume kao Integer
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja vrednost za precnik gume.
	 * 
	 * @param precnik
	 *            koji predstavlja vrednost precnika gume .
	 * @throws RuntimeException
	 *             ako je uneti precnik manji od 13 i veci od 22.
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost sirine gume.
	 * 
	 * @return sirinu gume kao Integer.
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja vrednost za sirinu gume.
	 * 
	 * @param sirina
	 *            koji predstavlja sirinu gume.
	 * @throws RuntimeException
	 *             ako je sirina gume manja od 135 ili veca od 355.
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost za visinu gume.
	 * 
	 * @return visinu gume kao Integer.
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja vrednost za visinu gume.
	 * 
	 * @param visina
	 *            koji predstavlja visinu gume.
	 * @throws RuntimeException
	 *             ako je visina gume manja od 25 ili veca od 95.
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Override-ovana metoda toString.
	 * 
	 * @return sve vrednosti atrubuta (markaModel, precnik, sirina i visina) kao
	 *         String.
	 * 
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Override-ovana metoda equals koja poredi dve gume.
	 * 
	 * @return boolean vrednost.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}

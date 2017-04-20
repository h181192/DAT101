package no.hib.dat101.modell;

/**
 * 
 * @author Kristoffer-Andre Kalliainen
 *
 */
public class Kategori {
	private Integer kategori_id;
	private Integer dagspris;

	/**
	 * Tom konstruktÝr
	 * 
	 */
	public Kategori() {
		this(0, 0);
	}

	/**
	 * KonstruktÝr
	 * 
	 * @param kategori_id
	 * @param dagspris
	 */
	public Kategori(Integer kategori_id, Integer dagspris) {
		this.kategori_id = kategori_id;
		this.dagspris = dagspris;
	}

	/**
	 * @return henter kategori_id
	 */
	public Integer getKategori_id() {
		return kategori_id;
	}

	/**
	 * @param kategori_id
	 *            setter kategori_id
	 */
	public void setKategori_id(Integer kategori_id) {
		this.kategori_id = kategori_id;
	}

	/**
	 * @return henter dagspris
	 */
	public Integer getDagspris() {
		return dagspris;
	}

	/**
	 * @param dagspris
	 *            setter dagspris
	 */
	public void setDagspris(Integer dagspris) {
		this.dagspris = dagspris;
	}

}

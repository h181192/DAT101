package no.hib.dat101.modell;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import no.hib.dat101.modell.rute.Rute;

/**
 * Klasse for � fremstille ett spille brett
 * @author Kristoffer-Andre Kalliainen
 *
 */
@Entity
@Table(name = "brett", schema = "kristoffer_stigespill")
public class Brett {
	private final Integer ANTALL_RUTER = 100;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer brett_id;
	@Column(name = "navn")
	private String navn;

	@OneToMany(mappedBy = "brett")
	private List<Rute> ruteTab;

	/**
	 * Konstrukt�r for brett, oppretter en ArrayList med standard 100 plasser
	 */
	public Brett() {
		ruteTab = new ArrayList<>(ANTALL_RUTER);
	}
	
	/**
	 * Finner ut hvor neste rute er n�r en terning har blitt kastet
	 * @param startRute Rute hvor en brikke st�r n�
	 * @param distanse Verdien som en brikke skal flytte seg
	 * @return Ruten brikken skal flyttes til
	 */
	public Rute finnRute(Rute startRute, Integer distanse) {
		// TODO
		return null;
	}

	/**
	 * 
	 * @param rute
	 */
	public void nyPlass(Rute rute) {
		// TODO
	}

	public Integer getBrett_id() {
		return brett_id;
	}

	public void setBrett_id(Integer brett_id) {
		this.brett_id = brett_id;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public List<Rute> getRuteTab() {
		return ruteTab;
	}

	public void setRuteTab(List<Rute> ruteTab) {
		this.ruteTab = ruteTab;
	}
}

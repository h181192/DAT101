package no.hib.dat101.utsyn;

import java.util.List;
import java.util.Scanner;

import no.hib.dat101.modell.Brett;
import no.hib.dat101.modell.Logg;
import no.hib.dat101.modell.Spiller;
import no.hib.dat101.modell.Stigespill;
import no.hib.dat101.modell.brikke.BrikkeFarge;

/**
 * Klasse for � representere tekstgrensesnitt til stigespillet
 * 
 * @author Kristoffer-Andre Kalliainen
 *
 */
public class Tekstgrensesnitt implements StigespillUI {
	private Scanner tast = new Scanner(System.in);

	@Override
	public Integer lesAntallSpillere() {
		System.out.print("\tOppgi antall spillere: ");
		return tast.nextInt();
	}

	@Override
	public String lesInnSpiller() {
		System.out.print("\tOppgi navn p� spiller: ");
		return tast.next();
	}

	@Override
	public BrikkeFarge lesInnBrikkeFarge() {
		System.out.print("\t0 - red\n\t1 - blue\n\t2 - green\n\t3 - yellow\n\tOppgi fargekode: ");
		int farge = tast.nextInt();
		BrikkeFarge brikke = BrikkeFarge.finnBrikkeFarge(farge);
		return brikke;
	}

	@Override
	public String infoOmTrekk(Logg logg) {
		return logg.toString();
	}

	@Override
	public void vinner(Stigespill stigespill) {
		System.out.println("\t" + stigespill.getVinner().getNavn() + " vant denne runden!");
	}

	@Override
	public Integer velgBrett() {
		System.out.print(
				"\n\tOppgi brettet du vil spille p�:\n\t1 - Brett nr 1 er vanlig\n\t2 - Brett nr 2 har stiger og slanger\n\tValg: ");
		return tast.nextInt();
	}

	@Override
	public void antallRuter(Brett brett) {
		System.out.println("\n\tAlle rutene er hentet, det er: " + (brett.getRuteTab().size()));
	}

	@Override
	public void antallSpillere(List<Spiller> spillere) {
		System.out.println("\n\tAntall spillere " + spillere.size());
	}

}

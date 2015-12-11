
public class Abschreibung {
	
	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Abschreibung(String bezeichnung, double initialWert, int nutzungsdauer) {
		this.bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		this.restWert = initialWert;
		this.alter = 0;
	}
	
	public void abschreiben() {
		alter++;
		if(alter <= nutzungsdauer) {
			restWert = Math.floor(initialWert/nutzungsdauer*(nutzungsdauer-alter));
		}
	}
	
	public void simulate(int maxJahre, int minWert) {
		for(int i = 0; i < maxJahre; i++) {
			if (restWert <= 0 || i == maxJahre || restWert <= minWert) {
				return;
			}
			else {
				System.out.println("Restwert: " + restWert + " Jahr: " + alter);
				abschreiben();
				System.out.println("Restwert: " + restWert + " Jahr: " + alter);
			}
		}
	}
	
	public Abschreibung renew(int zusatzWert, int zusatzJahre) {
		Abschreibung Anlage = new Abschreibung(bezeichnung, getRestWert()+zusatzWert, 
				getNutzungsdauer() - getAlter() + zusatzJahre);
		return Anlage;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}

	public double getRestWert() {
		return restWert;
	}

	public int getAlter() {
		return alter;
	}

}

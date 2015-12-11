
public class AbschreibungDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abschreibung tisch = new Abschreibung("tisch", 1000, 4);
		tisch.renew(2000, 5);
		tisch.simulate(3, 200);
		System.out.println("------");
		Abschreibung newTisch = tisch.renew(2000, 5);
		newTisch.simulate(3, 200);
	}

}

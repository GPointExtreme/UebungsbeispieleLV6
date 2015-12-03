
public class CSVDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSVParser p = new CSVParser("spalte1,spalte2,spalte3");
		
		String[] a = p.parse();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}

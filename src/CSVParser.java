
public class CSVParser {
	
	private String csvline;
	
	public CSVParser(String csvline) {
		this.csvline = csvline;
	}
	
	public int countComma() {
		int count = 0;
		for(int i = 0; i < this.csvline.length(); i++) {
			if(this.csvline.charAt(i) == ',') {
				count++;
			}
		}
		return count;
	}
	
	public String[] parse() {
		String[] array = new String[countComma() + 1];
		String temp = "";
		int count = 0;
		for(int i = 0; i < this.csvline.length(); i++) {
			
			if(this.csvline.charAt(i) != ',') {
				temp = temp + this.csvline.charAt(i);
			}
			else {
				array[count] = temp;
				count++;
				temp="";
			}
		}
		array[count] = temp;
		return array;
	}

}

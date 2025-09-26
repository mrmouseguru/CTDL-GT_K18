
public class DemoRomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman = "MCMXCIV";

		int total = convertRomanToInt(roman);
		// => số nguyên ???
		System.out.printf("%s: %d", roman, total);

	}

	private static int convertRomanToInt(String roman) {
		int n = roman.length();
		int total = 0;

		for (int i = 0; i < n; i++) {
			char currChar = roman.charAt(i);
			int currInt = getInt(currChar);
			
			if((i + 1) < n) {
				//còn thằng phía sau
				char nextChar = roman.charAt(i+1);
				int nextInt = getInt(nextChar);
				
				if(currInt < nextInt) {
					total -= currInt;
				}else {
					total += currInt;
				}
			}else {
				//không còn ký tự phía sau
				//total = total + currInt;
				total += currInt;
			}
		}

		return total;
	}

	private static int getInt(char currChar) {
		// code
		switch (currChar) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0; // ký tự không phải La Mã
		}
	}

}


public class DemoLinearSearch {

	public static void main(String[] args) {
		int arraySoNguyen[] = {10, 50, 30, 70, 80, 60, 20, 90, 40};
		boolean result;
		result = linearSeach(arraySoNguyen, 30);
		if(result) {
			
		}else {
			
		}
	}
	
	
	static boolean linearSeach(int a[], int key) {
		for(int i = 0; i < a.length; i++) 
		{
			if(key == a[i]) {
				return true;
			}
			
		}
		return false;
	}

}

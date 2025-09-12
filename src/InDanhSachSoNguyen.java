import java.util.Calendar;

public class InDanhSachSoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				1, 2, 3, 4, 5, 6, 7, 8, 9 ,10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				1, 2, 3, 4, 5, 6, 7, 8, 9 ,10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				1, 2, 3, 4, 5, 6, 7, 8, 9 ,10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		//start
		long start = Calendar.getInstance().getTimeInMillis();
		inDSSoCuaMang(a);
		//end
		long end = Calendar.getInstance().getTimeInMillis();
		//end - start = tg???
		
		System.out.println("Khoảng t/g milli giây:" + (end - start));
	}
	//n=10: 27
	//n=15 31
	//n=20 31
	//n=30 32
	//n=60 56
	//n=120 35
	//TIME COMPLEXITY = BigO = O
	//input size - numbers = 10
	//số lượng operation = 10 = input size
	static void inDSSoCuaMang(int[] numbers) {
		//thuật toán - giải thuật
		for(int i = 0; i < numbers.length; i++) {
			//0 : 1 ope
			//1: 2 ope
			//2: 3 ope
			//3: 4 ope
			System.out.println(i + " : " + numbers[i]);//operation
		}
	}
	
	//
	//TIME COMPLEXITY = BigO = O
	//input size - numbers = 10
	//số lượng operation = 100 operation
	//operation = 100
	static void thuatToan2(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			for(int value : numbers) {
				System.out.println(value);//operation
				
			}
		}
		//i = 0: run 10 operation
		//i = 1: run 10 operation
		//i = 2: run 10 operation
		//....
		//i = 9: run 10 operaiton 
	}
	
	//TIME COMPLEXITY = BigO = O
		//input size - numbers = 10
		//số lượng operation = ???
	//a{4, 1, 2, 11, 4, 5, 6, 7,8, 9}
	//trong trường hợp tệ nhất thuật toán này sẽ tốn số lượng operation
	//là input's size ????
	//số op = 10
		static boolean thuatToanTimSo15(int[] numbers) {
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] == 15) {
					return true;
				}
			}
			return false;
		}

}

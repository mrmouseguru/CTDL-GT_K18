package LinkedList;

public class DemoDSLK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khởi tạo danh sách liên kết đơn
		MyDSLK myDS  = new MyDSLK();
		//head  = null
		//tail  = null
		//size = 0
		
		//tạo nút 12
		Node node12 = new Node(12);
		Node node99 = new Node(99);
		Node node37 = new Node(37);
		
		//nút 12 trỏ đến 99
		node12.next = node99;
		node99.next = node37;
		node37.next = null;
		//nút đầu của DSLK
		myDS.head = node12;
		myDS.tail = node37;
		
		myDS.size = 3;
		//kiểm tra
		//myDS.printDSLK();
		
		myDS.insertFirst(15);
		myDS.printDSLK();
	}

}

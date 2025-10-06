package LinkedList;

public class MyDSLK {
	Node head;
	Node tail;
	int size;

	MyDSLK() {
		head = null;
		tail = null;
		size = 0;
	}

	// in danh sách
	void printDSLK() {
		//sinh viên cài đặt code
		Node current = head;
		//chưa đến tail.next = null
		while(current != null) {
			System.out.print(current.value + "->");
			//di chuyển current sang nút 99
			current = current.next;
		}
		
		
	}

}

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
	// Big-O???
	void printDSLK() {
		// sinh viên cài đặt code
		Node current = head;
		// chưa đến tail.next = null
		while (current != null) {
			System.out.print(current.value + "->");
			// di chuyển current sang nút 99
			current = current.next;
		}

	}

	// thêm một nút vào đầu DSLK
	// Big-O???
	void insertFirst(int value) {
		// sv cài đặt code

	}

	// thêm một nút vào cuối DSLK
	// Big-O???
	void insertLast(int value) {
		// sv cài đặt code

	}

	// xóa một nút ở đầu DS
	// Big-O
	void removeFirst() {

	}

	// xóa một nút ở cuối DS
	// Big-O
	void removeLast() {

	}

	// lấy nội dung của nút đầu
	// Big-O ????
	int getFirst() {
		return 0;
	}

	// lấy nội dung của nút cuối
	// Big-O ????
	int getLast() {
		return 0;
	}
	//lấy  nội dung của một nút bất kỳ trong DS
	//Big-O???
	int get(int value) {
		return 0;
	}

}

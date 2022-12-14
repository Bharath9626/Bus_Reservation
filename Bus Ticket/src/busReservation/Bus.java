package busReservation;

public class Bus {

	private int busNo;
	private boolean ac;
	private int capacity; // get and set method

	Bus(int no, boolean ac, int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}

	public int getBusNo() {
		return busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean val) {
		ac = val;
	}

	public int getcapacity() { // accessor method
		return capacity;
	}

	public void setcapacity(int cap) { // mutated method
		capacity = cap;
	}

	public void displayBusinfo() {
		System.out.println("Bus No: " + busNo + "Ac: " + ac + "Total capacity:" + capacity);

	}

}

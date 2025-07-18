// Làm việc với dữ liệu
package Model;

public class Counter_Model {
	private int value;

	public Counter_Model() {
		value = 0 ;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void Increment() {
		value ++;
	}
	
	public void Decrement() {
		value--;
	}
	
	public void Reset() {
		value =0;
	}
	
}

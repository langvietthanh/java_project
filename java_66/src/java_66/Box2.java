package java_66;

public class Box2 <E>{
	private E value; 
	//"E" chỉ là đại diện cho "tên" của kiểu dữ liệu của biến "value"

	protected Box2(E value) {
		super();
		this.value = value;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	
}

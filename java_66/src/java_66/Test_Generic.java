package java_66;

public class Test_Generic {
	public static void main(String[] args) {
		
		// Test Box1 với thuộc tính Value có kiểu dữ liệu cụ thể là int
		
		Box1 b1 = new Box1(15);
		System.out.println(b1.getValue());
		
//		Box1 b1 = new Box1(10,6); 
//		Box1 b1 = new Box1("muoi"); 
//      => cả hai đều lỗi do thuộc tính trong class Box1 là int
		
		Box2<Integer> b2 = new Box2<Integer>(10);
		System.out.println(b2.getValue());
		
		Box2<Double> c2 = new Box2<Double>(10.5);
		System.out.println(c2.getValue());
		
		Box2<String> d2 = new Box2<String>("Mot");
		System.out.println(d2.getValue());
	}
}

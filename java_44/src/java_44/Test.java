package java_44;

public class Test {
	public static void main(String[] args) {
		ToaDo n1 = new ToaDo(1, 2);
		ToaDo n2 = new ToaDo(3, 4);
		ToaDo n3 = new ToaDo(5, 6);
		Hinh h1 = new Diem(n1);
		Hinh h2 = new Tron(n2,5);
		Hinh h3 = new ChuNhat(n3,2,2);
		System.out.println(h1.cal_S());
		System.out.println(h2.cal_S());
		System.out.println(h3.cal_S());
	}
}

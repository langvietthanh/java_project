package java_45;

public class Test {
	public static void main(String[] args) {
		PhuongTien pt1 = new Bike("Xe Dap", new HangSanXuat("Viet Bac", "VietNam"));
		PhuongTien pt2 = new Car("Xe Oto", new HangSanXuat("Toyota", "Japan"), "Xang");
		Plane pt3 = new Plane("MayBay", new HangSanXuat("VN Airline", "China"),"Dau tho");
		System.out.println(pt1.getType()+" "+ pt1.Ten_Hang()+ " "+ pt1.getSpeed());
		pt1.Start();
		pt1.SpeedUp();
		pt1.Stop();
		System.out.println("=====");
		System.out.println(pt2.getType()+" "+ pt2.Ten_Hang()+ " "+ pt2.getSpeed());
		pt2.Start();
		pt2.SpeedUp();
		pt2.Stop();
		System.out.println("=====");
		System.out.println(pt3.getType()+" "+ pt3.Ten_Hang()+ " "+ pt3.getSpeed());
		pt3.Start();
		pt3.CatCanh();
		pt3.SpeedUp();
		pt3.HaCanh();
		pt3.Stop();
		System.out.println("=====");
	}
}

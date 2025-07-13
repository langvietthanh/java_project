package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DSSV {
	private ArrayList<SinhVien> list;

	
	public DSSV() {
		super();
		list = new ArrayList<SinhVien>();
	}
	public DSSV(ArrayList<SinhVien> list) {
		super();
		this.list = list;
	}
	
	public void addSinhVien(SinhVien a) {
		list.add(a);
	}	
	
	public void inDSSV() {
		for(SinhVien sv: list) {
			System.out.println(sv);
		}
	}
	
	public void Empty() {
		System.out.println(list.isEmpty());
	}
	
	public void number_of_SinhVien() {
		System.out.println(list.size());
	}
	
	public void Clear_DSSV() {
		list.clear();
	}
	
	public void find(SinhVien s) {
		System.out.println("Ton tai SV co ma "+s.getMSV()+": "+list.contains(s));
	}
	
	public void find_ten(String s) {
		for(SinhVien x: list) {
			if (s.compareTo(x.getTen())==0) {
				System.out.println("Ton tai sinh vien co ten: "+s);
				return ;
			}
		}
		System.out.println("Khong ton tai sinh vien co ten: "+s);
	}
	
	public void delete_SinhVien(SinhVien s) {
		if(list.contains(s)==true)list.remove(s);
		else System.out.println("Khong ton tai SV co MSV "+s.getMSV()+": "+s.getMSV());
	}
	
	public void print() {
		Collections.sort(list , new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if(o1.getDTB() < o2.getDTB())return 1;
				if(o1.getDTB() > o2.getDTB())return -1;
				else return 0;
			}
		});
		for(SinhVien sv: list) {
			System.out.println(sv);
		}
	}
}

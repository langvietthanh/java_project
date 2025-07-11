package java_52;

public class Test {
	public static void main(String[] args) {
		String s1,s2,s3,s4,s5,s6,s7;
		s1 = "con cho";
		s2 = "meo";
		s3 = s1.replaceAll("cho", s2);
		System.out.println(s3);
		s4 = s1.toUpperCase();
		System.out.println(s4);
		s5 = s4.toLowerCase();
		System.out.println(s5);
		s6 = "    con cho     ";
		System.out.println(s6.trim());
		char arr[];
		arr = s1.toCharArray();
		for(char c : arr)System.out.print(c+ " ");
		System.out.println();
		s7 = s1.substring(4, s1.length());
		System.out.println(s7);
	}
}

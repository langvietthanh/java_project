package java_65;

import java.util.Arrays;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tu_Dien {
	private Map<String, String> ds = new TreeMap<String, String>();
	
	public void ADD(String k,String v) {
		ds.put(k, v);
	}
	
	public void DEL(String k) {
		ds.remove(k);
	}
	
	public String SEARCH(String k) {
		return ds.get(k);
	}
	
	public void PRINT_KEY() {
		Set<String> st = ds.keySet();
		System.out.println(Arrays.toString(st.toArray()));
		System.out.println(ds.toString());
	}
	
	public int PRINT_SIZE() {
		return ds.size();
	}
	
	public void DEL_ALL() {
		ds.clear();
	}
}

package map.cn;
/*
 * treemap 输出的结果都是有序的
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
		Set<Integer> set = map.keySet();
		  Iterator<Integer> iter = set.iterator();
		 while (iter.hasNext()) {
			Integer type = (Integer) iter.next();
			System.out.println(type+"--"+map.get(type));
			
		}
	}
	
}

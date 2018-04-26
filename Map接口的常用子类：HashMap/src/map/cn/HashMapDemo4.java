package map.cn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * 输出全部的value
 * 用到的方法：
 * Collection<V> values() 
          返回此映射中包含的值的 Collection 视图。 
 */
public class HashMapDemo4 {
  public static void main(String[] args) {
	  Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
		 Collection<String> con = map.values();
		 //输出
		  Iterator<String> iter = con.iterator();
		  while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
}

}

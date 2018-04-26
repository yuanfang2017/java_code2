package map.cn;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap 的实例操作 2
 *   判断指定的key 或者value 是否存在
 *   
 *   方法（map接口中提供的）：
 *    boolean containsKey(Object key) 
          如果此映射包含指定键的映射关系，则返回 true。 
     boolean containsValue(Object value) 
          如果此映射将一个或多个键映射到指定值，则返回 true。 
 *   
 *   
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
       System.out.println( map.containsKey(3));
       System.out.println( map.containsKey(9));
       System.out.println( map.containsValue("nn"));
       System.out.println(map.containsValue("bb"));
     
	}
	

}

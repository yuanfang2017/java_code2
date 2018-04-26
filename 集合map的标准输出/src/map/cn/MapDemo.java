package map.cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 标准的输出：使用iterator 输出map 实例
 * 
 * 用到的方法：
 * Set<Map.Entry<K,V>> entrySet() 
          返回此映射所包含的映射关系的 Set 视图。 
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
		//将map接口的实例通过entrySet() 方法变成set接口对象
		 Set<Map.Entry<Integer, String>> set = map.entrySet();
		 //通过 set接口 实例为iterator实例化
		 Iterator<Map.Entry<Integer, String>> iter = set.iterator();
		 //通过iterator 迭代输出，每个对象都是 Map.Entry<Integer, String> 的实例
		 while (iter.hasNext()) {
			 //得到Map.Entry<Integer, String>的实例化对象  entry
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iter
					.next();
			//通过Map.Entry<Integer, String> 进行 key，value 的分离
			System.out.println(entry.getKey()+entry.getValue());
		}
		 
	}

}

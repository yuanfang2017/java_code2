package map.cn;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap 是一个map接口的子类    类 HashMap<K,V> 可以直接为map接口实例化
 * 主要的方法：
 * void clear() 
          从此映射中移除所有映射关系。 
 Object clone() 
          返回此 HashMap 实例的浅表副本：并不复制键和值本身。 
 boolean containsKey(Object key) 
          如果此映射包含对于指定键的映射关系，则返回 true。 
 boolean containsValue(Object value) 
          如果此映射将一个或多个键映射到指定值，则返回 true。 
 Set<Map.Entry<K,V>> entrySet() 
          返回此映射所包含的映射关系的 Set 视图。 
 V get(Object key) 
          返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。 
 boolean isEmpty() 
          如果此映射不包含键-值映射关系，则返回 true。 
 Set<K> keySet() 
          返回此映射中所包含的键的 Set 视图。 
 V put(K key, V value) 
          在此映射中关联指定值与指定键。 
 void putAll(Map<? extends K,? extends V> m) 
          将指定映射的所有映射关系复制到此映射中，这些映射关系将替换此映射目前针对指定映射中所有键的所有映射关系。 
 V remove(Object key) 
          从此映射中移除指定键的映射关系（如果存在）。 
 int size() 
          返回此映射中的键-值映射关系数。 
 Collection<V> values() 
          返回此映射所包含的值的 Collection 视图。 

 */
public class HashMapDemo {
	public static void main(String[] args) {
		/*
		 * demo 1：向集合中 增加取出内容
		 */
		//泛型的类型参数只能是类类型（包括自定义类），不能是简单类型。 
		Map<Integer, String> map = new HashMap<Integer, String>();
		//添加内容  是用put ，不是add
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
		//取出内容 是用 get，传参是传的key,得到的是value 的值
		String str = map.get(2);
		System.out.println(str);
			
	}

}

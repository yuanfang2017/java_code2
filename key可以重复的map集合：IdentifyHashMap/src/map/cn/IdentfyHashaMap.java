package map.cn;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * key 可以重复的 map 集合
 */
public class IdentfyHashaMap {
	public static void main(String[] args) {
		Map<Person, String> map = new IdentityHashMap<Person, String>();
		//添加 元素
		map.put(new Person("zhangsan",20), "number1");
		map.put(new Person("zhangsan",20), "number2");
		map.put(new Person("lisi",30), "number3");
		map.put(new Person("wangwu",20), "number4");
		Set<Entry<Person, String>> set = map.entrySet();
		Iterator<Entry<Person, String>> iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry<map.cn.Person, java.lang.String> entry = (Map.Entry<map.cn.Person, java.lang.String>) iter.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
	}

}

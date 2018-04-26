package map.cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 输出全部的 key
 *  用到的方法：
 *   Set<K> keySet() 
          返回此映射中所包含的键的 Set 视图。 
 */
public class HashMapDemo3 {
  public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
        //keySet() 把map集合当中的全部 key变成一个set 集合
         Set<Integer> set = map.keySet();
         //输出
        Iterator<Integer> itr =  set.iterator();
        while (itr.hasNext()) {
			Integer inte = (Integer) itr.next();
			System.out.println(inte);
		}
         
}
}

package map.cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ���ȫ���� key
 *  �õ��ķ�����
 *   Set<K> keySet() 
          ���ش�ӳ�����������ļ��� Set ��ͼ�� 
 */
public class HashMapDemo3 {
  public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
        //keySet() ��map���ϵ��е�ȫ�� key���һ��set ����
         Set<Integer> set = map.keySet();
         //���
        Iterator<Integer> itr =  set.iterator();
        while (itr.hasNext()) {
			Integer inte = (Integer) itr.next();
			System.out.println(inte);
		}
         
}
}

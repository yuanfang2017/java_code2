package map.cn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * ���ȫ����value
 * �õ��ķ�����
 * Collection<V> values() 
          ���ش�ӳ���а�����ֵ�� Collection ��ͼ�� 
 */
public class HashMapDemo4 {
  public static void main(String[] args) {
	  Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
		 Collection<String> con = map.values();
		 //���
		  Iterator<String> iter = con.iterator();
		  while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
}

}

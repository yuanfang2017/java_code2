package map.cn;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap ��ʵ������ 2
 *   �ж�ָ����key ����value �Ƿ����
 *   
 *   ������map�ӿ����ṩ�ģ���
 *    boolean containsKey(Object key) 
          �����ӳ�����ָ������ӳ���ϵ���򷵻� true�� 
     boolean containsValue(Object value) 
          �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true�� 
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

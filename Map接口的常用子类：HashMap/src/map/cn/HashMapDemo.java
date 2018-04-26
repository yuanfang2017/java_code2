package map.cn;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap ��һ��map�ӿڵ�����    �� HashMap<K,V> ����ֱ��Ϊmap�ӿ�ʵ����
 * ��Ҫ�ķ�����
 * void clear() 
          �Ӵ�ӳ�����Ƴ�����ӳ���ϵ�� 
 Object clone() 
          ���ش� HashMap ʵ����ǳ�������������Ƽ���ֵ���� 
 boolean containsKey(Object key) 
          �����ӳ���������ָ������ӳ���ϵ���򷵻� true�� 
 boolean containsValue(Object value) 
          �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true�� 
 Set<Map.Entry<K,V>> entrySet() 
          ���ش�ӳ����������ӳ���ϵ�� Set ��ͼ�� 
 V get(Object key) 
          ����ָ������ӳ���ֵ��������ڸü���˵����ӳ�䲻�����κ�ӳ���ϵ���򷵻� null�� 
 boolean isEmpty() 
          �����ӳ�䲻������-ֵӳ���ϵ���򷵻� true�� 
 Set<K> keySet() 
          ���ش�ӳ�����������ļ��� Set ��ͼ�� 
 V put(K key, V value) 
          �ڴ�ӳ���й���ָ��ֵ��ָ������ 
 void putAll(Map<? extends K,? extends V> m) 
          ��ָ��ӳ�������ӳ���ϵ���Ƶ���ӳ���У���Щӳ���ϵ���滻��ӳ��Ŀǰ���ָ��ӳ�������м�������ӳ���ϵ�� 
 V remove(Object key) 
          �Ӵ�ӳ�����Ƴ�ָ������ӳ���ϵ��������ڣ��� 
 int size() 
          ���ش�ӳ���еļ�-ֵӳ���ϵ���� 
 Collection<V> values() 
          ���ش�ӳ����������ֵ�� Collection ��ͼ�� 

 */
public class HashMapDemo {
	public static void main(String[] args) {
		/*
		 * demo 1���򼯺��� ����ȡ������
		 */
		//���͵����Ͳ���ֻ���������ͣ������Զ����ࣩ�������Ǽ����͡� 
		Map<Integer, String> map = new HashMap<Integer, String>();
		//�������  ����put ������add
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
		//ȡ������ ���� get�������Ǵ���key,�õ�����value ��ֵ
		String str = map.get(2);
		System.out.println(str);
			
	}

}

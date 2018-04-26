package map.cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ��׼�������ʹ��iterator ���map ʵ��
 * 
 * �õ��ķ�����
 * Set<Map.Entry<K,V>> entrySet() 
          ���ش�ӳ����������ӳ���ϵ�� Set ��ͼ�� 
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(4, "dd");
		//��map�ӿڵ�ʵ��ͨ��entrySet() �������set�ӿڶ���
		 Set<Map.Entry<Integer, String>> set = map.entrySet();
		 //ͨ�� set�ӿ� ʵ��Ϊiteratorʵ����
		 Iterator<Map.Entry<Integer, String>> iter = set.iterator();
		 //ͨ��iterator ���������ÿ�������� Map.Entry<Integer, String> ��ʵ��
		 while (iter.hasNext()) {
			 //�õ�Map.Entry<Integer, String>��ʵ��������  entry
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iter
					.next();
			//ͨ��Map.Entry<Integer, String> ���� key��value �ķ���
			System.out.println(entry.getKey()+entry.getValue());
		}
		 
	}

}

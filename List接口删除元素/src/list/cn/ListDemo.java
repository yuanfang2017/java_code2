package list.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * list ɾ��Ԫ��
 * Collection �ķ�����
 *1�� boolean remove(Object o) 
          �Ӵ� collection ���Ƴ�ָ��Ԫ�صĵ���ʵ����������ڵĻ�����ѡ�������� 
  2��boolean removeAll(Collection<?> c) 
          �Ƴ��� collection ����ЩҲ������ָ�� collection �е�����Ԫ�أ���ѡ�������� 
          
 list����ķ�����
   E remove(int index) 
      �Ƴ��б���ָ��λ�õ�Ԫ�أ���ѡ��������
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//���Ԫ��
		list.add("heiio");
		list.add("kittly");
		list.add("hope");
		list.add("love");
		//ɾ��Ԫ��
		list.remove(0);
		list.remove(2);
		//list.remove(9);
		list.remove("hahha");
		list.remove("love");
		//�������
		System.out.println(list);
	}

}

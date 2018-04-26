package iterator.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ɾ��һ��Ԫ��
 *   void remove() 
          �ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ�������� 
 */
public class IteratorDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		//����һ��������
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			if ("cc".equals(str)) {
				itr.remove();
			}
			//else{
				// System.out.println(str);
			//}
		 
			
		}
		System.out.println(list);
	}

}

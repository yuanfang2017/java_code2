package list.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * Collection �ӿڶ����� size��������ȡ�����ݵĳ���
 * ���ĳ��λ�õ����� get(int index)
 */
public class ListDemo {
 public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("heiio");
	list.add("kittly");
	list.add("hope");
	list.add("love");
	//����������������
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	//�����������
	//for (int i = list.size()-1; i >= 0; i--) {
	//	System.out.println(list.get(i));
	//}
}
}

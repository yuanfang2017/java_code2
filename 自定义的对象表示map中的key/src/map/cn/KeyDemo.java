package map.cn;

import java.util.HashMap;
import java.util.Map;

/*
 * �Զ��������Ϊ���ϵ��е�
 */
public class KeyDemo {public static void main(String[] args) {
	Map<Person, String> map = new HashMap<Person, String>();
	//new һ�� person ����
	Person per = new Person("����",20);
	//�򼯺������Ԫ��
	  map.put(per, "����");
	  System.out.println(map.get(per)); 	
}

}

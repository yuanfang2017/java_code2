package list.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * Collection 接口定义了 size（）可以取得数据的长度
 * 获得某个位置的数据 get(int index)
 */
public class ListDemo {
 public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("heiio");
	list.add("kittly");
	list.add("hope");
	list.add("love");
	//输出。按照正序输出
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	//按照逆向输出
	//for (int i = list.size()-1; i >= 0; i--) {
	//	System.out.println(list.get(i));
	//}
}
}

package leiji.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * school ������� �� ѧУ���ƣ�ȫ��ѧ������
 */
public class School {
	private String name;   //ѧУ����
	private  List<Person> list;
	public School() {
		//�޲ι���  ʵ����list ����
		this.list = new ArrayList<Person>();
		// TODO Auto-generated constructor stub
	}
	
	public School(String name) {
	    this();
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getList() {
		return list;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", list=" + list + "]";
	}
	
}

package leiji.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * school 类的属性 ： 学校名称，全部学生集合
 */
public class School {
	private String name;   //学校名称
	private  List<Person> list;
	public School() {
		//无参构造  实例化list 集合
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

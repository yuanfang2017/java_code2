package leiji.cn;
/*
 * 背景： 一个学校 有多个学生，一个学生只属于一个学校
 * 一对多的关系
 * person 类的属性： 姓名，年龄，所属学校
 */
public class Person {
	private String name;
	private int age;
	private School school;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
	

}

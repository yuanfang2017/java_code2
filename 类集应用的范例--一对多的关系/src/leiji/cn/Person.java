package leiji.cn;
/*
 * ������ һ��ѧУ �ж��ѧ����һ��ѧ��ֻ����һ��ѧУ
 * һ�Զ�Ĺ�ϵ
 * person ������ԣ� ���������䣬����ѧУ
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

package leiji.cn;

public class Demo {
	public static void main(String[] args) {
		//ʵ����ѧУ����
		School sch = new School("������ѧ");
		//ʵ����person ����
		Person p1 = new Person("zhangsan",20);
		
		Person p2 = new Person("lisi",30);
		Person p3 = new Person("wangwu",40);
		sch.getList().add(p1);
		sch.getList().add(p2);
		sch.getList().add(p3);
		
		p1.setSchool(sch);
		p2.setSchool(sch);
		p3.setSchool(sch);
		System.out.println("jajj");
		System.out.println(sch);
	}

}

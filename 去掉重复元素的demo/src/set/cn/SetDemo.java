package set.cn;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * HashCode :һ������ı���
 * 
 * ȥ���ض�Ԫ�صķ�������дobject�е�HashCode������equals ������toString ����
 * 
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("����",20));
		set.add(new Person("����",20));
		set.add(new Person("����",20));
		set.add(new Person("����",40));
		set.add(new Person("����",34));
		System.out.println(set);
	}

}

package set.cn;

import java.util.HashSet;
import java.util.Set;

/*
 * �Ƚ�һ��set �ӿ�
 * set�ӿ���collection�ӿڵ��ӽӿڣ���list�ӿڲ�ͬ���ǣ�set�ӿڲ��ܼ����ظ���Ԫ��
 * set�ӿ���list�ӿڵĶ�����û��̫�����𣬵���set�ӿڵ���Ҫ������collection ��һ�µ�
 * Ҳ����˵set�ӿڲ�û�ж�collection �ӿڽ������䣬ֻ�Ǳ�collection �ӿڸ����ϸ��ˣ����������ظ�Ԫ��
 */
public class HashSetDemo {
public static void main(String[] args) {
	/*
	 * hashset ��set �ӿڵ�һ�����࣬���治�ܷ��ظ���Ԫ�أ����Ҳ���ɢ�еĴ洢��ʽ������û��˳��
	 */
	Set<String> set = new HashSet<String>();
	//���Ԫ��
	set.add("aa");
	set.add("bb");
	set.add("bb");
	set.add("dd");
	set.add("ee");
	set.add("gg");
	set.add("hh");
	System.out.println(set);
}
}

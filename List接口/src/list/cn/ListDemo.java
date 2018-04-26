package list.cn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * java.util �ӿ� List<E>
 * ���壺public interface List<E>extends Collection<E>
 * list �ӿ���Collection ��ͬ���ǣ� ��LIst�Ľӿ��д�����������Collection�ӿڣ�ӵ�б�
 * Collection�ӿ��и���ķ������壬������Щ�������Ƚϳ���
 * 
 * boolean add(E e) 
          ���б��β�����ָ����Ԫ�أ���ѡ�������� 
 void add(int index, E element) 
          ���б��ָ��λ�ò���ָ��Ԫ�أ���ѡ�������� 
 boolean addAll(Collection<? extends E> c) 
          ���ָ�� collection �е�����Ԫ�ص����б�Ľ�β��˳����ָ�� collection �ĵ�����������ЩԪ�ص�˳�򣨿�ѡ�������� 
 boolean addAll(int index, Collection<? extends E> c) 
          ��ָ�� collection �е�����Ԫ�ض����뵽�б��е�ָ��λ�ã���ѡ�������� 

 */
public class ListDemo {
    public static void main(String[] args) {
		//����list ��������list�ǽӿڣ�������Ҫ���������ʵ���� ArrayList
    	List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        //���� Collection��������Collection�ǽӿڣ�������Ҫ���������ʵ���� Ҳ�ǣ�ArrayList
        Collection<String> collection = new ArrayList<String>();
        collection.add("wang");
        collection.add("yuanfang");
        //���Դ�һ��Collection ���󣬾��ǽ�Collection�е�����Ԫ����ӽ���
        list.addAll(collection);
        //�������
        System.out.println(list);
        System.out.println(collection);
        
	}
  
}

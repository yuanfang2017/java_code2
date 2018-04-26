package meiju.cn;

import java.util.EnumMap;
import java.util.Map;

/*
 * EnumMap �Ǽ���map ������ �������е�key ��ö������
 */
public class EnumMapDemo {
	public static void main(String[] args) {
		//new һ��EnumMap ����
		Map<Color, String> map = new EnumMap<Color, String>(Color.class);
		//��Ӽ���
		map.put(Color.RED, "��ɫ");
		map.put(Color.GREEN, "��ɫ");
		map.put(Color.BLUE, "��ɫ");
		for (Color c :Color.values()) {
			System.out.println(c.name() + map.get(c));
		}
	}

}

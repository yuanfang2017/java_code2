package meiju.cn;

import java.util.EnumMap;
import java.util.Map;

/*
 * EnumMap 是集合map 的子类 ，该类中的key 是枚举类型
 */
public class EnumMapDemo {
	public static void main(String[] args) {
		//new 一个EnumMap 对象
		Map<Color, String> map = new EnumMap<Color, String>(Color.class);
		//添加集合
		map.put(Color.RED, "红色");
		map.put(Color.GREEN, "蓝色");
		map.put(Color.BLUE, "绿色");
		for (Color c :Color.values()) {
			System.out.println(c.name() + map.get(c));
		}
	}

}

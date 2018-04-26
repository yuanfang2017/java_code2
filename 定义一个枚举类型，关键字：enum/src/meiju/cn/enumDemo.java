package meiju.cn;
/*
 * enum  是  关键字
 * 格式：[ public] enum  枚举类型名称{
 *   枚举对象1，枚举对象2，枚举对象 3  ....
 * }
 */
public class enumDemo {
	public static void main(String[] args) {
		Color c = Color.RED;
				System.out.println(c);
				
				//枚举.values() 得到全部的枚举类型，返回的是对象数组
				Color[] color = Color.values();
				for (int i = 0; i < color.length; i++) {
					System.out.println(color[i]);
				}
				//使用foreach 输出
				for (Color co:Color.values()) {
					System.out.println(co);
				}
				
		
	}
	

}

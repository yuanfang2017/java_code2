package swing.cn;

import java.awt.Color;

import javax.swing.JFrame;

/*
 * 新建一个窗口
 * 基本容器：JFrame 类，此类是component的子类
 */
public class Test {
	public static void main(String[] args) {
       JFrame jf = new JFrame("第一个swing窗体");
       //设置窗体大小
        jf.setSize(500, 200);
        //设置窗体的背景颜色
        jf.setBackground(Color.black);
        //设置组件的位置
        jf.setLocation(300, 200);
        //显示或者影藏组件
        jf.setVisible(true);
	}

}

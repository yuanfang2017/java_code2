package swing.cn;
/*
 * 在JLabel 中设置图片
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.MissingFormatArgumentException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test3 {
	public static void main(String[] args) throws Exception {
		File file = new File("D:"+File.separator+"test.gif");
		InputStream ip = new FileInputStream(file);
		//根据图片大小开辟空间
		byte [] b = new byte[(int)file.length()];
		ip.read(b);
		ip.close();
		 //实例化icon
		 Icon con = new ImageIcon(b);
		 JFrame jf = new JFrame("第一个swing窗体");	
		 JLabel jl = new JLabel("hello!!",con, JLabel.CENTER);    
		 jf.add(jl);
		 Dimension di = new Dimension();
		 di.setSize(500, 300);
		 jf.setSize(di); 
		 jf.setBackground(Color.black);	      
		 Point p = new Point(300, 200);
		 jf.setLocation(p);
		 jf.setVisible(true);
		
	}
	

}

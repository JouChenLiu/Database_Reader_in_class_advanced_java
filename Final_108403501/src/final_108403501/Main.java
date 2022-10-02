//劉柔辰 108403501 資管三A
package final_108403501;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
        ReaderFrame r = new ReaderFrame();
        r.setTitle("資料庫讀取器");
        r.setSize(600, 400);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;		//屏幕寬度
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;	//獲得屏幕高度
		r.setLocation((width - 600) / 2, (height - 400) / 2);
		r.setVisible(true);
		r.setResizable(true);
	}
}
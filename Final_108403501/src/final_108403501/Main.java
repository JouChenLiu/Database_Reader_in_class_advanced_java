//�B�X�� 108403501 ��ޤTA
package final_108403501;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
        ReaderFrame r = new ReaderFrame();
        r.setTitle("��ƮwŪ����");
        r.setSize(600, 400);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;		//�̹��e��
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;	//��o�̹�����
		r.setLocation((width - 600) / 2, (height - 400) / 2);
		r.setVisible(true);
		r.setResizable(true);
	}
}
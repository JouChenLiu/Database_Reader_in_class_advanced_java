//�B�X�� 108403501 ��ޤTA
package final_108403501;

import java.awt.*;	//�ϥ�BorderLayout�������Jawt�M��
import java.awt.event.*;	//�ϥΨƥ󥲶����Jevent�M��
import javax.swing.*;	//���Jswing�M��
import java.io.*;

public class ReaderFrame extends JFrame implements ActionListener{
	private DB db;
		
	private final JPanel toolPanel;		//�u���
	private final JPanel PanelButton;	//���s��
	private final JButton buttonSave;	//�s�ɫ��s
	
	private final JTextArea textArea;	//�s���
	private final JFileChooser fileChooser;	//����ܾ�
	
	public ReaderFrame() {
		db = new DB();
		
		//��ҤƤu���
		toolPanel = new JPanel();
		toolPanel.setLayout(new BorderLayout());
		
		//���s��
		PanelButton = new JPanel();
		PanelButton.setLayout(new FlowLayout());
		
		//��Ҥƫ��s
		buttonSave = new JButton("�s��");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");
		
		//�[�J���s��
		PanelButton.add(buttonSave);
		
		//�[�J�u���
		toolPanel.add(PanelButton, BorderLayout.WEST);
		
		//��Ҥƽs�赡�f
		textArea = new JTextArea();
		
		//��ҤƤ���ܾ�
		fileChooser = new JFileChooser();
		
		//���f�e�����K�[�ե�]�ϥ���ɥ����^
		Container container = getContentPane(); //�o��e��
		container.add(toolPanel, BorderLayout.NORTH); //�W�[�u����
		container.add(textArea, BorderLayout.CENTER);	//�W�[�s���
		
		textArea.setText(db.getRS());	//�}�Үɸ��J��Ʈw�������~��ƪ�
		textArea.append("108403501 �B�X��");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("save")) {
			File f = new File("C:\\Users\\Anna Liu\\OneDrive - ��ߤ����j��\\�ୱ\\�{��\\Java\\��ù�� �i��Java\\Final_108403501.txt");
			try {
				FileOutputStream out = new FileOutputStream(f);	//�o�����X�y
				out.write(textArea.getText().getBytes());	//�g�X���
			} catch(Exception ex) {
				ex.printStackTrace();	//��X�X���T��
			}
		}
		
		
	}
}

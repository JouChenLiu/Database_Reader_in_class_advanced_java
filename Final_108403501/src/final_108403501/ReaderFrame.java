//劉柔辰 108403501 資管三A
package final_108403501;

import java.awt.*;	//使用BorderLayout必須載入awt套件
import java.awt.event.*;	//使用事件必須載入event套件
import javax.swing.*;	//載入swing套件
import java.io.*;

public class ReaderFrame extends JFrame implements ActionListener{
	private DB db;
		
	private final JPanel toolPanel;		//工具區
	private final JPanel PanelButton;	//按鈕區
	private final JButton buttonSave;	//存檔按鈕
	
	private final JTextArea textArea;	//編輯區
	private final JFileChooser fileChooser;	//文件選擇器
	
	public ReaderFrame() {
		db = new DB();
		
		//實例化工具條
		toolPanel = new JPanel();
		toolPanel.setLayout(new BorderLayout());
		
		//按鈕區
		PanelButton = new JPanel();
		PanelButton.setLayout(new FlowLayout());
		
		//實例化按鈕
		buttonSave = new JButton("存檔");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");
		
		//加入按鈕區
		PanelButton.add(buttonSave);
		
		//加入工具區
		toolPanel.add(PanelButton, BorderLayout.WEST);
		
		//實例化編輯窗口
		textArea = new JTextArea();
		
		//實例化文件選擇器
		fileChooser = new JFileChooser();
		
		//窗口容器中添加組件（使用邊界布局）
		Container container = getContentPane(); //得到容器
		container.add(toolPanel, BorderLayout.NORTH); //增加工具欄
		container.add(textArea, BorderLayout.CENTER);	//增加編輯區
		
		textArea.setText(db.getRS());	//開啟時載入資料庫中的產品資料表
		textArea.append("108403501 劉柔辰");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("save")) {
			File f = new File("C:\\Users\\Anna Liu\\OneDrive - 國立中央大學\\桌面\\程式\\Java\\葉羅堯 進階Java\\Final_108403501.txt");
			try {
				FileOutputStream out = new FileOutputStream(f);	//得到文件輸出流
				out.write(textArea.getText().getBytes());	//寫出文件
			} catch(Exception ex) {
				ex.printStackTrace();	//輸出出錯訊息
			}
		}
		
		
	}
}

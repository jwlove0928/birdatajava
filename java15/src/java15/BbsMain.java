package java15;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java15.BbsDTO;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
	private JTextField idText;
	private JTextField titleText;
	private JTextField contentText;
	private JTextField etcText;
	public BbsMain() {
		JFrame f = new JFrame("³ªÀÇ °Ô½ÃÆÇ ¸¸µé±â");
		f.getContentPane().setBackground(Color.YELLOW);
		
		f.setSize(400,900);
		FlowLayout flow = new FlowLayout();
		
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("<\uC544\uC774\uB514>");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 35));
		f.getContentPane().add(lblNewLabel);
		
		idText = new JTextField();
		idText.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(idText);
		idText.setColumns(10);
		
		JLabel label = new JLabel("<\uC81C\uBAA9>");
		label.setForeground(Color.RED);
		label.setFont(new Font("±¼¸²", Font.BOLD, 35));
		f.getContentPane().add(label);
		
		titleText = new JTextField();
		titleText.setFont(new Font("±¼¸²", Font.BOLD, 30));
		titleText.setColumns(10);
		f.getContentPane().add(titleText);
		
		JLabel label_1 = new JLabel("<\uB0B4\uC6A9>");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 35));
		f.getContentPane().add(label_1);
		
		contentText = new JTextField();
		contentText.setFont(new Font("±¼¸²", Font.BOLD, 30));
		contentText.setColumns(10);
		f.getContentPane().add(contentText);
		
		JLabel label_2 = new JLabel("<\uAE30\uD0C0>");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("±¼¸²", Font.BOLD, 35));
		f.getContentPane().add(label_2);
		
		etcText = new JTextField();
		etcText.setFont(new Font("±¼¸²", Font.BOLD, 30));
		etcText.setColumns(10);
		f.getContentPane().add(etcText);
		
		JButton btnNewButton = new JButton("BBS \uAC80\uC0C9\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputId = idText.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = dao.select(inputId);
				String id = dto.getId();
				String title = dto.getTitle();
				String conetent = dto.getContent();
				String etc = dto.getEtc();
				idText.setText(id);
				titleText.setText(title);
				contentText.setText(conetent);
				etcText.setText(etc);
			}
		});
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnNewButton.setForeground(Color.MAGENTA);
		f.getContentPane().add(btnNewButton);
		
		JButton btnBbs = new JButton("BBS \uC785\uB825\uD558\uAE30");
		btnBbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = idText.getText();
				String title = titleText.getText();
				String content = contentText.getText();
				String etc = etcText.getText();
				BbsDAO dao = new BbsDAO();
				try {
					dao.insert(id,title,content,etc);
					JOptionPane.showMessageDialog(null, "»ðÀÔµÇ¾ú½À´Ï´Ù.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnBbs.setForeground(Color.MAGENTA);
		btnBbs.setFont(new Font("±¼¸²", Font.BOLD, 35));
		f.getContentPane().add(btnBbs);
		
		JButton btnBbs_1 = new JButton("BBS \uC218\uC815\uD558\uAE30");
		btnBbs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idText.getText();
				String title = titleText.getText();
				String content = contentText.getText();
				String etc = etcText.getText();
				BbsDAO dao = new BbsDAO();
				try {
					dao.update(id, title, content, etc);
					JOptionPane.showMessageDialog(null, "°»½ÅµÇ¾ú½À´Ï´Ù");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBbs_1.setForeground(Color.MAGENTA);
		btnBbs_1.setFont(new Font("±¼¸²", Font.BOLD, 35));
		f.getContentPane().add(btnBbs_1);
		
		JButton btnBbs_2 = new JButton("BBS \uC0AD\uC81C\uD558\uAE30");
		btnBbs_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idText.getText();
				BbsDAO dao = new BbsDAO();
				try {
					dao.delete(id);
					JOptionPane.showMessageDialog(null, "»èÁ¦µÇ¾ú½À´Ï´Ù");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBbs_2.setForeground(Color.MAGENTA);
		btnBbs_2.setFont(new Font("±¼¸²", Font.BOLD, 35));
		f.getContentPane().add(btnBbs_2);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		BbsMain bbs = new BbsMain();
	}
}

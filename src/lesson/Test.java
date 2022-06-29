package lesson;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Test extends JFrame {
	
	Test() {

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel lblEng = new JLabel("영어");
		JLabel lblKor = new JLabel("한글");
		
		JTextField txtEng = new JTextField(8);
		JTextField txtKor = new JTextField(8);
		
		JButton btnInsert = new JButton("신규입력");
		
		JButton btnSearch = new JButton("찾기");
		
		DefaultTableModel model = new DefaultTableModel(new String[] {"English", "한글"}, 0);
		JTable tblWord = new JTable(model);
		tblWord.setEnabled(false);
		tblWord.setAutoCreateRowSorter(true);

		JScrollPane scrolledTable = new JScrollPane(tblWord);
		scrolledTable.setPreferredSize(new Dimension(250, 180));
		
		c.add(lblEng);
		c.add(txtEng);
		c.add(lblKor);
		c.add(txtKor);
		c.add(btnInsert);
		c.add(btnSearch);
		c.add(scrolledTable);

		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tblWord.clearSelection();
				
				String strEng = txtEng.getText().trim();
				String strKor = txtKor.getText().trim();

				if (strEng.equals("")) {
					JOptionPane.showMessageDialog(getParent(), "영단어를 입력하세요.");
					txtEng.setText("");
					txtEng.requestFocus();
					return;
				}

				if (strKor.equals("")) {
					JOptionPane.showMessageDialog(getParent(), "한글을 입력하세요.");
					txtKor.setText("");
					txtKor.requestFocus();
					return;
				}
				
				
				if (strEng.equals("test") && strKor.equals("1234")) {
					
					JOptionPane.showMessageDialog(getParent(), "로그인되었습니ㅏㄷ.");
					// 로그인 된 창응로 넘어가라....
				}
				
				else {
					JOptionPane.showMessageDialog(getParent(), "아이디랑 비밀번호가 틀립니다.");
				}
				
				
				
				for(int i = 0; i < tblWord.getRowCount(); i++) {
					if (strEng.equals(tblWord.getValueAt(i, 0))) {
						JOptionPane.showMessageDialog(getParent(), "이미 있는 영단어입니다.");
						return;
					}
				}
				
				String[] strNewWord = {strEng, strKor};
				
				model.addRow(strNewWord);
				txtEng.setText("");
				txtKor.setText("");
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strEng = txtEng.getText().trim();
				
				if (strEng.equals("")) {
					JOptionPane.showMessageDialog(getParent(), "찾을 영단어를 입력하세요.");
					txtEng.setText("");
					txtEng.requestFocus();
					return;
				}
				
				
				
				
				boolean bFind = false;
				for(int i = 0; i < tblWord.getRowCount(); i++) {
					if (strEng.equals(tblWord.getValueAt(i, 0))) {
						tblWord.changeSelection(i, 0, false, false);
						bFind = true;
						break;
					}
				}
				
				if (!bFind) {
					JOptionPane.showMessageDialog(getParent(), "찾는 영단어가 없습니다.");
				}
								
			}
		});
		
		setTitle("단어장");
		setSize(600, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new Test();
	}
}

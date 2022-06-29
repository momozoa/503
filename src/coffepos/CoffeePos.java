package coffepos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoffeePos extends JFrame {
	
	int menuCount = 3;
	// Ŀ�� �޴� ��ü �г�
	JPanel[] pnlMenu = new JPanel[menuCount];
	
	// Ŀ�� �޴� ��ư
	String[] menuName = {"�Ƹ޸�ī��", "īǪġ��", "��Ű�߶�"};
	String[] menuImage = {"coffee1.jpg", "coffee2.jpg", "coffee3.jpg"};
	JButton[] btnCoffee = new JButton[menuCount];

	// Ŀ�� ����
	int[] menuPrice = {5000, 6000, 7000};
	JLabel[] lblPrice = new JLabel[menuCount];
	
	// + - ���� �г�
	JPanel[] pnlCount = new JPanel[menuCount];

	// ���� + - ��ư
	JTextField[] txtCount = new JTextField[menuCount];
	JButton[] btnMinus = new JButton[menuCount];
	JButton[] btnPlus = new JButton[menuCount];

	// ��� ��ư
	JButton[] btnCalc = new JButton[menuCount];
	
	// �� �ݾ�
	JLabel[] lblTotalPrice = new JLabel[menuCount];
	
	CoffeePos() {
		setTitle("Ŀ�����Ǳ�");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 3));
		
		// ȭ�� ��ġ
		for(int i = 0; i < menuCount;i++) {

			/////////////////////////////////////
			// Ŀ�� �޴�
			/////////////////////////////////////
			btnCoffee[i] = new JButton(new ImageIcon("./images/" + menuImage[i]));
			btnCoffee[i].setPreferredSize(new Dimension(170, 170));
			btnCoffee[i].addMouseListener(new MenuClick(i)); // �̺�Ʈ ���

			lblPrice[i] = new JLabel(menuName[i] + " " + menuPrice[i] + "��", JLabel.CENTER);
			lblPrice[i].setFont(new Font("���� ���", Font.BOLD, 16));

			/////////////////////////////////////
			// ī��Ʈ ���� ��ư
			/////////////////////////////////////
			btnMinus[i] = new JButton("-");
			btnMinus[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
			btnMinus[i].addActionListener(new CountClick(i)); // �̺�Ʈ ���

			btnPlus[i] = new JButton("+");
			btnPlus[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
			btnPlus[i].addActionListener(new CountClick(i)); // �̺�Ʈ ���
			
			txtCount[i] = new JTextField("0", 2);
			txtCount[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
			txtCount[i].setHorizontalAlignment(JTextField.CENTER);

			/////////////////////////////////////
			// ī��Ʈ �гο� �� ��� ��ġ
			/////////////////////////////////////
			pnlCount[i] = new JPanel();
			pnlCount[i].setLayout(new GridLayout(1, 3, 5, 10));
			pnlCount[i].add(btnMinus[i]);
			pnlCount[i].add(txtCount[i]);
			pnlCount[i].add(btnPlus[i]);

			/////////////////////////////////////
			// ��� ��ư
			/////////////////////////////////////
			btnCalc[i] = new JButton("���");
			btnCalc[i].setPreferredSize(new Dimension(170, 40));
			btnCalc[i].setFont(new Font("���� ���", Font.BOLD, 24));
			btnCalc[i].addActionListener(new CalcClick(i));

			/////////////////////////////////////
			// �� �ݾ�
			/////////////////////////////////////
			lblTotalPrice[i] = new JLabel("", JLabel.CENTER);
			lblTotalPrice[i].setFont(new Font("���� ���", Font.BOLD, 24));
			
			//lblTotalPrice[i].setVisible(false);
			
			
			/////////////////////////////////////
			// ī��Ʈ �гο� �� ��� ��ġ
			/////////////////////////////////////
			pnlMenu[i] = new JPanel();
			pnlMenu[i].setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
			//pnlMenu[i].setLayout(new GridLayout(5, 1, 0, 10));
			pnlMenu[i].setLayout(new FlowLayout());
			
			pnlMenu[i].add(btnCoffee[i]);
			pnlMenu[i].add(lblPrice[i]);
			pnlMenu[i].add(pnlCount[i]);
			pnlMenu[i].add(btnCalc[i]);
			pnlMenu[i].add(lblTotalPrice[i]);
			
			/////////////////////////////////////
			// �޴��� �߰�
			/////////////////////////////////////
			add(pnlMenu[i]);
		}
		
		setVisible(true);
	}

	class MenuClick extends MouseAdapter{
		int n;

		MenuClick(int n) {
			this.n = n;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.isEnabled()) {
				btn.setEnabled(false);
			} else {
				lblTotalPrice[n].setText("");
				btn.setEnabled(true);
			}
		}
	}	
	
	class CountClick implements ActionListener {
		int n;

		CountClick(int n) {
			this.n = n;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			String str = btn.getText();
			Integer count = Integer.parseInt(txtCount[n].getText());
			switch(str) {
				case "+": count++; break;
				case "-": count = (--count <= 0) ? 0 : count; break;
			}
			
			txtCount[n].setText(count.toString());
		}
	}
	
	class CalcClick implements ActionListener {
		int n;

		CalcClick(int n) {
			this.n = n;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Integer count = Integer.parseInt(txtCount[n].getText());
			Integer totalPrice = 0;
			if (!btnCoffee[n].isEnabled()) {
				totalPrice = menuPrice[n] * count;
				lblTotalPrice[n].setText(totalPrice + "��");
			}
		}
	}
	
	public static void main(String[] args) {
		new CoffeePos();
	}
}

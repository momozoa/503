package coffepos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoffeePos extends JFrame {
	
	int menuCount = 3;
	// 커피 메뉴 전체 패널
	JPanel[] pnlMenu = new JPanel[menuCount];
	
	// 커피 메뉴 버튼
	String[] menuName = {"아메리카노", "카푸치노", "마키야또"};
	String[] menuImage = {"coffee1.jpg", "coffee2.jpg", "coffee3.jpg"};
	JButton[] btnCoffee = new JButton[menuCount];

	// 커피 가격
	int[] menuPrice = {5000, 6000, 7000};
	JLabel[] lblPrice = new JLabel[menuCount];
	
	// + - 개수 패널
	JPanel[] pnlCount = new JPanel[menuCount];

	// 개수 + - 버튼
	JTextField[] txtCount = new JTextField[menuCount];
	JButton[] btnMinus = new JButton[menuCount];
	JButton[] btnPlus = new JButton[menuCount];

	// 계산 버튼
	JButton[] btnCalc = new JButton[menuCount];
	
	// 총 금액
	JLabel[] lblTotalPrice = new JLabel[menuCount];
	
	CoffeePos() {
		setTitle("커피자판기");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 3));
		
		// 화면 배치
		for(int i = 0; i < menuCount;i++) {

			/////////////////////////////////////
			// 커피 메뉴
			/////////////////////////////////////
			btnCoffee[i] = new JButton(new ImageIcon("./images/" + menuImage[i]));
			btnCoffee[i].setPreferredSize(new Dimension(170, 170));
			btnCoffee[i].addMouseListener(new MenuClick(i)); // 이벤트 등록

			lblPrice[i] = new JLabel(menuName[i] + " " + menuPrice[i] + "원", JLabel.CENTER);
			lblPrice[i].setFont(new Font("맑은 고딕", Font.BOLD, 16));

			/////////////////////////////////////
			// 카운트 증감 버튼
			/////////////////////////////////////
			btnMinus[i] = new JButton("-");
			btnMinus[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
			btnMinus[i].addActionListener(new CountClick(i)); // 이벤트 등록

			btnPlus[i] = new JButton("+");
			btnPlus[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
			btnPlus[i].addActionListener(new CountClick(i)); // 이벤트 등록
			
			txtCount[i] = new JTextField("0", 2);
			txtCount[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
			txtCount[i].setHorizontalAlignment(JTextField.CENTER);

			/////////////////////////////////////
			// 카운트 패널에 각 요소 배치
			/////////////////////////////////////
			pnlCount[i] = new JPanel();
			pnlCount[i].setLayout(new GridLayout(1, 3, 5, 10));
			pnlCount[i].add(btnMinus[i]);
			pnlCount[i].add(txtCount[i]);
			pnlCount[i].add(btnPlus[i]);

			/////////////////////////////////////
			// 계산 버튼
			/////////////////////////////////////
			btnCalc[i] = new JButton("계산");
			btnCalc[i].setPreferredSize(new Dimension(170, 40));
			btnCalc[i].setFont(new Font("맑은 고딕", Font.BOLD, 24));
			btnCalc[i].addActionListener(new CalcClick(i));

			/////////////////////////////////////
			// 총 금액
			/////////////////////////////////////
			lblTotalPrice[i] = new JLabel("", JLabel.CENTER);
			lblTotalPrice[i].setFont(new Font("맑은 고딕", Font.BOLD, 24));
			
			//lblTotalPrice[i].setVisible(false);
			
			
			/////////////////////////////////////
			// 카운트 패널에 각 요소 배치
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
			// 메뉴판 추가
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
				lblTotalPrice[n].setText(totalPrice + "원");
			}
		}
	}
	
	public static void main(String[] args) {
		new CoffeePos();
	}
}

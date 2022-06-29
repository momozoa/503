package lesson;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame{
	private JTextField txtInput;
	private JTextField txtOutput;
	private double firstNum;
	private String op;

	class BtnClick implements ActionListener{
		String str;
		double result;
		
		BtnClick(String str) {
			this.str = str;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {

			if (str.equals("C")) {
				txtInput.setText("");
				txtOutput.setText("");
				op = "";
				firstNum = 0;
			} else if (str.equals("+") || str.equals("-") || str.equals("x") || str.equals("/")) {
				if (!txtInput.getText().equals("")) {
					firstNum = Double.parseDouble(txtInput.getText());
					op = str; // ������ ����
					txtInput.setText("");
				}
				
				//txtInput.setText(txtInput.getText() + " " + str + " ");
			} else if (str.equals("=")) {
				calc();
				txtInput.setText("");
			} else {
				txtInput.setText(txtInput.getText() + str);
			}
		}
		
		public void calc() {
			switch(op) {
				case "+":
					result = firstNum + Integer.parseInt(txtInput.getText());
					break;
				case "-":
					result = firstNum - Integer.parseInt(txtInput.getText());
					break;
				case "x":
					result = firstNum * Integer.parseInt(txtInput.getText());
					break;
				case "/":
					result = firstNum / Integer.parseInt(txtInput.getText());
					break;
			}
		
			op = "";
			txtOutput.setText(String.valueOf(result));
		}
	}
	
	Calculator() {
		setTitle("����");
		
		JPanel pnlTop = new JPanel();
		JPanel pnlMiddle = new JPanel();
		JPanel pnlBottom = new JPanel();
		
		pnlTop.setBackground(Color.GRAY);
		pnlBottom.setBackground(Color.CYAN);


		///////////////////////
		// ��� �Է�
		///////////////////////
		add(pnlTop, BorderLayout.NORTH);
		JLabel lblInput = new JLabel("�Է�");
		lblInput.setFont(new Font("���� ���", Font.BOLD, 16));
		
		txtInput = new JTextField(10);
		txtInput.setFont(new Font("���� ���", Font.PLAIN, 16));
		pnlTop.add(lblInput);
		pnlTop.add(txtInput);


		///////////////////////
		// ��� ��ư
		///////////////////////
		add(pnlMiddle, BorderLayout.CENTER);
		pnlMiddle.setLayout(new GridLayout(4, 4));
		JButton[] btns = new JButton[16];
		String[] keys = {"+", "-", "x", "/", "=", "C"};
		for(int i = 0; i < 16; i++) {
			JButton btn = btns[i];

			if (i < 10) 
				btn = new JButton(String.valueOf(i));
			else {
				btn = new JButton(keys[i - 10]);
			}
			
			btn.setFont(new Font("Dialog", Font.BOLD, 30));
			btn.addActionListener(new BtnClick(btn.getText()));
			pnlMiddle.add(btn);
		}

		
		///////////////////////
		// �ϴ� ���
		///////////////////////
		add(pnlBottom, BorderLayout.SOUTH);
		JLabel lblOutput = new JLabel("���");
		lblOutput.setFont(new Font("���� ���", Font.BOLD, 16));
		txtOutput = new JTextField(10);
		txtOutput.setFont(new Font("���� ���", Font.PLAIN, 16));
		pnlBottom.add(lblOutput);
		pnlBottom.add(txtOutput);
		
		setSize(300, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}

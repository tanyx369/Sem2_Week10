import javax.swing.*;
import javax.swing.plaf.metal.MetalButtonUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Question2A extends JFrame
{
	JPanel main = new JPanel();
	ArrayList<Button> buttons = new ArrayList<Button>();
	ArrayList<String> str = new ArrayList<String>();
	JLabel label = new JLabel();
	
 	Question2A(){
		this.setSize(500 , 500);
		
		
		main.setLayout(new GridLayout(3,3));
		
		for(int i = 0 ; i < 9 ; i++) {
			
			Button button = new Button();
			main.add(button);
			buttons.add(button);
			
		}
		
		this.add(main ,BorderLayout.CENTER);
		this.add(label, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	class Button extends JButton implements ActionListener{
		
		//JLabel o = new JLabel("O");
		//JLabel x = new JLabel("X");
		static int count = 0;
		
		Button(){
			//this.setLayout(new BorderLayout());
			//o.setFont(new Font("MV Boli" , Font.BOLD , 35));
			//x.setFont(new Font("MV Boli" , Font.BOLD , 35));
			this.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			count ++;
			
			if( this.getText().isBlank()) {
				if(count % 2 == 0) {
					this.setText("O");
					this.setHorizontalAlignment(SwingConstants.CENTER);
					this.setFont(new Font("MV Boli" , Font.BOLD , 35));
					this.setForeground(Color.blue);
					/*
					this.setUI(new MetalButtonUI() {
						protected Color getDisabledTextColor() {
							return Color.green;
						}
					});
					this.setEnabled(false);
					*/
				}
				else {
					this.setText("X");
					this.setHorizontalAlignment(SwingConstants.CENTER);
					this.setFont(new Font("MV Boli" , Font.BOLD , 35));
					this.setForeground(Color.red);
					/*
					this.setUI(new MetalButtonUI() {
						protected Color getDisabledTextColor() {
							return Color.red;
						}
					});
					this.setEnabled(false);
					*/
				}
			}
			
			
			checkO();
			checkX();
			checkDraw();
		}
		
		
	}
	
	boolean win = false;
	public void checkO() {
		
		if(
			buttons.get(0).getText().equals("O") &&
			buttons.get(1).getText().equals("O") &&
			buttons.get(2).getText().equals("O")
		) { OWins(0, 1,2);}
		
		if(
				buttons.get(3).getText().equals("O") &&
				buttons.get(4).getText().equals("O") &&
				buttons.get(5).getText().equals("O")
			) { OWins(3, 4 ,5);}
		
		if(
				buttons.get(6).getText().equals("O") &&
				buttons.get(7).getText().equals("O") &&
				buttons.get(8).getText().equals("O")
			) { OWins(6, 7 ,8);}
		
		if(
				buttons.get(0).getText().equals("O") &&
				buttons.get(3).getText().equals("O") &&
				buttons.get(6).getText().equals("O")
			) { OWins(0, 3 ,6);}
		

		if(
				buttons.get(1).getText().equals("O") &&
				buttons.get(4).getText().equals("O") &&
				buttons.get(7).getText().equals("O")
			) { OWins(1, 4 ,7);}
		
		if(
				buttons.get(2).getText().equals("O") &&
				buttons.get(5).getText().equals("O") &&
				buttons.get(8).getText().equals("O")
			) { OWins(2, 5 ,8);}
		
		if(
				buttons.get(0).getText().equals("O") &&
				buttons.get(4).getText().equals("O") &&
				buttons.get(8).getText().equals("O")
			) { OWins(0, 4 ,8);}
		
		if(
				buttons.get(2).getText().equals("O") &&
				buttons.get(4).getText().equals("O") &&
				buttons.get(6).getText().equals("O")
			) { OWins(2, 4 ,6);}
		
	}
	
	public void checkX() {
		
		if(
			buttons.get(0).getText().equals("X") &&
			buttons.get(1).getText().equals("X") &&
			buttons.get(2).getText().equals("X")
		) { XWins(0, 1,2);}
		
		if(
				buttons.get(3).getText().equals("X") &&
				buttons.get(4).getText().equals("X") &&
				buttons.get(5).getText().equals("X")
			) { XWins(3, 4 ,5);}
		
		if(
				buttons.get(6).getText().equals("X") &&
				buttons.get(7).getText().equals("X") &&
				buttons.get(8).getText().equals("X")
			) { XWins(6, 7 ,8);}
		
		if(
				buttons.get(0).getText().equals("X") &&
				buttons.get(3).getText().equals("X") &&
				buttons.get(6).getText().equals("X")
			) { XWins(0, 3 ,6);}
		

		if(
				buttons.get(1).getText().equals("X") &&
				buttons.get(4).getText().equals("X") &&
				buttons.get(7).getText().equals("X")
			) { XWins(1, 4 ,7);}
		
		if(
				buttons.get(2).getText().equals("X") &&
				buttons.get(5).getText().equals("X") &&
				buttons.get(8).getText().equals("X")
			) { XWins(2, 5 ,8);}
		
		if(
				buttons.get(0).getText().equals("X") &&
				buttons.get(4).getText().equals("X") &&
				buttons.get(8).getText().equals("X")
			) { XWins(0, 4 ,8);}
		
		if(
				buttons.get(2).getText().equals("X") &&
				buttons.get(4).getText().equals("X") &&
				buttons.get(6).getText().equals("X")
			) { XWins(2, 4 ,6);}
	}
	

	
	public void OWins(int i , int x , int y) {
		buttons.get(i).setBackground(Color.green);
		buttons.get(x).setBackground(Color.green);
		buttons.get(y).setBackground(Color.green);
		for (Button but : buttons) {
			if(but.getText().equals("O")) {
				but.setUI(new MetalButtonUI() {
					protected Color getDisabledTextColor() {
						return Color.blue;
					}
				});
			}
			else if(but.getText().equals("X")) {
				but.setUI(new MetalButtonUI() {
					protected Color getDisabledTextColor() {
						return Color.red;
					}
				});
			}
			
			but.setEnabled(false);
		}
		win = true;
		label.setText("O won ! The game is over");
	}
	
	public void XWins(int i , int x , int y) {
		buttons.get(i).setBackground(Color.green);
		buttons.get(x).setBackground(Color.green);
		buttons.get(y).setBackground(Color.green);
		for (Button but : buttons) {
			if(but.getText().equals("O")) {
				but.setUI(new MetalButtonUI() {
					protected Color getDisabledTextColor() {
						return Color.blue;
					}
				});
			}
			else if(but.getText().equals("X")) {
				but.setUI(new MetalButtonUI() {
					protected Color getDisabledTextColor() {
						return Color.red;
					}
				});
			}
			
			but.setEnabled(false);
		}
		label.setText("X won ! The game is over");
		win = true;
	}
	
	public void checkDraw() {
		
		int num = 0;
		boolean status = false;
		boolean opt = false;
		ArrayList<Boolean> keeps = new ArrayList<Boolean>();
		
		for(Button but: buttons) {
			
			if(! but.getText().isBlank()) {
				num ++;
			}
			else {
			}
			
		}
		
		if(num == 9 && win == false) {
			label.setText("Draw ! The game is over. ");
			
		}
		
	}
	
	public static void main(String[] args) {
		new Question2A();
	}
	

}


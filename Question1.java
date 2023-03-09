import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;


public class Question1 extends JFrame implements ActionListener{
	
	boolean status = true;
	Circle circle = new Circle();
	JButton enlarge = new JButton("Enlarge");
	JButton shrink = new JButton("Shrink");
	
	Question1(){
		this.setSize(500 , 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		enlarge.addActionListener(this);
		shrink.addActionListener(this);
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,0));
		buttons.add(enlarge);
		buttons.add(shrink);
		
		this.add(buttons, BorderLayout.SOUTH);
		this.add(circle );
		this.setVisible(true);
		
		System.out.println(circle.getX());
	}
	

	Question1(boolean status){
		this.status = status;
	}
	
	
	class Circle extends JComponent 
	{ 
		int x = 115;
		int y = 100;
		int width = 30;
		int height = 30;
		Graphics2D g2;
		Ellipse2D.Double circle ;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g2 = (Graphics2D) g;
			circle = new Ellipse2D.Double(x, y, width , height);
			//g2.drawOval(x, y, width, height);
			g2.draw(circle);
		}
		
		public int getW() {
			return width;
		}
		
		public int getH() {
			return height;
		}
		
		public void setWidth(int w) {
			this.width = w;
		}
		
		public void setHeight(int h) {
			this.height = h;
		}
		
		public int getX() {
			return this.x;
		}
		
		public int getY() {
			return this.y;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		
		public void redraw() {
			this.repaint();
		}
	}
	
	

	
	int scale = 5;
	int cor = 3;
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == enlarge) {
			
			circle.setWidth(circle.getW() + scale);
			circle.setHeight(circle.getW() + scale);

			if(circle.getW()>= 500) {
				circle.setWidth(100);
				circle.setHeight(100);
			}
			
			circle.setX(circle.getX() - cor);
			
			System.out.println(circle.getWidth());
			
			circle.redraw();
		
		}
		else if(e.getSource() == shrink) {
			
			
			circle.setWidth(circle.getW() - scale);
			circle.setHeight(circle.getW() - scale);

			if(circle.getW()>= 500) {
				circle.setWidth(500);
				circle.setHeight(500);
			}
			
			circle.redraw();
		
		}
		
	}
   
	
	public static void main(String[] args) {
		
		/*
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton enlarge = new JButton("Enlarge");
		//enlarge.addActionListener(new Question1(true));
		JButton shrink = new JButton("Shrink");
		//shrink.addActionListener(new Question1(false));
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,0));
		buttons.add(enlarge);
		buttons.add(shrink);
		
		
		frame.add(cir, BorderLayout.CENTER);
		frame.add(buttons, BorderLayout.SOUTH);
		frame.setVisible(true);
		*/
		
		Question1 q1 = new Question1();
		
		
		//q1.add(buttons, BorderLayout.SOUTH);
		//q1.setVisible(true);
	}
}


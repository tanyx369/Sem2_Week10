import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Question2B extends JFrame implements ActionListener
{
	
	JComboBox combo;
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JPanel panel1 = new JPanel() ;
	JPanel panel2 = new JPanel();
	JTextArea text = new JTextArea();
	String[] countries = {"Canada", "Germany", "United States", "France"}; 
	
	
	Question2B(){
		this.setSize(1200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		
		
		label.setText("Select a country: ");
		combo = new JComboBox(countries);
		combo.addActionListener(this);
		panel1.setLayout(new FlowLayout(FlowLayout.LEADING , 5 , 0));
		panel1.add(label);
		panel1.add(combo);
		
		//label2.setText("Hello");
		panel2.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 0));
		panel2.add(label2);
		panel2.add(text);
		
		this.add(panel1);
		this.add(panel2);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Question2B();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ImageIcon icon ;
		if(e.getSource() == combo) {
			if(combo.getSelectedItem() == "Canada") {
				icon = new ImageIcon("C:\\Users\\Maxta\\Downloads\\cana.png");
				label2.setIcon(icon);
				label2.setText("Canada");
				label2.setHorizontalTextPosition(JLabel.CENTER);
				label2.setVerticalTextPosition(JLabel.BOTTOM);
				text.setText("Canadian flag or, unofficially, as the Maple Leaf , consists of a red field with a white square at its centre in the ratio of 1∶2∶1, in which is featured a stylized, red, 11-pointed maple leaf charged in the centre.\nIt is the first flag to have been adopted by both houses of Parliament and officially proclaimed by the Canadian monarch as the country's official national flag.\nThe flag has become the predominant and most recognizable national symbol of Canada.");
				text.setEditable(false);
			}
			else if (combo.getSelectedItem() == "Germany") {
				icon = new ImageIcon("C:\\Users\\Maxta\\Downloads\\Germany.svg.png");
				label2.setIcon(icon);
				label2.setText("Germany");
				label2.setHorizontalTextPosition(JLabel.CENTER);
				label2.setVerticalTextPosition(JLabel.BOTTOM);
				text.setText("The national flag of Germany is a tricolour consisting of three equal horizontal bands displaying\n the national colours of Germany: black, red, and gold (German: Schwarz-Rot-Gold [de]).[1] The flag was first sighted in 1848 in the German Confederation. \n It was officially adopted as the national flag of the Weimar Republic from 1919 to 1933, and has been in use since its reintroduction in West Germany in 1949.");
				text.setEditable(false);
			}
			else if (combo.getSelectedItem() == "United States") {
				icon = new ImageIcon("C:\\Users\\Maxta\\Downloads\\usa.png");
				label2.setIcon(icon);
				label2.setText("United States");
				label2.setHorizontalTextPosition(JLabel.CENTER);
				label2.setVerticalTextPosition(JLabel.BOTTOM);
				text.setText("The national flag of the United States of America, often referred to as the American flag or the U.S. flag \n consists of thirteen equal horizontal stripes of red (top and bottom) alternating with white, \n with a blue rectangle in the canton (referred to specifically as the \"union\") bearing fifty small, white, five-pointed stars arranged in nine offset horizontal rows, \n where rows of six stars (top and bottom) alternate with rows of five stars. The 50 stars on the flag represent the 50 U.S. states, \n and the 13 stripes represent the thirteen British colonies that declared independence from Great Britain, and became the first states in the U.S. \n Nicknames for the flag include the Stars and Stripes,Old Glory, and the Star-Spangled Banner.");
				text.setEditable(false);
			}
			else if (combo.getSelectedItem() == "France") {
				icon = new ImageIcon("C:\\Users\\Maxta\\Downloads\\ff.png");
				label2.setIcon(icon);
				label2.setText("France");
				label2.setHorizontalTextPosition(JLabel.CENTER);
				label2.setVerticalTextPosition(JLabel.BOTTOM);
				text.setText("The national flag of France (French: drapeau français) is a tricolour featuring three vertical bands coloured blue (hoist side), white, and red.\n It is known to English speakers as the Tricolour (French: Tricolore), although the flag of Ireland and others are also so known. \n The design was adopted after the French Revolution; while not the first tricolour, it became one of the most influential flags in history. \n The tricolour scheme was later adopted by many other nations in Europe and elsewhere, \n and, according to the Encyclopædia Britannica has historically stood \"in symbolic opposition to the autocratic and clericalist royal standards of the past\".");
				text.setEditable(false);
			}
		}
		
	}

}

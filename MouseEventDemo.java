//Handling mouse event
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventDemo implements MouseListener{
	JFrame f1;
	JPanel p1;
	JLabel l1;
	MouseEventDemo(){
		f1=new JFrame();
		f1.setLayout(new BorderLayout());
		f1.setSize(300, 300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		f1.add(p1,BorderLayout.CENTER);
		l1=new JLabel("Status");
		f1.add(l1, BorderLayout.SOUTH);
		p1.addMouseListener(this);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventDemo();
	}
	public void mouseEntered(MouseEvent e) {
		p1.setBackground(Color.BLACK);
	}
	public void mouseExited(MouseEvent e) {
		p1.setBackground(Color.blue);
	}
	public void mousePressed(MouseEvent e) {
		l1.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e) {
		l1.setText("Mouse Released");
	}
	public void mouseClicked(MouseEvent e) {
		l1.setText("Mouse clicked at"+e.getX()+" , "+e.getY());
	}
}

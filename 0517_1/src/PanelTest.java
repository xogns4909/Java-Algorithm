import java.awt.*;
import java.awt.event.*;
public class PanelTest {
private Frame f;
private Button b1, b2,b3,b4,b5;

public PanelTest() {
// ������ ����
	f=new Frame("Button");
	b1=new Button("��ư 1");
	b2=new Button("��ư 2");
	b3=new Button("��ư 3");
	b3=new Button("��ư 3");
	b5=new Button("��ư 5");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	f.add(b1,BorderLayout.EAST);
	f.add(b2,BorderLayout.WEST);
	f.add(b3,BorderLayout.NORTH);
	f.add(b4,BorderLayout.SOUTH);
	f.add(b5,BorderLayout.CENTER);
	f.setSize(400, 400);
	f.setVisible(true);
	}
	public static void main(String[] args) {
		PanelTest T = new PanelTest();
	
	}
}
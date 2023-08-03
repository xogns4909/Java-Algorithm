import java.awt.*;
import java.awt.event.*;

public class GridLayoutT {
private Frame f;
private Panel p;
private Button b1, b2, b3, b4;

public GridLayoutT() {
 // 프레임 생성
	f=new Frame("GridLayout 테스트");

	b1=new Button("버튼 1");
	b2=new Button("버튼 2");
	b3=new Button("버튼 3");
	b4=new Button("버튼 4");
//윈도우 종료
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});

	p=new Panel();

	p.setLayout(new GridLayout(2, 2));
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);

	f.add(p, "Center");
	f.setSize(300,200);
	f.setVisible(true);
	}

	public static void main(String[] args) {
		GridLayoutT gt=new GridLayoutT();
	}
}
import java.awt.*;
import java.awt.event.*;
public class ScrollbarT {
	Frame f;
	Scrollbar bar1, bar2, bar3, bar4, bar5;
	public ScrollbarT() {
		 // ������ ���� �� ������ ����
		 f=new Frame("Scrollbar �׽�Ʈ");
		 f.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
		 System.exit(0);
		 }
	 });
		 bar1=new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 300);
		 bar2=new Scrollbar(Scrollbar.HORIZONTAL, 0, 30, 0, 300);
		 bar3=new Scrollbar(Scrollbar.HORIZONTAL, 0, 30, 0, 300);
		 bar4=new Scrollbar(Scrollbar.VERTICAL, 0, 150, 0, 250);
		 bar5=new Scrollbar(Scrollbar.VERTICAL, 0, 50, 0, 250);
		  // �����ӿ� ��ũ�� �ٸ� ��, ��, ��, ��, �߾����� ����
		  f.add(bar1, "North");
		  f.add(bar2, "South");
		  f.add(bar3, "Center");
		  f.add(bar4, "East");
		  f.add(bar5, "West");
		  // ������ ������ �� ȭ�鿡 ���̰� ��.
		  f.setSize(500, 300);
		  f.setVisible(true);
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrollbarT st=new ScrollbarT();
	}

}

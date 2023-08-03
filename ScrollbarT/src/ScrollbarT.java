import java.awt.*;
import java.awt.event.*;
public class ScrollbarT {
	Frame f;
	Scrollbar bar1, bar2, bar3, bar4, bar5;
	public ScrollbarT() {
		 // 프레임 생성 및 윈도우 종료
		 f=new Frame("Scrollbar 테스트");
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
		  // 프레임에 스크롤 바를 동, 서, 남, 북, 중앙으로 붙임
		  f.add(bar1, "North");
		  f.add(bar2, "South");
		  f.add(bar3, "Center");
		  f.add(bar4, "East");
		  f.add(bar5, "West");
		  // 프레임 사이즈 및 화면에 보이게 함.
		  f.setSize(500, 300);
		  f.setVisible(true);
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrollbarT st=new ScrollbarT();
	}

}

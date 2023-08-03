import java.awt.*;
import java.awt.event.*;

public class ChoiceT {
	Frame f;
	Choice choice;
	public ChoiceT() {
		f=new Frame("Choict 테스트");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		choice=new Choice();
	choice.add("Terran");
	choice.add("Protoss");
	choice.add("Zerg");
	// 패널, 레이블을 생성하고 레이블과 Choice를 패널에 붙임
	 Panel p=new Panel();
	 p.setLayout(new BorderLayout());
	 p.add(new Label("종족을 선택하시오", Label.CENTER), "North");
	 p.add(choice, "Center");
	 // 프레임에 레이아웃 관리자를 FlowLayout로 설정
	 f.setLayout(new FlowLayout());
	 // 프레임에 패널을 붙임
	 f.add(p);
	 // 프레임 사이즈 및 화면에 보이게함
	 f.setSize(200, 100);
	 f.setVisible(true);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChoiceT ct=new ChoiceT();
	}
}


import java.awt.*;
import java.awt.event.*;

public class ChoiceT {
	Frame f;
	Choice choice;
	public ChoiceT() {
		f=new Frame("Choict �׽�Ʈ");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		choice=new Choice();
	choice.add("Terran");
	choice.add("Protoss");
	choice.add("Zerg");
	// �г�, ���̺��� �����ϰ� ���̺�� Choice�� �гο� ����
	 Panel p=new Panel();
	 p.setLayout(new BorderLayout());
	 p.add(new Label("������ �����Ͻÿ�", Label.CENTER), "North");
	 p.add(choice, "Center");
	 // �����ӿ� ���̾ƿ� �����ڸ� FlowLayout�� ����
	 f.setLayout(new FlowLayout());
	 // �����ӿ� �г��� ����
	 f.add(p);
	 // ������ ������ �� ȭ�鿡 ���̰���
	 f.setSize(200, 100);
	 f.setVisible(true);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChoiceT ct=new ChoiceT();
	}
}


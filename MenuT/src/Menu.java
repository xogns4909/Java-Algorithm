import java.awt.*;
 import java.awt.event.*;

 public class MenuT{

 private Frame f;
 private MenuBar bar;
 private Menu file, edit;
 private MenuItem open, save, saveas, print, exit;
 private MenuItem cut, paste, clear;

 public MenuT() {
 // ������ ���� �� ������ ����
 f=new Frame("Menu �׽�Ʈ");
 f.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 System.exit(0);
 }
 });
 // Menu�� �� �� �ִ� MenuBar ����
 bar=new MenuBar();
 // Menu��ü 2�� ����
 file=new Menu("����");
 edit=new Menu("����");

 open=new MenuItem("����");
 save=new MenuItem("����");
 saveas=new MenuItem("�ٸ� �̸�..");
 print=new MenuItem("�μ�");
 exit=new MenuItem("����");

 file.add(open);
 file.add(save);
 file.add(saveas);
 file.addSeparator();
		 file.add(print);
		 file.addSeparator();
		  file.add(exit);
		 
		  edit.add(cut=new MenuItem("�߶󳻱�"));
		  edit.add(paste=new MenuItem("�ٿ��ֱ�"));
		  edit.addSeparator();
		  edit.add(clear=new MenuItem("�����"));
		  // MenuBar�� 2���� Menu�� ����
		  bar.add(file);
		  bar.add(edit);
		 
		  f.setMenuBar(bar);
		  // ������ ������ �� ȭ�� ����
		  f.setSize(400,200);
		  f.setVisible(true);
		  }
		  public static void main(String[] args) {
		  MenuT mt=new MenuT();
		  }
		  }
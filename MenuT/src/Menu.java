import java.awt.*;
 import java.awt.event.*;

 public class MenuT{

 private Frame f;
 private MenuBar bar;
 private Menu file, edit;
 private MenuItem open, save, saveas, print, exit;
 private MenuItem cut, paste, clear;

 public MenuT() {
 // 프레임 생성 및 윈도우 종료
 f=new Frame("Menu 테스트");
 f.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 System.exit(0);
 }
 });
 // Menu를 볼 수 있는 MenuBar 생성
 bar=new MenuBar();
 // Menu객체 2개 생성
 file=new Menu("파일");
 edit=new Menu("편집");

 open=new MenuItem("열기");
 save=new MenuItem("저장");
 saveas=new MenuItem("다른 이름..");
 print=new MenuItem("인쇄");
 exit=new MenuItem("종료");

 file.add(open);
 file.add(save);
 file.add(saveas);
 file.addSeparator();
		 file.add(print);
		 file.addSeparator();
		  file.add(exit);
		 
		  edit.add(cut=new MenuItem("잘라내기"));
		  edit.add(paste=new MenuItem("붙여넣기"));
		  edit.addSeparator();
		  edit.add(clear=new MenuItem("지우기"));
		  // MenuBar에 2개의 Menu를 붙임
		  bar.add(file);
		  bar.add(edit);
		 
		  f.setMenuBar(bar);
		  // 프레임 사이즈 및 화면 보기
		  f.setSize(400,200);
		  f.setVisible(true);
		  }
		  public static void main(String[] args) {
		  MenuT mt=new MenuT();
		  }
		  }
import java.awt.*;
import java.awt.event.*;

	public class TextFieldT {
		private Frame f;
		private TextArea tf1, tf2;

		public TextFieldT() {
			f=new Frame("TextFieldT 테스트");
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
				
			});

	tf1=new TextArea(20, 30);
	tf1.append(" 칭찬해 주세요￦n ");

	tf2=new TextArea(" 신고해 주세요￦n ", 20, 30, TextArea.SCROLLBARS_NONE);
 Panel p1=new Panel();
 p1.setLayout(new BorderLayout());
 p1.add(new Label("학번", Label.RIGHT));
 p1.add(new Label("이름", Label.RIGHT));

 Panel p2=new Panel();
 p2.setLayout(new BorderLayout());
 p2.add(tf1);
 p2.add(tf2);

 Panel p3=new Panel();
 p3.add(p1);
 p3.add(p2);

 f.add(p3, "Center");

 System.out.println(" tf1 Text : "+tf1.getText());
 System.out.println(" tf2 Text : "+tf2.getText());
 	f.setSize(300, 150);
 f.setVisible(true);
 }

 public static void main(String[] args) {
	 TextFieldT tft=new TextFieldT();
 	}
}
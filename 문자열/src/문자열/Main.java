import java.awt.*;
import java.awt.event.*;

public class Main{

private Frame frame;
private Panel panel;

public PanelTest() {
 frame=new Frame("패널 테스트");
panel=new Panel();
frame.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent we) {
 System.exit(0);
 }
 });
frame.setBackground(Color.white);
 frame.setSize(400,300);

panel.setBackground(Color.blue);
panel.setSize(200,200);

frame.setLayout(null);

frame.add(panel);
frame.setVisible(true);
}
}
import java.awt.*;
import java.awt.event.*;

public class MenuTest {

    private Frame frame;
    private MenuBar bar;
    private Menu file, edit;
    private MenuItem open, save, saveAs, print, exit;
    private MenuItem cut, paste, clear;

    public MenuTest() {
        frame = new Frame("Menu Test");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        bar = new MenuBar();
        file = new Menu("����");
        edit = new Menu("����");

        file.add(open = new MenuItem("����"));
        file.add(save = new MenuItem("����"));
        file.add(saveAs = new MenuItem("�ٸ� �̸����� ����"));
        file.add(print = new MenuItem("�μ�"));
        file.add(exit = new MenuItem("����"));

        edit.add(cut = new MenuItem("�߶󳻱�"));
        edit.add(paste = new MenuItem("�ٿ��ֱ�"));
        edit.add(clear = new MenuItem("�����"));

        bar.add(file);
        bar.add(edit);

        frame.setMenuBar(bar);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MenuTest mt = new MenuTest();
    }
}

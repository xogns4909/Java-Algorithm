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
        file = new Menu("파일");
        edit = new Menu("편집");

        file.add(open = new MenuItem("열기"));
        file.add(save = new MenuItem("저장"));
        file.add(saveAs = new MenuItem("다른 이름으로 저장"));
        file.add(print = new MenuItem("인쇄"));
        file.add(exit = new MenuItem("종료"));

        edit.add(cut = new MenuItem("잘라내기"));
        edit.add(paste = new MenuItem("붙여넣기"));
        edit.add(clear = new MenuItem("지우기"));

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

import java.awt.*;
import java.awt.event.*;

public class Ex4 {

    private Frame frame;
    private Button b1, b2, b3, b4, b5;
    private MenuBar bar;
    private Menu example, docs, window, edit, shape;
    private MenuItem toolbox;
    private MenuItem recentDocs, newDocs, marker;
    private MenuItem vertical, horizontal, task;
    private MenuItem revert, empty;
    private MenuItem letter, paint;

    public Ex4() {

        frame = new Frame("Java Programming");

        b1 = new Button("COM");
        b2 = new Button("PUTER");
        b3 = new Button("AZA");
        b4 = new Button("AZA");
        b5 = new Button("FIGHTING");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Panel panel = new Panel();

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);

        System.out.println("d1's label : "+b1.getLabel());
        System.out.println("d2's label : "+b2.getLabel());
        System.out.println("d3's label : "+b3.getLabel());
        System.out.println("d4's label : "+b4.getLabel());
        System.out.println("d5's label : "+b5.getLabel());

        example = new Menu("보기");
        docs = new Menu("문서");
        window = new Menu("창");
        edit = new Menu("편집");
        shape = new Menu("모양");

        example.add(toolbox = new MenuItem("도구상자"));

        docs.add(recentDocs = new MenuItem("최근문서"));
        docs.add(newDocs = new MenuItem("새문서"));
        docs.addSeparator();
        docs.add(marker = new MenuItem("칸표식"));

        window.add(vertical = new MenuItem("가로로"));
        window.add(horizontal = new MenuItem("세로로"));
        window.add(task = new MenuItem("작업창"));

        edit.add(revert = new MenuItem("되돌리기"));
        docs.addSeparator();
        edit.add(empty = new MenuItem("(비어있음)"));

        shape.add(letter = new MenuItem("글자모양"));
        shape.add(paint = new MenuItem("그림"));

        frame.add(panel, "Center");
        frame.setSize(500, 80);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
    }
}

import java.awt.*;
import java.awt.event.*;
public class ListT {
Frame f;
List tribeList;
List unitList;

public ListT() {
// ������ ����
f=new Frame("List �׽�Ʈ");
// ������ ����
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
tribeList=new List(10);
unitList=new List(10, true);// tribeList�� item�߰�
tribeList.add("Terran");
tribeList.add("Protoss");
tribeList.add("Zerg");
// unitList�� item�߰�
unitList.add("Marine");
unitList.add("Firebat");
unitList.add("Medic");
// p1�� ���̺� �� tribeList ǥ��
 Panel p1=new Panel();
 p1.setLayout(new BorderLayout());
 p1.add(new Label("����", Label.CENTER), "North");
 p1.add(tribeList, "Center");
 // p2�� ���̺� �� unitList ǥ��
 Panel p2=new Panel();
 p2.setLayout(new BorderLayout());
 p2.add(new Label("����", Label.CENTER), "North");
 p2.add(unitList, "Center");
 // p3 �гο� p1, p2 �г� ǥ��
 Panel p3=new Panel();
 p3.add(p1);
 p3.add(p2);
 // �����ӿ� p3 �г� ǥ��
 f.add(p3);

 System.out.println("item : "+tribeList.getItem(0));
 System.out.println("item count : "+tribeList.getItemCount());

 String[] items=tribeList.getItems();
 for(int i=0;i<items.length;i++) {
 System.out.println(items[i]);
 }
 // ������ ������ �� ȭ�鿡 ���̰� ��
 f.setSize(400, 300);
f.setVisible(true);
 }
public static void main(String[] args) {
ListT lt=new ListT();
 }
}
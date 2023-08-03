import java.awt.*;
import java.awt.event.*;
public class ListT {
Frame f;
List tribeList;
List unitList;

public ListT() {
// 프레임 생성
f=new Frame("List 테스트");
// 윈도우 종료
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
tribeList=new List(10);
unitList=new List(10, true);// tribeList에 item추가
tribeList.add("Terran");
tribeList.add("Protoss");
tribeList.add("Zerg");
// unitList에 item추가
unitList.add("Marine");
unitList.add("Firebat");
unitList.add("Medic");
// p1에 레이블 및 tribeList 표시
 Panel p1=new Panel();
 p1.setLayout(new BorderLayout());
 p1.add(new Label("종족", Label.CENTER), "North");
 p1.add(tribeList, "Center");
 // p2에 레이블 및 unitList 표시
 Panel p2=new Panel();
 p2.setLayout(new BorderLayout());
 p2.add(new Label("유닛", Label.CENTER), "North");
 p2.add(unitList, "Center");
 // p3 패널에 p1, p2 패널 표시
 Panel p3=new Panel();
 p3.add(p1);
 p3.add(p2);
 // 프레임에 p3 패널 표시
 f.add(p3);

 System.out.println("item : "+tribeList.getItem(0));
 System.out.println("item count : "+tribeList.getItemCount());

 String[] items=tribeList.getItems();
 for(int i=0;i<items.length;i++) {
 System.out.println(items[i]);
 }
 // 프레임 사이즈 및 화면에 보이게 함
 f.setSize(400, 300);
f.setVisible(true);
 }
public static void main(String[] args) {
ListT lt=new ListT();
 }
}
import java.awt.*;
import java.awt.Event.*;
public class awtbasics {
    public static void main(String args[]){
        Frame f = new Frame("My Frame");
        Label l1 = new Label("First");
        Label l2 = new Label("Second");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Button b = new Button("Ok");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        f.setVisible(true);
    }
    
}

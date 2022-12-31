import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class awtcalci {
    public static void main(String args[]){
    Frame f = new Frame("Mini Calci");
    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    TextField t3 = new TextField(20);
    TextField t4 = new TextField(20);
    TextField t5 = new TextField(20);
    TextField t6 = new TextField(20);
    TextField t7 = new TextField(20);
    TextField t8 = new TextField(20);
    TextField t9 = new TextField(20);
    TextField t10 = new TextField(20);
    TextField t11 = new TextField(20);
    TextField t12 = new TextField(20);
    Button b1 = new Button("+");
    Button b2 = new Button("-");
    Button b3 = new Button("*");
    Button b4 = new Button("/");
    Label l1 = new Label("=");
    Label l3 = new Label("=");
    Label l4 = new Label("=");
    Label l5 = new Label("=");
    f.add(t1);
    f.add(b1);
    f.add(t2);
    f.add(l1);
    f.add(t9);
    f.add(t3);
    f.add(b2);
    f.add(t4);
    f.add(l3);
    f.add(t10);
    f.add(t5);
    f.add(b3);
    f.add(t6);
    f.add(l4);
    f.add(t11);
    f.add(t7);
    f.add(b4);
    f.add(t8);
    f.add(l5);
    f.add(t12);
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            float i1 = Float.parseFloat(t1.getText());
            float i2 = Float.parseFloat(t2.getText());
            float i3 = i1+i2;
            t9.setText(Float.toString(i3));
        }
    });
    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            float i1 = Float.parseFloat(t3.getText());
            float i2 = Float.parseFloat(t4.getText());
            float i3 = i1-i2;
            t10.setText(Float.toString(i3));
        }
    });
    b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            float i1 = Float.parseFloat(t5.getText());
            float i2 = Float.parseFloat(t6.getText());
            float i3 = i1*i2;
            t11.setText(Float.toString(i3));
        }
    });
    b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            float i1 = Float.parseFloat(t7.getText());
            float i2 = Float.parseFloat(t8.getText());
            float i3 =  i1/i2;
            t12.setText(Float.toString(i3));
        }
    });
    f.setLayout(new FlowLayout());
    f.setSize(300,300);
    f.setVisible(true);
    }
}

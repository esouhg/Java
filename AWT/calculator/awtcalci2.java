import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class awtcalci2 extends WindowAdapter implements ActionListener {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bpls, bmns, bmul, bdiv, bpnt, bclr, bbck, bexp, blog, bfct, bmod, bpms, beq;
    Label l;
    String s1, s2;
    double d1, d2;
    double num, num2;
    int turn;
    double breh;
    public static void main(String args[]){
        new awtcalci2();
    }
    public double fact(double i){
        int j = (int) i;
        int fact = 1;
        for(int k=2; k<=j;k++){
            fact = fact*k;
        }
        double fact2 = fact;
        return fact2;
    }
   awtcalci2(){
        Frame f = new Frame("Calci");
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bpls = new Button("+");
        bmns = new Button("-");
        bmul = new Button("*");
        bdiv = new Button("/");
        bpnt = new Button(".");
        bclr = new Button("clr");
        bbck = new Button("bckspace");
        bexp = new Button("^");
        blog = new Button("log");
        bfct = new Button("!");
        bmod = new Button("| |");
        bpms = new Button("+/-");
        beq = new Button("=");
        l = new Label("0");


        l.setBackground(Color.LIGHT_GRAY);
        l.setBounds(50,50,330,60);
        bpls.setBounds(50,130,50,50);
        blog.setBounds(50,200,50,50);
        bexp.setBounds(50,270,50,50);
        b0.setBounds(50,340,50,120);
        bpms.setBounds(120,410,50,50);
        b1.setBounds(120,340,50,50);
        b4.setBounds(120,270,50,50);
        b7.setBounds(120,200,50,50);
        bmns.setBounds(120,130,50,50);
        bmul.setBounds(190,130,50,50);
        b8.setBounds(190,200,50,50);
        b5.setBounds(190,270,50,50);
        b2.setBounds(190,340,50,50);
        bmod.setBounds(190,410,50,50);
        bpnt.setBounds(260,410,50,50);
        b3.setBounds(260,340,50,50);
        b6.setBounds(260,270,50,50);
        b9.setBounds(260,200,50,50);
        bdiv.setBounds(260,130,50,50);
        bdiv.setBounds(260,130,50,50);
        bclr.setBounds(330,130,50,50);
        bbck.setBounds(330,200,50,50);
        bfct.setBounds(330,270,50,50);
        beq.setBounds(330,340,50,120);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bpls.addActionListener(this);
        bmns.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bpnt.addActionListener(this);
        bclr.addActionListener(this);
        bbck.addActionListener(this);
        bexp.addActionListener(this);
        blog.addActionListener(this);
        bfct.addActionListener(this);
        bmod.addActionListener(this);
        bpms.addActionListener(this);
        beq.addActionListener(this);

        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bpnt);
        f.add(bpms);
        f.add(bmod);
        f.add(bclr);
        f.add(bbck);
        f.add(beq);
        f.add(bpls);
        f.add(bdiv);
        f.add(bmul);
        f.add(bmns);
        f.add(bfct);
        f.add(blog);
        f.add(bexp);
        f.add(l);


        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b0){
            s1 = l.getText();
            s1 = s1 + "0";
            l.setText(s1);
        }
        if(e.getSource() == b1){
            s1 = l.getText();
            s1 = s1 + "1";
            l.setText(s1);
        }
        if(e.getSource() == b2){
            s1 = l.getText();
            s1 = s1 + "2";
            l.setText(s1);
        }
        if(e.getSource() == b3){
            s1 = l.getText();
            s1 = s1 + "3";
            l.setText(s1);
        }
        if(e.getSource() == b4){
            s1 = l.getText();
            s1 = s1 + "4";
            l.setText(s1);
        }
        if(e.getSource() == b5){
            s1 = l.getText();
            s1 = s1 + "5";
            l.setText(s1);
        }
        if(e.getSource() == b6){
            s1 = l.getText();
            s1 = s1 + "6";
            l.setText(s1);
        }
        if(e.getSource() == b7){
            s1 = l.getText();
            s1 = s1 + "7";
            l.setText(s1);
        }
        if(e.getSource() == b8){
            s1 = l.getText();
            s1 = s1 + "8";
            l.setText(s1);
        }
        if(e.getSource() == b9){
            s1 = l.getText();
            s1 = s1 + "9";
            l.setText(s1);
        }
        if(e.getSource() == bpnt){
            s1 = l.getText();
            if(s1.indexOf(".") == -1){
                s1 = s1 + ".";
                l.setText(s1);
            }
        }
        if(e.getSource() == bpms){
            s1 = l.getText();
            if(s1.charAt(0)=='-'){
                s2="";
                for(int i=1; i<s1.length();i++){
                    s2 = s2 + s1.charAt(i);
                }
            }
            else{
                s2 = "-"+s1;
            }
            l.setText(s2);
        }
        if(e.getSource() == bbck){
            s1 = l.getText();
            s2 = "";
            for(int i=0; i<s1.length()-1;i++){
                s2 = s2 + s1.charAt(i);
            }
            l.setText(s2);
        }
        if(e.getSource() == bclr){
            breh = 0;
            num = 0;
            num2 = 0;
            turn = 0;
            l.setText("0");
        }
        if(e.getSource() == bmod){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            d2 = Math.abs(d1);
            s2 = Double.toString(d2);
            l.setText(s2);
        }
        if(e.getSource() == bpls){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            num = d1;
            l.setText("0");
            turn = 1;
        }
        if(e.getSource() == bmns){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            num = d1;
            l.setText("0");
            turn = 2;
        }
        if(e.getSource() == bmul){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            num = d1;
            l.setText("0");
            turn = 3;
        }
        if(e.getSource() == bdiv){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            num = d1;
            l.setText("0");
            turn = 4;
        }
        if(e.getSource() == bexp){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            num = d1;
            l.setText("0");
            turn = 5;
        }
        if(e.getSource() == blog){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            num = d1;
            l.setText("0");
            turn = 6;
        }
        if(e.getSource() == bfct){
            s1 = l.getText();
            d1 = Double.parseDouble(s1);
            d2 = fact(d1);
            s2 = Double.toString(d2);
            l.setText(s2);
        }
        if(e.getSource() == beq){
            s1 = l.getText();
            num2 = Double.parseDouble(s1);
            if(turn == 1){
                breh = num + num2;
            }
            if(turn == 2){
                breh = num - num2;
            }
            if(turn == 3){
                breh = num * num2;
            }
            if(turn == 4){
                breh = num/num2;
            }
            if(turn == 5){
                breh = Math.pow(num, num2);
            }
            if(turn == 6){
                breh = Math.log(num)/Math.log(num2);
            }
            s2 = Double.toString(breh);
            l.setText(s2);

        }
    }
}

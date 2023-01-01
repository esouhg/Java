import java.util.*;


import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class App { 
  Frame f;
  Label custname, token, date, time; //fixed texts on right side of system
  Button idright, itemname, sizeright, crustright, rate; //headings of bill in right side
  TextField custnamee, tokenn, datee, timee; //textfields respectively
  Label idleft, sizeleft, crustleft, quantity; //fixed texts on left side of system
  TextField idleftt, quantitty; //fillable textfield respectively
  Button sizeleftt, crustleftt; //fillable textfield respectively
  Button add, bill, remove; //billing buttons
  Label total, totall, tax, totalwittax, totalwittaxx; //bottom of the system texts
  int rateval;
  int n=0;
  String nameval ="";
  Label l01, l02, l03, l04, l05, l11, l12, l13, l14, l15, l21, l22, l23, l24, l25, l31, l32, l33, l34, l35, l41, l42, l43, l44, l45, l51, l52, l53, l54, l55, l61, l62, l63, l64, l65, l71, l72, l73, l74, l75, l81, l82, l83, l84, l85, l91, l92, l93, l94, l95;
  public static void main(String[] args) throws Exception {
  new App();
  }
  App(){
    //initiating

    f= new Frame("DOMINO'S BILL");
    idleft = new Label("ID:");
    idleftt = new TextField(20);
    sizeleft = new Label("Size:");
    sizeleftt = new Button("Reg");
    crustleft = new Label("Crust:");
    crustleftt = new Button("New Hand Toast");
    quantity = new Label("Quantity");
    quantitty = new TextField("1", 20);
    custname = new Label("CustName:");
    custnamee = new TextField(70);
    token = new Label("Token No:");
    tokenn = new TextField(20);
    date = new Label("Date: ");
    datee = new TextField(70);
    time = new Label("Time: ");
    timee = new TextField(20);
    idright = new Button("ID");
    idright.setBackground(Color.WHITE);
    itemname = new Button("Name(quantity)");
    itemname.setBackground(Color.WHITE);
    sizeright = new Button("Size");
    sizeright.setBackground(Color.WHITE);
    crustright = new Button("Crust");
    crustright.setBackground(Color.WHITE);
    rate = new Button("Rate");
    rate.setBackground(Color.WHITE);
    remove = new Button("Remove");
    bill = new Button("Bill");
    total = new Label("Total: ", Label.RIGHT);
    tax = new Label("Tex: 18%", Label.RIGHT);
    totalwittax = new Label("Total with Tax: ", Label.RIGHT);

    //initiating
    l01 = new Label("");
    l02 = new Label("");
    l03 = new Label("");
    l04 = new Label("");
    l05 = new Label("");
    l11 = new Label("");
    l12 = new Label("");
    l13 = new Label("");
    l14 = new Label("");
    l15 = new Label("");
    l21 = new Label("");
    l22 = new Label("");
    l23 = new Label("");
    l24 = new Label("");
    l25 = new Label("");
    l31 = new Label("");
    l32 = new Label("");
    l33 = new Label("");
    l34 = new Label("");
    l35 = new Label("");
    l41 = new Label("");
    l42 = new Label("");
    l43 = new Label("");
    l44 = new Label("");
    l45 = new Label("");
    l51 = new Label("");
    l52 = new Label("");
    l53 = new Label("");
    l54 = new Label("");
    l55 = new Label("");
    l61 = new Label("");
    l62 = new Label("");
    l63 = new Label("");
    l64 = new Label("");
    l65 = new Label("");
    l71 = new Label("");
    l72 = new Label("");
    l73 = new Label("");
    l74 = new Label("");
    l75 = new Label("");
    l81 = new Label("");
    l82 = new Label("");
    l83 = new Label("");
    l84 = new Label("");
    l85 = new Label("");
    l91 = new Label("");
    l92 = new Label("");
    l93 = new Label("");
    l94 = new Label("");
    l95 = new Label("");


    add = new Button("Add");

    //setting bounds or coordinates
    Panel p1 = new Panel(new GridLayout(4, 2, 0, 10));
    p1.setBounds(40, 50, 270, 120);
    p1.setBackground(Color.LIGHT_GRAY);

    Panel p2 = new Panel(new GridLayout(2, 4, 30, 10));
    p2.setBounds(340, 50, 600, 50);
    p2.setBackground(Color.LIGHT_GRAY);

    Panel p3 = new Panel(new BorderLayout());
    p3.setBounds(40, 130, 270, 200);
    p3.setBackground(Color.LIGHT_GRAY);
    
    
    idright.setBounds(340, 110, 60, 20);
    itemname.setBounds(400, 110, 210, 20);
    sizeright.setBounds(610, 110, 90, 20);
    crustright.setBounds(700, 110, 180, 20);
    rate.setBounds(880, 110, 60, 20);

    
    
    l11.setBounds(345, 130, 55, 20);
    l12.setBounds(405, 130, 205, 20);
    l13.setBounds(615, 130, 85, 20);
    l14.setBounds(705, 130, 175, 20);
    l15.setBounds(885, 130, 55, 20);
    l11.setBackground(Color.LIGHT_GRAY);
    l12.setBackground(Color.LIGHT_GRAY);
    l13.setBackground(Color.LIGHT_GRAY);
    l14.setBackground(Color.LIGHT_GRAY);
    l15.setBackground(Color.LIGHT_GRAY);
    l21.setBounds(345, 150, 55, 20);
    l22.setBounds(405, 150, 205, 20);
    l23.setBounds(615, 150, 85, 20);
    l24.setBounds(705, 150, 175, 20);
    l25.setBounds(885, 150, 55, 20);
    l21.setBackground(Color.LIGHT_GRAY);
    l22.setBackground(Color.LIGHT_GRAY);
    l23.setBackground(Color.LIGHT_GRAY);
    l24.setBackground(Color.LIGHT_GRAY);
    l25.setBackground(Color.LIGHT_GRAY);
    l31.setBounds(345, 170, 55, 20);
    l32.setBounds(405, 170, 205, 20);
    l33.setBounds(615, 170, 85, 20);
    l34.setBounds(705, 170, 175, 20);
    l35.setBounds(885, 170, 55, 20);
    l31.setBackground(Color.LIGHT_GRAY);
    l32.setBackground(Color.LIGHT_GRAY);
    l33.setBackground(Color.LIGHT_GRAY);
    l34.setBackground(Color.LIGHT_GRAY);
    l35.setBackground(Color.LIGHT_GRAY);
    l41.setBounds(345, 190, 55, 20);
    l42.setBounds(405, 190, 205, 20);
    l43.setBounds(615, 190, 85, 20);
    l44.setBounds(705, 190, 175, 20);
    l45.setBounds(885, 190, 55, 20);
    l41.setBackground(Color.LIGHT_GRAY);
    l42.setBackground(Color.LIGHT_GRAY);
    l43.setBackground(Color.LIGHT_GRAY);
    l44.setBackground(Color.LIGHT_GRAY);
    l45.setBackground(Color.LIGHT_GRAY);
    l51.setBounds(345, 210, 55, 20);
    l52.setBounds(405, 210, 205, 20);
    l53.setBounds(615, 210, 85, 20);
    l54.setBounds(705, 210, 175, 20);
    l55.setBounds(885, 210, 55, 20);
    l51.setBackground(Color.LIGHT_GRAY);
    l52.setBackground(Color.LIGHT_GRAY);
    l53.setBackground(Color.LIGHT_GRAY);
    l54.setBackground(Color.LIGHT_GRAY);
    l55.setBackground(Color.LIGHT_GRAY);
    l61.setBounds(345, 230, 55, 20);
    l62.setBounds(405, 230, 205, 20);
    l63.setBounds(615, 230, 85, 20);
    l64.setBounds(705, 230, 175, 20);
    l65.setBounds(885, 230, 55, 20);
    l61.setBackground(Color.LIGHT_GRAY);
    l62.setBackground(Color.LIGHT_GRAY);
    l63.setBackground(Color.LIGHT_GRAY);
    l64.setBackground(Color.LIGHT_GRAY);
    l65.setBackground(Color.LIGHT_GRAY);
    l71.setBounds(345, 250, 55, 20);
    l72.setBounds(405, 250, 205, 20);
    l73.setBounds(615, 250, 85, 20);
    l74.setBounds(705, 250, 175, 20);
    l75.setBounds(885, 250, 55, 20);
    l71.setBackground(Color.LIGHT_GRAY);
    l72.setBackground(Color.LIGHT_GRAY);
    l73.setBackground(Color.LIGHT_GRAY);
    l74.setBackground(Color.LIGHT_GRAY);
    l75.setBackground(Color.LIGHT_GRAY);
    l81.setBounds(345, 270, 55, 20);
    l82.setBounds(405, 270, 205, 20);
    l83.setBounds(615, 270, 85, 20);
    l84.setBounds(705, 270, 175, 20);
    l85.setBounds(885, 270, 55, 20);
    l81.setBackground(Color.LIGHT_GRAY);
    l82.setBackground(Color.LIGHT_GRAY);
    l83.setBackground(Color.LIGHT_GRAY);
    l84.setBackground(Color.LIGHT_GRAY);
    l85.setBackground(Color.LIGHT_GRAY);
    l91.setBounds(345, 270, 55, 20);
    l92.setBounds(405, 270, 205, 20);
    l93.setBounds(615, 270, 85, 20);
    l94.setBounds(705, 270, 175, 20);
    l95.setBounds(885, 270, 55, 20);
    l91.setBackground(Color.LIGHT_GRAY);
    l92.setBackground(Color.LIGHT_GRAY);
    l93.setBackground(Color.LIGHT_GRAY);
    l94.setBackground(Color.LIGHT_GRAY);
    l95.setBackground(Color.LIGHT_GRAY);
    l01.setBounds(345, 290, 55, 20);
    l02.setBounds(405, 290, 205, 20);
    l03.setBounds(615, 290, 85, 20);
    l04.setBounds(705, 290, 175, 20);
    l05.setBounds(885, 290, 55, 20);
    l01.setBackground(Color.LIGHT_GRAY);
    l02.setBackground(Color.LIGHT_GRAY);
    l03.setBackground(Color.LIGHT_GRAY);
    l04.setBackground(Color.LIGHT_GRAY);
    l05.setBackground(Color.LIGHT_GRAY);

    remove.setBounds(345, 320, 100, 20);
    bill.setBounds(450, 320, 100, 20);
    total.setBounds(790, 320, 150, 20);
    tax.setBounds(790, 340, 150, 20);
    totalwittax.setBounds(790, 360, 150, 20);



    PopupMenu sizepop = new PopupMenu();
    PopupMenu crustpop = new PopupMenu();

    MenuItem reg = new MenuItem("Reg");
    MenuItem med = new MenuItem("Med");
    MenuItem large = new MenuItem("Large");
    
    MenuItem newhand = new MenuItem("New Hand Toast");
    MenuItem cheeseburst = new MenuItem("Cheese Burst");
    MenuItem freshpan = new MenuItem("Fresh Pan Pizza");
    MenuItem wheatthin = new MenuItem("100% Wheat Thin Crust");


    sizepop.add(reg);
    sizepop.add(med);
    sizepop.add(large);

    crustpop.add(newhand);
    crustpop.add(cheeseburst);
    crustpop.add(freshpan);
    crustpop.add(wheatthin);

    //adding functions
    sizeleftt.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sizepop.show(sizeleftt, sizeleftt.getWidth(), sizeleftt.getHeight());
      }
    });    
    reg.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sizeleftt.setLabel("Reg");

      }
    });
    med.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sizeleftt.setLabel("Med");

      }
    });
    large.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sizeleftt.setLabel("Large");

      }
    });


    crustleftt.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        crustpop.show(crustleftt, crustleftt.getWidth(), crustleftt.getHeight());

      }
    });
    newhand.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        crustleftt.setLabel("New Hand Toast");
      }
    });
    cheeseburst.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        crustleftt.setLabel("Cheese Burst");
      }
    });
    freshpan.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        crustleftt.setLabel("Fresh Pan Pizza");
      }
    });
    wheatthin.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        crustleftt.setLabel("100% Wheat Thin Crust");
      }
    }); 

    add.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String sizeval = sizeleftt.getLabel();
        String crustval = crustleftt.getLabel();
        int idval = Integer.parseInt(idleftt.getText());
    
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
      }
      catch(ClassNotFoundException e){
          e.printStackTrace();
      }
      String url = "jdbc:mysql://localhost:3306/lmao";
      String uname = "root";
      String password = "groot";
      String query = "select name, rate from items where id ="+idval;
      try{
          Connection con = DriverManager.getConnection(url, uname, password);
          Statement stmt = con.createStatement();
          ResultSet result = stmt.executeQuery(query);
          while(result.next()){
            nameval = result.getString(1);
            rateval = Integer.parseInt(result.getString(2));
          }
          if(idval<=29 && idval >=19){
            sizeval = "Reg";
          }
          if(idval>46){
            sizeval = "";
            crustval = "";
          }
          if(sizeval == "Reg" && !(idval<=29 && idval >=19)){
            if(crustval=="100% Wheat Thin Crust" || crustval == "Fresh Pan Pizza"){
              rateval = rateval + 30;
            }
            else if(crustval == "Cheese Burst"){
              rateval = rateval+60;
            }
          }
          if(sizeval == "Med" ){
            rateval = (int) ((rateval*1.8) - ((rateval*1.8)%10));
            if(crustval=="100% Wheat Thin Crust" || crustval == "Fresh Pan Pizza"){
              rateval = rateval + 50;
            }
            else if(crustval == "Cheese Burst"){
              rateval = rateval+100;
            }
          }
          if(sizeval == "Large"){
            if(rateval>300){
              rateval = (int) ((rateval*2.7) - ((rateval*2.7)%10));
            }
            if(rateval>250 && rateval<=300){
              rateval = (int) ((rateval*2.7) - ((rateval*2.7)%10));
            }
            if(rateval>150 && rateval<=250){
              rateval = (int) ((rateval*3) - ((rateval*3)%10));
            }
            if(rateval>100 && rateval<=150){
              rateval = (int) ((rateval*4) - ((rateval*4)%10));
            }
            crustval = "New Hand Toast";
          }
          nameval = nameval + " (" + quantitty.getText()+")";
          rateval = rateval*(Integer.parseInt(quantitty.getText()));
          if(n==0){
          l11.setText(""+idval);
          l12.setText(nameval);
          l13.setText(sizeval);
          l14.setText(crustval);
          l15.setText(""+rateval);
          }
          if(n==1){
          l21.setText(""+idval);
          l22.setText(nameval);
          l23.setText(sizeval);
          l24.setText(crustval);
          l25.setText(""+rateval);
          }
          if(n==2){
          l31.setText(""+idval);
          l32.setText(nameval);
          l33.setText(sizeval);
          l34.setText(crustval);
          l35.setText(""+rateval);
          }
          if(n==3){
          l41.setText(""+idval);
          l42.setText(nameval);
          l43.setText(sizeval);
          l44.setText(crustval);
          l45.setText(""+rateval);
          }
          if(n==4){
          l51.setText(""+idval);
          l52.setText(nameval);
          l53.setText(sizeval);
          l54.setText(crustval);
          l55.setText(""+rateval);
          }
          if(n==5){
          l61.setText(""+idval);
          l62.setText(nameval);
          l63.setText(sizeval);
          l64.setText(crustval);
          l65.setText(""+rateval);
          }
          if(n==6){
          l71.setText(""+idval);
          l72.setText(nameval);
          l73.setText(sizeval);
          l74.setText(crustval);
          l75.setText(""+rateval);
          }
          if(n==7){
          l81.setText(""+idval);
          l82.setText(nameval);
          l83.setText(sizeval);
          l84.setText(crustval);
          l85.setText(""+rateval);
          }
          if(n==8){
          l91.setText(""+idval);
          l92.setText(nameval);
          l93.setText(sizeval);
          l94.setText(crustval);
          l95.setText(""+rateval);
          }
          if(n==9){
          l01.setText(""+idval);
          l02.setText(nameval);
          l03.setText(sizeval);
          l04.setText(crustval);
          l05.setText(""+rateval);
          }
          if(n<10){
          n=n+1;
          }

      }
      catch(Exception e){
          e.printStackTrace();
      }

      }
    });

    remove.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        
        if(n==1){
          l11.setText("");
          l12.setText("");
          l13.setText("");
          l14.setText("");
          l15.setText("");
          }
        if(n==2){
          l21.setText("");
          l22.setText("");
          l23.setText("");
          l24.setText("");
          l25.setText("");
          }
        if(n==3){
          l31.setText("");
          l32.setText("");
          l33.setText("");
          l34.setText("");
          l35.setText("");
          }
        if(n==4){
          l41.setText("");
          l42.setText("");
          l43.setText("");
          l44.setText("");
          l45.setText("");
          }
        if(n==5){
          l51.setText("");
          l52.setText("");
          l53.setText("");
          l54.setText("");
          l55.setText("");
          }
        if(n==6){
          l61.setText("");
          l62.setText("");
          l63.setText("");
          l64.setText("");
          l65.setText("");
          }
        if(n==7){
          l71.setText("");
          l72.setText("");
          l73.setText("");
          l74.setText("");
          l75.setText("");
          }
        if(n==8){
          l81.setText("");
          l82.setText("");
          l83.setText("");
          l84.setText("");
          l85.setText("");
          }
        if(n==9){
          l91.setText("");
          l92.setText("");
          l93.setText("");
          l94.setText("");
          l95.setText("");
          }
        if(n==10){
          l01.setText("");
          l02.setText("");
          l03.setText("");
          l04.setText("");
          l05.setText("");
          }
        if(n>0){
          n=n-1;
        }

      }
    });


    bill.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        int sum = 0;
        
        if(n>=1){
          sum = sum + Integer.parseInt(l15.getText());
          }
        if(n>=2){
          sum = sum + Integer.parseInt(l25.getText());
          }
        if(n>=3){
          sum = sum + Integer.parseInt(l35.getText());
          }
        if(n>=4){
          sum = sum + Integer.parseInt(l45.getText());
          }
        if(n>=5){
          sum = sum + Integer.parseInt(l55.getText());
          }
        if(n>=6){
          sum = sum + Integer.parseInt(l65.getText());
          }
        if(n>=7){
          sum = sum + Integer.parseInt(l75.getText());
          }
        if(n>=8){
          sum = sum + Integer.parseInt(l85.getText());
          }
        if(n>=9){
          sum = sum + Integer.parseInt(l95.getText());
          }
        if(n==10){
          sum = sum + Integer.parseInt(l05.getText());
          }
        total.setText("Total: "+sum);
        int sum2 = (int) (sum + sum*0.18);
        totalwittax.setText("Total with tax: "+ sum2);

      }
    });
    //finally adding stuffs
    p1.add(idleft);
    p1.add(idleftt);
    p1.add(sizeleft);
    p1.add(sizeleftt);
    p1.add(crustleft);
    p1.add(crustleftt);
    p1.add(quantity);
    p1.add(quantitty);
    f.add(p1);
    p2.add(custname);
    p2.add(custnamee);
    p2.add(date);
    p2.add(datee);
    p2.add(token);
    p2.add(tokenn);
    p2.add(time);
    p2.add(timee);
    p3.add(add, BorderLayout.SOUTH);
    f.add(sizepop);
    f.add(crustpop);
    f.add(idright);
    f.add(itemname);
    f.add(sizeright);
    f.add(crustright);
    f.add(rate);
    f.add(p2);
    f.add(p3);
    //f.add(p4);
    f.add(l11);
    f.add(l12);
    f.add(l13);
    f.add(l14);
    f.add(l15);
    f.add(l21);
    f.add(l22);
    f.add(l23);
    f.add(l24);
    f.add(l25);
    f.add(l31);
    f.add(l32);
    f.add(l33);
    f.add(l34);
    f.add(l35);
    f.add(l41);
    f.add(l42);
    f.add(l43);
    f.add(l44);
    f.add(l45);
    f.add(l51);
    f.add(l52);
    f.add(l53);
    f.add(l54);
    f.add(l55);
    f.add(l61);
    f.add(l62);
    f.add(l63);
    f.add(l64);
    f.add(l65);
    f.add(l71);
    f.add(l72);
    f.add(l73);
    f.add(l74);
    f.add(l75);
    f.add(l81);
    f.add(l82);
    f.add(l83);
    f.add(l84);
    f.add(l85);
    f.add(l91);
    f.add(l92);
    f.add(l93);
    f.add(l94);
    f.add(l95);
    f.add(l01);
    f.add(l02);
    f.add(l03);
    f.add(l04);
    f.add(l05);
    f.add(remove);
    f.add(bill);
    f.add(total);
    f.add(totalwittax);
    f.add(tax);

    f.setSize(980,400);
    f.setLayout(null);
    f.setVisible(true);
}
}

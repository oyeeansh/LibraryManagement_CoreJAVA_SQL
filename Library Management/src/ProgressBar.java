import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBar extends JFrame  {
    JProgressBar jb;
    JLabel top, bookid, iconnn,extra;
    int i=0,num=0;

    ProgressBar(){
        top = new JLabel("Welcome To Library");
        bookid= new JLabel("Loading DASHBOARD , Please Wait");
        extra = new JLabel();



        jb=new JProgressBar(0,500);
        jb.setBounds(150,250,160,30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        jb.setBackground(Color.white);
        jb.setForeground(Color.black);
        setSize(250,150);
        setLayout(null);





        iconnn= new JLabel();
        iconnn.setIcon(new ImageIcon("picture\\icon33.png"));
        add(iconnn);
        iconnn.setBounds(200,0,230,140);

        add(top);
        top.setBounds(130,130,400,30);
        top.setForeground(Color.black);
        top.setFont(new Font("Verdana", Font.BOLD, 20));

        add(bookid);
        bookid.setForeground(Color.black);
        bookid.setBounds(40,180,450,30);
        bookid.setFont(new Font("Verdana", Font.BOLD, 20));

        add(extra);
        extra.setBounds(35,140,150,30);





        getContentPane().setBackground(Color.pink);
        setTitle("MODEL BANK - Transaction");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(500,400);

    }
    public void iterate(){
        while(i<=2000){
            jb.setValue(i);
            if (i==500){
                dispose();
                DashBoard1 j = new DashBoard1();
                j.setVisible(true);
                break;

            }
            i=i+10;
            try{Thread.sleep(110);}catch(Exception e){}
        }


    }


    public static void main(String[] args)  {
        ProgressBar m=new ProgressBar();
        m.setVisible(true);
        m.iterate();


    }
}

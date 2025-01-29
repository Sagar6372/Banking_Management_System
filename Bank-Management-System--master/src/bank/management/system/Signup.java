package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,M1,M2,M3;
    JButton next;
    JTextField textName,textFname,textEmail,textAdd,textPin,textCity,textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first = "" + Math.abs(first4);
    Signup(){
        setTitle("APPLICATION FORM - PAGE 1");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." +first);
        label1.setBounds(160 ,20 ,600 ,40);
        label1.setFont(new Font("Raleways",Font.BOLD,33));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,60,600,30);
        label2.setFont(new Font("Raleways",Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Raleways",Font.BOLD,22));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100,160,100,30);
        labelName.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleways",Font.BOLD,14));
        textName.setBounds(300,160,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setBounds(100,210,200,30);
        labelfName.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleways",Font.BOLD,14));
        textFname.setBounds(300,210,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth");
        DOB.setBounds(100,310,200,30);
        DOB.setFont(new Font("Raleways",Font.BOLD,20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,310,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setBounds(100,260,200,30);
        labelG.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBounds(300,260,60,30);
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("Raleways",Font.BOLD,14));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450,260,90,30);
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleways",Font.BOLD,14));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setBounds(100,360,200,30);
        labelEmail.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleways",Font.BOLD,14));
        textEmail.setBounds(300,360,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setBounds(100,410,200,30);
        labelMs.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelMs);

        M1 = new JRadioButton("Married");
        M1.setBounds(300,410,100,30);
        M1.setBackground(new Color(222,255,228));
        M1.setFont(new Font("Raleways",Font.BOLD,14));
        add(M1);

        M2 = new JRadioButton("UnMarried");
        M2.setBounds(450,410,100,30);
        M2.setBackground(new Color(222,255,228));
        M2.setFont(new Font("Raleways",Font.BOLD,14));
        add(M2);

        M3 = new JRadioButton(" Other");
        M3.setBounds(635,410,100,30);
        M3.setBackground(new Color(222,255,228));
        M3.setFont(new Font("Raleways",Font.BOLD,14));
        add(M3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(M1);
        buttonGroup1.add(M2);
        buttonGroup1.add(M3);


        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setBounds(100,460,200,30);
        labelAdd.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleways",Font.BOLD,14));
        textAdd.setBounds(300,460,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(100,510,200,30);
        labelCity.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleways",Font.BOLD,14));
        textCity.setBounds(300,510,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setBounds(100,560,200,30);
        labelPin.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleways",Font.BOLD,14));
        textPin.setBounds(300,560,400,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setBounds(100,610,200,30);
        labelState.setFont(new Font("Raleways",Font.BOLD,20));
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleways",Font.BOLD,14));
        textState.setBounds(300,610,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleways",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(420,650,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850 , 800);
        setLocation(360 , 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(M1.isSelected()){
            marital = "Married";
        } else if (M2.isSelected()) {
            marital = "Unmarried";
        } else if (M3.isSelected()) {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pin = textPin.getText();
        String state = textState.getText();
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Conn con = new Conn();
                String p = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                new Signup2 (formno).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup();
    }

}

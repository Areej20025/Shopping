/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author 96653
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shopping extends JFrame {
    public static JCheckBox cb1, cb2, cb3;
    static JLabel l, l1;
    static JComboBox wood;

    public static void main(String args[]) {
        final JFrame frame = new JFrame("carpentry shop");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 1000);
        frame.setLayout(null);
        frame.setVisible(true);

        //username
        final JLabel label = new JLabel("Name:");
        frame.add(label);
        label.setBounds(200, 50, 100, 30);

        final JTextField a = new JTextField("");
        frame.add(a);
        a.setBounds(300, 50, 300, 30);

        //password
        final JLabel label2 = new JLabel("Password:");
        frame.add(label2);
        label2.setBounds(200, 100, 100, 30);

        final JTextField b = new JTextField("");
        frame.add(b);
        b.setBounds(300, 100, 300, 30);

        //phone number
        final JLabel label3 = new JLabel("Phone number:");
        frame.add(label3);
        label3.setBounds(200, 150, 100, 30);

        final JTextField c = new JTextField("");
        frame.add(c);
        c.setBounds(300, 150, 300, 30);

        //email
        final JLabel label4 = new JLabel("E-mail:");
        frame.add(label4);
        label4.setBounds(200, 200, 100, 30);

        final JTextField d = new JTextField("");
        frame.add(d);
        d.setBounds(300, 200, 300, 30);

        //room size
        final JLabel label5 = new JLabel("Room size:");
        frame.add(label5);
        label5.setBounds(200, 250, 100, 30);
        //height room
        final JTextField f1 = new JTextField("");
        frame.add(f1);
        f1.setBounds(300, 300, 50, 30);

        final JLabel label6 = new JLabel("Height:");
        frame.add(label6);
        label6.setBounds(250, 300, 100, 30);

        //width room
        final JTextField f2 = new JTextField("");
        frame.add(f2);
        f2.setBounds(400, 300, 50, 30);

        final JLabel label7 = new JLabel("Width:");
        frame.add(label7);
        label7.setBounds(360, 300, 100, 30);

        //length room
        final JTextField f3 = new JTextField("");
        frame.add(f3);
        f3.setBounds(500, 300, 50, 30);

        final JLabel label8 = new JLabel("Length:");
        frame.add(label8);
        label8.setBounds(455, 300, 50, 30);

        //closet space
        final JTextField closetSpace = new JTextField("");
        frame.add(closetSpace);
        closetSpace.setBounds(310, 350, 100, 30);

        final JLabel label10 = new JLabel("Closet Space (mÂ²):");
        frame.add(label10);
        label10.setBounds(200, 350, 200, 30);

        //Types of drawers:
        JLabel label12 = new JLabel("Types of drawers:");
        frame.add(label12);
        label12.setBounds(100, 400, 150, 30);

        cb1 = new JCheckBox("Drawers for hanging clothes");
        frame.add(cb1);
        cb1.setBounds(250, 410, 150, 20);
        cb2 = new JCheckBox("Drawers to arrange clothes");
        frame.add(cb2);
        cb2.setBounds(250, 440, 150, 20);
        cb3 = new JCheckBox("pull inserts");
        frame.add(cb3);
        cb3.setBounds(250, 470, 150, 20);

                // coior
                 final JLabel labeC = new JLabel("select color:");
                frame.add(labeC);
                labeC.setBounds(480,400,300,10);
                final JRadioButton white = new JRadioButton( "white");
                final JRadioButton brouwn  = new JRadioButton("brouwn");
                final JRadioButton green = new JRadioButton("gree");
                final JRadioButton blue = new JRadioButton("blue");
                                ButtonGroup ve=new ButtonGroup();

                       white.setSelected(true);
                       brouwn.setSelected(false);
                       green.setSelected(false);
                       blue.setSelected(false);
                       ve.add(white);
                       ve.add(brouwn);
                       ve.add(green);
                       ve.add(blue);
            
               frame.add(white);
               frame.add(brouwn);
               frame.add(green);
               frame.add(blue);
             
               white.setBounds(580, 410, 300, 15);
               brouwn.setBounds(580, 440, 350, 15);
               green.setBounds(580, 470, 400, 15);
               blue.setBounds(580, 500, 450, 15);
               
               //wood type:
               String list[] = { "Oak","Pine","Rosewood","Redwood","Spruce","Fir","Hemlock","Poplar","Sycamore","Alder"};
               wood = new JComboBox(list);
               frame.add(wood);
               wood.setBounds(250, 570, 150, 20);  
               l = new JLabel("select your wood type choice:");
               frame.add(l);
               l.setBounds(100,540,200,10); 

               
                 // payment  
                final JLabel labePay = new JLabel(" choos the payment  :");
                frame.add(labePay);
               labePay.setBounds(450,580,300,10);
                    ButtonGroup ve1=new ButtonGroup();
                    final JRadioButton pay1= new JRadioButton( " payment by paypal      ");
                   final JRadioButton  pay2  = new JRadioButton("payment by visa card    ");

                       pay1.setSelected(true);
                       pay2.setSelected(false);
                       ve1.add(pay1);
                       ve1.add(pay2);
               frame.add(pay1);
               frame.add(pay2);
         pay1.setBounds(580, 580, 300, 15);
         pay2.setBounds(580, 610, 350, 15);

         
    //calculate button
        final JButton submit = new JButton("Calculate Price");
        frame.add(submit);
        submit.setBounds(300, 700, 150, 30);

        //result label
        l1 = new JLabel("");
        frame.add(l1);
        l1.setBounds(300, 750, 300, 30);

        
submit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String username = a.getText();
        String password = b.getText();
        String phone = c.getText();
        String email = d.getText();
        double height = Double.parseDouble(f1.getText());
        double width = Double.parseDouble(f2.getText());
        double length = Double.parseDouble(f3.getText());
        double closet = Double.parseDouble(closetSpace.getText());
        String woodType = (String) wood.getSelectedItem(); // 

        // calculate the price based on the user inputs
        double size = height * width * length;
        double pricePerSquareMeter = 100; // assume a price of 100 per square meter
        double totalPrice = size * pricePerSquareMeter + closet * 30; // assume a price of 50 per square meter for closet space

        
        String paymentMethod = "";
if (pay1.isSelected()) {
    paymentMethod = "PayPal";
} else if (pay2.isSelected()) {
    paymentMethod = "Visa Card";
}


String color = "";
if (white.isSelected()) {
    color = "white";
} else if (brouwn.isSelected()) {
    color = "brouwn";
} else if (green.isSelected()) {
    color = "green";
} else if (blue.isSelected()) {
    color = "blue";
}

JOptionPane.showMessageDialog(null, "User Input: \n"+ "\n" +"username:  "+ username + "\n"
        +"password: "+ password + "\n" +"phone:  "+ phone + "\n" +"email:  " +email + "\n" + 
                "Room size:  " + size + " mÂ²" + "\n" + "Closet space:  " + closet + " mÂ²" + 
                        "\n" + "Wood type: " + woodType + "\n" + "Color:  " + color + "\n" + 
                                "Choose the payment option:  " + paymentMethod + "\n" + "Total price:  "+"\n"+"-----------------\n"+"$ "+totalPrice);   
    }});}}

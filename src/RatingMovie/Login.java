/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RatingMovie;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

        public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI extends JFrame {
   //untuk log in aku gabuat database/syarat harus gimana, jadi masukin apa aja terserah
    
   final JTextField fusername = new JTextField(10);
   final JPasswordField fpassword = new JPasswordField(10);
   JLabel lusername = new JLabel(" Username ");
   JLabel lpassword = new JLabel(" Password ");
   JButton btnSave = new JButton("Login");
   JButton btnCancel = new JButton("Cancel");

public GUI() {
    setTitle("LOGIN");
    setDefaultCloseOperation(3);
    setSize(330,175);
    setLocation(792,450);
    setLayout(null);
        
    add(lusername);
    lusername.setBounds(10,15,120,20);
    add(fusername);
    fusername.setBounds(140,15,150,20);
    add(lpassword);
    lpassword.setBounds(10,40,120,20);
    add(fpassword);
    fpassword.setBounds(140,40,150,20);
    add(btnSave);
    btnSave.setBounds(165,80,100,20);
    add(btnCancel);
    btnCancel.setBounds(50,80,100,20);
        
    btnSave.addActionListener(new ActionListener(){     
        @Override
        public void actionPerformed(ActionEvent e){
            if(fusername.getText().length()>0){
                JOptionPane.showMessageDialog(null, "Selamat Login Anda Sukses");
                MVC_RatingMovie mvcp = new MVC_RatingMovie();
            } dispose();
        }
    }); setVisible(true);
}}
    

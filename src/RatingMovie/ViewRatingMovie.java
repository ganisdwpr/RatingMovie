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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewRatingMovie extends JFrame{
    
   JTable tabel;
   DefaultTableModel tableModel;
   JScrollPane scrollPane;
   Object namaKolom[] = {"#", "ID", "Judul", "Tipe", "Episode", "Genre", "Status", "Rating"};
   
   JLabel lTitle = new JLabel ("Rating Movie");
   JTextField tfNo = new JTextField(); 
   JLabel lID = new JLabel("ID");
   JTextField tfID = new JTextField();
   JLabel lJudul= new JLabel("Judul");
   JTextField tfJudul = new JTextField();
   JLabel lTipe = new JLabel("Tipe");
   JTextField tfTipe = new JTextField();
   JLabel lStatus = new JLabel("Status");
   String[] namaStatus =
        {" Selesai", " Belum"};
   JComboBox cmbStatus = new JComboBox(namaStatus);
   JLabel lEpisode = new JLabel("Episode");
   JTextField tfEpisode = new JTextField();
   JLabel lRating = new JLabel("Rating");
   JTextField tfRating = new JTextField();
   JLabel lGenre = new JLabel("Genre");
   JTextField tfGenre = new JTextField();
   JButton btnSearch = new JButton("Search");
   JTextField tfSearch = new JTextField();
   JButton btnRefershPanel = new JButton("Refesh");
   JButton btnCreatePanel = new JButton("Create");
   JButton btnUpdatePanel = new JButton("Update");
   JButton btnDeletePanel = new JButton("Delete");
   JButton btnExitPanel = new JButton("Exit");
   
public ViewRatingMovie(){
      
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setLayout(null);
    setSize(1135, 365);
    setLocation(400, 350);
     
    add(lTitle);     
    lTitle.setBounds(480, 15, 900, 40);
    lTitle.setFont(new Font("Blackadder ITC",Font.BOLD, 30));
    add(lID);
    lID.setBounds(10, 50, 90, 20);
    add(tfID);
    tfID.setBounds(10, 70, 260, 20);
    add(lJudul);
    lJudul.setBounds(10, 100, 90, 20);
    add(tfJudul);
    tfJudul.setBounds(10, 120, 260, 20);
    add(lTipe);
    lTipe.setBounds(10, 150, 90, 20);
    add(tfTipe);
    tfTipe.setBounds(10, 170, 120, 20);
    add(lStatus);
    lStatus.setBounds(150, 150, 120, 20);
    add(cmbStatus);
    cmbStatus.setBounds(150, 170, 120, 20);
    add(lEpisode);
    lEpisode.setBounds(10, 200, 90, 20);
    add(tfEpisode);
    tfEpisode.setBounds(10, 220, 120, 20);
    add(lRating);
    lRating.setBounds(150, 200, 120, 20);
    add(tfRating);
    tfRating.setBounds(150, 220, 120, 20);
    add(lGenre);
    lGenre.setBounds(10, 250, 90, 20);
    add(tfGenre);
    tfGenre.setBounds(10, 270, 260, 20);
    add(btnSearch);
    btnSearch.setBounds(1017, 40, 80, 19);
    add(tfSearch);
    tfSearch.setBounds(808, 40, 200, 20);
    add(btnRefershPanel);
    btnRefershPanel.setBounds(295, 70, 80, 20);
    add(btnCreatePanel);
    btnCreatePanel.setBounds(295, 120, 80, 20);
    add(btnUpdatePanel);
    btnUpdatePanel.setBounds(295, 170, 80, 20);
    add(btnDeletePanel);
    btnDeletePanel.setBounds(295, 220, 80, 20);
    add(btnExitPanel);
    btnExitPanel.setBounds(295, 270, 80, 20);
    
    tableModel = new DefaultTableModel (namaKolom,0);
    tabel = new JTable(tableModel);
    scrollPane = new JScrollPane(tabel);
    
    add(scrollPane);
    scrollPane.setBounds(400, 70, 700, 220);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       
    btnExitPanel.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            dispose();
        }
   }); setVisible(true);
}
   
    public String getID(){
       return tfID.getText();
    }
    public String getJudul(){
       return tfJudul.getText();
    }
    public String getTipe(){
       return tfTipe.getText();
    }
    public String getEpisode(){
       return tfEpisode.getText();
    }
    public String getGenre(){
       return tfGenre.getText();
    }
    public String getStatus(){
       return (String) cmbStatus.getSelectedItem();
    }
    public String getRating(){
       return tfRating.getText();
    }
    public String getSearch(){
       return tfSearch.getText();
    }
}

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ControllerRatingMovie {
    ModelRatingMovie modelRatingmovie;
    ViewRatingMovie viewRatingmovie;
    
    public ControllerRatingMovie(ModelRatingMovie modelRatingmovie, ViewRatingMovie viewRatingmovie){
        this.modelRatingmovie = modelRatingmovie;
        this.viewRatingmovie = viewRatingmovie;
        
        if(modelRatingmovie.getBanyakData() !=0){
           String dataMovie[][]= modelRatingmovie.readMovie();
           viewRatingmovie.tabel.setModel((new JTable(dataMovie, viewRatingmovie.namaKolom)).getModel());
        }
        else{
            JOptionPane.showMessageDialog(null,"Data Tidak ada");          
        }
        
    viewRatingmovie.btnCreatePanel.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if ( viewRatingmovie.getID().equals("")
                    || viewRatingmovie.getJudul().equals("")
                    || viewRatingmovie.getTipe().equals("")
                    || viewRatingmovie.getEpisode().equals("")
                    || viewRatingmovie.getGenre().equals("")
                    || viewRatingmovie.getStatus().equals("")
                    || viewRatingmovie.getRating().equals("")){
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
            }else{
                String id = viewRatingmovie.getID();
                String judul = viewRatingmovie.getJudul();
                String tipe = viewRatingmovie.getTipe();
                String episode = viewRatingmovie.getEpisode();
                String genre = viewRatingmovie.getGenre();
                String status = viewRatingmovie.getStatus();
                String rating = viewRatingmovie.getRating();
                modelRatingmovie.createMovie(id, judul, tipe, episode, genre, status, rating);
                    
                String dataFilm[][] = modelRatingmovie.readMovie();
                viewRatingmovie.tabel.setModel(new JTable (dataFilm, viewRatingmovie.namaKolom).getModel());
            }   
        }
    }); 
        
   viewRatingmovie.btnRefershPanel.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String dataFilm[][] = modelRatingmovie.readMovie();
            viewRatingmovie.tabel.setModel(new JTable (dataFilm, viewRatingmovie.namaKolom).getModel());   
            viewRatingmovie.tfID.setText(null);
            viewRatingmovie.tfJudul.setText(null);
            viewRatingmovie.tfTipe.setText(null);
            viewRatingmovie.tfEpisode.setText(null);
            viewRatingmovie.tfGenre.setText(null);
            viewRatingmovie.tfRating.setText(null);
            viewRatingmovie.cmbStatus.setSelectedItem(this);
            viewRatingmovie.tfSearch.setText(null);
        }
    });
        
    viewRatingmovie.btnSearch.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String getSearch= viewRatingmovie.getSearch();
            String dataFilm[][] = modelRatingmovie.searchMovie(getSearch);
                viewRatingmovie.tabel.setModel(new JTable (dataFilm, viewRatingmovie.namaKolom).getModel());
            }
    }); 

    viewRatingmovie.tabel.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            int baris = viewRatingmovie.tabel.getSelectedRow();
            int kolom = viewRatingmovie.tabel.getSelectedColumn();
            String dataterpilih = viewRatingmovie.tabel.getValueAt(baris, 0).toString();
            System.out.println(dataterpilih);
        
            String id = viewRatingmovie.tabel.getValueAt(baris, 1).toString();
            viewRatingmovie.tfID.setText(id);
            String judul = viewRatingmovie.tabel.getValueAt(baris, 2).toString();
            viewRatingmovie.tfJudul.setText(judul);
            String tipe = viewRatingmovie.tabel.getValueAt(baris, 3).toString();
            viewRatingmovie.tfTipe.setText(tipe);
            String episode = viewRatingmovie.tabel.getValueAt(baris, 4).toString();
            viewRatingmovie.tfEpisode.setText(episode);
            String genre = viewRatingmovie.tabel.getValueAt(baris, 5).toString();
            viewRatingmovie.tfGenre.setText(genre);
            String status = viewRatingmovie.tabel.getValueAt(baris, 6).toString();
            viewRatingmovie.cmbStatus.setSelectedItem(status);
            String rating = viewRatingmovie.tabel.getValueAt(baris, 7).toString();
            viewRatingmovie.tfRating.setText(rating);
                
    viewRatingmovie.btnUpdatePanel.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){ 
                 String id = dataterpilih;
                    
                    String judul = viewRatingmovie.getJudul();
                    String tipe = viewRatingmovie.getTipe();
                    String episode = viewRatingmovie.getEpisode();
                    String genre = viewRatingmovie.getGenre();
                    String status = viewRatingmovie.getStatus();
                    String rating = viewRatingmovie.getRating();
                    modelRatingmovie.UpdateMovie( id,judul, tipe, episode, genre, status,rating);
                

                String dataFilm[][]= modelRatingmovie.readMovie();
                viewRatingmovie.tabel.setModel(new JTable(dataFilm, viewRatingmovie.namaKolom).getModel());

     }
        });
        
    viewRatingmovie.btnDeletePanel.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){    
            modelRatingmovie.deleteMovie(dataterpilih);
            String dataFilm[][]= modelRatingmovie.readMovie();
            viewRatingmovie.tabel.setModel(new JTable(dataFilm, viewRatingmovie.namaKolom).getModel());
        }
    });
  }});
}}
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
public class MVC_RatingMovie {
    
    ViewRatingMovie viewRatingmovie = new ViewRatingMovie();
    ModelRatingMovie modelRatingmovie = new ModelRatingMovie();
    ControllerRatingMovie controllerDaftarfilm = new ControllerRatingMovie(modelRatingmovie, viewRatingmovie);
}

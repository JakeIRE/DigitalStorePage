/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeinfo;

import DBHandler.DBWriter;
import DBHandler.RepositoryAccess;
import DBHandler.RepositoryAccessMethodFactory;
import DBHandler.RepositoryWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jakec
 */
public class MovieStorePageInfo implements StoreListing {
    
    private int movieID;
    private int ageRating;
    private String movieName;
    private String description;
    private int runtime;
    private double price;
    private List<String> genres;
    private int publisherID;
    
    public MovieStorePageInfo(int movieID){
        this.movieID = movieID;
        genres = new ArrayList<String>();
    }

    public MovieStorePageInfo(String name, double price, int ageRating, String genre, String desc, int runtime) {
        this.movieName = name;
        this.price = price;
        this.ageRating = ageRating;
        genres = new ArrayList<String>();
        genres.add(genre);
        this.description = desc;
        this.runtime= runtime;
    }
    
    public void setAgeRating(int ageRating){
        this.ageRating = ageRating;
    }
    
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setGenre(String... genre){
        for(String newGenre : genre){
            this.genres.add(newGenre);
        }
    }
    
    public void setRuntime(int runtime){
        this.runtime = runtime;
    }
    
    @Override
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String displayStorePage() {
        String listing = "";
        listing += "Name: "+movieName+"<br/>Description: "+description+"<br/>Price: "+
                price+"<br/>Runtime: "+runtime+"<br/>Age Rating: "+ageRating;
        return listing;
    }

    @Override
    public String displayListing() {
        String listing = "";
        listing += movieName+"\t"+description+"\t"+price;
        return listing;
    }

    
    @Override
    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    @Override
    public String getName() {
        return movieName;
    }

    @Override
    public int getProductID(){
        return movieID;
    }
    @Override
    public int addToRepo() {
        RepositoryAccessMethodFactory rf = new RepositoryAccessMethodFactory(); 
        RepositoryWriter w = rf.getRepoWriter();
        if(w.insertNewMovie(movieID, movieName, price, ageRating, description, runtime, genres.get(genres.size()-1), publisherID)){
            
         RepositoryAccess ra =  rf.getRepoAccess();
            return ra.getGameID(publisherID);
        } else{
           return -1;
        }
    }

    @Override
    public void setID(int id) {
        this.movieID = id;
    }
}

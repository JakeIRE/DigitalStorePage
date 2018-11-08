/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import StoreInfo.StoreListing;
import StoreInfo.StoreListingFactory;
import java.io.File;
import java.util.List;

/**
 *
 * @author jakec
 */
public class PublisherUIHandler {
    
    int publisherID;
    
    public PublisherUIHandler(int publisherID){
        this.publisherID = publisherID;
    }
    
    public Object[][] getAllProductListingByPublisher(int publisherID) {
        List<StoreListing> storeListingList = StoreListingFactory.getAllbyPublisher(publisherID);
        Object[][] storeListingArr = new Object[storeListingList.size()][3];

        for (int i = 0; i < storeListingArr.length; i++) {
            String tempListing = storeListingList.get(i).displayListing();
            String[] splitListing = tempListing.split("\t");
            storeListingArr[i][0] = splitListing[0];
            storeListingArr[i][1] = splitListing[1];
            storeListingArr[i][2] = Double.parseDouble(splitListing[2]);
        }
        return storeListingArr;
    }
    
    public String verifyGameDataInput(String name, String price, String ageRating, String genre,String desc, String minSpecs, String file){
        String error = "";
        /*if(!name.matches("^[a-z0-9_ -]") && name.length() <= 0){
            error +="\n Game name incorrect";
        }
        if(!price.matches("[0-9]+.?[0-9]{2}$") && price.length() > 0){
            error +="\n Input valid Price";
        }
        if(!ageRating.matches("[0-9]+") && ageRating.length() > 0){
            error +="\n Input valid age";
        }
        if(!genre.matches("[a-zA-Z]+") && genre.length() > 0){
            error +="\n Input valid genre";
        }
        if(desc.length() > 0){
            error +="\n Input description";
        }
        if(minSpecs.length() <= 0){
            error +="\n Input minimum specs";
        }
            File checkFile = new File(file);
            if(!checkFile.exists()){
                error += "\n File not found";
            }*/
        return error;
    }

    public int getID() {
        return publisherID;
    }
}
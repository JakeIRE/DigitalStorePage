/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeinfo;

/**
 *
 * @author jakec
 */
public interface StoreListing {
    String displayStorePage();
    String displayListing();
    String getName();
    int getProductID();
    void setPrice(double updatedPrice);
    int addToRepo();

    public void setPublisherID(int id);

    public void setID(int id);
}

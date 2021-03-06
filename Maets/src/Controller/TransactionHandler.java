package Controller;


import DBHandler.DBWriter;
import DBHandler.RepositoryAccess;
import DBHandler.RepositoryAccessMethodFactory;
import DBHandler.RepositoryWriter;
import org.json.JSONArray;
import org.json.JSONObject;

public class TransactionHandler {

    private RepositoryAccess rA;
    private RepositoryWriter dbWriter;
    private UIHandler uiHandler;
    
    public TransactionHandler( UIHandler uiHandler) {
        RepositoryAccessMethodFactory rf = new RepositoryAccessMethodFactory(); 
        dbWriter = rf.getRepoWriter();
        this.uiHandler=uiHandler;
        rA =  rf.getRepoAccess();
    }
    

    public boolean AddToLibrary() {
       uiHandler.pullDownCart();
       JSONArray cart = uiHandler.getCartJson();
        for(int x =0 ;x< cart.length();x++)
         {
            try{
             JSONObject currentObj = cart.getJSONObject(x);
            dbWriter.insertHistory(uiHandler.getUsername(),currentObj.getInt("productID"));
            } catch(Exception e){
                 System.out.println("Error s: "+e.toString());
                 return false;
            }
        }
        return true;
    }
    
    public boolean RemoveFromCart() {
        RepositoryAccessMethodFactory rf = new RepositoryAccessMethodFactory();
         RepositoryWriter rw =  rf.getRepoWriter();
        return rw.clearCart(uiHandler.getUsername());
    }
    

}

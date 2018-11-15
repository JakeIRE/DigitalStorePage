/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBHandler;

/**
 *
 * @author jakec
 */
public class RepositoryAccessMethodFactory {
    public RepositoryAccessMethodFactory(){
        
    }
    
    public RepositoryAccess getRepoAccess(){
        return new DBQueryParser();
    }
    
    public RepositoryWriter getRepoWriter(){
        return new DBWriter();
    }
}

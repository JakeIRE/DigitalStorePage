/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Launchers;

/**
 *
 * @author jakec
 */
public class RunEXE implements RunProduct{
    private String file;
    
    public RunEXE(String file){
        this.file = file;
    }
    
    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

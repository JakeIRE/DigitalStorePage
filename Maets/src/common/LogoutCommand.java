/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import Controller.ConnectionReplyContext;
import Controller.ConnectionReplyInterceptor;
import Controller.LoggingDispatcher;
import Controller.LoggingInterceptor;
import DBHandler.DBWriter;
import DBHandler.RepositoryAccessMethodFactory;
import DBHandler.RepositoryWriter;
import java.util.Date;

/**
 *
 * @author jhonata
 */
public class LogoutCommand implements Command{
    private RepositoryWriter dbWriter;
    private String userName = "";
    public LogoutCommand(String userName) {
        RepositoryAccessMethodFactory rf = new RepositoryAccessMethodFactory(); 
        dbWriter = rf.getRepoWriter();
        this.userName = userName;
    }
    @Override
    public void execute() {
        
        ConnectionReplyInterceptor cri = LoggingInterceptor.getInterceptor();
                
        LoggingDispatcher dis = LoggingDispatcher.getDispatcher();

        ConnectionReplyContext context;  

        dis.registerLoggingInterceptor(cri);

        context = new ConnectionReplyContext(new Date(),this.userName); 

        dis.postRemoteReply(context);
        
    } 
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement;

import java.sql.*;
/**
 *
 * @author suhan
 */



//4 steps of JDBC Connectivity
//->Register Driver,Create connection,Create Statement,Execute Query,Close Connection
public class Conn {
    
    Statement s;
    Connection c;
    public Conn(){
        
        try{
//            No need to register driver
//            Class.forName(com.mysql.cj.jdbc.Driver);
//login details 
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Su_hani19@");
            s = c.createStatement();
            
        
        
        
        
        }catch(Exception e){
            System.out.println(e)
        }
        
        
        
        
        
    }
    
}

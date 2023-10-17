/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_machine;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class connect {
    Connection c;
    Statement s;
    
    
    public connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database?","root","Karishma@2312");
            s=c.createStatement();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
            
    }
}

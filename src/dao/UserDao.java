/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import model.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static util.Result.rs;
import static util.Result.d;
import static util.UserDetails.id;
import static util.UserDetails.resultSet1;
import static util.all_results.a_date;
import static util.all_results.a_id;
import model.Result;
import static util.all_results.oblist;

/**
 *
 * @author Dell
 */
public class UserDao {
    private Connection connection=null;
    private String sql=null;
     private String sqll=null;
    private PreparedStatement preparedStatement =null;
    private ResultSet resultSet=null;
   
    private String s=null;
private int  result=0;
private int count=0;
    public UserDao() {
    }
    
    
         public int signup (user user) throws ClassNotFoundException{
        connection=DBconnection.connect();
        sql="select id from user where  email= ? and password = ?  ";
        try {
            preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            resultSet=preparedStatement.executeQuery();
            
              
            if(resultSet.next()){
               id= resultSet.getInt(1);
                
    
                return 1;
               
            }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }     
      
        return 0;
    }
    public int register(user user) throws ClassNotFoundException{
         connection=DBconnection.connect();
         sql="insert into user(f_name,l_name,email,password,age,gender)values(?,?,?,?,?,?)";
           try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getFname());
            preparedStatement.setString(2, user.getLname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setInt(5, user.getAge());
            preparedStatement.setString(6, user.getGender());
            result=preparedStatement.executeUpdate();   
                          
        }
           
           catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
 
    
    
    
    public void set_value() {
        
          connection=DBconnection.connect();
         sql="insert into result(result,date,u_id)values(?,?,?)";
          try {
            preparedStatement=connection.prepareStatement(sql);  
            preparedStatement.setInt(1, rs);
            preparedStatement.setString(2,d);
            preparedStatement.setInt(3,id);
                
           
            result=preparedStatement.executeUpdate();
             
        }
           
           
           
           catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void old(){
      
         
        connection=DBconnection.connect();
        sql="select result , date from result where  u_id= ? ";
        try {
            preparedStatement =connection.prepareStatement(sql);
             preparedStatement.setInt(1, id);
            resultSet1=preparedStatement.executeQuery();
            
              
            while(resultSet1.next()){
                a_id=resultSet1.getInt(1);
                a_date=resultSet1.getString(2);
                oblist.add(new Result(a_id,a_date));

                
               
               
            }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
    }
    public int forgetpass(user user){
         connection=DBconnection.connect();
        sql="select id from user where  email= ?  ";
        try {
            preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getEemail());
           
            resultSet=preparedStatement.executeQuery();
            
              
            if(resultSet.next()){
               id= resultSet.getInt(1);
                 return 1;
               
            }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return 0;
      
      
    }
    
}

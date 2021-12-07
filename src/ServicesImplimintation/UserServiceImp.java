/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesImplimintation;

import Services.UserService;
import dao.UserDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Result;
import model.user;
import static util.Result.rs;


/**
 *
 * @author Dell
 */
public class UserServiceImp implements UserService{

 private UserDao userdao;

    public UserServiceImp() {
        userdao=new UserDao();
    }
    
 
  
    @Override
    public int login(user user) {
       
     try {
         return userdao.signup(user);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(UserServiceImp.class.getName()).log(Level.SEVERE, null, ex);
     }
     return 0;
    
    }

    @Override
    public int signup(user user) {
       
     try {
         return userdao.register(user);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(UserServiceImp.class.getName()).log(Level.SEVERE, null, ex);
     }
     return 0;
    
    }

    @Override
    public void show() {
       userdao.set_value();
    }

    @Override
    public void old() {
       
     userdao.old();
    }

    @Override
    public int forgetpass(user user) {
      return  userdao.forgetpass( user);
    }
    
}

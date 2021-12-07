/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ServicesImplimintation.UserServiceImp;
import java.util.List;
import model.Result;
import model.user;

/**
 *
 * @author Dell
 */
public class userController {
    private UserServiceImp userServiceImp;

    public userController() {
        userServiceImp=new UserServiceImp();
    }
    
    public int login(user user){
        return userServiceImp.login(user);
    }
    public int register(user user ) {
      return  userServiceImp.signup(user);
    }
    public void show(){
         userServiceImp.show();
    }
    public void old(){
        
         userServiceImp.old();
    }
    public int forgetpass(user user){
      return  userServiceImp.forgetpass(user);
    }
}
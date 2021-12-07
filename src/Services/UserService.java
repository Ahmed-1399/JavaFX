/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import java.util.List;
import model.Result;
import static util.Result.rs;


import model.user;

/**
 *
 * @author Dell
 */
public interface UserService {
    public int login(user user);
     public int signup(user user);
     public void show();
      public void old();
      public int forgetpass(user user);
    
}

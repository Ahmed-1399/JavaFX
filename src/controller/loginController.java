
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.user;


public class loginController implements Initializable {

      @FXML
    private PasswordField password;

    @FXML
    private Label validu_p;

    @FXML
    private AnchorPane loginPage;

    @FXML
    private Button login;

    @FXML
    private ImageView loading;

    @FXML
    private Button signup;

    @FXML
    private TextField username;
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
  loading.setVisible(false);
  validu_p.setVisible(false);
    }
     @FXML
    void loginAction(ActionEvent event) {

        loading.setVisible(true);
         PauseTransition pt=new PauseTransition();
         pt.setDuration(Duration.seconds(1));
         pt.setOnFinished(   ev->{
        loading.setVisible(false);
         String Username=username.getText();
         String Password=password.getText();
         user user =new user();
         user.setEmail(Username);
         user.setPassword(Password);
          userController uc =new userController();
          int result=uc.login(user);
//             System.out.print(result);
          if(result==1){
//              goging to main
             loginPage.getScene().getWindow().hide();
 
             Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("/Frontend/main1.fxml"));
                  Stage Main_stage=new Stage();
                    Scene scene = new Scene(root, 700, 500);
                    Main_stage.setScene(scene);
                    Main_stage.setResizable(false);
                    Main_stage.setTitle("Main");
                    Main_stage.show();
            } catch (IOException ex) {
                Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
                 else{
                validu_p.setVisible(true);
    
              
       
          }
    });
         pt.play();
    }
     @FXML
    void signupAction(ActionEvent event) throws IOException {
        
    loginPage.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/Signup.fxml"));
   
         Stage signup_stage=new Stage();
        Scene scene = new Scene(root, 549, 656);
        signup_stage.setScene(scene);
        signup_stage.setResizable(false);
        signup_stage.setTitle("signUp");
        signup_stage.show();
    
    }/////////////////////
    @FXML
     void forgetAction(ActionEvent event) throws IOException {
      loginPage.getScene().getWindow().hide();
       Parent root =FXMLLoader.load(getClass().getResource("/Frontend/Forget_Password.fxml"));
   
         Stage forget_stage=new Stage();
        Scene scene = new Scene(root, 470, 500);
        forget_stage.setScene(scene);
        forget_stage.setResizable(false);
        forget_stage.setTitle("Cancel");
        forget_stage.show();
    }
   
    
}

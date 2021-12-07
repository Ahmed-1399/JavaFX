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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.user;

public class signupController implements Initializable {
    
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    
    @FXML
    private TextField username;
    
     @FXML
    private PasswordField password;

    
    @FXML
    private PasswordField conpassword;
    
    @FXML
    private TextField age;
    
     @FXML
    private RadioButton male;
     
     @FXML
    private RadioButton female;
     
     

    
    @FXML
    private ToggleGroup gender;

    @FXML
    private AnchorPane signuppage;

    @FXML
    private Hyperlink login;

    @FXML
    private ImageView loading;

    @FXML
    private Button signup;

    @FXML
    private Label con_pass_valid;
    @FXML
    private Label inv_register;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
  loading.setVisible(false);
  con_pass_valid.setVisible(false);
    inv_register.setVisible(false);
    
    }
     @FXML
            
    void signupAction(ActionEvent event) {

        loading.setVisible(true);
         PauseTransition pt=new PauseTransition();
         pt.setDuration(Duration.seconds(1));
         
         user user=new user();
         user.setFname(firstname.getText());
          user.setLname(lastname.getText());
           user.setEmail(username.getText());
           user.setPassword(password.getText());
            user.setAge(Integer.parseInt(age.getText()));
            user.setGender("m");
            if(female.isSelected())
            {
                user.setGender("f");
            }
            userController uc=new userController();
            
            
         
         pt.setOnFinished(   ev->{
        loading.setVisible(false);
      int result=  uc.register(user);
      
        if(result==1 &&password.getText().equals(conpassword.getText())){
          signuppage.getScene().getWindow().hide();
 
      Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("/Frontend/Login.fxml"));
                 Stage signup_stage=new Stage();
        Scene scene = new Scene(root, 549, 656);
        signup_stage.setScene(scene);
        signup_stage.setResizable(false);
        signup_stage.setTitle("Login");
        signup_stage.show();
            } catch (IOException ex) {
                Logger.getLogger(signupController.class.getName()).log(Level.SEVERE, null, ex);
            }
   
        
        }
                 else{
             inv_register.setVisible(true);
        }
      
    });
         pt.play();
    }
      @FXML
    void loginAction(ActionEvent event) throws IOException {
 signuppage.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/Login.fxml"));
   
         Stage signup_stage=new Stage();
        Scene scene = new Scene(root, 549, 656);
        signup_stage.setScene(scene);
        signup_stage.setResizable(false);
        signup_stage.setTitle("Login");
        signup_stage.show();
    
    }
       
    
    
}
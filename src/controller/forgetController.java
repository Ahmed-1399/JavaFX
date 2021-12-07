package controller;

import Services.UserService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Result;
import model.user;


public class forgetController implements Initializable{
    
     @FXML
    private AnchorPane getpassword;
      @FXML
    private TextField forgetpass;
          @FXML
    private Button newt;
           @FXML
    private TableColumn<Result, Integer> t_id;

    @FXML
    private TableColumn<Result, String> t_date;


    @FXML
    private TableView<Result> table;
     
    
     @FXML
    void cancelAction(ActionEvent event) throws IOException{
        getpassword.getScene().getWindow().hide();
       Parent root =FXMLLoader.load(getClass().getResource("/Frontend/Login.fxml"));
   
         Stage forget_stage=new Stage();
        Scene scene = new Scene(root,590, 650);
        forget_stage.setScene(scene);
        forget_stage.setResizable(false);
        forget_stage.setTitle("Cancel");
        forget_stage.show();

    }
     @FXML
    void search(ActionEvent event)  {

        String text=forgetpass.getText();
        user user=new user();
         userController uc=new userController();
         uc.forgetpass(user);
         user.setEemail(text);
        int result= uc.forgetpass(user);
           if(result==1){
//              goging to main
             getpassword.getScene().getWindow().hide();
 
             Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("/Frontend/old.fxml"));
                  Stage Main_stage=new Stage();
                    Scene scene = new Scene(root, 549, 656);
                    Main_stage.setScene(scene);
                    Main_stage.setResizable(false);
                    Main_stage.setTitle("Main");
                    Main_stage.show();
                    uc.old();
                    
            } catch (IOException ex) {
                Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
                 else{
                getpassword.setVisible(false);
    
              
       
          }
         
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }

}


package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static util.Result.count;
import static util.Result.count1;
import static util.Result.count2;
import static util.Result.count3;
import static util.Result.count4;
import static util.Result.rs;
import  controller.loginController;
import dao.UserDao;
import java.util.ArrayList;
import java.util.List;
import model.Result;



public class ResultController implements Initializable{
    private UserDao userdao;
     @FXML
    private Label taInformation;
      @FXML
    private AnchorPane Resultcontact;
    
    @FXML
    void ShowOldResultsAction(ActionEvent event) throws IOException {
        
       
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/Old_Results.fxml"));
   Resultcontact.getScene().getWindow().hide();
         Stage stage=new Stage();
        Scene scene = new Scene(root, 660, 520);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Old Results");
        stage.show();
        
          userController uc =new userController();
  
         uc.old();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         rs=count+count1+count2+count3+count4;
       taInformation.setText(rs+"");
       
       
       userController uc =new userController();
      uc.show();
       
        }
    }

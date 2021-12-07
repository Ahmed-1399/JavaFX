
package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import util.Result;


public class Next1Controller {
    @FXML
    private RadioButton m1;

    @FXML
    private AnchorPane main1;

    @FXML
    private RadioButton m2;

    @FXML
    private RadioButton m3;

    @FXML
    private RadioButton m4;

    @FXML
    private ToggleGroup mark2;

    @FXML
    private ToggleGroup mark1;
    

    @FXML
    void Next1Action(ActionEvent event) throws IOException {
        
       if(m2.isSelected()){
        Result.count+=10;                        
                }
       if(m3.isSelected()){
        Result.count+=10;
                }
       if((m1.isSelected() || m2.isSelected()) && (m3.isSelected() || m4.isSelected())){
           
       }else 
           JOptionPane.showMessageDialog(null,"Please Select your choose too previous Qs");
       
        main1.getScene().getWindow().hide();
        
       
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main2.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root, 750, 540);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main2");
        stage.show();
    
    }

    }
    

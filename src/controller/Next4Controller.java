
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

public class Next4Controller {
    
     @FXML
    private RadioButton m15;

    @FXML
    private RadioButton m14;

    @FXML
    private RadioButton m16;

    @FXML
    private AnchorPane main4;

    @FXML
    private ToggleGroup mark8;

    @FXML
    private ToggleGroup mark7;

    @FXML
    private RadioButton m13;

    @FXML
    void next4Action(ActionEvent event) throws IOException {
        if(m13.isSelected()){
        Result.count3+=10;
                }
       if(m15.isSelected()){
        Result.count3+=10;
                }
       if((m13.isSelected() || m14.isSelected()) && (m15.isSelected() || m16.isSelected())){
           
       }else 
           JOptionPane.showMessageDialog(null,"Please Select your choose too previous Qs");
        main4.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main5.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root, 640, 520);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main5");
        stage.show();
    }
    
    @FXML
    void Previous3Action(ActionEvent event) throws IOException {
        Result.count2=0;
         main4.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main3.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root, 640, 630);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main3");
        stage.show();

    }
    
}

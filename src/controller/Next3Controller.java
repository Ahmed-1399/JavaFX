
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


public class Next3Controller {
     @FXML
    private ToggleGroup mark6;

    @FXML
    private ToggleGroup mark5;

    @FXML
    private AnchorPane main3;

    @FXML
    private RadioButton m9;

    @FXML
    private RadioButton m11;

    @FXML
    private RadioButton m10;

    @FXML
    private RadioButton m12;

    @FXML
    void next3Action(ActionEvent event) throws IOException {
        if(m9.isSelected()){
        Result.count2+=10;
                }
       if(m11.isSelected()){
        Result.count2+=10;
                }
       if((m9.isSelected() || m10.isSelected()) && (m11.isSelected() || m12.isSelected())){
           
       }else 
           JOptionPane.showMessageDialog(null,"Please Select your choose too previous Qs");
        
         main3.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main4.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root, 650, 560);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main4");
        stage.show();

    }
     @FXML
    void Previous2Action(ActionEvent event) throws IOException {
        Result.count1=0;
        main3.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main2.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root,760, 520);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main2");
        stage.show();

    }
    
}

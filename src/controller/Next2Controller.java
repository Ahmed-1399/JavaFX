
package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import util.Result;

public class Next2Controller { 
    @FXML
    private Button next2;
    
     @FXML
    private AnchorPane main2;

    @FXML
    private ToggleGroup mark2;

    @FXML
    private RadioButton m5;

    @FXML
    private RadioButton m6;

    @FXML
    private RadioButton m7;

    @FXML
    private RadioButton m8;

    @FXML
    private ToggleGroup mark3;
    
      @FXML
    void next2Action(ActionEvent event)throws IOException  {
        // Select Radio Button Counter
        if(m5.isSelected()){
        Result.count1+=10;
                }
       if(m7.isSelected()){
        Result.count1+=10;
                }
       
       if((m5.isSelected() || m6.isSelected()) && (m7.isSelected() || m8.isSelected())){
           
       }else 
           JOptionPane.showMessageDialog(null,"Please Select your choose too previous Qs");

        main2.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main3.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root, 660, 520);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main3");
        stage.show();
    }
    @FXML
    void previous1Action(ActionEvent event) throws IOException {
        Result.count=0;
        main2.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main1.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root,660, 520);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main1");
        stage.show();
    }}


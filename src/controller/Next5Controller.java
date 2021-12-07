
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

public class Next5Controller {
    
    @FXML
    private ToggleGroup mark10;

    @FXML
    private AnchorPane main5;

    @FXML
    private ToggleGroup mark9;

    @FXML
    private RadioButton m17;

    @FXML
    private RadioButton m19;

    @FXML
    private RadioButton m18;

    @FXML
    private RadioButton m20;


    @FXML
    void resultAction(ActionEvent event) throws IOException {
        if(m18.isSelected()){
        Result.count4+=10;
                }
       if(m19.isSelected()){
        Result.count4+=10;
                }
       if((m17.isSelected() || m18.isSelected()) && (m19.isSelected() || m20.isSelected())){
           
       }else 
           JOptionPane.showMessageDialog(null,"Please Select your choose too previous Qs");
         main5.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/Result-contact.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root, 600, 530);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Show Result");
        stage.show();

    }

    @FXML
    void Previous4Action(ActionEvent event) throws IOException {
        Result.count3=0;
        main5.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main4.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root, 640, 600);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main4");
        stage.show();

    }
    
}

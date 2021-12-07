 
package controller;

import java.io.IOException;
import java.net.URL;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import dao.UserDao;
import model.Result;
import static util.all_results.oblist;
import static util.Result.rs;
import static util.Result.count;
import static util.Result.count1;
import static util.Result.count2;
import static util.Result.count3;
import static util.Result.count4;


public class OldResultsController implements Initializable{


    @FXML
    private AnchorPane OldResults;
    
             @FXML
    private TableColumn<Result, Integer> t_id;

    @FXML
    private TableColumn<Result, String> t_date;


    @FXML
    private TableView<Result> table;
    
    
    @FXML
    void NewTestAction(ActionEvent event) throws IOException {
       
        count=0;
        count1=0;
        count2=0;
        count3=0;
        count4=0;

        OldResults.getScene().getWindow().hide();
 
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/main1.fxml"));
   
         Stage stage=new Stage();
        Scene scene = new Scene(root,660, 520);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Main1");
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       t_id.setCellValueFactory(new PropertyValueFactory<>("result"));
       t_date.setCellValueFactory(new PropertyValueFactory<>("date"));
       table.setItems(oblist);
    }
    }

    


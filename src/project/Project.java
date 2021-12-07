/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class Project extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      Parent root =FXMLLoader.load(getClass().getResource("/Frontend/Login.fxml"));
   
        Scene scene = new Scene(root, 590, 650);
        primaryStage.setScene(scene);
         primaryStage.setResizable(false);
         primaryStage.setTitle("Login");
         primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

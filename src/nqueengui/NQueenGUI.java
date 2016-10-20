/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueengui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class NQueenGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("Number of queens:");
        TextField N = new TextField();
        N.setPromptText("No. of queens.");
        N.setPrefColumnCount(10);
        N.getText();
        Button btn = new Button();
        btn.setText("Solve");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int n = Integer.parseInt(N.getText());
                Printer p = new Printer();
                p.printQueen(n);
                
            }
        });
        

        
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(10);
        hb.getChildren().addAll(label1, N);
        
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(20);
        vb.getChildren().addAll(hb, btn);
        
        StackPane root = new StackPane();
        root.getChildren().add(vb);
        Scene scene = new Scene(root, 500, 300);
        
        primaryStage.setTitle("N-Queen problem Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

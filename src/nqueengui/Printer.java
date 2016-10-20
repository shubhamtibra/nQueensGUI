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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static nqueengui.Solver.solve;
/**
 *
 * @author user
 */
public class Printer extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printQueen(int n_q){
         

        TextArea textArea = new TextArea();
        textArea.setText(Solver.ans);

        VBox vbox = new VBox(textArea);

        Scene scene = new Scene(vbox, 200, 100);
        Stage s = new Stage();
        s.setTitle("N-Queen problem Solver");
        s.setScene(scene);
        s.show();
    }
    
}

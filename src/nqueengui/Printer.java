/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueengui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
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
        solve(n_q);
        textArea.setText(Solver.ans);

        VBox vbox = new VBox(textArea);

        Scene scene = new Scene(vbox, 400, 200);
        Stage s = new Stage();
        s.setTitle("Solutions");
        s.setScene(scene);
        s.show();
    }
    
}

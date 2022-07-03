package com.example.projectoop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
public class Confirming {

    static boolean answer;

    public static boolean display(String title , String msg){
        Stage confirm = new Stage();
        confirm.setTitle(title);
        confirm.initModality(Modality.APPLICATION_MODAL);

        Label label=new Label(msg);

        Button yes = new Button("YES");
        Button no = new Button("NO");

        yes.setOnAction(e->{
            answer=true;
            confirm.close();
        });
        no.setOnAction(e->{
            answer=false;
            confirm.close();
        });


        HBox layout = new HBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(yes,no);
        VBox layall =new VBox();
        layall.getChildren().addAll(label,layout);
        layall.setAlignment(Pos.CENTER);
        layall.setSpacing(10);
        layall.setPadding(new Insets(3,3,3,3));
        layall.setCenterShape(true);

        Scene scene = new Scene (layall,200,60);

        confirm.setScene(scene);
        confirm.showAndWait();
        return answer;
    }
}
package com.example.projectoop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
public class AleretBox {

    public static void display(String title , String msg){
        Stage alret = new Stage();
        alret.setTitle(title);
        alret.initModality(Modality.APPLICATION_MODAL);

        Label label=new Label(msg);
        Button close = new Button("Close");
        close.setOnAction(e -> alret.close());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label,close);

        Scene scene = new Scene (layout,150,150);

        alret.setScene(scene);
        alret.showAndWait();
    }
}

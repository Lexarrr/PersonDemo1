package com.example.persondemo;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Person Form");
        stage.setScene(scene);
        stage.show();

        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());



//        EventHandler<ActionEvent> eventHandler = new EventHandler<>() {
//            @Override
//
//            public void handle(ActionEvent event) {
//                final Stage dialog = new Stage();
//                dialog.initModality(Modality.APPLICATION_MODAL);
//                dialog.initOwner(new Stage());
//                VBox dialogVbox = new VBox(20);
//                dialogVbox.getChildren().add(new Text("CONGRATULATION!"));
//                Scene dialogScene = new Scene(dialogVbox, 300, 200);
//                dialog.setScene(dialogScene);
//                dialog.show();
//            }
//        };
//
//        Button bt = new Button();
//        bt.setOnAction(eventHandler.handle());
    }

    public static void main(String[] args) {
        launch();
    }
}
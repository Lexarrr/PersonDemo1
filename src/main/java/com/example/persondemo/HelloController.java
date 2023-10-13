package com.example.persondemo;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class HelloController {

    @FXML
    private TextField fname;
    @FXML
    private TextField sname;
    @FXML
    private TextField prof;
    @FXML
    private TextField daybir;
    @FXML
    private TextField yearOld;

    @FXML
    private Label exc;

    @FXML
    Button click;

    @FXML
    VBox mainBox;

//    @Override
//
//    public void handle(ActionEvent event) {
//        final Stage dialog = new Stage();
//        dialog.initModality(Modality.APPLICATION_MODAL);
//        dialog.initOwner(new Stage());
//        VBox dialogVbox = new VBox(20);
//        dialogVbox.getChildren().add(new Text("CONGRATULATION!"));
//        Scene dialogScene = new Scene(dialogVbox, 300, 200);
//        dialog.setScene(dialogScene);
//        dialog.show();
//    }


    @FXML
    protected void init() {



    }

    @FXML
    protected void ToSave() throws IOException, MineException {
        Map<Integer, Person> personMap = new HashMap<>();
        int id = 1;
        for (Node text : mainBox.getChildren()) {
            if (text instanceof TextField) {
                try {
                    personMap.put(id++, new Person(fname.getText(), sname.getText(),
                            prof.getText(), daybir.getText(),
                            Integer.parseInt(yearOld.getText())));

                } catch (NumberFormatException e) {
                    exc.setText("You should to fill the form!");
                } catch (ExcFormatField e) {
                    exc.setText("The recording format is incorrect! For example, 1999.01.01");
                }
            }
        }
        String fn = "PersonList.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(fn));
        try {
            bw.write(personMap.toString()); //eventHandler.handle(bw.write(personMap.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bw.close();

        click.setOnAction(actionEvent -> {

            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.initOwner(new Stage());
            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("CONGRATULATION!"));
            Scene dialogScene = new Scene(dialogVbox, 300, 200);
            dialog.setScene(dialogScene);
            dialog.show();
        });

    }


    @FXML
    protected void toDelete() {
        for (Node text : mainBox.getChildren()) {
            if (text instanceof TextField) {
                ((TextField) text).clear();
            }
        }
    }
}
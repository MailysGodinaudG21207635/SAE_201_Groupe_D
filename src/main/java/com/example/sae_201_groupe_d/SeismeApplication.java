package com.example.sae_201_groupe_d;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.ArrayList;

public class SeismeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.setProperty("javafx.platform", "desktop");
        System.setProperty("http.agent", "Gluon Mobile/1.0.3");
        FXMLLoader fxmlLoader = new FXMLLoader(SeismeApplication.class.getResource("seisme-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1510, 800);
        String cheminlogo = "logo.png";
        Image logo = new Image(getClass().getResourceAsStream(cheminlogo));
        stage.setTitle("SysmoFR");
        stage.getIcons().add(logo);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();}
}
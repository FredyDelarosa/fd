package com.brunoblanco.lumotienda;

import com.brunoblanco.lumotienda.Clases.InventarioRopa;
import com.brunoblanco.lumotienda.Controladores.ActualizarProductoOpcionControlador;
import com.brunoblanco.lumotienda.Controladores.MenúControlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class HelloApplication extends Application {
    private static InventarioRopa inventarioRopa = new InventarioRopa();

    public static InventarioRopa getInventarioRopa() {
        return inventarioRopa;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menú.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Menú");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

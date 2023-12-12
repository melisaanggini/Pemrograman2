package com.example.demo1;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private TableView<Mahasiswa> table = new TableView<Mahasiswa>();
    private final ObservableList<Mahasiswa> data =
            FXCollections.observableArrayList(
                    new Mahasiswa(1, "123", "John"),
                    new Mahasiswa(2, "123", "Jane"),
                    new Mahasiswa(3, "124123", "Jono"),
                    new Mahasiswa(4, "1241234", "Bp Agus"),
                    new Mahasiswa(5, "2610", "Ibu Agus"),
                    new Mahasiswa(6, "2710", "Adk Agus"),
                    new Mahasiswa(7, "2810", "KK Agus"),
                    new Mahasiswa(8, "2910", "Cucu Agus"),
                    new Mahasiswa(9, "3010", "Anak Agus"),
                    new Mahasiswa(10,"3110", "Nenek Agus")

                    );

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(300);
        stage.setHeight(500);


        table.setEditable(true);

        TableColumn nimMahasiswaCol = new TableColumn("NIM");
        nimMahasiswaCol.setMinWidth(100);
        nimMahasiswaCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa, String>("nimMahasiswa"));

        TableColumn nameMahasiswaCol = new TableColumn("Nama");
        nameMahasiswaCol.setMinWidth(100);
        nameMahasiswaCol.setCellValueFactory(
                new PropertyValueFactory<Mahasiswa, String>("nameMahasiswa"));


        table.setItems(data);
        table.getColumns().addAll(nimMahasiswaCol, nameMahasiswaCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }

    public static class Mahasiswa {

        private final SimpleStringProperty nimMahasiswa;
        private final SimpleStringProperty nameMahasiswa;
        private final SimpleIntegerProperty idMahasiswa;

        private Mahasiswa(int idMhs, String nimMhs, String nameMhs) {
            this.idMahasiswa = new SimpleIntegerProperty(idMhs);
            this.nimMahasiswa = new SimpleStringProperty(nimMhs);
            this.nameMahasiswa = new SimpleStringProperty(nameMhs);

        }

        public String getNimMahasiswa() {
            return nimMahasiswa.get();
        }

        public void setNimMahasiswa(String nimMhs) {
            nimMahasiswa.set(nimMhs);
        }

        public String getNameMahasiswa() {
            return nameMahasiswa.get();
        }

        public void setNameMahasiswa(String nameMhs) {
            nameMahasiswa.set(nameMhs);
        }

    }

    public static void main(String[] args) {
        launch();
    }
}
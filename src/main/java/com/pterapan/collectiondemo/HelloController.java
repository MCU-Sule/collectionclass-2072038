package com.pterapan.collectiondemo;

import com.pterapan.collectiondemo.Model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    public TableView table1;
    public TableColumn column1;
    public TableColumn column2;

    public TextField txtNrp1;

    public TextField txtNama;

    public TextField txtNrp2;
    private ObservableList<Student> oList;

    @FXML
    public void initialize() {
        oList = FXCollections.observableArrayList();
        table1.setItems(oList);
        column1.setText("NRP");
        column1.setCellValueFactory(new PropertyValueFactory<>("nrp"));
        column2.setText("Nama");
        column2.setCellValueFactory(new PropertyValueFactory<>("nama"));
    }

    public void onHapus(ActionEvent actionEvent) {
        oList.remove(table1.getSelectionModel().getSelectedItem());

////         failed
//        System.out.println(txtNrp2.getText());
//        boolean cek = Arrays.asList(oList).contains(txtNrp2.getText());
////        boolean cek = oList.contains(txtNrp2.getText());
//        String nrp = column1.getText();
//        String nama = column2.getText();
//
//        System.out.println(cek);
//
//        if (cek == true) {
//            System.out.println("this data is present in the list");
//            oList.remove(column1.getText());
//            oList.remove(column2.getText());
////            new Student(nrp, nama)
//        } else {
//            System.out.println("this data is NOT present in the list");
//        }

//        String nrp = txtNrp2.getText();
//        String nama = txtNama.getText();
//        if (table1.contains(nrp, nama)) {
//            oList.contains(new Student(nrp, nama))
//                    .remove(table1.getSelectionModel().getSelectedItem());
//        if (oList.size() > 0) {
//            System.out.println(txtNrp2.getText());
//            oList.remove(txtNrp2.getText());
//            table1.getItems().remove(txtNrp2.getText());
//            System.out.println(oList);
//        }
//        column1.getColumns().remove(txtNrp2.getText());
//        System.out.println(txtNrp2.getText());
//        column1.getItems().remove(txtNrp2.getText().getNrp());
//        System.out.println(oList);
    }
    public void onTambah(ActionEvent actionEvent) {
        String nrp = txtNrp1.getText();
        String nama = txtNama.getText();
        oList.add(new Student(nrp, nama));
        txtNrp1.clear();
        txtNama.clear();
    }
}
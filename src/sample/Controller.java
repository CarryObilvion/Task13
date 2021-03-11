package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sample.Metods.Component;
import sample.Metods.Composite;
import sample.Metods.Element;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public double x;
    public double y;
    public Pane pane;
    public Component component = null;
    public Component a;
    public Component b;
    public Component c;


    public void ClFin(ActionEvent actionEvent) {
        pane.getChildren().clear();
        component = b;
    }

    public void ClSt(ActionEvent actionEvent) {
        pane.getChildren().clear();
        component = a;
    }

    public void ClTr(ActionEvent actionEvent) {
        pane.getChildren().clear();
        component = c;
    }

    public void Clean(ActionEvent actionEvent) {
        pane.getChildren().clear();
    }

    public void onClick(MouseEvent mouseEvent) {
        pane.getChildren().clear();
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        if (component == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Please select an item and style.");
            alert.show();
        } else {
            component.setY(y);
            component.setX(x);
            component.draw(pane);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        a = new Element();
        ArrayList<Component> temp = new ArrayList<>();
        Element element1 = new Element();
        Element element2 = new Element();
        temp.add(element1);
        temp.add(element2);
        b = new Composite(temp);
        Component a1 = new Element();
        ArrayList<Component> temp1 = new ArrayList<>();
        Element element3 = new Element();
        Element element4 = new Element();
        temp1.add(element3);
        temp1.add(element4);
        Component b1 = new Composite(temp1);
        ArrayList<Component> comps = new ArrayList<>();
        comps.add(a1);
        comps.add(b1);
        c = new Composite(comps);
    }

    public void clColor(ActionEvent actionEvent) {
        if (component == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Please select an item and style.");
            alert.show();
        } else {
            component.setStyle("-fx-background-color: #00FFFF; -fx-text-fill: black; -fx-border-insets: 3; -fx-border-width: 1; -fx-border-style: solid;");
        }
    }

    public void clWhite(ActionEvent actionEvent) {
        if (component == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Please select an item and style.");
            alert.show();
        } else {
            component.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-insets: 1; -fx-border-width: 2; -fx-border-style: solid;");
        }
    }
}

package sample.Metods;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
/**
 * Класс, хранящий данные о рисуемом объекте и отвечает за его отображение
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */
public class Element extends Component {
    @Override
    public void add(Component component) throws ComponentException {
        throw new ComponentException();
    }

    public Element() {
        prefix = new Character('-');
        name = new String("Name");
        x = 1.;
        y = 1;
        w = 20;
        h = 7;
        style="-fx-background-color: #00FFFF; -fx-text-fill: black; -fx-border-insets: 3; -fx-border-width: 1; -fx-border-style: solid;";

    }

    @Override
    public void remove(Component component) throws ComponentException {
        throw new ComponentException();
    }

    @Override
    public Component getChild(int index) throws ComponentException {
        throw new ComponentException();
    }

    @Override
    public void draw(Pane pane) {
        Label field = (Label) getPicture();
        field.setPrefSize((pane.getWidth() * w / 100.), (pane.getHeight() * h / 100.));
        field.setLayoutX(x);
        field.setLayoutY(y);
        pane.getChildren().add(field);
    }

    @Override
    public Node getPicture() {
        String text = new String(prefix.toString());
        text += " " + name;
        Label field = new Label(text);
        field.setStyle(getStyle());
        return field;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y=y;
    }

    @Override
    public void setW(double w) {

    }

    @Override
    public void setH(double h) {

    }
}
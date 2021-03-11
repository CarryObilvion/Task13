package sample.Metods;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
/**
 * Абстрактный класс, содержащий свойства элементарного и составного типа
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */
public abstract class Component {

    // описание поля класса
    Character prefix;
    String name;
    String type;
    // параметры рисования
    protected double x;
    protected double y;
    protected double w;
    protected double h;
    protected String style;

    public abstract void add(Component component) throws ComponentException;

    public abstract void remove(Component component) throws ComponentException;

    public abstract Component getChild(int index) throws ComponentException;

    public abstract void draw(Pane pane);

    public abstract Node getPicture();

    public abstract void setX(double x);

    public abstract void setY(double y);

    public abstract void setW(double w);

    public abstract void setH(double h);

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

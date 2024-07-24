
package Container;
import Components.Component;
import javax.swing.*;
import java.util.List;

public abstract class Container extends JFrame {

    public String name;
    protected List<Component> components;
    protected List<Container> children;
    public Container parent;


}

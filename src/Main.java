import javax.swing.*;
import java.awt.*;
import Views.Views;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Views views = new Views();
                views.setVisible(true);
            }
        });
    }

}
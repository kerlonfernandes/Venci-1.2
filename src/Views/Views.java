package Views;
import Container.Container;
import Container.Tab;
import java.awt.BorderLayout;
import javax.swing.*;

public class Views extends Container {
    public Views() {
        setTitle("Venci");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // try {
        //     for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        //         if ("GTK+".equals(info.getName())) {
        //             UIManager.setLookAndFeel(info.getClassName());
        //             break;
        //         }
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        setLayout(new BorderLayout());

        Tab tab = new Tab();
        MenuBarTop menuBarTop = new MenuBarTop();

        setJMenuBar(menuBarTop.MenuBarTop());
        add(tab.TextArea(), BorderLayout.CENTER);

        setVisible(true);
        
    }

}


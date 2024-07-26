package Container;
import javax.swing.*;

public class Tab extends Container {

    public JTextArea textArea;

    
    public JScrollPane TextArea() {

        this.textArea = new JTextArea();
    
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
    
        return new JScrollPane(textArea);

    }
    
}

package GUIIserComponent;

import javax.swing.*;
import java.awt.*;

public class MyComponent extends JButton {
    private int code;

    public MyComponent(String title, int code) {
        super(title);
        this.code = code;
        setFont(new Font("Times New Roman",Font.BOLD,40));
    }

    public int getCode() {
        return code;
    }
}

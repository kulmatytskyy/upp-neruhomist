package kma.upp.neruhomist.ui.util;

import kma.upp.neruhomist.ui.MenuFrame;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class DelayedInitJFrame extends JFrame {

    @Autowired
    protected MenuFrame menuFrame;

    private boolean isInitialized = false;

    protected ActionListener backToMenu = actionEvent -> {
        dispose();
        menuFrame.setVisible(true);
    };

    @Override
    public void setVisible(boolean visible) {
        if(visible && !isInitialized) {
            initComponents();
        }
        super.setVisible(visible);
    }

    protected abstract void initComponents();
}

package kma.upp.neruhomist.ui.util;

import javax.swing.*;

public abstract class DelayedInitJFrame extends JFrame {

    private boolean isInitialized = false;

    @Override
    public void setVisible(boolean visible) {
        if(visible && !isInitialized) {
            initComponents();
        }
        super.setVisible(visible);
    }

    protected abstract void initComponents();
}

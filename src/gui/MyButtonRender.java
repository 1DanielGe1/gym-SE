package gui;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author FeianLing
 * @date 2019/9/10
 */
class MyButtonRender implements TableCellRenderer {
    private JPanel jPanel;
    private JButton jButton;
    private String name;

    public MyButtonRender(String name) {
        initJPanel();
        initButton();
        jPanel.add(jButton);
        this.name = name;
    }

    private void initButton() {
        jButton = new JButton();
        jButton.setBounds(2, 3, 75, 10);
        jButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        System.out.println("" + e.getActionCommand());
//                        System.out.println(jButton.getText());
                    }
                });
    }

    private void initJPanel() {
        jPanel = new JPanel();
        jPanel.setLayout(null);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        jButton.setText(name);
        return jPanel;
    }
}


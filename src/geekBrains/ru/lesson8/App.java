package geekBrains.ru.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    private int counter = 0;

    public App() {
        setTitle("App window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 120);

        Font font = new Font("Arial", Font.BOLD, 30);

        JPanel panel = new JPanel();
        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        add(counterView, BorderLayout.CENTER);

        JButton incrementButton = new JButton(">");
        add(incrementButton, BorderLayout.LINE_END);
        JButton decrementButton = new JButton("<");
        add(decrementButton, BorderLayout.LINE_START);
        JButton button = new JButton("Reset");
        JButton plus = new JButton("+10");
        JButton minus = new JButton("-10");
        panel.add(plus);
        panel.add(minus);
        panel.add(button);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == incrementButton) {
                    counter++;
                } else if (e.getSource() == decrementButton) {
                    counter--;
                } else if (e.getSource() == button) {
                    counter = 0;
                } else if (e.getSource() == plus) {
                    counter += 10;
                } else if (e.getSource() == minus) {
                    counter -= 10;
                }
                refreshCounterView(counterView);
            }
        };

        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        button.addActionListener(actionListener);
        plus.addActionListener(actionListener);
        minus.addActionListener(actionListener);
        getContentPane().add(BorderLayout.SOUTH, panel);

        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new App();
    }
}

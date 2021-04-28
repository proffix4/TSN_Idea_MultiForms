package kz.talipovsn.ij.multiforms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Форма 2
public class Form2 extends JFrame {
    private JPanel panel2;
    private JButton priorButton;
    private JButton exitButton;
    private JLabel label_Data;

    public Form2() {
        // Инициализация компонент
        getContentPane().add(panel2);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Многооконная программа");
        pack();
        setLocationRelativeTo(null);

        // Устанавливаем данные с общей переменной
        label_Data.setText(Main.data.toString());

        // Кнопка "Назад"
        priorButton.addActionListener(actionEvent -> {
            Main.form2.setVisible(false); // Скрываем форму 2
            Main.form1.setVisible(true);  // Делаем видимой форму 1
        });

        // Кнопка "Выход"
        exitButton.addActionListener(actionEvent -> System.exit(0));
    }
}

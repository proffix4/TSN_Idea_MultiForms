package kz.talipovsn.ij.multiforms;

import javax.swing.*;
import java.awt.*;

// Форма 1
public class Form1 extends JFrame {

    private JButton nextButton;
    private JTextField textField_Fio;
    private JPanel panel1;
    private JTextField textField_tel;

    public Form1() {
        // Инициализация компонент
        getContentPane().add(panel1);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Многооконная программа");
        pack();
        setLocationRelativeTo(null);

        // Кнопка "Далее"
        nextButton.addActionListener(actionEvent -> {
            // Очистим общую переменную
            Main.data.setLength(0);

            String s1 = textField_Fio.getText(); // Узнаем ФИО
            String s2 = textField_tel.getText(); // Узнаем телефон

            // Сохраняем нужные данные в общую переменную
            if (!s1.equals("")) {
                Main.data.append(s1);
                if (!s2.equals("")) {
                    Main.data.append(", номер: ").append(s2);
                }
            } else {
                Main.data.append("???");
            }

            Main.form1.setVisible(false); // Скрываем форму 1
            Main.form2.setVisible(true); // Делаем видимой форму 2
        });

    }

}

package kz.talipovsn.ij.multiforms;

import javax.swing.*;

// Основной класс-запускатель программы
public class Main {

    static StringBuilder data = new StringBuilder(); // Общая переменная для всех форм

    static JFrame form1; // Общая ссылка на форму 1
    static JFrame form2; // Общая ссылка на форму 2

    // Точка входа в программу
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            form1 = new Form1(); // Создаем в памяти форму 1
            form2 = new Form2(); // Создаем в памяти форму 2
            form1.setVisible(true); // Делаем видимой форму 1
        });
    }
}

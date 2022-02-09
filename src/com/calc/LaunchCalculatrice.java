package com.calc;
import javax.swing.*;

public class LaunchCalculatrice {

    public static void main(String[] args) {
        JFrame calc= new JFrame();
        calc.add(new VueCalculatrice());
        calc.setTitle("Calculatrice de nomi");
        ImageIcon icone = new ImageIcon("./src/img/img1.png");
        calc.setIconImage(icone.getImage());
        calc.setSize(300,300);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


    }
}

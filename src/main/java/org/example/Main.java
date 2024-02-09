package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double x =10.35784;
        System.out.println(x);
        System.out.printf ("%.2f%n", x);

        Locale.setDefault(Locale.US);
        System.out.printf ("%.4f%n", x);
        System.out.println("RESULTADO = "+x+ " METROS");
    }
}
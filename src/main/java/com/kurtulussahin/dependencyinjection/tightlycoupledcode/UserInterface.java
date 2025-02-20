package com.kurtulussahin.dependencyinjection.tightlycoupledcode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface {

    public UserInterface() {

        JFrame f = new JFrame("A JFrame");
        f.setSize(250, 250);
        f.setLocation(300, 200);
        final JTextArea textArea = new JTextArea(10, 40);
        f.getContentPane().
                add(BorderLayout.CENTER, textArea);
        final JButton button = new JButton("Click Me");
        f.getContentPane().
                add(BorderLayout.SOUTH, button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ProductService productService = new ProductService();

                textArea.append("Button was clicked\n");
                textArea.append("Featured products for preferred customers:\n");
                System.out.println("Featured products for preferred customers:");
                for (Product product : productService.getFeaturedProducts(true)) {
                    textArea.append(product.getProductID() + "\n");
                    textArea.append(product.getName() + "\n");
                    textArea.append(product.getDescription() + "\n");
                    textArea.append(product.getUnitPrice() + "\n");

                }
                System.out.println("Featured products for non-preferred customers:");
                for (Product product : productService.getFeaturedProducts(false)) {
                    textArea.append(product.getProductID() + "\n");
                    textArea.append(product.getName() + "\n");
                    textArea.append(product.getDescription() + "\n");
                    textArea.append(product.getUnitPrice() + "\n");
                }
                productService.close();
            }
        });
        f.setVisible(true);
    }
}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame{

    private static final int WIDTH = 1400;
    private static final int HEIGHT = 900;
    public static AVLTree tree = new AVLTree();
    public Frame(String framename) {
        super(framename);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        Panel p = new Panel();
        add(p);

        p.setLayout(null);
       
        
        JTextField text = new JTextField();
        p.add(text);

        JButton delete = new JButton("delete");
        
       

        JButton add = new JButton("add");
        p.add(delete);
        p.add(add);

        setVisible(true);
       
        add.setBounds(20, 800, 50, 20);
        delete.setBounds(20, 840, 50, 20);
        text.setBounds(80, 820, 50, 20);

        add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String x = text.getText();
                if(e.getSource()==add){
                    tree.insert(Integer.parseInt(x));
                    text.setText("");
                    p.repaint();

                }
                
            }
        });
        delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String x = text.getText();
                if(e.getSource()==delete){
                    tree.delete(Integer.parseInt(x));
                    text.setText("");
                    p.repaint();
                }
                
            }
        });

    }
    


}

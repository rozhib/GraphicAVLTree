import java.awt.*;
import javax.swing.*;


public class Panel extends JPanel{
    public Panel(){
        
        

        
    }
    public void paint(Graphics g){
        super.paint(g);
        Frame.tree.inorder(Frame.tree.root);
        paintSpaces(g, Frame.tree.root, 700, 50, 300);

        JButton add = new JButton("add");
        add.setBounds(20, 20, 50, 30);


    }

	



    public void paintSpaces(Graphics g, Node n, int x, int y, int space){
        
        if(n!=null){
            g.drawString(n.info+"", x, y);
        

        int left = x-space;
        int right = x+space;
        int newY = y+90;

        if(n.lchild!=null){
            g.drawLine(x-5, y-5, left+5, newY+5);
           // g.drawOval(left, newY, 10, 10);
            paintSpaces(g, n.lchild, left, newY, space/2);
        }
        if(n.rchild!=null){
            g.drawLine(x+9, y-5, right-5, newY+5);
            paintSpaces(g, n.rchild, right, newY, space/2);
        }
        
    }

    }
    
}

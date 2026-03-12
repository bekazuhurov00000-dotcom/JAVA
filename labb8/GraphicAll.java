import java.awt.*;
import javax.swing.*;

public class GraphicAll extends JFrame {

    public GraphicAll(String s) {
        super(s);

        setLayout(null);
        setSize(220, 420);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Button b1 = new Button("y = kx");
        b1.setBounds(20,20,160,30);
        add(b1);

        Button b2 = new Button("y = 3x^2");
        b2.setBounds(20,60,160,30);
        add(b2);

        Button b3 = new Button("y = -x^2 + x^3");
        b3.setBounds(20,100,160,30);
        add(b3);

        Button b4 = new Button("y = x^3 + x^2 + x");
        b4.setBounds(20,140,160,30);
        add(b4);

        Button b5 = new Button("y = x^5");
        b5.setBounds(20,180,160,30);
        add(b5);

        Button b6 = new Button("y = sin(x)");
        b6.setBounds(20,220,160,30);
        add(b6);

        Button b7 = new Button("y = cos(x-1)+x");
        b7.setBounds(20,260,160,30);
        add(b7);

        b1.addActionListener(e -> new GraphWindow("y = kx",1));
        b2.addActionListener(e -> new GraphWindow("y = 3x^2",2));
        b3.addActionListener(e -> new GraphWindow("y = -x^2 + x^3",3));
        b4.addActionListener(e -> new GraphWindow("y = x^3 + x^2 + x",4));
        b5.addActionListener(e -> new GraphWindow("y = x^5",5));
        b6.addActionListener(e -> new GraphWindow("y = sin(x)",6));
        b7.addActionListener(e -> new GraphWindow("y = cos(x-1)+x",7));
    }

    public static void main(String[] args) {
        new GraphicAll("Построение графиков");
    }
}

class GraphWindow extends JFrame {

    int type;

    GraphWindow(String title, int t){
        super(title);
        type = t;
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(new DrawPanel(type));
    }
}

class DrawPanel extends JPanel {

    int type;

    DrawPanel(int t){
        type = t;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();
        int centerX = w/2;
        int centerY = h/2;

        g.setColor(Color.LIGHT_GRAY);

        for(int i=0;i<w;i+=20)
            g.drawLine(i,0,i,h);

        for(int i=0;i<h;i+=20)
            g.drawLine(0,i,w,i);

        g.setColor(Color.BLACK);

        g.drawLine(centerX,0,centerX,h);
        g.drawLine(0,centerY,w,centerY);

        g.setColor(Color.RED);

        double scale = 40;

        int prevX=0, prevY=0;
        boolean first=true;

        for(double x=-10;x<=10;x+=0.05){

            double y=0;

            switch(type){

                case 1:
                    double k = 0.5;
                    y = k*x;
                    break;

                case 2:
                    y = 3*x*x;
                    break;

                case 3:
                    y = -x*x + x*x*x;
                    break;

                case 4:
                    y = x*x*x + x*x + x;
                    break;

                case 5:
                    y = Math.pow(x,5)/50;
                    break;

                case 6:
                    y = Math.sin(x);
                    break;

                case 7:
                    y = Math.cos(x-1)+x/5;
                    break;
            }

            int drawX = centerX + (int)(x*scale);
            int drawY = centerY - (int)(y*scale);

            if(!first)
                g.drawLine(prevX,prevY,drawX,drawY);

            prevX = drawX;
            prevY = drawY;
            first = false;
        }
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame
{
    private final JTextField tfCount;
    private JButton btnCount;
    private int count = 0;


    public Counter() {

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("Counter"));
        tfCount = new JTextField("0");
        tfCount.setEditable(false);
        cp.add(tfCount);
        btnCount = new JButton("Count");
        cp.add(btnCount);

        btnCount.addActionListener(new ActionListener() {
            @Override


            public void actionPerformed(ActionEvent evt) {
                ++count;
                tfCount.setText(count + "");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Counter");
        setSize(300, 100);
        setVisible(true);
    }
    // The entry main() method
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter();
            }
        });
    }
}

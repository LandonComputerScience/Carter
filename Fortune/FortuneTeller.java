package fortune;
// Fortune Teller

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;


public class FortuneTeller extends JFrame
        implements ActionListener
{
    private static final EasySound ding = new EasySound("C:\\Users\\Carter\\IdeaProjects\\CS\\src\\fortune\\ding.wav");

    // Declare an array of "fortunes" (strings):
    String[] fortunes = {"Fortune 1", "Fortune 2", "Fortune 3", "Fortune 4", "Fortune 5"};

    private JTextField display;

    public FortuneTeller()
    {
        super("Fortune Teller");

        display = new JTextField("  Press \"Next\" to see your fortune...", 25);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(display);
        c.add(go);
    }

    public void actionPerformed(ActionEvent e)
    {
        // Pick and display a random fortune:

        //int selection = new Random().nextInt(fortunes.length);

        int selection = (int) (Math.random() * fortunes.length);

        display.setText("  " + fortunes[selection]);
        ding.play();
    }

    public static void main(String[] args)
    {
        JFrame window = new FortuneTeller();
        window.setBounds(300, 300, 300, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }
}

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class TicTacToe implements ActionListener {
    Random r = new Random();
    JFrame f =new JFrame();
    JPanel title=new JPanel();
    JPanel button = new JPanel();
    JLabel text = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean p1_turn;
    TicTacToe(){
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,800);
        f.getContentPane().setBackground(Color.black);
        f.setLayout(new BorderLayout());
        f.setVisible(true);

        text.setBackground(Color.gray);
        text.setForeground(Color.black);
        text.setFont(new Font("Ink Free",Font.BOLD,75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Tic-Tac-Toe");
        text.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);

        title.add(text);
        f.add(title,BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void firstturn(){

    }
    public void check(){

    }
    public void xwins(int a,int b,int c){

    }
    public void owins(int a,int b,int c){

    }
}

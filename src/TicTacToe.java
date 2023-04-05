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

        button.setLayout(new GridLayout(3,3));
        button.setBackground(Color.cyan);

        for(int i =0;i<9;i++){
            buttons [i]=new JButton();
            button.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.ITALIC,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);

        title.add(text);
        f.add(title,BorderLayout.NORTH);
        f.add(button);
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

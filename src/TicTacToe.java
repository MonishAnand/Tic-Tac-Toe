import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class TicTacToe implements ActionListener {
    Random r = new Random();
    JFrame f = new JFrame();
    JPanel title = new JPanel();
    JPanel button = new JPanel();
    JLabel text = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean p1_turn;

    TicTacToe() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 800);
        f.getContentPane().setBackground(Color.black);
        f.setLayout(new BorderLayout());
        f.setVisible(true);

        text.setBackground(Color.gray);
        text.setForeground(Color.black);
        text.setFont(new Font("Ink Free", Font.BOLD, 75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Tic-Tac-Toe");
        text.setOpaque(true);

        button.setLayout(new GridLayout(3, 3));
        button.setBackground(Color.cyan);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.ITALIC, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title.setLayout(new BorderLayout());
        title.setBounds(0, 0, 800, 100);

        title.add(text);
        f.add(title, BorderLayout.NORTH);
        f.add(button);

        firstturn();
    }


    public void firstturn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (r.nextInt(2) == 0) {
            p1_turn = true;
            text.setText("X turn");
        } else {
            p1_turn = false;
            text.setText("O turn");
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (p1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.red);
                        buttons[i].setText("x");
                        p1_turn = false;
                        text.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.blue);
                        buttons[i].setText("o");
                        p1_turn = true;
                        text.setText("X turn");
                        check();

                    }
                }
            }
        }



    }

    public void check() {
        if(
                        (buttons[0].getText()=="x")&&
                        (buttons[1].getText()=="x")&&
                        (buttons[2].getText()=="x")
        ){
            xwins(0,1,2);
        }
        if (
                (buttons[3].getText()=="x")&&
                        (buttons[4].getText()=="x")&&
                        (buttons[5].getText()=="x")
        ){
            xwins(3,4,5);
        }
        if (
                (buttons[6].getText()=="x")&&
                        (buttons[7].getText()=="x")&&
                        (buttons[8].getText()=="x")
        ){
            xwins(6,7,8);
        }
        if (
                (buttons[0].getText()=="x")&&
                        (buttons[3].getText()=="x")&&
                        (buttons[6].getText()=="x")
        ){
            xwins(0,3,6);
        }
        if (
                (buttons[1].getText()=="x")&&
                        (buttons[4].getText()=="x")&&
                        (buttons[7].getText()=="x")
        ){
            xwins(1,4,7);
        }
        if (
                (buttons[2].getText()=="x")&&
                        (buttons[5].getText()=="x")&&
                        (buttons[8].getText()=="x")
        ){
            xwins(2,5,8);
        }
        if (
                (buttons[0].getText()=="x")&&
                        (buttons[4].getText()=="x")&&
                        (buttons[8].getText()=="x")
        ){
            xwins(0,4,8);
        }
        if (
                (buttons[2].getText()=="x")&&
                        (buttons[4].getText()=="x")&&
                        (buttons[6].getText()=="x")
        ){
            xwins(2,4,6);
        }

        if(
                (buttons[0].getText()=="o")&&
                        (buttons[1].getText()=="o")&&
                        (buttons[2].getText()=="o")
        ){
            owins(0,1,2);
        }
        if (
                (buttons[3].getText()=="o")&&
                        (buttons[4].getText()=="o")&&
                        (buttons[5].getText()=="o")
        ){
            owins(3,4,5);
        }
        if (
                (buttons[6].getText()=="o")&&
                        (buttons[7].getText()=="o")&&
                        (buttons[8].getText()=="o")
        ){
            owins(6,7,8);
        }
        if (
                (buttons[0].getText()=="o")&&
                        (buttons[3].getText()=="o")&&
                        (buttons[6].getText()=="o")
        ){
            owins(0,3,6);
        }
        if (
                (buttons[1].getText()=="o")&&
                        (buttons[4].getText()=="o")&&
                        (buttons[7].getText()=="o")
        ){
            owins(1,4,7);
        }
        if (
                (buttons[2].getText()=="o")&&
                        (buttons[5].getText()=="o")&&
                        (buttons[8].getText()=="o")
        ){
            owins(2,5,8);
        }
        if (
                (buttons[0].getText()=="o")&&
                        (buttons[4].getText()=="o")&&
                        (buttons[8].getText()=="o")
        ){
            owins(0,4,8);
        }
        if (
                (buttons[2].getText()=="o")&&
                        (buttons[4].getText()=="o")&&
                        (buttons[6].getText()=="o")
        ){
            owins(2,4,6);
        }
    }
    public void xwins(int a,int b,int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);

        for (int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        text.setText("X wins");
    }
    public void owins(int a, int b,int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);

        for (int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        text.setText("O wins");
    }
}



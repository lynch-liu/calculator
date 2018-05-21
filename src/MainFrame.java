import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class MainFrame {
    private JPanel panel1;
    private JButton oneButton;
    private JButton xAssignButton;
    private JButton xButton;
    private JButton yButton;
    private JButton zButton;
    private JButton sqrtButton;
    private JButton historyButton;
    private JLabel mainLabel;
    private JButton CBotton;
    private JButton equalButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton squreButton;
    private JButton minusButton;
    private JButton plusButton;
    private JButton zeroButton;
    private JButton dotButton;
    private JButton dividButton;
    private JButton cubeButton;
    private JButton multiplyButton;
    private JButton nineButton;
    private JButton remainderButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton delButton;
    private JButton yAssignButton;
    private JButton zAssignButton;
    private JLabel xLabel;
    private JLabel yLabel;
    private JLabel zLabel;
    private JLabel subLabel;

    private double result;
    private double prev;
    private double x;
    private double y;
    private double z;
    private int operation = 0;
    private final int PLUS = 1;
    private final int MINUS = 2;
    private final int MULTIPLY = 3;
    private final int DIVID = 4;
    private final int SQ= 5;
    private final int CB= 6;
    private final int SQRT= 7;
    private final int NOOP= 0;


    public MainFrame() {
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO:History window below
            }
        });
        xAssignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                x = result;
                xLabel.setText(""+x);
            }
        });
        yAssignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                y = result;
                yLabel.setText(""+y);
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                z = result;
                zLabel.setText(""+z);
            }
        });
        CBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearButtonPushed();
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = PLUS;
                prev =
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        dividButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        remainderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        squreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cubeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();

            }
        });
        zAssignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
    //update result value
    private void updateResult(){
        switch(result){
            case PLUS:
                result = prev + Double.parseDouble(mainLabel.getText());
                break;
            case MINUS:
                result = prev - Double.parseDouble(mainLabel.getText());
                break;
            case MULTIPLY:
                result = prev * Double.parseDouble(mainLabel.getText());
                break;
            case DIVID:
                result = prev / Double.parseDouble(mainLabel.getText());
                break;
            case SQ:
                result = (Double.parseDouble(mainLabel.getText()))*(Double.parseDouble(mainLabel.getText()));
                break;
            case CB:

                break;
            case SQRT:

                break;
        }
    }
    //add a String to the mainLabel
    private void addTextToField(String s){
        if(mainLabel.getText().length()<8) {
            mainLabel.setText(mainLabel.getText() + s);
        }else{

        }
    }
    private void addTextToSubField(String s){
            subLabel.setText(subLabel.getText() + s);
    }
    //clear the mainLabel
    private void clearButtonPushed(){
        mainLabel.setText("");
        Operation = NOOP;
    }

}

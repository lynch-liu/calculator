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

    private double result = 0;
    private double prev = 0;
    private boolean havePrev = false;
    private double x = 0;
    private boolean haveX = false;
    private double y = 0;
    private boolean haveY = false;
    private double z = 0;
    private boolean haveZ = false;
    private int operation = 0;
    private boolean

    private final int PLUS = 1;
    private final int MINUS = 2;
    private final int MULTIPLY = 3;
    private final int DIVID = 4;
    private final int SQ= 5;
    private final int CB= 6;
    private final int SQRT= 7;
    private final int RM= 7;
    private final int NOOP= 0;


    public MainFrame() {
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO:History window below
            }
        });


        // assign and recall function for X Y Z
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
        zAssignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        yButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
        /////////////////////////////////////////////////////
        //Function buttons

        CBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearButtonPushed();
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = PLUS;
                
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = MINUS;
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = MULTIPLY;
            }
        });
        dividButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = DIVID;
            }
        });
        remainderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = RM;
            }
        });
        squreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = SQ;
            }
        });
        cubeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = CB;
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
                operation = SQRT;
            }
        });
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainLabel.getText().length() > 0){
                    String tempS = mainLabel.getText();
                    tempS = tempS.substring(0,tempS.length()-2);
                    mainLabel.setText(tempS);
                }
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResult();
            }
        });

        //////////////////////////////////////////////////////////
        //Digit Button will add a char to the mainLabel
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("1");
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("2");
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("3");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("4");
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("5");
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("6");
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("7");
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("9");
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField("0");
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextToField(".");
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
                result = (Double.parseDouble(mainLabel.getText()))*(Double.parseDouble(mainLabel.getText()))*(Double.parseDouble(mainLabel.getText()));
                break;
            case SQRT:
                result = Math.sqrt(Double.parseDouble(mainLabel.getText()));
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
        havePrev = false;
        operation = NOOP;
    }

}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    private final int PLUS = 1;
    private final int MINUS = 2;
    private final int MULTIPLY = 3;
    private final int DIVID = 4;
    private final int SQ = 5;
    private final int CB = 6;
    private final int SQRT = 7;
    private final int RM = 8;
    private final int NOOP = 0;
    private JPanel panel1;
    private JButton oneButton;
    private JButton xAssignButton;
    private JButton xButton;
    private JButton yButton;
    private JButton zButton;
    private JButton sqrtButton;
    private JButton historyButton;
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
    private JTextField mainLabel;
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
    private boolean haveDot = false;


    public static void main(String[] args) {
        JFrame frame = new JFrame("MainFrame");
        frame.setContentPane(new MainFrame().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainFrame() {
        mainLabel.disable();
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO:History window below
            }
        });

        /////////////////////////////////////////////////////
        // assign and recall function for X Y Z
        /////////////////////////////////////////////////////
        xAssignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainLabel.getText().substring(mainLabel.getText().length()-2 , mainLabel.getText().length()-1) == ".")
                    mainLabel.setText(mainLabel.getText()+"0");

                x = Double.parseDouble(mainLabel.getText());
                xLabel.setText("" + x);
                haveX = true;
            }
        });
        yAssignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                y = Double.parseDouble(mainLabel.getText());
                yLabel.setText("" + y);
                haveY = true;
            }
        });
        zAssignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                z = Double.parseDouble(mainLabel.getText());
                zLabel.setText("" + z);
                haveZ = true;
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (haveX) {
                    mainLabel.setText(x + "");
                }
            }
        });
        yButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (haveY) {
                    mainLabel.setText(y + "");
                }
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (haveZ) {
                    mainLabel.setText(z + "");
                }
            }
        });
        /////////////////////////////////////////////////////
        //Function buttons
        /////////////////////////////////////////////////////
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainLabel.getText().length() == 0){
                }else if(havePrev){
                    updateResult();
                    prev = result;
                    clearLabel();
                }else {
                    prev = Double.parseDouble(mainLabel.getText());
                    havePrev = true;
                    clearLabel();
                }
                operation = PLUS;

            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainLabel.getText().length() == 0){
                }else if(havePrev){
                    updateResult();
                    prev = result;
                    clearLabel();
                }else {
                    prev = Double.parseDouble(mainLabel.getText());
                    havePrev = true;
                    clearLabel();
                }
                operation = MINUS;
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainLabel.getText().length() == 0){
                }else if(havePrev){
                    updateResult();
                    prev = result;
                    clearLabel();
                }else {
                    prev = Double.parseDouble(mainLabel.getText());
                    havePrev = true;
                    clearLabel();
                }
                operation = MULTIPLY;
            }
        });
        dividButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainLabel.getText().length() == 0){
                }else if(havePrev){
                    updateResult();
                    prev = result;
                    clearLabel();
                }else {
                    prev = Double.parseDouble(mainLabel.getText());
                    havePrev = true;
                    clearLabel();
                }
                operation = DIVID;
            }
        });
        remainderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainLabel.getText().length() == 0){
                }else if(havePrev){
                    updateResult();
                    prev = result;
                    clearLabel();
                }else {
                    prev = Double.parseDouble(mainLabel.getText());
                    havePrev = true;
                    clearLabel();
                }
                operation = RM;
            }
        });
        squreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(havePrev){
                    updateResult();
                    mainLabel.setText(""+result);
                }
                operation = SQ;
                equalButtonPushed();

            }
        });
        cubeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(havePrev){
                    updateResult();
                    mainLabel.setText(""+result);
                }
                operation = CB;
                equalButtonPushed();
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(havePrev){
                    updateResult();
                    mainLabel.setText(""+result);
                }
                operation = SQRT;
                equalButtonPushed();
            }
        });
        ////////////////////
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mainLabel.getText().length() > 0) {

                    String tempS = mainLabel.getText();
                    if(mainLabel.getText().charAt(mainLabel.getText().length()-1) == '.')
                        haveDot = false;
                    tempS = tempS.substring(0, tempS.length() - 1);
                    mainLabel.setText(tempS);
                }
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                equalButtonPushed();
                prev = result;

            }
        });
        CBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearButtonPushed();
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
                if (!haveDot) {
                    addTextToField(".");
                    haveDot = true;
                }
            }
        });


    }

    //update result value
    private void updateResult() {
        if (mainLabel.getText().charAt(mainLabel.getText().length() - 1) == '.'){
            mainLabel.setText(mainLabel.getText() + "0");
        }
        if(mainLabel.getText().length() == 0){
            mainLabel.setText("0.0");
        }
        switch (operation) {
            case PLUS:
                if (havePrev) {
                    result = prev + Double.parseDouble(mainLabel.getText());
                }
                break;
            case MINUS:
                if (havePrev) {
                    result = prev - Double.parseDouble(mainLabel.getText());
                }
                break;
            case MULTIPLY:
                if (havePrev) {
                    result = prev * Double.parseDouble(mainLabel.getText());
                }
                break;
            case DIVID:
                if (havePrev) {
                    result = prev / Double.parseDouble(mainLabel.getText());
                }
                break;
            case RM:
                if (havePrev) {
                    result = prev % Double.parseDouble(mainLabel.getText());
                }
                break;
            case SQ:
                result = (Double.parseDouble(mainLabel.getText())) * (Double.parseDouble(mainLabel.getText()));
                break;
            case CB:
                result = (Double.parseDouble(mainLabel.getText())) * (Double.parseDouble(mainLabel.getText())) * (Double.parseDouble(mainLabel.getText()));
                break;
            case SQRT:
                result = Math.sqrt(Double.parseDouble(mainLabel.getText()));
                break;
            default:
                break;
        }
    }

    private void showResult() {
        mainLabel.setText(result + "");
    }

    //add a String to the mainLabel
    private void addTextToField(String s) {
        if (haveDot) {
            mainLabel.setText(mainLabel.getText() + s);
        } else {
            if (mainLabel.getText().length() <= 8) {
                mainLabel.setText(mainLabel.getText() + s);
            }
        }
    }
    //equal action
    private void equalButtonPushed(){
        if(havePrev){
            updateResult();
            operation = NOOP;
            showResult();
        }else{
            updateResult();
            operation = NOOP;
            showResult();
        }
    }
    //clearbutton's action
    private void clearButtonPushed() {
        clearLabel();
        havePrev = false;
        operation = NOOP;
    }

    private void clearLabel() {
        mainLabel.setText("");
        haveDot = false;
    }

}

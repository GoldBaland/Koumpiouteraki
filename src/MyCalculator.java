import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends JFrame {

    private double total1 =  0.0;
    private double total2 =  0.0;
    private char math_operator;



    private JPanel rootPanel;
    private JButton btnEquals;
    private JLabel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnZero;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnClear;
    private JButton btnPoint;

    private void getOperation (String btnText){
        math_operator = btnText.charAt(0);
        textDisplay.setText("");
    }


    public MyCalculator()
    {
        add(rootPanel);
        setTitle("MyCalculator");
        setSize(600,600);


        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });

        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (math_operator) {
                    case '+':
                        total2 =  total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        total2 =  total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        total2 =  total1 * Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 =  total1 / Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(total2));
                total1=0;

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2=0;
                textDisplay.setText("");
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total1 =  total1 + Double.parseDouble(textDisplay.getText());
                String button_Text = btnPlus.getText();
                getOperation(button_Text);

            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total1 =  total1 +  Double.parseDouble(textDisplay.getText());
                String button_Text = btnMinus.getText();
                getOperation(button_Text);

            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total1 = total1 + Double.parseDouble(textDisplay.getText());
                String button_Text = btnMultiply.getText();
                getOperation(button_Text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total1 =  total1 + Double.parseDouble(textDisplay.getText());
                String button_Text = btnDivide.getText();
                getOperation(button_Text);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnPiontText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPiontText);
            }
        });
    }



}

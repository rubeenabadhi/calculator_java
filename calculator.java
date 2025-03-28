import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class calculator implements ActionListener {
    String oparator,currentText;
    boolean isOparation=false;
    String oldValue,newValue;
    float result=0,memoryValue=0,flag=0;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eightButton,nineButton;
    JButton fourButton,fiveButton,sixButton;
    JButton oneButton,twoButton,threeButton,zeroButton;
    JButton plusButton,dotButton,minusButton,multiButton,divisionButton,equalButton;
    JButton backButton,clearButton,squareButton,plusMinusButton,percntButton,mrcButton,mPlusButton,mMinusButton;
    public calculator(){
        jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(500,600);
        jf.setLocation(200,100);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel=new JLabel();
        displayLabel.setFont(new Font("Arial", Font.BOLD, 40));
        displayLabel.setBounds(30, 40, 430, 50);
        displayLabel.setBackground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.black);
        Border border = BorderFactory.createLineBorder(Color.black);
        displayLabel.setBorder(border);
        jf.add(displayLabel);
        
        
        
        sevenButton=new JButton("7");
        sevenButton.setBounds(30 , 160, 70, 70);
        sevenButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(120, 160, 70, 70);
        eightButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(210, 160, 70, 70);
        nineButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        plusButton=new JButton("+");
        plusButton.setBounds(300, 160, 70, 70);
        plusButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        plusButton.addActionListener(this);
        jf.add(plusButton);
        
        squareButton=new JButton("\u221A");
        squareButton.setBounds(390, 160, 70, 70);
        squareButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        squareButton.addActionListener(this);
        jf.add(squareButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30, 260, 70, 70);
        fourButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(120, 260, 70, 70);        
        fiveButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(210, 260, 70, 70);
        sixButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        minusButton=new JButton("-");
        minusButton.setBounds(300, 260, 70, 70);
        minusButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusMinusButton=new JButton("\u00B1");
        plusMinusButton.setBounds(390, 260, 70, 70);
        plusMinusButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        plusMinusButton.addActionListener(this);
        jf.add(plusMinusButton);
        
    
        oneButton=new JButton("1");
        oneButton.setBounds(30, 360, 70, 70);
        oneButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        oneButton.addActionListener(this);
        jf.add(oneButton);
         
        twoButton=new JButton("2");
        twoButton.setBounds(120, 360, 70, 70);
        twoButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        twoButton.addActionListener(this);
        jf.add(twoButton);
        
        threeButton=new JButton("3");
        threeButton.setBounds(210, 360, 70, 70);
        threeButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        multiButton=new JButton("x");
        multiButton.setBounds(300, 360, 70, 70);
        multiButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        multiButton.addActionListener(this);
        jf.add(multiButton);
        
        percntButton=new JButton("%");
        percntButton.setBounds(390, 360, 70, 70);
        percntButton.setFont(new Font("Tahoma",Font.BOLD, 25));
        percntButton.addActionListener(this);
        jf.add(percntButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(30, 460, 70, 70);
        zeroButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        
        dotButton=new JButton(".");
        dotButton.setBounds(120, 460, 70, 70);
        dotButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        dotButton.addActionListener(this);
        jf.add(dotButton);
        
        equalButton=new JButton("=");
        equalButton.setBounds(210, 460, 70, 70);
        equalButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        equalButton.addActionListener(this);
        jf.add(equalButton);
        
        divisionButton=new JButton("/");
        divisionButton.setBounds(300, 460, 70, 70);
        divisionButton.setFont(new Font("Tahoma",Font.BOLD, 35));
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

        clearButton=new JButton("AC");
        clearButton.setBounds(390, 460, 70, 70);
        clearButton.setFont(new Font("Tahoma",Font.BOLD, 25));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        backButton=new JButton("Back");
        backButton.setBounds(30, 100, 115, 40);
        backButton.setFont(new Font("Tahoma",Font.BOLD, 20));
        backButton.addActionListener(this);
        jf.add(backButton);

        mrcButton=new JButton("MRC");
        mrcButton.setBounds(165, 100, 115, 40);
        mrcButton.setFont(new Font("Tahoma",Font.BOLD, 20));
        mrcButton.addActionListener(this);
        jf.add(mrcButton);

        mPlusButton=new JButton("M+");
        mPlusButton.setBounds(300, 100, 70, 40);
        mPlusButton.setFont(new Font("Tahoma",Font.BOLD, 20));
        mPlusButton.addActionListener(this);
        jf.add(mPlusButton);

        mMinusButton=new JButton("M-");
        mMinusButton.setBounds(390, 100, 70, 40);
        mMinusButton.setFont(new Font("Tahoma",Font.BOLD, 20));
        mMinusButton.addActionListener(this);
        jf.add(mMinusButton);

        
        
        
         
    }

    public static void main(String[] args) { 
        new calculator(); 
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==sevenButton){
            if(isOparation){
                displayLabel.setText("7");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }    
        }else if(e.getSource()==eightButton){
            if(isOparation){
                displayLabel.setText("8");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");

            }
        }else if(e.getSource()==nineButton){
            if(isOparation){
                displayLabel.setText("9");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }else if (e.getSource()==sixButton) {
            if(isOparation){
                displayLabel.setText("6");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }else if (e.getSource()==fiveButton) {
            if(isOparation){
                displayLabel.setText("5");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }else if (e.getSource()==fourButton) {
            if(isOparation){
                displayLabel.setText("4");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }else if (e.getSource()==threeButton) {
            if(isOparation){
                displayLabel.setText("3");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }else if (e.getSource()==twoButton) {
            if(isOparation){
                displayLabel.setText("2");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }else if (e.getSource()==oneButton) {
            if(isOparation){
                displayLabel.setText("1");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }else if (e.getSource()==zeroButton) {
            if(isOparation){
                displayLabel.setText("0");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }else if (e.getSource()==dotButton) {
            if(isOparation){
                displayLabel.setText(".");
                isOparation=false;
            }else{
                displayLabel.setText(displayLabel.getText()+".");
            }
    

        }else if (e.getSource()==plusButton) {
            isOparation=true;
            oldValue=displayLabel.getText();
            oparator="+";
        }else if (e.getSource()==minusButton) {
            isOparation=true;
            oldValue=displayLabel.getText();
            oparator="-";
        }else if (e.getSource()==multiButton) {
            isOparation=true;
            oldValue=displayLabel.getText();
            oparator="X";
        }else if (e.getSource()==divisionButton) {
            isOparation=true;
            oldValue=displayLabel.getText();
            oparator="/";
        }else if(e.getSource()==percntButton){
            isOparation=true;
            oldValue=displayLabel.getText();
            oparator="%";
            
        }else if (e.getSource()==equalButton) {
            String newValue=displayLabel.getText();
            float oldValueConvert=Float.parseFloat(oldValue);
            float newValueConvert=Float.parseFloat(newValue); 
            switch (oparator) {
                case "+":
                    result=oldValueConvert+newValueConvert;
                    System.out.println(result);
                    break;
                case "-":
                    result=oldValueConvert-newValueConvert;
                    System.out.println(result);
                    break;
                case "X":
                    result=oldValueConvert*newValueConvert;
                    System.out.println(result);
                    break;
                case "/":
                    if(newValueConvert !=0||oldValueConvert!=0){
                        result=oldValueConvert/newValueConvert;
                        System.out.println(result);
                
                        
                    }else{
                        result=0;
                    }
                case "%" :
                    result=(oldValueConvert * newValueConvert) / 100;
                    System.out.println(result);
                    break;

                default:
                    displayLabel.setText("error");
                    break;
            }
            displayLabel.setText(result + "");      
               
            
        }else if (e.getSource()==backButton) {
            currentText=displayLabel.getText();
            if (!currentText.isEmpty()) {
                char[] oldTextArray = currentText.toCharArray();
                char[] newTextArray = new char[oldTextArray.length - 1];

                for(int i=0;i<oldTextArray.length - 1;i++){
                    newTextArray[i]=oldTextArray[i];

                }
                displayLabel.setText(new String(newTextArray));
                
            }
        }else if (e.getSource()==clearButton) {
            displayLabel.setText("");

        }else if(e.getSource()==squareButton){
            isOparation=true;
            currentText=displayLabel.getText();
            float currentTextConvert=Float.parseFloat(currentText);
            result=currentTextConvert*currentTextConvert;
            displayLabel.setText(result+"");
            
        }else if(e.getSource()==plusMinusButton){
            isOparation=true;
            currentText=displayLabel.getText();
            float currentTextConvert=Float.parseFloat(currentText);
            if(currentTextConvert>0){
                displayLabel.setText("-"+currentText);
            }else if(currentTextConvert<0){
                displayLabel.setText(String.valueOf(-currentTextConvert));
            }else{
                displayLabel.setText("Error");
            }
        }else if(e.getSource()==mPlusButton){
            newValue=displayLabel.getText();
            float newValueConvert=Float.parseFloat(newValue);
            memoryValue+=newValueConvert;
            System.out.println(memoryValue);
            displayLabel.setText(memoryValue+"");
        }else if(e.getSource()==mMinusButton){
            newValue=displayLabel.getText();
            float newValueConvert=Float.parseFloat(newValue);
            memoryValue-=newValueConvert;
            displayLabel.setText(memoryValue+"");
        }else if(e.getSource()==mrcButton){
            flag++;
            if(flag==1){
                displayLabel.setText(String.valueOf(memoryValue+""));
            }else if(flag>=2){
                memoryValue=0;
                displayLabel.setText(memoryValue+"");
            }
        }else{
            displayLabel.setText("");
        }
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author BOKAMOSO
 */
public class GymMemberShipFrame extends JFrame{
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractPnl;
    private JPanel membershipPnl;
    private JPanel personalTrainerPnl;
    private JPanel membershipAndCommentsPnl;
    private JPanel headingAndClientPnl;
    private JPanel commentsPnl;
    private JPanel mainPnl;
    private JPanel buttonPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel personalTrainerLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idTxtFld;
    
    private JComboBox genderCmbx;
    
    private JRadioButton monthRadioBtn;
    private JRadioButton sixMonthRadioBtn;
    private JRadioButton annualRadioBtn;
    
    private JCheckBox personalTrainerChkBox;
    
    private JTextArea commentsTxtArea;
    private JScrollPane scrollableText;
    private ButtonGroup btnGrp;
    private JButton applyBtn;

    public GymMemberShipFrame() {
        setSize(500,550);
        setTitle("Gym membership");
        
        headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        clientPnl=new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.GREEN,1),"Client details"));
        
        namePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        contractPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        membershipPnl=new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.GREEN,1),"Contract options"));
        commentsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        headingAndClientPnl=new JPanel(new BorderLayout());
        membershipAndCommentsPnl=new JPanel(new BorderLayout());
        mainPnl=new JPanel(new BorderLayout());
        
        headingLbl=new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC+Font.BOLD,20));
        headingLbl.setForeground(Color.GREEN);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl=new JLabel("Name:  ");
        surnameLbl=new JLabel("surname: ");
        idNoLbl=new JLabel("IDd no:  ");
        genderLbl=new JLabel("Gender:  ");
        contractTypeLbl=new JLabel("Type of contract: ");
        personalTrainerLbl=new JLabel("Select the checkbox if you need a personal trainer");
        
        nameTxtFld=new JTextField(10);
        surnameTxtFld=new JTextField(10);
        idTxtFld=new JTextField(10);
        
        genderCmbx=new JComboBox();
        genderCmbx.addItem("Male");
        genderCmbx.addItem("Female");
        
        monthRadioBtn=new JRadioButton("Month-to-month");
        sixMonthRadioBtn=new JRadioButton("six months");
        annualRadioBtn=new JRadioButton("Annual");
        
        personalTrainerChkBox=new JCheckBox();
        
        btnGrp=new ButtonGroup();
        btnGrp.add(monthRadioBtn);
        btnGrp.add(sixMonthRadioBtn);
        btnGrp.add(annualRadioBtn);
        
        commentsTxtArea=new JTextArea(20,40);
        commentsTxtArea.setBorder(new TitledBorder(new LineBorder(Color.blue,1),"Comments"));
        scrollableText=new JScrollPane(commentsTxtArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn=new JButton("apply");
        
        headingPnl.add(headingLbl);
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idTxtFld);
        genderPnl.add(genderLbl);
        genderPnl.add(genderCmbx);
        
        contractPnl.add(contractTypeLbl);
        contractPnl.add(monthRadioBtn);
        contractPnl.add(sixMonthRadioBtn);
        contractPnl.add(annualRadioBtn);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        personalTrainerPnl.add(personalTrainerLbl);
        personalTrainerPnl.add(personalTrainerChkBox);
       
        membershipPnl.add(contractPnl);
        membershipPnl.add(personalTrainerPnl);
        
        
        buttonPnl.add(applyBtn);
        headingAndClientPnl.add(headingPnl,BorderLayout.NORTH);
        headingAndClientPnl.add(clientPnl,BorderLayout.CENTER);
        membershipAndCommentsPnl.add(membershipPnl,BorderLayout.NORTH);
        membershipAndCommentsPnl.add(commentsPnl,BorderLayout.CENTER);
        commentsPnl.add(scrollableText);
        
        mainPnl.add(headingAndClientPnl,BorderLayout.NORTH);
        mainPnl.add(membershipAndCommentsPnl,BorderLayout.CENTER);
        mainPnl.add(buttonPnl,BorderLayout.SOUTH);
                
        add(mainPnl);
        pack();
        setVisible(true);
        
    }
    
    
    
}

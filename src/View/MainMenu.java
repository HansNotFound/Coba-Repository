/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Controller;
import Model.DataUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author HansNotFound
 */
public class MainMenu extends JFrame implements ActionListener{
    JFrame frame;
    JButton buttonInputData;
    JButton buttonPrintData;
    JButton buttonExit;
    
    public MainMenu(){
        frame = new JFrame("E-KTP Online Republik Harapan Bangsa");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        
        buttonInputData = new JButton("Input Data");
        buttonPrintData = new JButton("Print Data");
        buttonInputData.setBounds(80, 90, 100, 100);
        buttonInputData.addActionListener(this);
        
        buttonExit = new JButton("EXIT");
        buttonExit.setBounds(140, 250, 100, 50);
        //buttonExit.setAlignmentX(Component.CENTER_ALIGNMENT);
        //buttonExit.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonExit.addActionListener(this);
        
        buttonPrintData = new JButton("Print Data");
        buttonPrintData.setBounds(210, 90, 100, 100);
        buttonPrintData.addActionListener(this);
        
        frame.add(buttonExit);
        frame.add(buttonInputData /*, BorderLayout.WEST*/);
        frame.add(buttonPrintData);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    //DataUser du = new DataUser();
    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command) {
            case "Input Data":
                frame.setVisible(false);
                /*ArrayList<DataUser> listUser = new ArrayList<>();
                listUser = Controller.getAllUsers();
                for(int i = 0; i < listUser.size(); i++){
                    System.out.println(listUser.get(i).toString());
                }*/
                new JFrame_InputData();
                //
                break;
            case "Print Data":
                frame.setVisible(false);
                String NIK = JOptionPane.showInputDialog("Masukkan NIK = ");
                ArrayList<DataUser> listUser;
                listUser = Controller.getAllUsers();
                DataUser user = new DataUser();
                boolean ktemu = false;
                for(int i = 0; i < listUser.size(); i++){
                    if(NIK.equals(listUser.get(i).getNIK())){
                        user = Controller.getUser(NIK);
                        ktemu = true;
                        break;
                    }
                }
                if(ktemu == false){
                    JOptionPane.showMessageDialog(null, "NIK tidak ditemukan");
                    new MainMenu();
                    
                }
                new JFrame_FilledData(user);
                
                break;
            case "EXIT": 
                System.exit(0);
                break;
        }
    }
}

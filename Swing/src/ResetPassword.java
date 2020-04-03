import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ResetPassword extends JFrame implements ActionListener{
    
    private JFrame frame;
    private JLabel resetLable, emailLable, passwordLabel;
    private JPasswordField passwordField;
    private JTextField emailTextField;
    private JButton resetButton, clearButton, homeButton;
    private Font font1, font2;
    
    ResetPassword()
    {
        frame = new JFrame();
        
        font1 = new Font("Arial", Font.BOLD, 22);
        font2 = new Font("Arial", Font.BOLD, 15);
        
        resetLable = new JLabel("Reset Password!");
        resetLable.setBounds(180, 10, 500, 50);
        resetLable.setFont(font1);
        frame.add(resetLable);
        
        emailLable = new JLabel("Enter your email: ");
        emailLable.setBounds(50, 50, 150, 50);
        emailLable.setFont(font2);
        frame.add(emailLable);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(50, 90, 200, 30);
        emailTextField.setFont(font2);
        frame.add(emailTextField);
        
        passwordLabel = new JLabel("Enter new password: ");
        passwordLabel.setBounds(50, 120, 200, 50);
        passwordLabel.setFont(font2);
        frame.add(passwordLabel);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(50, 160, 200, 30);
        passwordField.setFont(font2);
        frame.add(passwordField);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(130, 215, 70, 30);
        frame.add(homeButton);
        homeButton.addActionListener(this);
        
        resetButton = new JButton("Reset");
        resetButton.setBounds(225, 215, 70, 30);
        frame.add(resetButton);
        resetButton.addActionListener(this);
                
        clearButton = new JButton("Clear");
        clearButton.setBounds(320, 215, 80, 30);
        frame.add(clearButton);
        clearButton.addActionListener(this);
        
        frame.setBounds(700,300,550,350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Reset Demo");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            String email = emailTextField.getText();
            String pass = passwordField.getText();
            
            if (email.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null,"All field must be filled out!");
            }
            else {
                try {       
                    Class.forName("com.mysql.jdbc.Driver");
      
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingtest","root", "");
                    
                    Statement st = con.createStatement();
                    int i = st.executeUpdate(" update members " + " set password = '"+ pass +"' where email = '"+ email +"' ");
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null,"Reset Successfull!");
                        LoginFrame loginFrame = new LoginFrame();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Reset Failed!");
                        emailTextField.setText(null);
                        passwordField.setText(null);
                    }
                    
                 } catch(SQLException e1){
                    JOptionPane.showMessageDialog(null, e1.getMessage());
                 } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage());
                }
            }
            
        }
        else if (e.getActionCommand().equals("Clear")) {
            emailTextField.setText(null);
            passwordField.setText(null);
        }
        else if (e.getActionCommand().equals("Home")) {
            LoginFrame loginFrame = new LoginFrame();
            frame.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        
        ResetPassword resetPassword = new ResetPassword();
    }
   
}

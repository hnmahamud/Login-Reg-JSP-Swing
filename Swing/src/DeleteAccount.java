import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class DeleteAccount extends JFrame implements ActionListener{
    
    private JFrame frame;
    private JLabel deleteLable, emailLable, passwordLabel;
    private JTextField emailTextField, passwordField;
    private JButton deleteButton, clearButton, homeButton;
    private Font font1, font2;
    
    DeleteAccount()
    {
        frame = new JFrame();
        
        font1 = new Font("Arial", Font.BOLD, 22);
        font2 = new Font("Arial", Font.BOLD, 15);
        
        deleteLable = new JLabel("Delete Account!");
        deleteLable.setBounds(180, 10, 500, 50);
        deleteLable.setFont(font1);
        frame.add(deleteLable);
        
        emailLable = new JLabel("Enter your email: ");
        emailLable.setBounds(50, 50, 150, 50);
        emailLable.setFont(font2);
        frame.add(emailLable);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(50, 90, 200, 30);
        emailTextField.setFont(font2);
        frame.add(emailTextField);
        
        passwordLabel = new JLabel("Enter your password: ");
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
        
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(225, 215, 70, 30);
        frame.add(deleteButton);
        deleteButton.addActionListener(this);
                
        clearButton = new JButton("Clear");
        clearButton.setBounds(320, 215, 80, 30);
        frame.add(clearButton);
        clearButton.addActionListener(this);
        
        frame.setBounds(700,300,550,350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Delete Demo");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deleteButton) {
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
                    int i = st.executeUpdate(" delete from members " + " where email = '"+ email +"' and password = '"+pass+"' ");
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null,"Delete Successfull!");
                        LoginFrame loginFrame = new LoginFrame();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Reset Failed!");
                        emailTextField.setText(null);
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
        }
        else if (e.getActionCommand().equals("Home")) {
            LoginFrame loginFrame = new LoginFrame();
            frame.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        
        DeleteAccount deleteAccount = new DeleteAccount();
    }
   
}

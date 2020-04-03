import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LoginFrame extends JFrame implements ActionListener{  
    
    private JFrame frame;
    private JLabel usernameLabel, passwordLabel, fnameLable, lnameLable, emailLable, unameLable, genderLable, districtLable, welcomeLable, loginLable, phoneLable, bloodLable, addressLable;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton, signupButton, logoutButton, deleteButton, forgetButton, clearButton;
    private Font font1, font2;

     LoginFrame() {
    
        frame = new JFrame();
        
        font1 = new Font("Arial", Font.BOLD, 22);
        font2 = new Font("Arial", Font.BOLD, 15);
        
        loginLable = new JLabel("Account Login!");
        loginLable.setBounds(180, 10, 500, 50);
        loginLable.setFont(font1);
        frame.add(loginLable);
        
        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 50, 150, 50);
        usernameLabel.setFont(font2);
        frame.add(usernameLabel);
        
        usernameTextField = new JTextField();
        usernameTextField.setBounds(50, 90, 200, 30);
        usernameTextField.setFont(font2);
        frame.add(usernameTextField);
        
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 120, 150, 50);
        passwordLabel.setFont(font2);
        frame.add(passwordLabel);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(50, 160, 200, 30);
        passwordField.setFont(font2);
        frame.add(passwordField);
        
        forgetButton = new JButton("Forget pass?");
        forgetButton.setBounds(60, 260, 110, 30);
        frame.add(forgetButton);
        forgetButton.addActionListener(this);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(200, 260, 70, 30);
        frame.add(loginButton);
        loginButton.addActionListener(this);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(300, 260, 70, 30);
        frame.add(clearButton);
        clearButton.addActionListener(this);
                
        signupButton = new JButton("Signup");
        signupButton.setBounds(400, 260, 80, 30);
        frame.add(signupButton);
        signupButton.addActionListener(this);
        
        frame.setBounds(700,300,600,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Login Demo");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == loginButton) {
            String user = usernameTextField.getText();
            String pass = passwordField.getText();
            
            if (user.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null,"All field must be filled out!");
            }
            else {
                try {
                
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingtest","root", "");
    
                Statement st = con.createStatement();
    
                ResultSet rs;
                rs = st.executeQuery(" select * from members " + " where username = '" + user + "' and password='" + pass + "' ");
                if (rs.next()) {
                    String first_name = rs.getString("first_name");
                    String last_name =(rs.getString("last_name"));
                    int phone = (rs.getInt("phone"));
                    String email =(rs.getString("email"));
                    String username =(rs.getString("username"));
                    String district =(rs.getString("district"));
                    String gender =(rs.getString("gender"));
                    String blood_group =(rs.getString("blood_group"));
                    String address =(rs.getString("address"));
                    
                    JOptionPane.showMessageDialog(null,"Login Successfull!");
                    
                    loginLable.setVisible(false);
                    usernameLabel.setVisible(false);
                    usernameTextField.setVisible(false);
                    passwordLabel.setVisible(false);
                    passwordField.setVisible(false);
                    forgetButton.setVisible(false);
                    loginButton.setVisible(false);
                    signupButton.setVisible(false);
                    clearButton.setVisible(false);
                    
                    welcomeLable = new JLabel();
                    welcomeLable.setBounds(60, 20, 500, 30);
                    welcomeLable.setFont(font1);
                    frame.add(welcomeLable);
                    
                    fnameLable = new JLabel();
                    fnameLable.setBounds(50, 100, 500, 30);
                    fnameLable.setFont(font2);
                    frame.add(fnameLable);

                    lnameLable = new JLabel();
                    lnameLable.setBounds(300, 100, 500, 30);             
                    lnameLable.setFont(font2);
                    frame.add(lnameLable);

                    phoneLable = new JLabel();
                    phoneLable.setBounds(50, 140, 500, 30);
                    phoneLable.setFont(font2);
                    frame.add(phoneLable);

                    emailLable = new JLabel();
                    emailLable.setBounds(300, 140, 500, 30);
                    emailLable.setFont(font2);
                    frame.add(emailLable);

                    districtLable = new JLabel();
                    districtLable.setBounds(50, 180, 500, 30);
                    districtLable.setFont(font2);
                    frame.add(districtLable);

                    genderLable = new JLabel();
                    genderLable.setBounds(300, 180, 500, 30);
                    genderLable.setFont(font2);
                    frame.add(genderLable);
                    
                    bloodLable = new JLabel();
                    bloodLable.setBounds(50, 220, 500, 30);
                    bloodLable.setFont(font2);
                    frame.add(bloodLable);
                    
                    addressLable = new JLabel();
                    addressLable.setBounds(300, 220, 500, 30);
                    addressLable.setFont(font2);
                    frame.add(addressLable);
                    
                    welcomeLable.setText("Hello " + username + ", Welcome to your account!");
                    fnameLable.setText("First Name: " + first_name);
                    lnameLable.setText("Last Name: " + last_name);
                    phoneLable.setText("Phone: " + phone);
                    emailLable.setText("Email: " + email);
                    districtLable.setText("District: " + district);
                    genderLable.setText("Gender: " + gender);
                    bloodLable.setText("Blood Group: " + blood_group);
                    addressLable.setText("Address: " + address);
                    
                    logoutButton = new JButton("Logout");
                    logoutButton.setBounds(165, 260, 80, 30);
                    frame.add(logoutButton);
                    logoutButton.addActionListener(this);

                    deleteButton = new JButton("Delete Acc");
                    deleteButton.setBounds(270, 260, 100, 30);
                    frame.add(deleteButton);
                    deleteButton.addActionListener(this);
    
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect username or password!");
                }
                
            }catch(SQLException e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage());
                }
            }
             
        }
        else if (e.getActionCommand().equals("Signup")) {
            RegistrationFrame registration = new RegistrationFrame();
            frame.setVisible(false);
        }
        else if (e.getActionCommand().equals("Logout")) {
            JOptionPane.showMessageDialog(null,"Logout Successfull!");
            
            welcomeLable.setVisible(false);
            fnameLable.setVisible(false);
            lnameLable.setVisible(false);
            phoneLable.setVisible(false);
            emailLable.setVisible(false);
            districtLable.setVisible(false);
            genderLable.setVisible(false);
            bloodLable.setVisible(false);
            addressLable.setVisible(false);
            logoutButton.setVisible(false);
            deleteButton.setVisible(false);
            
            loginLable.setVisible(true);
            usernameLabel.setVisible(true);
            usernameTextField.setVisible(true);
            passwordLabel.setVisible(true);
            passwordField.setVisible(true);
            forgetButton.setVisible(true);
            loginButton.setVisible(true);
            signupButton.setVisible(true);
            clearButton.setVisible(true);
            usernameTextField.setText(null);
            passwordField.setText(null);
        }
        else if (e.getActionCommand().equals("Forget pass?")) {
            ResetPassword resetPassword = new ResetPassword();
            frame.setVisible(false);
        }
        else if (e.getActionCommand().equals("Delete Acc")) {
            DeleteAccount deleteAccount = new DeleteAccount();
            frame.setVisible(false);
        }
        else if (e.getActionCommand().equals("Clear")) {
            usernameTextField.setText(null);
            passwordField.setText(null);
        }
        
    }
    
    public static void main(String[] args) {
        
        LoginFrame loginFrame = new LoginFrame();
    }   
    
}

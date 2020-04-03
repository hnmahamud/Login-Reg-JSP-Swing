import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class RegistrationFrame extends JFrame implements ActionListener{
    
    private JFrame frame;
    private JLabel firstnameLable, lastnameLable, usernameLabel, passwordLable, confirmpasswordLable, emailLabel, genderLabel, districtLabel, regLable, phoneLable, bloodgroupLabel, addressLable;
    private JPasswordField passwordField, confirmpasswordField;
    private JTextField firstnameTextField, lastnameTextField, usernameTextField,emailTextField, phoneTextField, addressField;
    private JButton saveButton, homeButton, clearButton;
    private JComboBox districtComboBox, genderComboBox, bloodgroupComboBox;
    private Font font1, font2;
    
    RegistrationFrame()
    {
        frame = new JFrame();
        
        font1 = new Font("Arial", Font.BOLD, 25);
        font2 = new Font("Arial", Font.BOLD, 15);
        
        regLable = new JLabel("Please fill-up the form!");
        regLable.setBounds(250, 10, 500, 50);
        regLable.setFont(font1);
        frame.add(regLable);
        
        firstnameLable = new JLabel("First Name: *");
        firstnameLable.setBounds(100, 100, 150, 50);
        firstnameLable.setFont(font2);
        frame.add(firstnameLable);
        
        firstnameTextField = new JTextField();
        firstnameTextField.setBounds(100, 140, 200, 30);
        firstnameTextField.setFont(font2);
        frame.add(firstnameTextField);
        
        lastnameLable = new JLabel("Last Name: *");
        lastnameLable.setBounds(500, 100, 150, 50);
        lastnameLable.setFont(font2);
        frame.add(lastnameLable);
        
        lastnameTextField = new JTextField();
        lastnameTextField.setBounds(500, 140, 200, 30);
        lastnameTextField.setFont(font2);
        frame.add(lastnameTextField);
        
        phoneLable = new JLabel("Phone: *");
        phoneLable.setBounds(100, 180, 150, 50);
        phoneLable.setFont(font2);
        frame.add(phoneLable);
        
        phoneTextField = new JTextField();
        phoneTextField.setBounds(100, 220, 200, 30);
        phoneTextField.setFont(font2);
        frame.add(phoneTextField);
        
        emailLabel = new JLabel("Email: *");
        emailLabel.setBounds(500, 180, 150, 50);
        emailLabel.setFont(font2);
        frame.add(emailLabel);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(500, 220, 200, 30);
        emailTextField.setFont(font2);
        frame.add(emailTextField);
        
        usernameLabel = new JLabel("Username: *");
        usernameLabel.setBounds(100, 260, 150, 50);
        usernameLabel.setFont(font2);
        frame.add(usernameLabel);
        
        usernameTextField = new JTextField();
        usernameTextField.setBounds(100, 300, 200, 30);
        usernameTextField.setFont(font2);
        frame.add(usernameTextField);
        
        districtLabel = new JLabel("District: *");
        districtLabel.setBounds(500, 260, 150, 50);
        districtLabel.setFont(font2);
        frame.add(districtLabel);
        
        String district[]={"-Select your district-","Dinajpur","Rangpur","Dhaka"};        
        districtComboBox = new JComboBox(district);    
        districtComboBox.setBounds(500, 300, 200, 30);
        districtComboBox.setFont(font2);
        frame.add(districtComboBox);
        
        passwordLable = new JLabel("Password: *");
        passwordLable.setBounds(100, 340, 150, 50);
        passwordLable.setFont(font2);
        frame.add(passwordLable);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 380, 200, 30);
        passwordField.setFont(font2);
        frame.add(passwordField);
        
        confirmpasswordLable = new JLabel("Confirm password: *");
        confirmpasswordLable.setBounds(500, 340, 150, 50);
        confirmpasswordLable.setFont(font2);
        frame.add(confirmpasswordLable);
        
        confirmpasswordField = new JPasswordField();
        confirmpasswordField.setBounds(500, 380, 200, 30);
        confirmpasswordField.setFont(font2);
        frame.add(confirmpasswordField);
        
        genderLabel = new JLabel("Gender: *");
        genderLabel.setBounds(100, 420, 150, 50);
        genderLabel.setFont(font2);
        frame.add(genderLabel);
        
        String gender[]={"-Select your gender-","Male","Female","Other"};        
        genderComboBox = new JComboBox(gender);    
        genderComboBox.setBounds(100, 460, 200, 30);
        genderComboBox.setFont(font2);
        frame.add(genderComboBox);
        
        bloodgroupLabel = new JLabel("Blood group: *");
        bloodgroupLabel.setBounds(500, 420, 150, 50);
        bloodgroupLabel.setFont(font2);
        frame.add(bloodgroupLabel);
        
        String blood[]={"-Select blood group-", "A+", "O+", "AB+", "A-", "O-", "B-", "AB-"};        
        bloodgroupComboBox = new JComboBox(blood);    
        bloodgroupComboBox.setBounds(500, 460, 200, 30);
        bloodgroupComboBox.setFont(font2);
        frame.add(bloodgroupComboBox);
        
        addressLable = new JLabel("Address: *");
        addressLable.setBounds(100, 500, 150, 50);
        addressLable.setFont(font2);
        frame.add(addressLable);
        
        addressField = new JTextField();
        addressField.setBounds(100, 540, 600, 60);
        addressField.setFont(font2);
        frame.add(addressField);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(230, 640, 70, 30);
        frame.add(homeButton);
        homeButton.addActionListener(this);
        
        saveButton = new JButton("Save");
        saveButton.setBounds(360, 640, 70, 30);                          
        frame.add(saveButton);
        saveButton.addActionListener(this);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(500, 640, 70, 30);
        frame.add(clearButton);
        clearButton.addActionListener(this);
        
        frame.setBounds(580, 180, 800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Registration Demo");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            
            String firstName = firstnameTextField.getText();
            String lastName = lastnameTextField.getText();
            String phone = phoneTextField.getText();
            String email = emailTextField.getText();
            String uName = usernameTextField.getText();
            String district = districtComboBox.getSelectedItem().toString();
            String pass = passwordField.getText();
            String cpass = confirmpasswordField.getText();
            String gender = genderComboBox.getSelectedItem().toString();
            String blood = bloodgroupComboBox.getSelectedItem().toString();
            String address = addressField.getText();
            
            if (firstName.equals("") || lastName.equals("") || phone.equals("") || email.equals("") || uName.equals("") || district.equals("-Select your district-") || pass.equals("") || cpass.equals("") || gender.equals("-Select your gender-") || blood.equals("-Select blood group-") || address.equals("") ) {
                JOptionPane.showMessageDialog(null,"All field must be filled out!");
            }
            else {
                try {
                
                        Class.forName("com.mysql.jdbc.Driver");
               
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingtest","root","");
                        
                        Statement st = con.createStatement();
                        if (pass.equalsIgnoreCase(cpass)) {
                           st.executeUpdate(" insert into members " + "values ('"+firstName+"', '"+lastName+"', '"+phone+"', '"+email+"', '"+uName+"', '"+district+"', '"+pass+"', '"+gender+"', '"+blood+"', '"+address+"') ");
                           JOptionPane.showMessageDialog(null,"Registration Successfull!");
                           LoginFrame loginFrame = new LoginFrame();
                           frame.setVisible(false);
                           }
                           else {
                            JOptionPane.showMessageDialog(null,"Password doesn't match!");
                            }
                        
                    } catch (SQLException e1) {
                        if (e1.getErrorCode() == 1062) {
                            JOptionPane.showMessageDialog(null, "Email already in use, please insert another email!");
                            emailTextField.setText(null);
                        }
                        else if (e1.getErrorCode() == 1366) {
                            JOptionPane.showMessageDialog(null, "Phone number must be integer!");
                            phoneTextField.setText(null);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, e1.getMessage());
                        }
                    } catch (Exception e2) {   
                        JOptionPane.showMessageDialog(null, e2.getMessage());
                    }   
                }
            }
            else if (e.getActionCommand().equals("Home")) {
                    LoginFrame loginFrame = new LoginFrame();
                    frame.setVisible(false);
            }
            else if (e.getActionCommand().equals("Clear")) {
                    firstnameTextField.setText(null);
                    lastnameTextField.setText(null);
                    phoneTextField.setText(null);
                    emailTextField.setText(null);
                    usernameTextField.setText(null);
                    districtComboBox.setSelectedItem("-Select your district-");
                    passwordField.setText(null);
                    confirmpasswordField.setText(null);
                    genderComboBox.setSelectedItem("-Select your gender-");
                    bloodgroupComboBox.setSelectedItem("-Select your blood-");
                    addressField.setText(null);
            }
                

        }
    
    public static void main(String[] args) {
        
        RegistrationFrame registrationFrame = new RegistrationFrame();
    }
   
}

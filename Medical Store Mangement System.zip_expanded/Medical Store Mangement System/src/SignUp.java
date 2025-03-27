import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

class SignUp extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame jf;
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1;
    JPasswordField p1, p2;
    Font f;
    static HashMap<String, String> userDatabase = new HashMap<>();

    SignUp() {
        jf = new JFrame();
        f = new Font("Times New Roman", Font.BOLD, 20);
        jf.setLayout(null);

        l5 = new JLabel("SIGN UP"); l5.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l5.setBounds(300, 100, 300, 40);
        jf.add(l5);

        l1 = new JLabel("User Name : "); l1.setFont(f);
        l1.setBounds(200, 250, 200, 25);
        jf.add(l1);

        t1 = new JTextField(20);
        t1.setBounds(350, 250, 200, 25);
        t1.setToolTipText("Enter Username");
        jf.add(t1);

        l2 = new JLabel("Password  : "); l2.setFont(f);
        l2.setBounds(200, 300, 200, 25);
        jf.add(l2);

        p1 = new JPasswordField(20);
        p1.setBounds(350, 300, 200, 25);
        p1.setToolTipText("Enter Password");
        jf.add(p1);

        l3 = new JLabel("Confirm Password  : "); l3.setFont(f);
        l3.setBounds(200, 350, 200, 25);
        jf.add(l3);

        p2 = new JPasswordField(20);
        p2.setBounds(350, 350, 200, 25);
        p2.setToolTipText("Confirm Password");
        jf.add(p2);

        b1 = new JButton("Sign Up");
        b1.setBounds(200, 400, 100, 35);
        jf.add(b1); b1.addActionListener(this);

        b2 = new JButton("Clear");
        b2.setBounds(320, 400, 100, 35);
        jf.add(b2); b2.addActionListener(this);

        jf.setTitle("Sign Up");
        jf.setLocation(20, 20);
        jf.setSize(800, 600);
        jf.setResizable(false);
        jf.getContentPane().setBackground(Color.cyan);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String password = new String(p1.getPassword());
            String confirmPassword = new String(p2.getPassword());

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                userDatabase.put(username, password);
                JOptionPane.showMessageDialog(null, "Registration Successful!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                jf.setVisible(false);
                new Login();
            }
        } else if (ae.getSource() == b2) {
            t1.setText("");
            p1.setText("");
            p2.setText("");
        }
    }
}

package swingDemo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrameDemo implements ActionListener{
	JFrame frame=null;
	
	JLabel label_one,label_two;
	JTextField txtUser,txtPass;
	
	JButton btnRegister,btnLogin;
	
	public FrameDemo() {
		frame = new JFrame();	
		frame.setTitle("First frame in jumper");
		frame.setSize(500,280);
		//frame.setLocation(240, 80);
		
		Font font = new Font(Font.SERIF,Font.ITALIC,24);
		
		label_one = new JLabel("User Name ");
		label_one.setBounds(40,40,200,40);//x,y,w,h
		label_one.setFont(font);
		
		label_two = new JLabel("Password ");
		label_two.setBounds(40,90,200,40);//x,y,w,h
		label_two.setFont(font);
		
		txtUser = new JTextField();
		txtUser.setBounds(250,40,200,40);
		txtUser.setFont(font);
		
		txtPass = new JTextField();
		txtPass.setBounds(250,90,200,40);
		txtPass.setFont(font);
		
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(40,140,200,40);
		btnRegister.setFont(font);
		btnRegister.setBorderPainted(false);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(250,140,200,40);
		btnLogin.setFont(font);
		btnLogin.setBorderPainted(false);
				
		btnRegister.addActionListener(this);
		btnLogin.addActionListener(this);
				
		frame.add(label_one);
		frame.add(txtUser);
		frame.add(label_two);
		frame.add(txtPass);
		frame.add(btnRegister);
		frame.add(btnLogin);
		
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {		
		new FrameDemo();		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="Register") {
			//System.out.println("Register button is clicked");
			
			//read inputs from UI
			String userName = txtUser.getText().toString();
			String password = txtPass.getText().toString();
			
			//write to a file		
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\jumper_cred.txt",true));
				bw.write(userName+" "+password+"\n");
				bw.close();
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			JOptionPane.showMessageDialog(null,"Successfully written in a file");
		
		}else if(e.getSource()==btnLogin) {
			//System.out.println("Login button is clicked");
			
			//read inputs from UI
			String name = txtUser.getText().toString();
		
			String password = txtPass.getText().toString();
			
			//read credentials from file
			try {
				BufferedReader br = new BufferedReader(new FileReader("E:\\jumper_cred.txt"));
				
				boolean validate = false;
				String line =null;
						
				while((line=br.readLine())!=null){// bharat khanal
					String[] arr = line.split(" ");
		
					if(name.equals(arr[0]) && password.equals(arr[1])) {
						validate=true; break;
						//JOptionPane.showMessageDialog(null,"Login Successfully");
					}
				}
				if(validate) {
					
					DashBoard db = new DashBoard();
					//JOptionPane.showMessageDialog(null,"Login Successfully");
				}else {
					JOptionPane.showMessageDialog(null,"Username or Password didn't match");
				}

			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
	}

}

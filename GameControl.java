import javax.swing.*;
import java.awt.*;

public class GameControl {
	public int time = 0;
	public static void main(String[] args) {
		
		JFrame F1 = new JFrame("Soviet Clicker");    
		// TODO Auto-generated method stub
		JPanel P1 = new JPanel();
		P1.setBounds(40,80,200,200);    
		P1.setBackground(Color.gray);  
		
		F1.add(P1);
		F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F1.setSize(400,400);    
        	F1.setLayout(null);    
        	F1.setVisible(true); 
        	GameControl object = new GameControl();
        	object.Update();
	}

	void Update() {
		while(true) {
			
		}
	}
}

import javax.swing.*;


public class Game {
	public static void main(String[] args){
		
		JFrame window = new JFrame ("First game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setContentPane(new GamePanel());
		
		window.pack();
		window.setVisible(true);
		
	}

}

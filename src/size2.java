import javax.swing.JOptionPane;


public class size2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numPlayers = JOptionPane.showInputDialog ("Enter the number of players");
		
		int numPlayers1 = Short.parseShort(numPlayers);
		int teamSize = numPlayers1/11;
		int teamSize1 = 1;
if (numPlayers1 >11 && numPlayers1 <55){
	
	JOptionPane.showMessageDialog(null, teamSize);
}
else{
	JOptionPane.showMessageDialog(null, teamSize1);
}
}}
package javaBasic;
	import javax.swing.JOptionPane;

	public class ChoosingOptionPlus {
		
		    public static void main(String[] args) {
		        Object[] options = {"i do", "i don't"};  
		        int option = JOptionPane.showOptionDialog(null,
		                "Do you want to change to the first class ticket?",
		                "choose one",
		                JOptionPane.YES_NO_OPTION,
		                JOptionPane.QUESTION_MESSAGE,
		                null, options, options[0]); 
		        
		        JOptionPane.showMessageDialog(null, "You've chosen: " + 
		                (option == JOptionPane.YES_OPTION ? "YES" : "NO"));
		        System.exit(0);
		    }
		}

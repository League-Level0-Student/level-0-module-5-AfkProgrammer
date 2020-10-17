package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String XD = JOptionPane.showInputDialog(null,"What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
		
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What makes your pet happy?", "Happiness of your pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Getting pet", "Getting punched", "Treats" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task==1) {
				Gettingpunched();
				
			}
			if (task==0) {
				Gettingpet ();
			}
			if (task==2) {
				Treats ();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	
	private static void Gettingpunched() {
		happinessLevel = happinessLevel -1;
		JOptionPane.showMessageDialog(null, " Happiness level = "+happinessLevel);

	}
	private static void Gettingpet () {
		happinessLevel = happinessLevel +1;
		JOptionPane.showMessageDialog(null, " Happiness level ="+happinessLevel);
	}
	private static void Treats () {
		happinessLevel = happinessLevel +2;
		JOptionPane.showMessageDialog(null, " Happiness level ="+happinessLevel);
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
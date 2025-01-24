import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      
		String[] creatures = {"Dragon", "Unicorn", "Minotaur", "Gnome", "Phoenix", "Mermaid", "Fairy"};

		// HINT: This CodeCollab demonstrates several Array ALGORITHMS!
		
		// LOOP #1
		System.out.println("Fantasy creatures:");
		for (String creature : creatures) {
			System.out.print(creature + " ");
		}
		System.out.println();

		// LOOP #2
		int totalCharacters = 0;
		for (int i = 0; i < creatures.length; i++) {
			totalCharacters += creatures[i].length();
		}
		System.out.println("Total number of characters in creature names: " + totalCharacters);
		
		// LOOP #3
		String longestName = creatures[0];
		for (String creature : creatures) {
			if (creature.length() > longestName.length()) {
				longestName = creature;
		   }
		}
		System.out.println("Creature with the longest name: " + longestName);

		// LOOP #4
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of a creature to search for: ");
		String target = scanner.nextLine();
		boolean found = false;
		for (int i = 0; i < creatures.length; i++) {
			if (creatures[i].equalsIgnoreCase(target)) {
				System.out.println("Creature " + target + " found at index " + i);
				found = true;
				break;
		   }
		}
		if (!found) {
			System.out.println("Creature " + target + " not found in the array.");
		}
		
		// LOOP #5
		System.out.print("Enter a length to count creatures with longer names: ");
		int lengthThreshold = scanner.nextInt();
		int count = 0;
		for (String creature : creatures) {
			if (creature.length() > lengthThreshold) {
				count++;
			}
		}
		System.out.println("There are " + count + " creatures with names longer than " + lengthThreshold + " characters.");

	}
}

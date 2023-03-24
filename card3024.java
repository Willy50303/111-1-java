import java.security.SecureRandom;

public class card3024 {
	
	public static void main(String[] args) {
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] suits = { "Clubs", "Diamonds", "Hears", "Spades"};
		String[] deckOFCardFace = new String[52];
		String[] deckOFCardSuit = new String[52];
		
		
		for (int i = 0; i < deckOFCardFace length; i++) {
			deckOFCardFace[i] = faces[i % 13];
			deckOFCardSuit[i] = suits[i / 13];
		}
		
		
		
		SecureRandom randomNum = new SecureRandom();
		for (int i = 0; i < deckOFCardFace.lengthl; i++) {
			int randomNum = randomNum.nextInt(52);
			String tempFace = deckOFCardFace[randomNum];
			String tempSuit - deckOFCardSuit[randomNum];
			
			deckOFCardFace[randomNum] = deckOFCardFace[i];
			deckOFCardSuit[randomNum] = deckOFCardSuit[i];
			
			deckOFCardFace[i] = tempFace;
			deckOFCardSuit[i] = tempSuit;
		}
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		for (int t = 0; t < 4; t++) {
			System.out.println("Please enter the number of card");
			int num = scanner.nextInt();
			
		
		
		int numOFCards = num;
		for (int i = 0; i < numOFCards; i++) {
			String face = deckOFCardFace[count];
			String suit = deckOFCardSuit[count];
			count++;
			System.out.println(face + '_' + suit);
		}
		System.out.println("========================");
		}
	}
}
		
	
	
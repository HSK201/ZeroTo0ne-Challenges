import java.util.Scanner;

public class encrypt {
	
	//Main function
	public static void main(String[] args) {
		
		//input reader
		Scanner reader = new Scanner(System.in);
		
		//Enter actual string text
		System.out.println("Please enter your text want crypt it : ");
		String Text = reader.next();
		
		//Print entered text
		System.out.println("Your text before encryption : " + Text);
		
		//Determine the shift number
		System.out.println("Choose the shift number : ");
		int shiftNum = reader.nextInt();
		
		//Convert the entered text to array of character
		char msg [] = Text.toCharArray();
		
		String encryptMsg = "";
		
		char[] normAlpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int index = 0;
		
		if(shiftNum == 1) {
			for(int i = 0; i < msg.length; i++) {
				for(int j = 0; j < normAlpha.length; j++) {
					if( msg[i] == normAlpha[j] ) {
					index = j;
					index +=1;
					encryptMsg += normAlpha[index];
					}

				}
			}
		}
	
	
	char Capital [] = encryptMsg.toCharArray();
	String newEncryptMsg = "";
	for ( int i = 0 ; i < Capital.length ; i++ ) {
		if(Capital[i] == 'o') {
			Capital[i] = 'O';
		}
		else if(Capital[i] == 'a') {
			Capital[i] = 'A';
		}
		else if(Capital[i] == 'u') {
			Capital[i] = 'U';
		}
		else if(Capital[i] == 'e') {
			Capital[i] = 'E';
		}
		else if(Capital[i] == 'i') {
			Capital[i] = 'I';
		}
		newEncryptMsg += Capital[i];
	}
		

	//Print encryption text
	System.out.println("The text encryption is : " + newEncryptMsg);
	}
}

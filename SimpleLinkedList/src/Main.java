import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner input = new Scanner(System.in);
		
		int choice, number;
		do {
			System.out.println("1 - add at the beginning");
			System.out.println("2 - add at the end");
			System.out.println("3 - Show the list");
			System.out.println("4 - take from beginning");
			System.out.println("5 - take from the end");
			System.out.println("0 - exit");
			System.out.println("pick an option");
			choice = input.nextInt();
			if(choice < 0 || choice > 5) {
				System.out.println("invalid option");
			}else {
				switch(choice){
					case 1:
						System.out.println("What number go at the beginning?");
						number = input.nextInt();
						list.addAtBeginning(number);
						break;
					case 2:
						System.out.println("What number go at the end?");
						number = input.nextInt();
						list.addAtEnd(number);
						break;
					case 3:
						if(list.first == null) {
							System.out.println("The list is empty");
						}else {
							list.Show();
						}
						break;
					case 4:
						if(list.first == null) {
							System.out.println("The list is empty");
						}else {
							list.takeFromBeginning();
						}
						break;
					case 5:
						if(list.first == null) {
							System.out.println("The list is empty");
						}else {
							list.takeFromEnd();
						}
						break;
				}
			}
			
		}while(choice != 0);
	}
}

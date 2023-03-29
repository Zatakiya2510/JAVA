import java.util.Scanner;
public class BookUpdate{
	public static void main(String[] args) {
		Scanner scS = new Scanner(System.in);
		Scanner scN = new Scanner(System.in);
		System.out.println("Enter no of books");
		int n = scN.nextInt();

		BookDetails[] books = new BookDetails[n];

		for(int i=0;i<n;i++){
			System.out.println("Enter Title of book "+ (i+1));
			String title = scS.nextLine();

			System.out.println("Enter Author of book "+ (i+1));
			String authorName = scS.nextLine();

			System.out.println("Enter Price of book "+ (i+1));
			double price = scN.nextDouble();

			System.out.println("Enter Stock of book "+ (i+1));
			int noOfBookAvailable = scN.nextInt();

			books[i] = new BookDetails(title,authorName,price,noOfBookAvailable);
		}
		while(true){
			System.out.println("Enter 1 for search, 2 for update, 3 to display books");
			int choice = scN.nextInt();

			if(choice==1){
				System.out.println("Enter search word");
				String searchWord = scS.nextLine();				
				for(int i=0;i<n;i++){
					if(books[i].search(searchWord)){
						System.out.println("Book Title = "+books[i].title);
					}
				}
			}
			else if(choice==2){
				System.out.println("Enter Title of the book");
				String searchWord = scS.nextLine();	
				System.out.println("Enter positive number to purchase or negative number for sell");
				int noOfBooks = scN.nextInt();
				for(int i=0;i<n;i++){
					if(books[i].search(searchWord)){
						books[i].updateStock(noOfBooks);
					}
				}
			}
			else if(choice==3){
				for(int i=0;i<n;i++){
					System.out.println("Title of book["+(i+1)+"]= "+books[i].title);
					System.out.println("Author of book["+(i+1)+"]= "+books[i].authorName);
					System.out.println("Price of book["+(i+1)+"]= "+books[i].price);
					System.out.println("Stock of book["+(i+1)+"]= "+books[i].noOfBookAvailable);
				}
			}
			else{
				break;
			}
		}
	}
}

class Book{
	String title;
	String authorName;
	public Book(String title, String authorName){
		this.title = title;
		this.authorName = authorName;
	}
}

class BookDetails extends Book{
	double price;
	int noOfBookAvailable;
	public BookDetails(String title, String authorName, double price, int noOfBookAvailable){
		super(title,authorName);
		this.price = price;
		this.noOfBookAvailable = noOfBookAvailable;
	}

	public boolean search(String searchWord){
		if(title.indexOf(searchWord)>-1 || authorName.indexOf(searchWord)>-1){
			return true;
		}
		else{
			return false;
		}
	}

	public void updateStock(int noOfBooks){
		noOfBookAvailable += noOfBooks;
	}
}
import java.util.*;
import java.io.*;
public class BookTester {
	public static void main(String[] args) {
		List<Book> books=new ArrayList<>();
		Book book=null;
		try{
			BufferedReader br=new BufferedReader(new FileReader(new File("books.txt")));
			//1. read the file till not finished
			String line=null;
			while((line=br.readLine())!=null){
				//2. make tokens of each line: and create a book object 
				//and then put that book object into the arraylist of book
				String tokens[]=line.split(":");
				//id, isbn, title,author,price
				book=new Book(Integer.parseInt(tokens[0]), tokens[1], tokens[2],tokens[3],Double.parseDouble(tokens[4]));
				books.add(book);
				//
				//System.out.println(line);
			}
		}catch(FileNotFoundException e){
			System.out.println("file not found");
		}catch(IOException e){
			System.out.println("some io problem happens");
		}
		//3.print all the books
		Iterator<Book> it=books.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}

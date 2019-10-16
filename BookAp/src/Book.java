
class Book{
	
	private int id;
	private String isbn;
	private String Title;
	private String author;
	private double price;
	public Book(int id, String isbn, String title, String author, double price) {
		super();
		this.id = id;
		this.isbn = isbn;
		Title = title;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", Title=" + Title + ", author=" + author + ", price=" + price
				+ "]";
	}
}	
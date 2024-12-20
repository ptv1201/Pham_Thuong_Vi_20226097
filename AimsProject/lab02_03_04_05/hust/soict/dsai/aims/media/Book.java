package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<>();
	//các phương thức khởi tạo

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String category, float cost,String author) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
		addAuthor(author);
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title,String author) {
		super(title);
		// TODO Auto-generated constructor stub
		addAuthor(author);
	}
	//kiểm tra xem author có trong list ko
	public boolean checkAuthors(String author) {
		for (String i : authors) {
			if (i.equals(author)) {
				return true;
			}
		}
		return false;
	}
	//addAuthor

	public void addAuthor(String authorName) {
		if (!checkAuthors(authorName)) {
			authors.add(authorName);
			System.out.println("add author name successfully");
			return;
		}
		System.out.println("author name already exist");
	}
	//removeAuthor

	public void removeAuthor(String authorName) {
		if (checkAuthors(authorName)) {
			authors.remove(authorName);
			System.out.println("remove author name successfully");
			return;
		}
		System.out.println("author name not exist");
	}

}

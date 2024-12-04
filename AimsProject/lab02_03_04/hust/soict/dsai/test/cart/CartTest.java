package hust.soict.dsai.test.cart;
import  hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

	public class CartTest {
		public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f); cart.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); cart.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f); cart.addMedia(dvd3);
		Book book1=new Book("Banh troi nuoc","ho xuan huong");cart.addMedia(book1);
		Book book2=new Book("Doraemon","anime",10.00f);cart.addMedia(book2);
		CompactDisc track1= new CompactDisc("Power");cart.addMedia(track1);
		//Test the print method
		cart.print();
		//To-do: Test the search methods here
		cart.search(2);
		cart.search("Aladin");
		cart.search(1);
		cart.search("Banh troi nuoc");
		dvd1.play();
		}
		}


package hust.soict.dsai.aims;

import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class Aims {

	public static void main(String[] args) {
		// Create a new cart

		Store store = new Store();
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store.addMedia(dvd3);
		Book book1 = new Book("Banh troi nuoc", "ho xuan huong");
		store.addMedia(book1);
		Book book2 = new Book("Doraemon", "anime", 10.00f);
		store.addMedia(book2);
		CompactDisc track1 = new CompactDisc("Power", "kpop", 100.50f);
		store.addMedia(track1);
		CompactDisc track2 = new CompactDisc("APT", "kpop", 100f);
		store.addMedia(track2);
		doShowMenu(cart,store);
	}

	public static void showMenu() {

		System.out.println("AIMS: ");

		System.out.println("--------------------------------");

		System.out.println("1. View store");

		System.out.println("2. Update store");

		System.out.println("3. See current cart");

		System.out.println("0. Exit");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3");

	}

	public static void classMenu() {

		System.out.println("Option: ");

		System.out.println("--------------------------------");

		System.out.println("1. add a book");

		System.out.println("2. add a dvd");

		System.out.println("0. add a cd");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}

	public static void sortMenu() {

		System.out.println("Option: ");

		System.out.println("--------------------------------");

		System.out.println("1. sort by title");

		System.out.println("2. sort by cost");

		System.out.println("0. Exit");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}

	public static void filterMenu() {

		System.out.println("Option: ");

		System.out.println("--------------------------------");

		System.out.println("1. filter by title");

		System.out.println("2.filter by id");

		System.out.println("0. Exit");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}

	public static void editMenu() {

		System.out.println("Option: ");

		System.out.println("--------------------------------");

		System.out.println("1. add Media to Store");

		System.out.println("2. remove Media from store");

		System.out.println("0. Exit");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}

	public static void storeMenu() {
		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. See a media’s details");

		System.out.println("2. Add a media to cart");

		System.out.println("3. Play a media");

		System.out.println("4. See current cart");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3-4");

	}

	public static void mediaDetailsMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. Add to cart");

		System.out.println("2. Play");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}

	public static void cartMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. Filter medias in cart");

		System.out.println("2. Sort medias in cart");

		System.out.println("3. Remove media from cart");

		System.out.println("4. Play a media");

		System.out.println("5. Place order");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3-4-5");

	}

	public static void doShowMenu(Cart cart,Store store) {
		Scanner scanner = new Scanner(System.in);
		showMenu();
		if (scanner.nextInt() == 1) {
			doStoreMenu(cart, store);// chọn số 1 trong showmenu: xem cửa hàng
		}
		else if (scanner.nextInt() == 2) { // chọn số 2 trong showMenu để cập nhập cửa hàng
			doEditMenu(cart,store);
		}
		 else if (scanner.nextInt() == 3) { // chọn số 3 trong showMenu để xem giỏ hàng hiện tại
			 cart.print();
			 doCartMenu(cart,store);
		 }
		 else if (scanner.nextInt() == 0) { // chọn số 0 trong showMenu để thoát menu
		 }
		scanner.close();
		doShowMenu(cart,store);
	}

	public static void doStoreMenu(Cart cart, Store store) {
		Scanner scanner = new Scanner(System.in);
		storeMenu();
		if (scanner.nextInt() == 1) { // chọn số 1 trong storeMenu: xem chi tiết Media
			doMediaDetailsMenu(cart,store);
		}
		else if (scanner.nextInt() == 2) { // chọn số 2 trong storeMenu để thêm vào giỏi hàng
			System.out.println("Please write the title on the screen");
			String title = scanner.nextLine();
			cart.addMedia(store.search(title));
			System.out.println("number of items in cart: " + (cart.itemsOrdered.size()));
			
		}
		else if (scanner.nextInt() == 3) { // chọn số 3 trong storeMenu để play cd/dvd
			System.out.println("Please write the title on the screen");
			String title = scanner.nextLine();
				if ((store.search(title))instanceof DigitalVideoDisc)
					((DigitalVideoDisc) (store.search(title))).play();
				if ((store.search(title)) instanceof CompactDisc)
					((CompactDisc) (store.search(title))).play();
				
			
		} 
		else if (scanner.nextInt() == 4) { // 4-See current cart
			cart.print();
			doCartMenu(cart,store);
		}

		else;// chọn số 0 trong storeMenu để back showMenu
		scanner.close();
		return;
	}

	public static void doMediaDetailsMenu(Cart cart,Store store) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write the title");
		String title = scanner.nextLine();
		if ((store.search(title)) != null) {

			mediaDetailsMenu();

			if (scanner.nextInt() == 0) { // chọn số 0 trong mediaDetailsMenu để back lại storeMenu
				doStoreMenu(cart,store);}
			else if (scanner.nextInt() == 1) { // chọn số 1 trong mediaDetailsMenu để thêm vào giỏi hàng
				cart.addMedia(store.search(title));
				System.out.println("number of items in cart: " + (cart.itemsOrdered.size()));
			
			}

			else if (scanner.nextInt() == 2) { // chọn số 2 trong mediaDetailsMenu để play cd/dvd
				if ((store.search(title)) instanceof DigitalVideoDisc)
					((DigitalVideoDisc) (store.search(title))).play();
				if ((store.search(title)) instanceof CompactDisc)
					((CompactDisc) (store.search(title))).play();
			}
		}
		scanner.close();
		return;
	}

	
	public static void doEditMenu(Cart cart,Store store) {
		Scanner scanner = new Scanner(System.in);
		editMenu();
		if (scanner.nextInt() == 1) { // chọn số 1 trong editMenu để thêm vào store
			classMenu();
			System.out.println("input title,category,cost");
			String title = scanner.nextLine();
			String category = scanner.nextLine();
			float cost = scanner.nextFloat();
			if (scanner.nextInt() == 0) {// add a cd
				CompactDisc track = new CompactDisc(title, category, cost);
				store.addMedia(track);
			} else if (scanner.nextInt() == 1) {// add a book
				Book book = new Book(title, category, cost);
				store.addMedia(book);
			} else if (scanner.nextInt() == 2) {// add a dvd
				DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, cost);
				store.addMedia(dvd);
			}
		} 
		else if (scanner.nextInt() == 2) { // chọn số 2 trong editMenu để xóa khỏi store
			System.out.println("input id");
			int id = scanner.nextInt();
			scanner.nextLine();
			store.removeMedia(store.search(id));
		} else
			;// chọn 0 để quay lại showMenu
		scanner.close();
		return;
	}

	public static void doCartMenu(Cart cart,Store store) {
		Scanner scanner = new Scanner(System.in);
		cartMenu();

		if (scanner.nextInt() == 1) {// 1-Filter medias in cart
			filterMenu();
			if (scanner.nextInt() == 1) { // lọc theo tiêu đề
				String title=scanner.nextLine();
			    cart.find(title);
			} else if (scanner.nextInt() == 2) {
				// lọc theo id
				int id=scanner.nextInt();
			    cart.find(id);
			} else;
				// chọn 0 quay lại

		} else if (scanner.nextInt() == 2) {// 2-Sort medias in cart
			sortMenu();
			if (scanner.nextInt() == 1) { // Sắp xếp theo tiêu đề, sau đó theo giá
				Collections.sort(cart.itemsOrdered, Media.COMPARE_BY_TITLE_COST);
				System.out.println("Sorted by Title then Cost:");
				for (Media media : cart.itemsOrdered) {
					System.out.println(media);
				}
			} else if (scanner.nextInt() == 2) {
				// Sắp xếp theo giá, sau đó theo tiêu đề
				Collections.sort(cart.itemsOrdered, Media.COMPARE_BY_COST_TITLE);
				System.out.println("\nSorted by Cost then Title:");
				for (Media media : cart.itemsOrdered) {
					System.out.println(media);
				}
			} else
				;// chọn 0 quay lại
			
		} else if (scanner.nextInt() == 3) {// 3-Remove media from cart
			System.out.println("input id");
			int id = scanner.nextInt();
			cart.removeMedia(cart.find(id));
			
		} else if (scanner.nextInt() == 4) {// 4-Play a media
			System.out.println("Please write the title on the screen");
			scanner.nextLine();
			String title = scanner.nextLine();
			if ((cart.find(title)) instanceof DigitalVideoDisc)
				((DigitalVideoDisc) (cart.find(title))).play();
			if (cart.find(title) instanceof CompactDisc)
				((CompactDisc) (cart.find(title))).play();
			
		} else if (scanner.nextInt() == 5) {// 5-Place order
			System.out.println("an order is created");
			cart.deleteCart();
			
		} else
			; // chọn 0 quay lại showMenu

		scanner.close();
		return;
	}
}

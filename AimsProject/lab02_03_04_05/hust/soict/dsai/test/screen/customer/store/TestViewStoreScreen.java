package hust.soict.dsai.test.screen.customer.store;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.customer.controller.ViewStoreController;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application{
	private static Store store;
	@Override
	public void start (Stage primaryStage) throws Exception {
	final String STORE_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
	FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (STORE_FXML_FILE_PATH));
	ViewStoreController viewStoreController = new ViewStoreController(store);
	fxmlLoader.setController (viewStoreController);
	Parent root = fxmlLoader.load();
	primaryStage.setTitle("Store");
	primaryStage.setScene (new Scene(root));
	primaryStage.show();
	}
	public static void main(String[] args) {
	store=new Store();
	/*
	*...
	Add some items to store here
	
	*/
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
	launch(args);
}
}

package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class testStore {
	public static void main(String[] args) {
		//Create a new store
		Store store = new Store();
		//Create new dvd objects and add them to the store
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f); 
		//test addDVD
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);
		store.addDVD(dvd3);
		//test removeDVD
		store.removeDVD(dvd2);
		store.removeDVD(dvd3);
		store.removeDVD(dvd3);
		
		}
	
}

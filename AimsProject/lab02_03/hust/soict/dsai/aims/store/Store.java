package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	final int MAX = 1000;
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
	private boolean checkDVD(DigitalVideoDisc disc) {
		for (DigitalVideoDisc i : itemsInStore) {
			if (i == null)
				return false;
			if (i.equals(disc))
				return true;
		}
		return false;
	}

	public void addDVD(DigitalVideoDisc disc) {
		if (!checkDVD(disc)) {
			itemsInStore.add(disc);
			System.out.println("the DVD " + disc.getTitle() + " has just been added");
			return;
		}
		System.out.println("DVD already exist");
	}

	public void removeDVD(DigitalVideoDisc disc) {
		if (checkDVD(disc)) {
			itemsInStore.remove(disc);
			System.out.println("the DVD " + disc.getTitle() + " has just been removed");
			return;
		}
		System.out.println("DVD not exist");
	}
}

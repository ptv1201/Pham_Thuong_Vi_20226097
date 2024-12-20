package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	private boolean checkMedia(Media media) {
		for (Media i : itemsInStore) {
			if (i == null) {
				return false;
			}
			if (i.equals(media)) {
				return true;
			}
		}
		return false;
	}

	public void addMedia(Media media) {
		if (!checkMedia(media)) {
			itemsInStore.add(media);
			System.out.println("the DVD " + media.getTitle() + " has just been added");
			return;
		}
		System.out.println("DVD already exist");
	}

	public void removeMedia(Media media) {
		if (checkMedia(media)) {
			itemsInStore.remove(media);
			System.out.println("the DVD " + media.getTitle() + " has just been removed");
			return;
		}
		System.out.println("DVD not exist");
	}
	public Media search(String title) {
		for (Media i: itemsInStore) {
			if (i.getTitle().equals(title)) {
				System.out.println("result: " +i.getId()+" - "+ i.getTitle() + " - " + i.getCategory()+ " : "+ i.getCost() + " $\n");
				return i;
			}
		}
		System.out.println("No match found");
		return null;
	}
	public Media search(int id) {
		for (Media i: itemsInStore) {
			if (i.getId()==id) {
				System.out.println("result: " + i.getId() +" - "+ i.getTitle() + " - " + i.getCategory()+ " : "+ i.getCost() + " $\n");
				return i;
			}
		}
		System.out.println("No match found");
		return null;
	}
	//getter ItemsInStore 

	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	
	
}

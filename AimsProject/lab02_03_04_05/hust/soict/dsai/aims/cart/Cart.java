package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {

	public ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	//addMedia
	public boolean equals(Media media) {
		for (Media i : itemsOrdered) {
			if ((i.getTitle()).equals(media.getTitle())) {
				return true;
			}
		}
		return false;
	}
	public void addMedia(Media media) {
		if(!equals(media)) {
			itemsOrdered.add(media);
		}
	    System.out.println("Added: " + media.getTitle());
	}
//removeMedia
	public void removeMedia(Media media) {
	    if (itemsOrdered.remove(media)) {
	        System.out.println("Removed: " + media.getTitle());
	        return;
	    } else {
	        System.out.println("Media not found in the cart.");
	    }
	}


	// Hàm tính tổng giá tiền đĩa
	public float totalCost() {
		float sum = 0.00f;
		for (Media i: itemsOrdered) {
			sum += i.getCost();
		}
		return sum;
	}

	// hàm print
	public void print() {
		float totalCost = 0.00f;
		StringBuilder output = new StringBuilder("***********************CART***********************\nOrderItems\n");
		for (Media i: itemsOrdered) {
			output.append(i.getId() + " - " +i.getTitle() + " - " + i.getCategory() +" : "+ i.getCost() + " $\n");
			totalCost = +i.getCost();
		}
		output.append("Total cost: " + totalCost + " $")
				.append("\n***************************************************");
		System.out.println(output);
	}
//hàm search ID
	public void search(int id) {
		for (Media i: itemsOrdered) {
			if (i.getId()==id) {
				System.out.println("result: " + i.getTitle() + " - " + i.getCategory()+ " : "+ i.getCost() + " $\n");
				return;
			}
		}
		System.out.println("No match found");
	}
	public Media find(int id) {
		for (Media i: itemsOrdered) {
			if (i.getId()==id) {
				System.out.println("result: " + i.getTitle() + " - " + i.getCategory()+ " : "+ i.getCost() + " $\n");
				return i;
			}
		}
		System.out.println("No match found");
		return null;
	}

	// hàm search by title
	public void search(String title) {
		for (Media i: itemsOrdered) {
			if (i.getTitle().equals(title)) {
				System.out.println("result: " + i.getTitle() + " - " + i.getCategory()+ " : "+ i.getCost() + " $\n");
				return;
			}
		}
		System.out.println("No match found");
	}
	public Media find(String title) {
		for (Media i: itemsOrdered) {
			if (i.getTitle().equals(title)) {
				System.out.println("result: " + i.getTitle() + " - " + i.getCategory()+ " : "+ i.getCost() + " $\n");
				return i;
			}
		}
		System.out.println("No match found");
		return null;
	}
	public void deleteCart() {
		for (Media i: itemsOrdered) {
			removeMedia(i);
		}
	}
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
}

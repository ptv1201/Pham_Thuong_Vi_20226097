package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	// Hàm thêm đĩa DVD vào giỏ hàng
	public int addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return 0;
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The DVD " + disc.getTitle() + " have been added");
			return 1;
		}
	}

	// Ham them dia vào gio hang theo List voi so luong tuy y
	public int addDigitalVideoDisc(DigitalVideoDisc... dvdlist) {
		int countAdd = 0;
		for (DigitalVideoDisc disc : dvdlist) {
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full");
				break;
			} else {
				itemsOrdered[qtyOrdered] = disc;
				qtyOrdered++;
				System.out.println("The DVD " + disc.getTitle() + " has been added");
				countAdd++;
			}
		}
		return countAdd;
	}

	// Ham them 2 dia DVD
	public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full.");
			return 0;
		} else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			System.out.println("The DVD " + dvd1.getTitle() + " has been added");

			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The DVD " + dvd2.getTitle() + " has been added");

			return 2;
		}
	}

	// Hàm xoá đĩa
	public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered[0] == null) {
			return -1;
		}
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				itemsOrdered[qtyOrdered - 1] = null; // xóa cái cuối vì nó lặp 2 lần
				qtyOrdered--;
				return 1;
			}
		}

		return 0;
	}

	// Hàm tính tổng giá tiền đĩa
	public float totalCost() {
		float sum = 0.00f;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}

	// hàm print
	public void print() {
		float totalCost = 0.00f;
		StringBuilder output = new StringBuilder("***********************CART***********************\nOrderItems\n");
		for (int i = 0; i < qtyOrdered; i++) {
			output.append((i + 1) + " - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "
					+ itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " : "
					+ itemsOrdered[i].getCost() + " $\n");
			totalCost = +itemsOrdered[i].getCost();
		}
		output.append("Total cost: " + totalCost + " $")
				.append("\n***************************************************");
		System.out.println(output);
	}
//hàm search ID
	public void search(int id) {
		if (id > qtyOrdered) {
			System.out.println("No match found");
		} else {
			System.out.println("result: " + itemsOrdered[id - 1].getTitle() + " - " + itemsOrdered[id - 1].getCategory()
					+ " - " + itemsOrdered[id - 1].getDirector() + " - " + itemsOrdered[id - 1].getLength() + " : "
					+ itemsOrdered[id - 1].getCost() + " $\n");
		}
	}

	// hàm search by title
	public void search(String title) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle().equals(title)) {
				System.out.println("result: " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory()
						+ " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " : "
						+ itemsOrdered[i].getCost() + " $\n");
				return;
			}
		}
		System.out.println("No match found");
	}
}

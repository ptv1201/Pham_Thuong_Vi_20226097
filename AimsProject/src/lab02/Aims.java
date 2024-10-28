package lab02;
import java.util.LinkedList;
class Store {
    private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>();


    private boolean checkDVD(DigitalVideoDisc disc) {
        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
            if (digitalVideoDisc.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if(checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println( disc.getTitle() + " 've been deleted from the store !");
        } else {
            System.out.println("There is no "+ disc.getTitle() + " in the store !");
        }
    }

    public void addDVD(DigitalVideoDisc disc) {
        if(!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println( disc.getTitle() + " 've been added to the store !");
        } else {
            System.out.println( disc.getTitle() + " 'already exists in the store !");
        }

    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no dvd in the store !\n");
        else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }
}

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Cart anOrder = new Cart();

	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers",87,19.95f);
	        anOrder.addDigitalVideoDisc(dvd1);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "Geogre Lucas",87,24.95f);
	        anOrder.addDigitalVideoDisc(dvd2);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
	        anOrder.addDigitalVideoDisc(dvd3);

	        anOrder.print();

	        anOrder.removeDigitalVideoDisc(dvd2);
	        System.out.printf("Total cost is: %.2f",anOrder.totalCost());
	}

}

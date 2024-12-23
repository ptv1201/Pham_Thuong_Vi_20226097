package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame{
		private Store store;
		JPanel createNorth() {
			JPanel north = new JPanel();
			north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
			north.add(createMenuBar());
			north.add(createHeader());
			return north;
			}
		JMenuBar createMenuBar() {
			JMenu menu = new JMenu("Options");
			JMenu smUpdateStore = new JMenu ("Update Store");
			smUpdateStore.add(new JMenuItem("Add Book"));
			smUpdateStore.add(new JMenuItem("Add CD"));
			smUpdateStore.add(new JMenuItem("Add DVD"));
			menu.add(smUpdateStore);
			menu.add(new JMenuItem("View store"));
			menu.add(new JMenuItem("View cart"));
			JMenuBar menuBar = new JMenuBar();
			menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
			menuBar.add(menu);
			return menuBar;
			}
		JPanel createHeader() {
			JPanel header = new JPanel();
			header.setLayout(new BoxLayout (header, BoxLayout.X_AXIS));
			JLabel title = new JLabel("AIMS");
			title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
			title.setForeground (Color.CYAN);
			JButton cart = new JButton("View cart");
			cart.setPreferredSize (new Dimension (100, 50));
			cart.setMaximumSize(new Dimension(100, 50));
			header.add(Box.createRigidArea (new Dimension (10, 10)));
			header.add(title);
			header.add(Box.createHorizontalGlue());
			header.add(cart);
			header.add(Box.createRigidArea (new Dimension (10, 10)));
			return header;
			}
		JPanel createCenter() {
			JPanel center = new JPanel();
			center.setLayout(new GridLayout (3, 3, 2, 2));
			ArrayList<Media> mediaInStore = store.getItemsInStore();
			for (int i = 0; i < 9; i++) {
			MediaStore cell = new MediaStore (mediaInStore.get(i));
			center.add(cell);
			}
			return center;
			}
		public StoreScreen (Store store) {
			this.store = store;
			Container cp = getContentPane();
			cp.setLayout(new BorderLayout());
			cp.add(createNorth(), BorderLayout.NORTH);
			cp.add(createCenter(), BorderLayout.CENTER);
			setVisible(true);
			setTitle("Store");
			setSize(1024, 768);
			}
		
		public static void main(String[] args) {
			Store store=new Store();
			
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
			Book book3 = new Book("OnePiece", "anime", 100f);
			store.addMedia(book3);
			Book book4 = new Book("Conan", "anime", 10.00f);
			store.addMedia(book4);
			
			new StoreScreen(store);
		}
}

package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

//các hàm khởi tạo

public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DigitalVideoDisc(int id, String title, String category, float cost) {
	super(id, title, category, cost);
	// TODO Auto-generated constructor stub
}


public DigitalVideoDisc(String title) {
	super(title);
	// TODO Auto-generated constructor stub
}


	public DigitalVideoDisc(String title, String category, float cost) {
	super(title, category, cost);
	// TODO Auto-generated constructor stub
}


	public DigitalVideoDisc(String title, String category,String director, int length, float cost) {
	super(title, category, director, length, cost);
	// TODO Auto-generated constructor stub
}


	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String title, String director, int length) {
		super(title, director, length);
		// TODO Auto-generated constructor stub
	}

	//play()
	@Override
	public void play() {
		System.out.println("Phát DVD: " + this.getTitle());
		System.out.println("Độ dài DVD: " + this.getLength());
		}
}

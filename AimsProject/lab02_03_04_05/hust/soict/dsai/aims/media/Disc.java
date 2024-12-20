package hust.soict.dsai.aims.media;

public class Disc extends Media{
	private String director;
	private int length;
//các hàm khởi tạo
	public Disc() {
		super();
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}


	public Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, String category,String director,int length, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
		this.director=director;
		this.length=length;
	}

	public Disc(int id, String title, String category, float cost,String director,int length) {
		super(id, title, category, cost);
		// TODO Auto-generated constructor stub
		this.director=director;
		this.length=length;
	}
	public Disc(String title,String director,int length) {
		super(title);
		// TODO Auto-generated constructor stub
		this.director=director;
		this.length=length;
	}
	//getter
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}


}

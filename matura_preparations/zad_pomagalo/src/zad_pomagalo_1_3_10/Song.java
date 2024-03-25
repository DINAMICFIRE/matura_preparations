package zad_pomagalo_1_3_10;

public class Song {
	private String artist;
	private String name;
	
	public Song() {
		this.artist = "unknown";
		this.name = "unknown";
	}
	
	public Song(String name) {
		this.artist = "unknown";
		this.name = name;
	}
	
	public Song(String artist, String name) {
		super();
		this.artist = artist;
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

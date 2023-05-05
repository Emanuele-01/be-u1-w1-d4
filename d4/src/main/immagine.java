package main;

public class immagine extends multimedialElement{
	
	private String nameFileImage;

	public immagine(String titolo, String nameFileImage) {
		super(titolo);
		this.nameFileImage = nameFileImage;
	}
	 public String getNomeFile() {
	        return nameFileImage;
	    }

	@Override
	public int getDuration() {
		return 0;
	}

	@Override
	public void play() {
	}

}

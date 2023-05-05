package main;

public class video extends multimedialElement {
	
	private String nameFileVideo;

	public video(String titolo, String nameFileVideo) {
		super(titolo);
		this.nameFileVideo = nameFileVideo;
	}
	
	public String getNomeFile() {
        return nameFileVideo;
    }
	
	@Override
	public int getDuration() {
		return 0;
	}

	@Override
	public void play() {
		
	}

}

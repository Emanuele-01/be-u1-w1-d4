package main;

public class audio extends multimedialElement{
	
	private String nameFileAudio;

	public audio(String titolo, String nameFileAudio) {
		super(titolo);
		this.nameFileAudio = nameFileAudio;
	}

	public String getNomeFile() {
        return nameFileAudio;
    }
	
	@Override
	public int getDuration() {
		return 0;
	}

	@Override
	public void play() {
		
	}

}

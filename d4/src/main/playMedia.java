package main;

public class playMedia extends multimedialElement{
	
	private String nameFileGeneral;
    private int durata;
    private int volume;
    private int luminosità;

	public playMedia(String titolo, String nameFileGeneral, int durata, int volume, int luminosità) {
		super(titolo);
		this.nameFileGeneral = nameFileGeneral;
		this.durata = durata;
		this.volume = volume;
		this.luminosità = luminosità;
	}
	
	public String getNameFile() {
        return nameFileGeneral;
    }

	@Override
	public int getDuration() {
		return durata;
	}

	@Override
	public void play() {
		for (int go = 0; go < durata; go++) {
			String Esclamation = "!".repeat(volume);
			int Lum = luminosità;
			System.out.println(getTitle() + " " + Esclamation);
			System.out.println("luminosità: " + luminosità);
		};
	}
	
	 public void abbassaVolume() {
	        if (volume > 0) {
	            volume--;
	        }
	    }

	    public void alzaVolume() {
	        volume++;
	    }
	    
	    public void abbassaLuminosità() {
	        if (luminosità > 0) {
	            luminosità--;
	        }
	    }

	    public void alzaLuminosità() {
	    	if (luminosità < 5) {
	            luminosità++;
	        }
	    }
	
}

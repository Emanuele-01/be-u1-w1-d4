package main;

public class Main {

	public static void main(String[] args) {
		
		playMedia audio = new playMedia("La guerra di Piero", "audio.wave", 6, 3, 3);
		audio.abbassaVolume();
		audio.abbassaLuminosità();
		audio.play();
	}

}

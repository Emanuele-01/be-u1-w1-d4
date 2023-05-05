package main;

public abstract class multimedialElement {

	private String titolo;
	
	public multimedialElement(String titolo) {
        this.titolo = titolo;
    }
	
	 public String getTitle() {
	        return titolo;
	    }
	 
	 public abstract int getDuration();
	 
	 public abstract void play();
}

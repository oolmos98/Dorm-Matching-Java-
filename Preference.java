
public class Preference {

	private int quiet;
	private int music;
	private int reading;
	private int chatting;

	public Preference(){
		quiet = 0;
		music = 0;
		reading = 0;
		chatting = 0;
	}
	public Preference (int quiet, int music, int reading, int chatting){
		this.quiet = quiet;
		this.music = music;
		this.reading = reading;
		this.chatting = chatting;

	}
	public int compare(Preference s2){
		int score;
		int dif = Math.abs(this.getQuiet() - s2.getQuiet()) + Math.abs(this.getMusic() - s2.getMusic()) + Math.abs(this.getChatting() - s2.getChatting()) + Math.abs(this.getReading() - s2.getReading());

		score = 40 - dif;
		return score;
	}

	public int getQuiet(){
		return quiet;
	}

	public int getMusic(){
		return music;
	}

	public int getReading(){
		return reading;
	}

	public int getChatting(){
		return chatting;
	}
	public void setQuiet(int quiet){
		this.quiet=quiet;
	}
	public void setMusic(int music){
		this.music = music;
	}
	public void setReading(int read){
		this.reading= read;
	}
	public void setChatting(int chat){
		this.chatting = chat;
	}

}


public class Music {

	private String musicName;
	private String singer;
	private int playTime;
	private String path;

	public Music(String musicName, String singer, int playTime, String path) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public Music(String musicName, String singer, int playTime) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}

	public String getMusicName() {
		return musicName;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}
}

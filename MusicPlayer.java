import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	ArrayList<Music> musicList = new ArrayList<Music>();

	MP3Player mp3 = new MP3Player();
	int index = 0;
	
	public MusicPlayer() {
		musicList.add(new Music("벌써 12시", "청하", 100, "C://music/CHUNG HA - 벌써 12시.mp3"));
		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new Music("Solo", "JEMMIE", 200, "C://music/JENNIE - SOLO.mp3"));
		musicList.add(new Music("2002", "Anne Marie", 200, "C://music/Anne Marie - 2002.mp3"));
		musicList.add(new Music("Let It Go", "Idina Menzel", 200, "C://music/Idina Menzel - Let It Go.mp3"));
		musicList.add(new Music("A Whole New World", "Massoud, Naomi Scott", 200,
				"C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3"));
		musicList.add(new Music("Rain", "깡", 200, "C://music/Rain - 깡.mp3"));
		musicList.add(new Music("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));
		musicList.add(new Music("FANCY", "TWICE", 200, "C://music/TWICE - FANCY.mp3"));
		musicList.add(new Music("NO ONE", "이하이", 200, "C://music/이하이 - NO ONE.mp3"));
	}

	public void play() {
		mp3.play(musicList.get(index).getPath());
		
	}
	public void nextPlay() {
		index++;
		if (mp3.isPlaying() ) {
			mp3.stop();
		}
		if (index >= musicList.size()) {

			index %= musicList.size();
			System.out.println("다음 곡이 없으므로 " + musicList.get(index).getMusicName() + "으로 다시 재생합니다.");
		}
		System.out.print("다음곡 >> ");
		mp3.play(musicList.get(index).getPath());
	}
	
	public void prevPlay() {
		if (mp3.isPlaying() ) {
			mp3.stop();
		}
		index--;
		if (index < 0) {
			index = index % musicList.size() + musicList.size();
		}
		System.out.print("이전곡 >> ");
		mp3.play(musicList.get(index).getPath());
		
	}
}

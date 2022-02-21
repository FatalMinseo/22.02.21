import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	ArrayList<Music> musicList = new ArrayList<Music>();

	MP3Player mp3 = new MP3Player();
	int index = 0;
	
	public MusicPlayer() {
		musicList.add(new Music("���� 12��", "û��", 100, "C://music/CHUNG HA - ���� 12��.mp3"));
		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new Music("Solo", "JEMMIE", 200, "C://music/JENNIE - SOLO.mp3"));
		musicList.add(new Music("2002", "Anne Marie", 200, "C://music/Anne Marie - 2002.mp3"));
		musicList.add(new Music("Let It Go", "Idina Menzel", 200, "C://music/Idina Menzel - Let It Go.mp3"));
		musicList.add(new Music("A Whole New World", "Massoud, Naomi Scott", 200,
				"C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3"));
		musicList.add(new Music("Rain", "��", 200, "C://music/Rain - ��.mp3"));
		musicList.add(new Music("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));
		musicList.add(new Music("FANCY", "TWICE", 200, "C://music/TWICE - FANCY.mp3"));
		musicList.add(new Music("NO ONE", "������", 200, "C://music/������ - NO ONE.mp3"));
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
			System.out.println("���� ���� �����Ƿ� " + musicList.get(index).getMusicName() + "���� �ٽ� ����մϴ�.");
		}
		System.out.print("������ >> ");
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
		System.out.print("������ >> ");
		mp3.play(musicList.get(index).getPath());
		
	}
}

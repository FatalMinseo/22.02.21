import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();

//		Music music1 =new Music("��", "Rain", 100);
//		Music music2 =new Music("Dalla Dalla", "Itzy", 120);
//		Music music3 =new Music("Solo", "JEMMIE", 200);

//		ArrayList<Music> musicList = new ArrayList<Music>();
//		musicList.add(new Music("���� 12��", "û��", 100, "C://music/CHUNG HA - ���� 12��.mp3"));
//		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
//		musicList.add(new Music("Solo", "JEMMIE", 200, "C://music/JENNIE - SOLO.mp3"));
//		musicList.add(new Music("2002", "Anne Marie", 200, "C://music/Anne Marie - 2002.mp3"));
//		musicList.add(new Music("Let It Go", "Idina Menzel", 200, "C://music/Idina Menzel - Let It Go.mp3"));
//		musicList.add(new Music("A Whole New World", "Massoud, Naomi Scott", 200, "C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3"));
//		musicList.add(new Music("Rain", "��", 200, "C://music/Rain - ��.mp3"));
//		musicList.add(new Music("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));
//		musicList.add(new Music("FANCY", "TWICE", 200, "C://music/TWICE - FANCY.mp3"));
//		musicList.add(new Music("NO ONE", "������", 200, "C://music/������ - NO ONE.mp3"));

//		int index = 0;
		MusicPlayer Player = new MusicPlayer();
		
		while (true) {
			System.out.print("[1]�� [2]�� [3]���� [4]���� [5]�� >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("�� >> ");
//				mp3.play(musicList.get(index).getPath());
				show(Player.musicList, Player.index);
				Player.play();
			} else if (menu == 2) {
				if (mp3.isPlaying() == true) {
					mp3.stop();
				}
				System.out.println("��");
			} else if (menu == 3) {
				Player.nextPlay();
				show(Player.musicList, Player.index);
			} else if (menu == 4) {
				Player.prevPlay();
				show(Player.musicList, Player.index);
			} else if (menu == 5) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�ٽ� �Է�");
			}
			System.out.println();
		}
		sc.close();
	}

	public static void show(ArrayList<Music> musicList, int index) {
		System.out.println(musicList.get(index).getMusicName() + ", " + musicList.get(index).getSinger() + ", "
				+ (musicList.get(index).getPlayTime() / 60) + "�� " + musicList.get(index).getPlayTime() % 60 + "��");
	}
}

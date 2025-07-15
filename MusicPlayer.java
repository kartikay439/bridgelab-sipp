import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		MusicPlayerApp browser = new MusicPlayerApp();
		browser.startMusicPlayer();

	}
}

interface MusicPlayerFuctionalities {
	void addSong(Scanner sc);

	void nextSong();
}

class Song {
	private Song next;
	private Song prev;
	private String name;

	// Creating new song
	public Song(String name) {
		this.setName(name);
		this.next = null;
		this.prev = null;
	}

	public Song getNext() {
		return next;
	}

	public void setNext(Song next) {
		this.next = next;
	}

	public Song getPrev() {
		return prev;
	}

	public void setPrev(Song prev) {
		this.prev = prev;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class MusicPlayerApp implements MusicPlayerFuctionalities {
	Song top;
	Song bottom;
	Song current;

	public MusicPlayerApp() {
		this.top = null;
	}

	public void addSong(Scanner sc) {
		System.out.println("Enter song name: ");
		String url = sc.next();
		Song newSong = new Song(url);

		if (top == null) {

			top = bottom = current = newSong;
		} else {

			newSong.setPrev(current);
			newSong.setNext(current.getNext());

			if (current.getNext() != null) {
				current.getNext().setPrev(newSong);
			} else {

				bottom = newSong;
			}

			current.setNext(newSong);
			current = newSong;
		}

		System.out.println("Added: " + url + "\n");
	}

	public void nextSong() {
		if (current.getPrev() != null) {
			current = current.getPrev();
			System.out.println("Playing : " + current.getName());

			return;
		}
		System.out.println("No Next Song exist");
		System.out.println();
		System.out.println();
	}

	public void getCurrent() {
		if (current != null) {
			System.out.println("Current tab  :" + current.getName());
			System.out.println();
			System.out.println();
			return;
		}
		System.out.println("No song exist please add song to playlist first............................");
		System.out.println();
		System.out.println();

	}

	public void previousSong() {
		if (current.getNext() != null) {
			current = current.getNext();
			System.out.println(current.getName());
			return;
		}
		System.out.println("No Previos Song exist");
		System.out.println();
		System.out.println();
	}

	public void showPlaylist() {
		Song temp = top;
		System.out.println("----------------------------------Your Playlist-----------------------------");
		while (temp != null) {
			System.out.println(temp.getName());
			temp = temp.getNext();
		}
		System.out.println();
		System.out.println();
	}

	public void startMusicPlayer() {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("addSong 1.");
			System.out.println("Previous Song 2.");
			System.out.println("Next Song 3.");
			System.out.println("Current Song 4.");
			System.out.println("Show Playlist 5.");
			System.out.println("Close MusicPlayer 6.");
			System.out.println();
			System.out.println();
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addSong(sc);
				break;
			case 2:
				previousSong();
				break;
			case 3:
				nextSong();
				break;
			case 4:
				getCurrent();
				break;
			case 5:
				showPlaylist();
				break;

			case 6:
				running = false;
				break;

			}

		}
	}

}
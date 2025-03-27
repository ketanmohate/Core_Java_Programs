package Day_02_11_2024;

import java.util.*;

abstract class Media
{
	abstract void play();
	
	void stop()
	{
		System.out.println("Media stopped.");
	}
}

interface Playable
{
	void play();
}

interface Stoppable
{
	void play();
}

class Song extends Media implements Playable, Stoppable
{
	private String songName;
	
	Song(String songName) 
	{
		this.songName = songName;
	}

	public void play() 
	{
		System.out.println("Playing song" + songName);
	}
	
	public void stop()
	{
		System.out.println("Stopping song" + songName);
	}
	
}

class Video extends Media implements Playable, Stoppable
{
	private String videoName;
	
	Video(String videoName) 
	{
		this.videoName = videoName;
	}

	public void play()
	{
		System.out.println("Playing vidos: " + videoName);
	}
	
	public void stop()
	{
		System.out.println("Stopping video: " + videoName);
	}
}

public class Q1_Media_Player_System 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Media[] m = new Media[2];
				
		for(int i=0 ; i<m.length ; i++)
		{
			System.out.println("Enter the Song name");
			String songName = sc.nextLine();
			
			System.out.println("Enter the videos name");
			String videoName = sc.nextLine();
			
			m[i] = new Song(songName);
			m[i] = new Video(videoName);
		}
		
		for(Media mr : m)
		{
			mr.play();
			mr.stop();
			System.out.println();
		}
	}

}

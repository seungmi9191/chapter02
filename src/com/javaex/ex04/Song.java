package com.javaex.ex04;

public class Song {
	
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;
	
	//기본 생성자
	public Song() {
	}
	
	//매개변수 추가된 생성자
	public Song(String t, String art, String a, String c, int y, int tra) {
		
		title = t;
		artist = art;
		album = a;
		composer = c;
		year = y;
		track = tra;
		
	}
	
	//노래 제목과 가수만 입력받아 필드를 초기화하는 생성자
	public Song(String t, String art) {
		
	}
	
	/*//노래제목
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	
	//가수
	public void setArtist(String art) {
		artist = art;
	}
	public String getArtist() {
		return artist;
	}
	
	//앨범제목
	public void setAlbum(String a) {
		album = a;
	}
	public String getAblum() {
		return album;
	}

	//작곡가
	public void setComposer(String c) {
		composer = c;
	}
	public String getComposer() {
		return composer;
	}
	
	//연도
	public void setYear(int y) {
		year = y;
	}
	public int getYear() {
		return year;
	}
	
	//트랙번호
	public void setTrack(int tra) {
		track = tra;
	}
	public int getTrack() {
		return track;
	}*/
	
	public void showInfo() {
		System.out.println(artist+"," + title+ "( "+album+","+
	    year + "," + track + "번 track," + composer + " 작곡  )");
	}
}

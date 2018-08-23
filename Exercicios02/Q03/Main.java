public class Main{
	public static void main(String[] args){
		MusicList myList = new MusicList();		
		myList.addFile("audio/BoB-Airplane.mp3");
		myList.addFile("audio/Beck-HitInTheUsa.mp3");
		myList.addFile("audio/Gunther-DingDingDongSong.mp3");			
		int num = myList.getNumberOfFiles();
		System.out.println(num);
		myList.listFiles();
		myList.playAll();
		myList.removeFile("DingDingDong");
		num = myList.getNumberOfFiles();	
		System.out.println(num);		
	}
}

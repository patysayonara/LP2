import java.util.ArrayList;

public class MusicList{

	private ArrayList<String> list;
	private SoundEngine engine;

	public MusicList(){
		list = new ArrayList<String>();
		engine = new SoundEngine();
	}
	
	public void addFile(String file){
		list.add(file);
	}

	public int getNumberOfFiles(){
		return list.size();
	}

	public void listFiles(){	
		for(String file: list){
			System.out.println(list.indexOf(file) + ": " + file);
		}
	}

	public void removeFile(int musicIndex){
		if(musicIndex > (list.size()-1) || musicIndex < 0){
			System.out.println("Foi inserido um indice invalido!");
		} else {
			list.remove(musicIndex);
		}
	}

	public void playFile(String file){
		engine.playCompletely(file);
	}
	
	public void playAll(){
		for(String play: list){
			engine.playCompletely(play);
		}
	}

	public void removeFile(String file){
		int conferir = 0;
		int indice = 0;
		for(String find: list){		
			if(find.contains(file) && conferir == 0){
				indice = list.indexOf(find);
				conferir = 1;
			}
		}
		if(conferir == 0){
			System.out.println("Nenhuma das musicas contem esse termo em sua estrutura!");
		} else {
			list.remove(indice);
		}
	}
}

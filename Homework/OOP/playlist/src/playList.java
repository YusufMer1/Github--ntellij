import java.util.ArrayList;
public class playList {
    String name;
    ArrayList<String> songs;
    playList(String name){
        this.name = name;
        songs = new ArrayList<>();
    }
    public void addSongs(String songName){
        songs.add(songName);
    }
    public void removeSong(String songName){
        songs.remove(songName);
    }
    public void printSongs(){
        if(songs == null){
            System.out.println("playlist is empty");
        }
        else{
            int i = 1;
            for(String name : songs){
                System.out.println(i + ". " + name);
                i++;
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        playList pL = new playList("my Favourite Songs");
        pL.addSongs("Golden Brown");
        pL.addSongs("505");
        pL.addSongs("Rolling In the Deep");
        pL.printSongs();
        pL.removeSong("505");
        pL.printSongs();
    }
}
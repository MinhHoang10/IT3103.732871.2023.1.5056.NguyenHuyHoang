package OopLab4;
//Nguyen Huy Hoang 20215056
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Track;

public class CompactDisc extends Media {
    private String artist;
    private List<Track> tracks = new ArrayList<track>();

    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }

    public boolean addTrack(Track newTrack) {
        if(tracks.contains(newTrack)){
            return false;
        } else {
            tracks.add(newTrack);
            return true;
        }
    }

    public boolean removeTrack(Track newTrack){
        if(tracks.contains(newTrack)){
            tracks.remove(newTrack);
            return true;
        } else {
            return false;
        }
    }

    public int getLength(){
        int total = 0;
        for (Track i : tracks) {
            total += i.getLength();
          }
        return total;
    }
}

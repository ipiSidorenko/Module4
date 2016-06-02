package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.file;

public class AudioFile extends File {

    private String artistName;
    private String songName;
    private short bitrate;

    AudioFile(String fileName){
        super(fileName);
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public short getBitrate() {
        return bitrate;
    }

    public void setBitrate(short bitrate) {
        this.bitrate = bitrate;
    }

}

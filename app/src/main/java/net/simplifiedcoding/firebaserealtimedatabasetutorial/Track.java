package net.simplifiedcoding.firebaserealtimedatabasetutorial;


import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Belal on 2/26/2017.
 */
@IgnoreExtraProperties
public class Track {
    private String id;
    private String trackName;


    public Track() {

    }

    public Track(String id, String trackName) {
        this.trackName = trackName;

        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }


}
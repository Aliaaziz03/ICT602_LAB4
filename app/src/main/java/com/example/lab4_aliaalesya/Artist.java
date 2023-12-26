package com.example.lab4_aliaalesya;

public class Artist {
    String artistId;
    String artistName;

    // Empty constructor required for Firebase
    public Artist() {}

    public Artist(String a, String b) {
        artistId = a;
        artistName = b;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }
}

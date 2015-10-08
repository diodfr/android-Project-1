package com.example.broca.finalcoursephase1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by broca on 22/09/2015.
 */
public class Film implements Parcelable {
    public String posterUrl;
    public String originalTitle;
    public String backdropUrl;
    public String overview;
    public String voteAverage;
    public String releaseDate;

    public Film() {

    }

    protected Film(Parcel in) {
        posterUrl = in.readString();
        originalTitle = in.readString();
        backdropUrl = in.readString();
        overview = in.readString();
        voteAverage = in.readString();
        releaseDate = in.readString();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(posterUrl);
        dest.writeString(originalTitle);
        dest.writeString(backdropUrl);
        dest.writeString(overview);
        dest.writeString(voteAverage);
        dest.writeString(releaseDate);
    }
}

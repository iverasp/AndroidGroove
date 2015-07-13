package no.iegget.mopidy.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by iver on 7/11/15.
 */
public class Contract {

    public static final String CONTENT_AUTHORITY = "no.iegget.android.mopidy";
    public static final Uri BASE_CONTENT_URI = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(CONTENT_AUTHORITY).build();

    public static final String PATH_ALBUMS = "albums";
    public static final String PATH_ALBUM = "albums/#";

    public static final String PATH_ARTISTS = "artists";
    public static final String PATH_ARTIST = "artists/#";

    public static final String PATH_TRACKS = "tracks";
    public static final String PATH_TRACK = "tracks/#";

    public static class Album implements BaseColumns {
        public static final String TABLE = "album";
        public static final Uri ALBUMS_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_ALBUMS).build();

        public static final String NAME = "name";
        public static final String NUM_TRACKS = "num_tracks";
        public static final String ARTIST_ID = "artist_id";
    }

    public static class Artist implements BaseColumns {
        public static final String TABLE = "artist";

        public static final String NAME = "name";
    }

    public static class Track implements BaseColumns {
        public static final String TABLE = "track";

        public static final String NAME = "name";
        public static final String LENGHT = "lenght";
        public static final String BITRATE = "bitrate";
        public static final String TRACK_NO = "track_no";
        public static final String GENRE = "genre";
        public static final String ALBUM_ID = "album_id";

    }
}

package no.iegget.mopidy.provider;

import com.blandware.android.atleap.provider.ormlite.OrmLiteUriMatcher;

import no.iegget.mopidy.model.Album;
import no.iegget.mopidy.model.Artist;
import no.iegget.mopidy.model.Track;

/**
 * Created by iver on 7/11/15.
 */
public class UriMatcher extends OrmLiteUriMatcher {
    protected UriMatcher(String authority) {
        super(authority);
    }

    @Override
    public void instantiate() {
        addClass(Contract.PATH_ALBUMS, Album.class);
        addClass(Contract.PATH_ALBUM, Album.class);

        addClass(Contract.PATH_ARTISTS, Artist.class);
        addClass(Contract.PATH_ARTIST, Artist.class);

        addClass(Contract.PATH_TRACKS, Track.class);
        addClass(Contract.PATH_TRACK, Track.class);
    }
}

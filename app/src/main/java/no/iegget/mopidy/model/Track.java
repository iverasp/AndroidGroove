package no.iegget.mopidy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import no.iegget.mopidy.provider.Contract;

/**
 * Created by iver on 7/12/15.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@DatabaseTable(tableName = Contract.Track.TABLE)
public class Track {

    @DatabaseField(id = true, columnName = Contract.Track._ID)
    public int id;

    @DatabaseField(columnName = Contract.Track.NAME)
    public String name;

    @DatabaseField(columnName = Contract.Track.LENGHT)
    public int length;

    @DatabaseField(columnName = Contract.Track.BITRATE)
    public int bitrate;

    @DatabaseField(columnName = Contract.Track.TRACK_NO)
    public int trackNumber;

    @DatabaseField(columnName = Contract.Track.GENRE)
    public String genre;

    @DatabaseField(foreign = true, columnName = Contract.Track.ALBUM_ID)
    public Album album;
}

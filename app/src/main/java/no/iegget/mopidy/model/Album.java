package no.iegget.mopidy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import no.iegget.mopidy.provider.Contract;

/**
 * Created by iver on 7/12/15.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@DatabaseTable(tableName = Contract.Album.TABLE)
public class Album {

    @DatabaseField(id = true, columnName = Contract.Album._ID)
    public int id;

    @DatabaseField(columnName = Contract.Album.NAME)
    public String name;

    @DatabaseField(columnName = Contract.Album.NUM_TRACKS)
    public int numberOfTracks;

    @DatabaseField(foreign = true, columnName = Contract.Album.ARTIST_ID)
    public Artist artist;

}

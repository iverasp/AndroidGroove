package no.iegget.mopidy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import no.iegget.mopidy.provider.Contract;

/**
 * Created by iver on 7/12/15.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@DatabaseTable(tableName = Contract.Artist.TABLE)
public class Artist {

    @DatabaseField(id = true, columnName = Contract.Artist._ID)
    public int id;

    @DatabaseField(columnName = Contract.Artist.NAME)
    public String name;

}

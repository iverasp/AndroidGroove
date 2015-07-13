package no.iegget.mopidy.provider;

import android.content.Context;

import com.blandware.android.atleap.provider.ormlite.OrmLiteDatabaseHelper;
import com.blandware.android.atleap.provider.ormlite.OrmLiteUriMatcher;

/**
 * Created by iver on 7/11/15.
 */
public class DatabaseHelper extends OrmLiteDatabaseHelper {

    public static final String DATABASE_NAME = "app.db";
    public static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, DATABASE_VERSION);
    }

    @Override
    public OrmLiteUriMatcher getUriMatcher() {
        return OrmLiteUriMatcher.getInstance(UriMatcher.class, Contract.CONTENT_AUTHORITY);
    }
}

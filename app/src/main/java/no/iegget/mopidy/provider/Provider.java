package no.iegget.mopidy.provider;

import android.database.sqlite.SQLiteOpenHelper;

import com.blandware.android.atleap.provider.ormlite.OrmLiteProvider;
import com.blandware.android.atleap.provider.ormlite.OrmLiteUriMatcher;
import com.blandware.android.atleap.provider.sqlite.SQLiteUriMatcher;

/**
 * Created by iver on 7/11/15.
 */
public class Provider extends OrmLiteProvider {
    @Override
    protected SQLiteOpenHelper createHelper() {
        return new DatabaseHelper(getContext());
    }

    @Override
    public SQLiteUriMatcher getUriMatcher() {
        return OrmLiteUriMatcher.getInstance(UriMatcher.class, Contract.CONTENT_AUTHORITY);
    }

    @Override
    public String getAuthority() {
        return Contract.CONTENT_AUTHORITY;
    }
}

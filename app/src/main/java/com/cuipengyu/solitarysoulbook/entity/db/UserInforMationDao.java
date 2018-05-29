package com.cuipengyu.solitarysoulbook.entity.db;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.cuipengyu.solitarysoulbook.entity.bean.UserInforMation;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_INFOR_MATION".
*/
public class UserInforMationDao extends AbstractDao<UserInforMation, Long> {

    public static final String TABLENAME = "USER_INFOR_MATION";

    /**
     * Properties of entity UserInforMation.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Informationid = new Property(1, Long.class, "informationid", false, "INFORMATIONID");
        public final static Property UserName = new Property(2, String.class, "userName", false, "USER_NAME");
        public final static Property UserImage = new Property(3, String.class, "userImage", false, "USER_IMAGE");
        public final static Property SignaTrue = new Property(4, String.class, "signaTrue", false, "SIGNA_TRUE");
    }

    private Query<UserInforMation> userBean_UserInforMationsQuery;

    public UserInforMationDao(DaoConfig config) {
        super(config);
    }
    
    public UserInforMationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_INFOR_MATION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"INFORMATIONID\" INTEGER," + // 1: informationid
                "\"USER_NAME\" TEXT," + // 2: userName
                "\"USER_IMAGE\" TEXT," + // 3: userImage
                "\"SIGNA_TRUE\" TEXT);"); // 4: signaTrue
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_INFOR_MATION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserInforMation entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long informationid = entity.getInformationid();
        if (informationid != null) {
            stmt.bindLong(2, informationid);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(3, userName);
        }
 
        String userImage = entity.getUserImage();
        if (userImage != null) {
            stmt.bindString(4, userImage);
        }
 
        String signaTrue = entity.getSignaTrue();
        if (signaTrue != null) {
            stmt.bindString(5, signaTrue);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserInforMation entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long informationid = entity.getInformationid();
        if (informationid != null) {
            stmt.bindLong(2, informationid);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(3, userName);
        }
 
        String userImage = entity.getUserImage();
        if (userImage != null) {
            stmt.bindString(4, userImage);
        }
 
        String signaTrue = entity.getSignaTrue();
        if (signaTrue != null) {
            stmt.bindString(5, signaTrue);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public UserInforMation readEntity(Cursor cursor, int offset) {
        UserInforMation entity = new UserInforMation( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // informationid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // userName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userImage
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // signaTrue
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserInforMation entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setInformationid(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setUserName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserImage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSignaTrue(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(UserInforMation entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(UserInforMation entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(UserInforMation entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "userInforMations" to-many relationship of UserBean. */
    public List<UserInforMation> _queryUserBean_UserInforMations(Long informationid) {
        synchronized (this) {
            if (userBean_UserInforMationsQuery == null) {
                QueryBuilder<UserInforMation> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Informationid.eq(null));
                userBean_UserInforMationsQuery = queryBuilder.build();
            }
        }
        Query<UserInforMation> query = userBean_UserInforMationsQuery.forCurrentThread();
        query.setParameter(0, informationid);
        return query.list();
    }

}

package code.name.score.octave.db;

import java.lang.System;

@androidx.room.Database(entities = {code.name.score.octave.db.PlaylistEntity.class, code.name.score.octave.db.SongEntity.class, code.name.score.octave.db.HistoryEntity.class, code.name.score.octave.db.PlayCountEntity.class, code.name.score.octave.db.BlackListStoreEntity.class, code.name.score.octave.db.LyricsEntity.class}, version = 23, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcode/name/score/octave/db/RetroDatabase;", "Landroidx/room/RoomDatabase;", "()V", "blackListStore", "Lcode/name/score/octave/db/BlackListStoreDao;", "historyDao", "Lcode/name/score/octave/db/HistoryDao;", "lyricsDao", "Lcode/name/score/octave/db/LyricsDao;", "playCountDao", "Lcode/name/score/octave/db/PlayCountDao;", "playlistDao", "Lcode/name/score/octave/db/PlaylistDao;", "app_release"})
public abstract class RetroDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract code.name.score.octave.db.PlaylistDao playlistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract code.name.score.octave.db.BlackListStoreDao blackListStore();
    
    @org.jetbrains.annotations.NotNull()
    public abstract code.name.score.octave.db.PlayCountDao playCountDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract code.name.score.octave.db.HistoryDao historyDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract code.name.score.octave.db.LyricsDao lyricsDao();
    
    public RetroDatabase() {
        super();
    }
}
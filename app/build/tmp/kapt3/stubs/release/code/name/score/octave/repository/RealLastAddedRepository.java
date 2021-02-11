package code.name.score.octave.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcode/name/score/octave/repository/RealLastAddedRepository;", "Lcode/name/score/octave/repository/LastAddedRepository;", "songRepository", "Lcode/name/score/octave/repository/RealSongRepository;", "albumRepository", "Lcode/name/score/octave/repository/RealAlbumRepository;", "artistRepository", "Lcode/name/score/octave/repository/RealArtistRepository;", "(Lcode/name/score/octave/repository/RealSongRepository;Lcode/name/score/octave/repository/RealAlbumRepository;Lcode/name/score/octave/repository/RealArtistRepository;)V", "makeLastAddedCursor", "Landroid/database/Cursor;", "recentAlbums", "", "Lcode/name/score/octave/model/Album;", "recentArtists", "Lcode/name/score/octave/model/Artist;", "recentSongs", "Lcode/name/score/octave/model/Song;", "app_release"})
public final class RealLastAddedRepository implements code.name.score.octave.repository.LastAddedRepository {
    private final code.name.score.octave.repository.RealSongRepository songRepository = null;
    private final code.name.score.octave.repository.RealAlbumRepository albumRepository = null;
    private final code.name.score.octave.repository.RealArtistRepository artistRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<code.name.score.octave.model.Song> recentSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<code.name.score.octave.model.Album> recentAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<code.name.score.octave.model.Artist> recentArtists() {
        return null;
    }
    
    private final android.database.Cursor makeLastAddedCursor() {
        return null;
    }
    
    public RealLastAddedRepository(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.repository.RealSongRepository songRepository, @org.jetbrains.annotations.NotNull()
    code.name.score.octave.repository.RealAlbumRepository albumRepository, @org.jetbrains.annotations.NotNull()
    code.name.score.octave.repository.RealArtistRepository artistRepository) {
        super();
    }
}
package code.name.score.octave.repository;

import java.lang.System;

/**
 * Created by hemanths on 16/08/17.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcode/name/score/octave/repository/TopPlayedRepository;", "", "notRecentlyPlayedTracks", "", "Lcode/name/score/octave/model/Song;", "recentlyPlayedTracks", "topAlbums", "Lcode/name/score/octave/model/Album;", "topArtists", "Lcode/name/score/octave/model/Artist;", "topTracks", "app_release"})
public abstract interface TopPlayedRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<code.name.score.octave.model.Song> recentlyPlayedTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<code.name.score.octave.model.Song> topTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<code.name.score.octave.model.Song> notRecentlyPlayedTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<code.name.score.octave.model.Album> topAlbums();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<code.name.score.octave.model.Artist> topArtists();
}
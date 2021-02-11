package code.name.score.octave.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcode/name/score/octave/interfaces/IHomeClickListener;", "", "onAlbumClick", "", "album", "Lcode/name/score/octave/model/Album;", "onArtistClick", "artist", "Lcode/name/score/octave/model/Artist;", "onGenreClick", "genre", "Lcode/name/score/octave/model/Genre;", "app_debug"})
public abstract interface IHomeClickListener {
    
    public abstract void onAlbumClick(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Album album);
    
    public abstract void onArtistClick(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Artist artist);
    
    public abstract void onGenreClick(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Genre genre);
}
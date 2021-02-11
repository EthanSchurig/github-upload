package code.name.score.octave.fragments.playlists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\rJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcode/name/score/octave/fragments/playlists/PlaylistDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcode/name/score/octave/interfaces/IMusicServiceEventListener;", "realRepository", "Lcode/name/score/octave/repository/RealRepository;", "playlist", "Lcode/name/score/octave/db/PlaylistWithSongs;", "(Lcode/name/score/octave/repository/RealRepository;Lcode/name/score/octave/db/PlaylistWithSongs;)V", "playListSongs", "Landroidx/lifecycle/MutableLiveData;", "", "Lcode/name/score/octave/model/Song;", "getSongs", "Landroidx/lifecycle/LiveData;", "Lcode/name/score/octave/db/SongEntity;", "onMediaStoreChanged", "", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "app_debug"})
public final class PlaylistDetailsViewModel extends androidx.lifecycle.ViewModel implements code.name.score.octave.interfaces.IMusicServiceEventListener {
    private final androidx.lifecycle.MutableLiveData<java.util.List<code.name.score.octave.model.Song>> playListSongs = null;
    private final code.name.score.octave.repository.RealRepository realRepository = null;
    private code.name.score.octave.db.PlaylistWithSongs playlist;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<code.name.score.octave.db.SongEntity>> getSongs() {
        return null;
    }
    
    @java.lang.Override()
    public void onMediaStoreChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    public PlaylistDetailsViewModel(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.repository.RealRepository realRepository, @org.jetbrains.annotations.NotNull()
    code.name.score.octave.db.PlaylistWithSongs playlist) {
        super();
    }
}
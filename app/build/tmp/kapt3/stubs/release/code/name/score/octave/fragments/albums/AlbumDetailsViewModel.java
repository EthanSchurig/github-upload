package code.name.score.octave.fragments.albums;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u0012\u001a\u00020\nJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0015\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\fH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcode/name/score/octave/fragments/albums/AlbumDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcode/name/score/octave/interfaces/IMusicServiceEventListener;", "repository", "Lcode/name/score/octave/repository/RealRepository;", "albumId", "", "(Lcode/name/score/octave/repository/RealRepository;J)V", "albumDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcode/name/score/octave/model/Album;", "fetchAlbum", "", "getAlbum", "Landroidx/lifecycle/LiveData;", "getAlbumInfo", "Lcode/name/score/octave/network/Result;", "Lcode/name/score/octave/network/model/LastFmAlbum;", "album", "getArtist", "Lcode/name/score/octave/model/Artist;", "artistId", "getMoreAlbums", "", "artist", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "app_release"})
public final class AlbumDetailsViewModel extends androidx.lifecycle.ViewModel implements code.name.score.octave.interfaces.IMusicServiceEventListener {
    private final androidx.lifecycle.MutableLiveData<code.name.score.octave.model.Album> albumDetails = null;
    private final code.name.score.octave.repository.RealRepository repository = null;
    private final long albumId = 0L;
    
    private final void fetchAlbum() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<code.name.score.octave.model.Album> getAlbum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<code.name.score.octave.model.Artist> getArtist(long artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<code.name.score.octave.network.Result<code.name.score.octave.network.model.LastFmAlbum>> getAlbumInfo(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Album album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<code.name.score.octave.model.Album>> getMoreAlbums(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Artist artist) {
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
    
    public AlbumDetailsViewModel(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.repository.RealRepository repository, long albumId) {
        super();
    }
}
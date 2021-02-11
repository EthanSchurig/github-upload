package code.name.score.octave.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u0019H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006-"}, d2 = {"Lcode/name/score/octave/fragments/DetailListFragment;", "Lcode/name/score/octave/fragments/base/AbsMainActivityFragment;", "Lcode/name/score/octave/interfaces/IArtistClickListener;", "Lcode/name/score/octave/interfaces/IAlbumClickListener;", "()V", "args", "Lcode/name/score/octave/fragments/DetailListFragmentArgs;", "getArgs", "()Lcode/name/score/octave/fragments/DetailListFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "albumAdapter", "Lcode/name/score/octave/adapter/album/AlbumAdapter;", "albums", "", "Lcode/name/score/octave/model/Album;", "artistAdapter", "Lcode/name/score/octave/adapter/artist/ArtistAdapter;", "artists", "Lcode/name/score/octave/model/Artist;", "gridCount", "", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "lastAddedSongs", "", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "loadAlbums", "title", "type", "loadArtists", "loadFavorite", "loadHistory", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAlbumClick", "albumId", "", "view", "Landroid/view/View;", "onArtist", "artistId", "topPlayed", "app_release"})
public final class DetailListFragment extends code.name.score.octave.fragments.base.AbsMainActivityFragment implements code.name.score.octave.interfaces.IArtistClickListener, code.name.score.octave.interfaces.IAlbumClickListener {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final code.name.score.octave.fragments.DetailListFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void lastAddedSongs() {
    }
    
    private final void topPlayed() {
    }
    
    private final void loadHistory() {
    }
    
    private final void loadFavorite() {
    }
    
    private final void loadArtists(int title, int type) {
    }
    
    private final void loadAlbums(int title, int type) {
    }
    
    private final code.name.score.octave.adapter.artist.ArtistAdapter artistAdapter(java.util.List<code.name.score.octave.model.Artist> artists) {
        return null;
    }
    
    private final code.name.score.octave.adapter.album.AlbumAdapter albumAdapter(java.util.List<code.name.score.octave.model.Album> albums) {
        return null;
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager() {
        return null;
    }
    
    private final androidx.recyclerview.widget.GridLayoutManager gridLayoutManager() {
        return null;
    }
    
    private final int gridCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onArtist(long artistId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onAlbumClick(long albumId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public DetailListFragment() {
        super(0);
    }
}
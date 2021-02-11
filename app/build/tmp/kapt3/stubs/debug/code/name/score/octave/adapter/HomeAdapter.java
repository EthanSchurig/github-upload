package code.name.score.octave.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0006/01234B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020(2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0014\u0010-\u001a\u00020\u001d2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcode/name/score/octave/adapter/HomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcode/name/score/octave/interfaces/IArtistClickListener;", "Lcode/name/score/octave/interfaces/IAlbumClickListener;", "Lcode/name/score/octave/interfaces/IGenreClickListener;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "list", "", "Lcode/name/score/octave/model/Home;", "albumAdapter", "Lcode/name/score/octave/adapter/album/AlbumAdapter;", "albums", "Lcode/name/score/octave/model/Album;", "artistsAdapter", "Lcode/name/score/octave/adapter/artist/ArtistAdapter;", "artists", "Lcode/name/score/octave/model/Artist;", "getItemCount", "", "getItemViewType", "position", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onAlbumClick", "", "albumId", "", "view", "Landroid/view/View;", "onArtist", "artistId", "onBindViewHolder", "holder", "onClickGenre", "genre", "Lcode/name/score/octave/model/Genre;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapData", "sections", "AbsHomeViewItem", "AlbumViewHolder", "ArtistViewHolder", "GenreViewHolder", "PlaylistViewHolder", "SuggestionsViewHolder", "app_debug"})
public final class HomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements code.name.score.octave.interfaces.IArtistClickListener, code.name.score.octave.interfaces.IAlbumClickListener, code.name.score.octave.interfaces.IGenreClickListener {
    private java.util.List<code.name.score.octave.model.Home> list;
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void swapData(@org.jetbrains.annotations.NotNull()
    java.util.List<code.name.score.octave.model.Home> sections) {
    }
    
    private final code.name.score.octave.adapter.artist.ArtistAdapter artistsAdapter(java.util.List<code.name.score.octave.model.Artist> artists) {
        return null;
    }
    
    private final code.name.score.octave.adapter.album.AlbumAdapter albumAdapter(java.util.List<code.name.score.octave.model.Album> albums) {
        return null;
    }
    
    private final androidx.recyclerview.widget.GridLayoutManager gridLayoutManager() {
        return null;
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onArtist(long artistId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onAlbumClick(long albumId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onClickGenre(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Genre genre, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcode/name/score/octave/adapter/HomeAdapter$AlbumViewHolder;", "Lcode/name/score/octave/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcode/name/score/octave/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcode/name/score/octave/model/Home;", "app_debug"})
    final class AlbumViewHolder extends code.name.score.octave.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        code.name.score.octave.model.Home home) {
        }
        
        public AlbumViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcode/name/score/octave/adapter/HomeAdapter$ArtistViewHolder;", "Lcode/name/score/octave/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcode/name/score/octave/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcode/name/score/octave/model/Home;", "app_debug"})
    final class ArtistViewHolder extends code.name.score.octave.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        code.name.score.octave.model.Home home) {
        }
        
        public ArtistViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcode/name/score/octave/adapter/HomeAdapter$SuggestionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcode/name/score/octave/adapter/HomeAdapter;Landroid/view/View;)V", "images", "", "", "bindView", "", "home", "Lcode/name/score/octave/model/Home;", "app_debug"})
    final class SuggestionsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final java.util.List<java.lang.Integer> images = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        code.name.score.octave.model.Home home) {
        }
        
        public SuggestionsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcode/name/score/octave/adapter/HomeAdapter$PlaylistViewHolder;", "Lcode/name/score/octave/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcode/name/score/octave/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcode/name/score/octave/model/Home;", "app_debug"})
    final class PlaylistViewHolder extends code.name.score.octave.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        code.name.score.octave.model.Home home) {
        }
        
        public PlaylistViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcode/name/score/octave/adapter/HomeAdapter$GenreViewHolder;", "Lcode/name/score/octave/adapter/HomeAdapter$AbsHomeViewItem;", "itemView", "Landroid/view/View;", "(Lcode/name/score/octave/adapter/HomeAdapter;Landroid/view/View;)V", "bind", "", "home", "Lcode/name/score/octave/model/Home;", "app_debug"})
    final class GenreViewHolder extends code.name.score.octave.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        code.name.score.octave.model.Home home) {
        }
        
        public GenreViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcode/name/score/octave/adapter/HomeAdapter$AbsHomeViewItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "arrow", "Landroid/widget/ImageView;", "getArrow", "()Landroid/widget/ImageView;", "clickableArea", "Landroid/view/ViewGroup;", "getClickableArea", "()Landroid/view/ViewGroup;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "title", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "app_debug"})
    public static class AbsHomeViewItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView arrow = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.ViewGroup clickableArea = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getArrow() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.ViewGroup getClickableArea() {
            return null;
        }
        
        public AbsHomeViewItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}
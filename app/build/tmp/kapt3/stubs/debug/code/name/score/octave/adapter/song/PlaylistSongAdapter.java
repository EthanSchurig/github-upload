package code.name.score.octave.adapter.song;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00060\u000fR\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcode/name/score/octave/adapter/song/PlaylistSongAdapter;", "Lcode/name/score/octave/adapter/song/SongAdapter;", "playlist", "Lcode/name/score/octave/db/PlaylistEntity;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcode/name/score/octave/model/Song;", "itemLayoutRes", "", "iCabHolder", "Lcode/name/score/octave/interfaces/ICabHolder;", "(Lcode/name/score/octave/db/PlaylistEntity;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;ILcode/name/score/octave/interfaces/ICabHolder;)V", "createViewHolder", "Lcode/name/score/octave/adapter/song/SongAdapter$ViewHolder;", "view", "Landroid/view/View;", "ViewHolder", "app_debug"})
public final class PlaylistSongAdapter extends code.name.score.octave.adapter.song.SongAdapter {
    private final code.name.score.octave.db.PlaylistEntity playlist = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected code.name.score.octave.adapter.song.SongAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public PlaylistSongAdapter(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.db.PlaylistEntity playlist, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<code.name.score.octave.model.Song> dataSet, int itemLayoutRes, @org.jetbrains.annotations.Nullable()
    code.name.score.octave.interfaces.ICabHolder iCabHolder) {
        super(null, null, 0, null, false);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0096\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078T@TX\u0094\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcode/name/score/octave/adapter/song/PlaylistSongAdapter$ViewHolder;", "Lcode/name/score/octave/adapter/song/SongAdapter$ViewHolder;", "Lcode/name/score/octave/adapter/song/SongAdapter;", "itemView", "Landroid/view/View;", "(Lcode/name/score/octave/adapter/song/PlaylistSongAdapter;Landroid/view/View;)V", "value", "", "songMenuRes", "getSongMenuRes", "()I", "setSongMenuRes", "(I)V", "onSongMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_debug"})
    public class ViewHolder extends code.name.score.octave.adapter.song.SongAdapter.ViewHolder {
        
        @java.lang.Override()
        protected int getSongMenuRes() {
            return 0;
        }
        
        @java.lang.Override()
        protected void setSongMenuRes(int value) {
        }
        
        @java.lang.Override()
        protected boolean onSongMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}
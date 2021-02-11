package code.name.score.octave.helper.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcode/name/score/octave/helper/menu/SongMenuHelper;", "Lorg/koin/core/KoinComponent;", "()V", "MENU_RES", "", "handleMenuClick", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "song", "Lcode/name/score/octave/model/Song;", "menuItemId", "OnClickSongMenu", "app_debug"})
public final class SongMenuHelper implements org.koin.core.KoinComponent {
    public static final int MENU_RES = code.name.score.octave.R.menu.menu_item_song;
    @org.jetbrains.annotations.NotNull()
    public static final code.name.score.octave.helper.menu.SongMenuHelper INSTANCE = null;
    
    public final boolean handleMenuClick(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Song song, int menuItemId) {
        return false;
    }
    
    private SongMenuHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcode/name/score/octave/helper/menu/SongMenuHelper$OnClickSongMenu;", "Landroid/view/View$OnClickListener;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "menuRes", "", "getMenuRes", "()I", "song", "Lcode/name/score/octave/model/Song;", "getSong", "()Lcode/name/score/octave/model/Song;", "onClick", "", "v", "Landroid/view/View;", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_debug"})
    public static abstract class OnClickSongMenu implements android.view.View.OnClickListener, android.widget.PopupMenu.OnMenuItemClickListener {
        private final androidx.fragment.app.FragmentActivity activity = null;
        
        public int getMenuRes() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract code.name.score.octave.model.Song getSong();
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        public OnClickSongMenu(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity) {
            super();
        }
    }
}
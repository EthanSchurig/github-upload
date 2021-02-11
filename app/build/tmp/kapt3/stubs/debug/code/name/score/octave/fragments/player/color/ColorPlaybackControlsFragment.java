package code.name.score.octave.fragments.player.color;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016J\u001a\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\rH\u0002J\b\u0010\'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\rH\u0002J\b\u0010)\u001a\u00020\rH\u0014J\b\u0010*\u001a\u00020\rH\u0002J\b\u0010+\u001a\u00020\rH\u0002J\b\u0010,\u001a\u00020\rH\u0016J\b\u0010-\u001a\u00020\rH\u0002J\b\u0010.\u001a\u00020\rH\u0002J\b\u0010/\u001a\u00020\rH\u0002J\b\u00100\u001a\u00020\rH\u0014J\b\u00101\u001a\u00020\rH\u0014J\b\u00102\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcode/name/score/octave/fragments/player/color/ColorPlaybackControlsFragment;", "Lcode/name/score/octave/fragments/base/AbsPlayerControlsFragment;", "()V", "lastDisabledPlaybackControlsColor", "", "lastPlaybackControlsColor", "mainActivity", "Lcode/name/score/octave/activities/MainActivity;", "getMainActivity", "()Lcode/name/score/octave/activities/MainActivity;", "progressViewUpdateHelper", "Lcode/name/score/octave/helper/MusicProgressViewUpdateHelper;", "hide", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "setColor", "color", "Lcode/name/score/octave/util/color/MediaNotificationProcessor;", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "show", "updatePlayPause", "updatePlayPauseDrawableState", "updatePrevNextColor", "updateRepeatState", "updateShuffleState", "updateSong", "app_debug"})
public final class ColorPlaybackControlsFragment extends code.name.score.octave.fragments.base.AbsPlayerControlsFragment {
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private code.name.score.octave.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final code.name.score.octave.activities.MainActivity getMainActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
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
    
    @java.lang.Override()
    public void setColor(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.util.color.MediaNotificationProcessor color) {
    }
    
    private final void updatePlayPause() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void setUpPrevNext() {
    }
    
    private final void updatePrevNextColor() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    @java.lang.Override()
    protected void updateShuffleState() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    @java.lang.Override()
    protected void updateRepeatState() {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public void hide() {
    }
    
    @java.lang.Override()
    protected void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    public ColorPlaybackControlsFragment() {
        super(0);
    }
}
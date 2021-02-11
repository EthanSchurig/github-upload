package code.name.score.octave.activities;

import java.lang.System;

/**
 * Created by hemanths on 2020-02-02.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\nH\u0002J\u0006\u0010!\u001a\u00020\nJ\b\u0010\"\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcode/name/score/octave/activities/DriveModeActivity;", "Lcode/name/score/octave/activities/base/AbsMusicServiceActivity;", "Lcode/name/score/octave/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "lastDisabledPlaybackControlsColor", "", "lastPlaybackControlsColor", "progressViewUpdateHelper", "Lcode/name/score/octave/helper/MusicProgressViewUpdateHelper;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "total", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "setupFavouriteToggle", "toggleFavourite", "updatePlayPauseDrawableState", "updateRepeatState", "updateShuffleState", "updateSong", "app_debug"})
public final class DriveModeActivity extends code.name.score.octave.activities.base.AbsMusicServiceActivity implements code.name.score.octave.helper.MusicProgressViewUpdateHelper.Callback {
    private int lastPlaybackControlsColor = android.graphics.Color.GRAY;
    private int lastDisabledPlaybackControlsColor = android.graphics.Color.GRAY;
    private code.name.score.octave.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void setupFavouriteToggle() {
    }
    
    private final void toggleFavourite() {
    }
    
    private final void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void setUpPrevNext() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    public final void updateShuffleState() {
    }
    
    private final void updateRepeatState() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    public DriveModeActivity() {
        super();
    }
}
package code.name.score.octave.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcode/name/score/octave/service/ThrottledSeekHandler;", "Ljava/lang/Runnable;", "musicService", "Lcode/name/score/octave/service/MusicService;", "handler", "Landroid/os/Handler;", "(Lcode/name/score/octave/service/MusicService;Landroid/os/Handler;)V", "notifySeek", "", "run", "Companion", "app_debug"})
public final class ThrottledSeekHandler implements java.lang.Runnable {
    private final code.name.score.octave.service.MusicService musicService = null;
    private final android.os.Handler handler = null;
    private static final long THROTTLE = 500L;
    @org.jetbrains.annotations.NotNull()
    public static final code.name.score.octave.service.ThrottledSeekHandler.Companion Companion = null;
    
    public final void notifySeek() {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    public ThrottledSeekHandler(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.service.MusicService musicService, @org.jetbrains.annotations.NotNull()
    android.os.Handler handler) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcode/name/score/octave/service/ThrottledSeekHandler$Companion;", "", "()V", "THROTTLE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
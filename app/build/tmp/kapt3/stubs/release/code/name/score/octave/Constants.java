package code.name.score.octave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcode/name/score/octave/Constants;", "", "()V", "FAQ_LINK", "", "GITHUB_PROJECT", "IS_MUSIC", "NUMBER_OF_TOP_TRACKS", "", "RATE_ON_GOOGLE_PLAY", "USER_BANNER", "USER_PROFILE", "baseProjection", "", "getBaseProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "app_release"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RATE_ON_GOOGLE_PLAY = "https://play.google.com/store/apps/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GITHUB_PROJECT = "https://github.com/EthanSchurig/octave";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAQ_LINK = "https://github.com/EthanSchurig/octave/blob/master/FAQ.md";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PROFILE = "profile.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_BANNER = "banner.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_MUSIC = "is_music=1 AND title != \'\'";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] baseProjection = {"_id", "title", "track", "year", "duration", "_data", "date_modified", "album_id", "album", "artist_id", "artist", "composer", "album_artist"};
    public static final int NUMBER_OF_TOP_TRACKS = 99;
    @org.jetbrains.annotations.NotNull()
    public static final code.name.score.octave.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getBaseProjection() {
        return null;
    }
    
    private Constants() {
        super();
    }
}
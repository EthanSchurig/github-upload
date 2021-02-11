package code.name.score.octave.model.smartplaylist;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u00d6\u0001\u00a8\u0006\u000e"}, d2 = {"Lcode/name/score/octave/model/smartplaylist/HistoryPlaylist;", "Lcode/name/score/octave/model/smartplaylist/AbsSmartPlaylist;", "Lorg/koin/core/KoinComponent;", "()V", "describeContents", "", "songs", "", "Lcode/name/score/octave/model/Song;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
public final class HistoryPlaylist extends code.name.score.octave.model.smartplaylist.AbsSmartPlaylist implements org.koin.core.KoinComponent {
    public static final android.os.Parcelable.Creator<code.name.score.octave.model.smartplaylist.HistoryPlaylist> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<code.name.score.octave.model.Song> songs() {
        return null;
    }
    
    public HistoryPlaylist() {
        super(null, 0);
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<code.name.score.octave.model.smartplaylist.HistoryPlaylist> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final code.name.score.octave.model.smartplaylist.HistoryPlaylist[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final code.name.score.octave.model.smartplaylist.HistoryPlaylist createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}
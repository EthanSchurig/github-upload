package code.name.score.octave.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcode/name/score/octave/interfaces/IGenreClickListener;", "", "onClickGenre", "", "genre", "Lcode/name/score/octave/model/Genre;", "view", "Landroid/view/View;", "app_debug"})
public abstract interface IGenreClickListener {
    
    public abstract void onClickGenre(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Genre genre, @org.jetbrains.annotations.NotNull()
    android.view.View view);
}
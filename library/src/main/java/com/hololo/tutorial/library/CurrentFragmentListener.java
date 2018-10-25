package com.hololo.tutorial.library;

import android.support.annotation.Nullable;
import android.view.View;

public interface CurrentFragmentListener {
    void currentFragmentPosition(int position);

    void currentFragmentView(@Nullable View view, @Nullable String tag);
}

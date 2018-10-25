package com.hololo.tutorial.library;

import android.support.annotation.Nullable;
import android.view.View;

public interface CurrentFragmentListener {
    void currentFragment(@Nullable View view, @Nullable Integer position);
}

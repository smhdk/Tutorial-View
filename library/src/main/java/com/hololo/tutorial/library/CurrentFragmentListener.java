package com.hololo.tutorial.library;

import android.view.View;

public interface CurrentFragmentListener {
    void currentFragmentPosition(int position);

    void currentFragmentView(View view, int position);
}

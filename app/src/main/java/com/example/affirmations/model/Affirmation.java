package com.example.affirmations.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class Affirmation {
    @StringRes int stringResourceId;
    @DrawableRes int imageResourceId;
    public Affirmation(int stringResourceId, int imageResourceId) {
        this.stringResourceId = stringResourceId;
        this.imageResourceId = imageResourceId;
    }

    public int getStringResourceId() {
        return this.stringResourceId;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }
}

package com.xicheng.immerse.foundation;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

/**
 *
 */
public class ImmerseViewModel extends AndroidViewModel {
    /**
     * 持用的application
     */
    final public Application application ;

    public ImmerseViewModel(@NonNull Application application) {
        super(application);
        this.application = application;
    }
}

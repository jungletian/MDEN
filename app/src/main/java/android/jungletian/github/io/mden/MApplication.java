package android.jungletian.github.io.mden;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by zhangtj on 2015/8/25.
 */
public class MApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}

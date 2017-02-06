package com.example.czz.stockknower.third;

import android.app.Application;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.io.File;

/**
 * Created by czz on 2017/2/3.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration configuration=new ImageLoaderConfiguration.Builder(getApplicationContext())
                .threadPoolSize(3)//设置开辟的子线程数量
                .threadPriority(10)//设置子线程的优先级
                .memoryCacheExtraOptions(545,300)//设置缓存大小
                .diskCache(new UnlimitedDiskCache(new File("/storage/sdcard/imageloader")))
                .build();
        ImageLoader.getInstance().init(configuration);
    }
}

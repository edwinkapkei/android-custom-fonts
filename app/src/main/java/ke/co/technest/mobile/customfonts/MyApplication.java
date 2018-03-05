package ke.co.technest.mobile.customfonts;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Set font path and font name
        CalligraphyConfig.initDefault(
                new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/SourceSansPro-Regular.otf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }
}

package evino.test.com.br.testevino.application;

import android.app.Application;

import evino.test.com.br.testevino.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by techresult on 04/05/2016.
 */
public class App extends Application {

    public void onCreate(){
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/journal.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }

}

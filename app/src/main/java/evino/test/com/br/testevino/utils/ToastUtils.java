package evino.test.com.br.testevino.utils;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;

/**
 * Created by techresult on 05/05/2016.
 */
public class ToastUtils {

    public static SpannableStringBuilder increaseToastText(String text){
        SpannableStringBuilder biggerText = new SpannableStringBuilder(text);
        biggerText.setSpan(new RelativeSizeSpan(1.65f), 0, text.length(), 0);
        return biggerText;
    }

}

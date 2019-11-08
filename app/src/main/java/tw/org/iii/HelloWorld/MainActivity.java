package tw.org.iii.HelloWorld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //呼叫res/layout/activity_main.xml

        textView = findViewById(R.id.lottrey);
        buttonClick = findViewById(R.id.click);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.v("DCH", "OK"); //確認按鈕正常
                showLottery();
            }
        });
    }

    //產生樂透號碼 1~50 並從小到大排出
    private  void showLottery() {
        TreeSet<Integer> set = new TreeSet<>(); //值不重複
        while (set.size() < 6) {
            set.add((int)(Math.random()*49+1));
        }
        textView.setText(set.toString());
    }
}

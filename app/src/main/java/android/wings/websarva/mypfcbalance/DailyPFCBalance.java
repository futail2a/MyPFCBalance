package android.wings.websarva.mypfcbalance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DailyPFCBalance extends AppCompatActivity {
    private float calorie;
    private float protein;
    private float fat;
    private float carb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_pfcbalance);

        Intent intent = getIntent();
        calorie = intent.getFloatExtra("carolie", 0);
        protein = intent.getFloatExtra("protein", 0);
        fat = intent.getFloatExtra("fat", 0);
        carb = intent.getFloatExtra("carb", 0);

//          = getString(R.string.tv_sum_calorie, (float)10);
        TextView sumCalorie = (TextView) findViewById(R.id.sum_calorie);
        sumCalorie.setText(getResources()
                .getString(R.string.tv_sum_calorie, (float)10));
    }


    public void onBackMainButtonClick(View view){
        finish();
    }

}

package android.wings.websarva.mypfcbalance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.util.Log;
import android.view.View;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private PFCBalance pfcBalance;
    private float totalCalorie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BodyDataParser bodyDataParser = new BodyDataParser();
        bodyDataParser.getBodyData();
        BodyData bodyData = bodyDataParser.getBodyData();

        LeanBulkState state = new LeanBulkState();
        pfcBalance = state.calcTotalPFCBalance(bodyData);
        totalCalorie = state.getTotalCalorie();

        float p = pfcBalance.protain();
        float c = pfcBalance.carb();
        float f = pfcBalance.fat();
        createPFCPieChart(p, f,c);

    }

    private void createPFCPieChart(float p, float f, float c){
        PieChart pieChart = (PieChart) findViewById(R.id.PFC_chart);

        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(p*100, "Protein"));
        entries.add(new PieEntry(f*100, "Fat"));
        entries.add(new PieEntry(c*100, "Carbon"));
        PieDataSet set = new PieDataSet(entries, "PFC balance");
        Log.d("PFC balance value","p:"+p + " f:"+f+" c:"+c);
        // TODO define each color (tomato, yellow, palegreen), change character color
        set.setValueTextColor(Color.BLACK);
        set.setColors(new int[] { Color.rgb(255, 99, 71), Color.rgb(255, 247, 179), Color.rgb(152,251,152) });
        PieData data = new PieData(set);
        pieChart.setData(data);
        pieChart.setTouchEnabled(false);
        Description description = new Description();
        description.setEnabled(false);
        pieChart.setDescription(description);
        pieChart.invalidate();
    }

    public void onDailyPFCButtonClick(View view){
        Intent intent = new Intent(MainActivity.this, DailyPFCBalance.class);
        float cal = totalCalorie;
        float p = pfcBalance.protain();
        float f = pfcBalance.fat();
        float c = pfcBalance.carb();
        intent.putExtra("calorie",cal);
        intent.putExtra("protein",p);
        intent.putExtra("fat",f);
        intent.putExtra("carb",c);
        startActivity(intent);
    }

}

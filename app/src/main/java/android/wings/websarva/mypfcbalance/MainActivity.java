package android.wings.websarva.mypfcbalance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PieChart pieChart = (PieChart) findViewById(R.id.PFC_chart);

        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(20f, "Protein"));
        entries.add(new PieEntry(30f, "Fat"));
        entries.add(new PieEntry(50f, "Carbon"));
        PieDataSet set = new PieDataSet(entries, "PFC balance");
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

}

package android.wings.websarva.mypfcbalance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.w3c.dom.Text;


public class DailyPFCBalance extends AppCompatActivity {
    private float sumCalorie;
    private float sumProtein;
    private float sumFat;
    private float sumCarb;

    final double MORNING = 0.3;
    final double LUNCH = 0.4;
    final double SNACK = 0.1;
    final double DINER = 0.2;
    final double SUM = 1.0;

    final private RealMatrix mealRatio = MatrixUtils.createRealMatrix(new double[][]{
            {MORNING, LUNCH ,SNACK, DINER, SUM}
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_pfcbalance);

        Intent intent = getIntent();
        sumCalorie = intent.getFloatExtra("calorie", 0);
        sumProtein = intent.getFloatExtra("protein", 0);
        sumFat = intent.getFloatExtra("fat", 0);
        sumCarb = intent.getFloatExtra("carb", 0);

        RealMatrix sumCaloriePFC = MatrixUtils.createRealMatrix(new double[][]{
                {sumCalorie}, {sumProtein}, {sumFat}, {sumCarb}
        });
        RealMatrix mealPFCMatrix = sumCaloriePFC.multiply(mealRatio);
        Log.d("DEBUG", "Daily PFC Matrix" + mealPFCMatrix);

        setValues(mealPFCMatrix);
    }

    private void setValues(RealMatrix mealPFCMatrix){
        //Breakfast
        TextView text_morningCalorie = (TextView) findViewById(R.id.morning_calorie);
        text_morningCalorie.setText(getResources()
                .getString(R.string.tv_morning_calorie, mealPFCMatrix.getData()[0][0]));

        TextView text_morningProtein = (TextView) findViewById(R.id.morning_protein);
        text_morningProtein.setText(getResources()
                .getString(R.string.tv_morning_protein, mealPFCMatrix.getData()[1][0]));

        TextView text_morningFat = (TextView) findViewById(R.id.morning_fat);
        text_morningFat.setText(getResources()
                .getString(R.string.tv_morning_fat, mealPFCMatrix.getData()[2][0]));

        TextView text_morningCarb = (TextView) findViewById(R.id.morning_carb);
        text_morningCarb.setText(getResources()
                .getString(R.string.tv_morning_carb, mealPFCMatrix.getData()[3][0]));
        
        //Lunch
        TextView text_lunchCalorie = (TextView) findViewById(R.id.lunch_calorie);
        text_lunchCalorie.setText(getResources()
                .getString(R.string.tv_lunch_calorie, mealPFCMatrix.getData()[0][1]));

        TextView text_lunchProtein = (TextView) findViewById(R.id.lunch_protein);
        text_lunchProtein.setText(getResources()
                .getString(R.string.tv_lunch_protein, mealPFCMatrix.getData()[1][1]));

        TextView text_lunchFat = (TextView) findViewById(R.id.lunch_fat);
        text_lunchFat.setText(getResources()
                .getString(R.string.tv_lunch_fat, mealPFCMatrix.getData()[2][1]));

        TextView text_lunchCarb = (TextView) findViewById(R.id.lunch_carb);
        text_lunchCarb.setText(getResources()
                .getString(R.string.tv_lunch_carb, mealPFCMatrix.getData()[3][1]));
        
        //Snack
        TextView text_snackCalorie = (TextView) findViewById(R.id.snack_calorie);
        text_snackCalorie.setText(getResources()
                .getString(R.string.tv_snack_calorie, mealPFCMatrix.getData()[0][2]));

        TextView text_snackProtein = (TextView) findViewById(R.id.snack_protein);
        text_snackProtein.setText(getResources()
                .getString(R.string.tv_snack_protein, mealPFCMatrix.getData()[1][2]));

        TextView text_snackFat = (TextView) findViewById(R.id.snack_fat);
        text_snackFat.setText(getResources()
                .getString(R.string.tv_snack_fat, mealPFCMatrix.getData()[2][2]));

        TextView text_snackCarb = (TextView) findViewById(R.id.snack_carb);
        text_snackCarb.setText(getResources()
                .getString(R.string.tv_snack_carb, mealPFCMatrix.getData()[3][2]));
        
        //Diner
        TextView text_dinerCalorie = (TextView) findViewById(R.id.diner_calorie);
        text_dinerCalorie.setText(getResources()
                .getString(R.string.tv_diner_calorie, mealPFCMatrix.getData()[0][3]));

        TextView text_dinerProtein = (TextView) findViewById(R.id.diner_protein);
        text_dinerProtein.setText(getResources()
                .getString(R.string.tv_diner_protein, mealPFCMatrix.getData()[1][3]));

        TextView text_dinerFat = (TextView) findViewById(R.id.diner_fat);
        text_dinerFat.setText(getResources()
                .getString(R.string.tv_diner_fat, mealPFCMatrix.getData()[2][3]));

        TextView text_dinerCarb = (TextView) findViewById(R.id.diner_carb);
        text_dinerCarb.setText(getResources()
                .getString(R.string.tv_diner_carb, mealPFCMatrix.getData()[3][3]));
        
        //Sum
        TextView text_sumCalorie = (TextView) findViewById(R.id.sum_calorie);
        text_sumCalorie.setText(getResources()
                .getString(R.string.tv_sum_calorie, mealPFCMatrix.getData()[0][4]));

        TextView text_sumProtein = (TextView) findViewById(R.id.sum_protein);
        text_sumProtein.setText(getResources()
                .getString(R.string.tv_sum_protein, mealPFCMatrix.getData()[1][4]));

        TextView text_sumFat = (TextView) findViewById(R.id.sum_fat);
        text_sumFat.setText(getResources()
                .getString(R.string.tv_sum_fat, mealPFCMatrix.getData()[2][4]));

        TextView text_sumCarb = (TextView) findViewById(R.id.sum_carb);
        text_sumCarb.setText(getResources()
                .getString(R.string.tv_sum_carb, mealPFCMatrix.getData()[3][4]));

    }


    public void onBackMainButtonClick(View view){
        finish();
    }

}

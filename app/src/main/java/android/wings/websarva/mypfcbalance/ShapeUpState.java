package android.wings.websarva.mypfcbalance;

public class ShapeUpState implements DietPeriodState {
    final private float baselineIndex = 30;
    final private float proteinContrast = (float)1.5;
    final private float carbContrast = (float)0.25;

    private float totalCalorie;
    private float protein;
    private float proteinCalorie;
    private float carb;
    private float carbCalorie;
    private float fat;
    private float fatCalorie;


    private float leanBodyMass;
    private PFCBalance pfcBalance;

    public PFCBalance calcTotalPFCBalance(BodyData bodyData){
        //TODO Consider delegation
        leanBodyMass = bodyData.getBodyComposition().leanBodyMass();
        calcTotalCalorie();
        calcProtein();
        calcProteinCalorie();
        calcCarbCalorie();
        calcCarb();
        calcFat();
        calcFatCalorie();


        float p = proteinCalorie/totalCalorie;
        float c = carbCalorie/totalCalorie;
        float f = fatCalorie/totalCalorie;
        pfcBalance = new PFCBalance(p,f,c);
        return pfcBalance;
    }
/*
    protected void calcLeanBodyMass(BodyData bodyData){
        leanBodyMass = bodyData.getBodyComposition().weight()* (1 - bodyData.getBodyComposition().bodyFatPercentage());
    }
*/
    private void calcLeanBodyMass(RenfoBodyComposition bodyComposition){
            leanBodyMass = bodyComposition.leanBodyMass();
    }

    private void calcTotalCalorie(){
        totalCalorie = leanBodyMass * baselineIndex;
    };

    private void calcProtein(){
        protein = leanBodyMass * proteinContrast;
    }

    private void calcProteinCalorie(){
        proteinCalorie = protein * 4;
    }

    private void calcCarbCalorie(){
        carbCalorie = totalCalorie* carbContrast;
    }

    private void calcCarb(){
        carb =  carbCalorie / 4;
    }

    private void calcFatCalorie(){
        fatCalorie = totalCalorie - (proteinCalorie + carbCalorie);
    }

    private void calcFat(){
        fat = fatCalorie / 9;
    }

}

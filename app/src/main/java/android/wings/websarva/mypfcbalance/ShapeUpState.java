package android.wings.websarva.mypfcbalance;

public class ShapeUpState implements DietPeriodState {
    final private float baselineIndex = 35;
    final private float proteinContrast = (float)2.5;
    final private float carbContrast = 15;

    private float leanBodyMass;
    private PFCBalance pfcBalance;

    public PFCBalance calcTotalPFCBalance(BodyData bodyData){
        calcLeanBodyMass(bodyData);

        float p = calcNecessartProteinCalorie()/calcTotalNecessaryCalorie();
        float f = calcNecessaryFat()/calcTotalNecessaryCalorie();
        float c = calcNecessaryCarbCalorie()/calcTotalNecessaryCalorie();
        pfcBalance = new PFCBalance(p,f,c);
        return pfcBalance;
    }

    protected void calcLeanBodyMass(BodyData bodyData){
        leanBodyMass = bodyData.getBodyComposition().weight()* (1 - bodyData.getBodyComposition().bodyFatPercentage());
    }

    private void calcLeanBodyMass(RenfoBodyComposition bodyComposition){
            leanBodyMass = bodyComposition.leanBodyMass();
    }


    //Todo save calc result as member variables

    private float calcTotalNecessaryCalorie(){
        return leanBodyMass * baselineIndex;
    };

    private float calcNecessaryProtein(){
        return leanBodyMass * proteinContrast;
    }

    private  float calcNecessartProteinCalorie(){
        return calcNecessaryProtein() * 4;
    }

    private float calcNecessaryCarbCalorie(){
        return calcTotalNecessaryCalorie() * carbContrast;
    }

    private float calcNecessaryCarb(){
        return calcNecessaryCarbCalorie() / 4;
    }

    private float calcNecessaryFatCalorie(){
        return calcTotalNecessaryCalorie() - (calcNecessartProteinCalorie() + calcNecessaryCarbCalorie());
    }

    private float calcNecessaryFat(){
        return calcNecessaryFatCalorie() / 9;
    }

}

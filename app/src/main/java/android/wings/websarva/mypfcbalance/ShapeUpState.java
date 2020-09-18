package android.wings.websarva.mypfcbalance;

public class ShapeUpState extends DietBalanceCalculator implements DietPeriodState{

    ShapeUpState(){
        baselineIndex = 30;
        proteinContrast = (float)1.5;
        carbContrast = (float)0.25;
    }

    @Override
    public PFCBalance calcTotalPFCBalance(BodyData bodyData){
    return super.calcTotalPFCBalance(bodyData);
    }

}

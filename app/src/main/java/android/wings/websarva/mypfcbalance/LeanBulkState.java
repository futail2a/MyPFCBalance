package android.wings.websarva.mypfcbalance;

public class LeanBulkState extends DietBalanceCalculator implements DietPeriodState {

    LeanBulkState(){
        baselineIndex = 50;
        proteinContrast = (float)2.0;
        carbContrast = (float)0.4;
    }

    @Override
    public PFCBalance calcTotalPFCBalance(BodyData bodyData){
        return super.calcTotalPFCBalance(bodyData);
    }

}

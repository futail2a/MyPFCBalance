package android.wings.websarva.mypfcbalance;

public class DirtyBulkState extends DietBalanceCalculator implements DietPeriodState {

    DirtyBulkState(){
        baselineIndex = 55;
        proteinContrast = (float)2.5;
        carbContrast = (float)0.5;
    }

    @Override
    public PFCBalance calcTotalPFCBalance(BodyData bodyData){
        return super.calcTotalPFCBalance(bodyData);
    }
}

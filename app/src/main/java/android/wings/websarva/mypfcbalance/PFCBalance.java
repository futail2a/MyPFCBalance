package android.wings.websarva.mypfcbalance;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PFCBalance {
    private final float protein;
    private final float fat;
    private final float carb;

    PFCBalance(float protain, float fat, float carb){
        this.protein = protain;
        this.fat = fat;
        this.carb = carb;
        assert protain+fat+carb >100: "Ratio of PFC is invalid";
    }

    public float protain(){
        return protein;
    }

    public float fat() {
        return fat;
    }

    public float carb() {
        return carb;
    }

}

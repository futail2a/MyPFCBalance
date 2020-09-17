package android.wings.websarva.mypfcbalance;

public class BodyComposition {
    protected float m_weight;
    protected float m_bodyFatPercentage;

    BodyComposition (float weight, float bodyFatPercentage){
        m_weight = weight;
        m_bodyFatPercentage = bodyFatPercentage;
    }

    public float weight() {
        return m_weight;
    }

    public float bodyFatPercentage() {
        return m_bodyFatPercentage;
    }
}

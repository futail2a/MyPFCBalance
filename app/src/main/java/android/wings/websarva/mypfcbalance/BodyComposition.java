package android.wings.websarva.mypfcbalance;

public class BodyComposition {
    protected float m_weight;
    protected float m_bodyFatPercentage;
    protected float m_leanBodyMass;

    BodyComposition (float weight, float bodyFatPercentage){
        m_weight = weight;
        m_bodyFatPercentage = bodyFatPercentage;
        m_leanBodyMass = m_weight * (1 - m_bodyFatPercentage);
    }

    public float weight() {
        return m_weight;
    }

    public float bodyFatPercentage() {
        return m_bodyFatPercentage;
    }

    public float leanBodyMass() {
        return m_leanBodyMass;
    }
}

package android.wings.websarva.mypfcbalance;

import java.util.Calendar;

public class RenfoBodyComposition extends BodyComposition {
    Calendar m_date;
    float m_BMI;
    float m_leanBodyMass;
    float m_subcutaneousFatPercentage;
    int m_visceralFatLevel;
    float m_bodyWaterPercentage;
    float m_skeletalMusclePercentage;
    float m_muscleMass;
    float m_proteinPercentage;
    float m_basicMetabolicRate;
    int m_bodyAge;

    RenfoBodyComposition (float weight, float bodyFatPercentage, float subcutaneousFatPercentage, float skeletalMusclePercentage){
        super(weight,bodyFatPercentage);
        m_subcutaneousFatPercentage = subcutaneousFatPercentage;
        m_skeletalMusclePercentage = skeletalMusclePercentage;
    }
    RenfoBodyComposition (Calendar date, float weight, float BMI, float bodyFatPercentage, float leanBodyMass, float subcutaneousFatPercentage, int visceralFatLevel, float bodyWaterPercentage, float skeletalMusclePercentage,
                          float muscleMass, float proteinPercentage, float basicMetabolicRate, int bodyAge){
        super(weight,bodyFatPercentage);
        m_date = date;
        m_BMI = BMI;
        m_leanBodyMass = leanBodyMass;
        m_subcutaneousFatPercentage = subcutaneousFatPercentage;
        m_visceralFatLevel = visceralFatLevel;
        m_bodyWaterPercentage = bodyWaterPercentage;
        m_skeletalMusclePercentage = skeletalMusclePercentage;
        m_muscleMass = muscleMass;
        m_proteinPercentage = proteinPercentage;
        m_basicMetabolicRate = basicMetabolicRate;
        m_bodyAge = bodyAge;
    }
}
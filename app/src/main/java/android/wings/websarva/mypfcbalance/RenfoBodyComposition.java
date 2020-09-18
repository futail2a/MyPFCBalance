package android.wings.websarva.mypfcbalance;

import java.util.Calendar;

public class RenfoBodyComposition extends BodyComposition {
    private Calendar m_date;
    private float m_BMI;
    private float m_leanBodyMass;
    private float m_subcutaneousFatPercentage;
    private int m_visceralFatLevel;
    private float m_bodyWaterPercentage;
    private float m_skeletalMusclePercentage;
    private float m_muscleMass;
    private  float m_proteinPercentage;
    private float m_basicMetabolicRate;
    private int m_bodyAge;


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

    public Calendar date(){return m_date;}
    public float BMI(){return m_BMI;}
    public float leanBodyMass(){return m_leanBodyMass;}
    public float subcutaneousFatPercentage(){return m_subcutaneousFatPercentage;}
    public int visceralFatLevel(){return m_visceralFatLevel;}
    public float bodyWaterPercentage(){return m_bodyWaterPercentage;}
    public float skeletalMusclePercentage(){return m_skeletalMusclePercentage;}
    public float muscleMass(){return m_muscleMass;}
    public  float proteinPercentage(){return m_proteinPercentage;}
    public float basicMetabolicRate(){return m_basicMetabolicRate;}
    public int bodyAge(){return m_bodyAge;}

}
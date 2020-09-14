package android.wings.websarva.mypfcbalance;

public class BodyData {
    static float m_defaultHeight;
    float m_height;
    BodyComposition m_bodyComposition;

    BodyData (float height, BodyComposition bodyComposition){
        m_defaultHeight= height;
        m_height = height;
        m_bodyComposition = bodyComposition;
    }

    BodyData (BodyComposition bodyComposition){
        m_height = m_defaultHeight;
        m_bodyComposition = bodyComposition;
    }
}

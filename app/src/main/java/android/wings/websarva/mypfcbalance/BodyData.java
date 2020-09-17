package android.wings.websarva.mypfcbalance;

public class BodyData {
    private static float m_defaultHeight;
    private float m_height;
    private BodyComposition m_bodyComposition;

    BodyData (float height, BodyComposition bodyComposition){
        m_defaultHeight= height;
        m_height = height;
        m_bodyComposition = bodyComposition;
    }

    BodyData (BodyComposition bodyComposition){
        m_height = m_defaultHeight;
        m_bodyComposition = bodyComposition;
    }

    public BodyComposition getBodyComposition() {
        return m_bodyComposition;
    }

    public float getHeight(){
        return m_height;
    }
}

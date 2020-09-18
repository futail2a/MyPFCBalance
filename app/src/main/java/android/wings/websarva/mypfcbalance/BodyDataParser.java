package android.wings.websarva.mypfcbalance;

public class BodyDataParser {
    //TODO implement body data parser
    // Demo value at 9/17
    BodyData m_bodyData;

    BodyDataParser(){
        BodyComposition bodyComposition = new BodyComposition((float)46.85, (float)0.156);
        m_bodyData = new BodyData(165,bodyComposition);
    }

    public BodyData getBodyData(){
        return m_bodyData;
    }
}

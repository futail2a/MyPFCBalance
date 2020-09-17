package android.wings.websarva.mypfcbalance;

import java.util.Calendar;
import java.util.TreeMap;


public class PersonalStatus {
    enum Sex{
        MALE,
        FEMALE,
        OTHER
    }

    private String m_name;
    private Sex m_sex;
    private Calendar m_birthDay;
    TreeMap<Calendar, BodyData> m_bodyDataSet;


    PersonalStatus(String name, Sex sex, Calendar birthDay){
        m_name = name;
        m_sex = sex;
        m_birthDay = birthDay;
    }

    public void addBodyData(Calendar date, BodyData bodyData){
        m_bodyDataSet.put(date, bodyData);
    }

    public String getName(){return m_name;}
    public String getSex(){return "not implemented yet";}
    public Calendar getBirthDay(){return m_birthDay;}

}

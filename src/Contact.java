import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Contact {
    private String surname;
    private String name;
    private PhoneNumber number;
    private Calendar birthDay;
    private String eMail;
    private String vkId;
    public void setSurname (String surname){
        if (surname.length() > 0 && surname.length() <= 50){
            this.name = name;
        }
    }
    public void setName (String name){
        if (name.length() > 0 && name.length() <=50){
            this.name = name;
        }
    }
    public void setNumber (long number){
        this.number = new PhoneNumber(number);
    }
    public void setBirthDay (int year, int month, int day){
        if (year > 1900 && year < DateFormat.YEAR_FIELD) {
            this.birthDay = new GregorianCalendar(year, month, day);
        }
    }
    public void setEMail (String mail){
        if (mail.length() <= 50){
            this.eMail = mail;
        }
    }
    public void setVkId (String id){
        if (id.length() <= 15) {
            this.vkId = id;
        }
    }
    public String getSurname(){
        return this.surname;
    }
    public String getName(){
        return this.name;
    }
    public PhoneNumber getNumber(){
        return this.number;
    }
    public Calendar getBirthDay(){
        return this.birthDay;
    }
    public String getEMail(){
        return this.eMail;
    }
    public String getVkId(){
        return this.vkId;
    }
    public Contact(String surname, String name, long number,
                   int year, int month, int day, String eMail, String vkId){
        setSurname(surname);
        setName(name);
        setNumber(number);
        setBirthDay(year, month, day);
        setEMail(eMail);
        setVkId(vkId);
    }
    public Contact(String surname, String name, long number,
                   int year, int month, int day){
        setSurname(surname);
        setName(name);
        setNumber(number);
        setBirthDay(year, month, day);
    }
}

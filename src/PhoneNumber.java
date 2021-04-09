import java.math.BigInteger;

public class PhoneNumber {
    private long number;
    public void setNumber(long number){
        if (number > 9000000000l && number < 9999999999l){
            this.number = number;
        }
    }
    public long getNumber(){
        return this.number;
    }
    public PhoneNumber (long number){
        setNumber(number);
    }
    public String toString(){
        return "+7"+this.number;
    }
}

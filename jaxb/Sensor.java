import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Sensor {
    private String name;
    private Float dailyMin;
    private Float dailyMax;
    private Float weeklyMin;
    private Float weeklyMax;
    private Float monthlyMin;
    private Float monthlyMax;
    private Float yearlyMin;
    private Float yearlyMax;
    private Float[] mins = new Float[4];

    @XmlAttribute
    public Float[] getMins(){
        return mins;
    }

    public void setMins(Float[] mins){
        int i = 0;
        for(Float f : mins){
            this.mins[i] = f;
            i++;
            if(i == mins.length){
                break;
            }
        }
    }

    @XmlAttribute
    public Float getDailyMin() {
        return dailyMin;
    }

    public void setDailyMin(Float dailyMin) {
        this.dailyMin = dailyMin;
    }

    @XmlAttribute
    public Float getDailyMax() {
        return dailyMax;
    }

    public void setDailyMax(Float dailyMax) {
        this.dailyMax = dailyMax;
    }

    @XmlAttribute
    public Float getWeeklyMin() {
        return weeklyMin;
    }

    public void setWeeklyMin(Float weeklyMin) {
        this.weeklyMin = weeklyMin;
    }

    @XmlAttribute
    public Float getWeeklyMax() {
        return weeklyMax;
    }

    public void setWeeklyMax(Float weeklyMax) {
        this.weeklyMax = weeklyMax;
    }

    @XmlAttribute
    public Float getMonthlyMin() {
        return monthlyMin;
    }

    public void setMonthlyMin(Float monthlyMin) {
        this.monthlyMin = monthlyMin;
    }

    @XmlAttribute
    public Float getMonthlyMax() {
        return monthlyMax;
    }

    public void setMonthlyMax(Float monthlyMax) {
        this.monthlyMax = monthlyMax;
    }

    @XmlAttribute
    public Float getYearlyMin() {
        return yearlyMin;
    }

    public void setYearlyMin(Float yearlyMin) {
        this.yearlyMin = yearlyMin;
    }

    @XmlAttribute
    public Float getYearlyMax() {
        return yearlyMax;
    }

    public void setYearlyMax(Float yearlyMax) {
        this.yearlyMax = yearlyMax;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

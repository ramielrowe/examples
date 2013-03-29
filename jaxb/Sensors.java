import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

@XmlRootElement
public class Sensors {
    private HashMap<String, Sensor> sensors = new HashMap<String, Sensor>();

    @XmlElement
    public Sensor[] getSensors(){
        Sensor[] array = new Sensor[sensors.size()];
        int i = 0;
        for(Sensor s : sensors.values()){
            array[i] = s;
            i++;
        }
        return array;
    }

    public void setSensors(Sensor[] sensors){
        for(Sensor s : sensors){
            this.sensors.put(s.getName(), s);
        }
    }

    public void addSensor(Sensor s){
        sensors.put(s.getName(), s);
    }

    public Sensor getSensor(String name){
        return sensors.get(name);
    }
}

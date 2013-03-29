import javax.xml.bind.JAXB;

public class test {

    public static void main(String[] args){
        Sensors sensors = new Sensors();
        Sensor sensor1 = new Sensor();
        sensor1.setName("sensor1");
        sensor1.setDailyMax(100.0f);
        sensor1.setDailyMin(15.0f);
        Sensor sensor2 = new Sensor();
        sensor2.setName("sensor2");
        sensor2.setMonthlyMax(101.0f);
        sensor2.setMonthlyMin(14.0f);
        sensors.addSensor(sensor1);
        sensors.addSensor(sensor2);
        JAXB.marshal(sensors, System.out);
    }
}

public class Demo {
    public static void main(String[] args) {
        ControlCenter control = new ControlCenter("Groep T",Size.MEDIUM);
        Sensor CO1 = new COSensor("Smoke sensor","Kitchen","Philips",20);
        Sensor CO1Copy  = new COSensor("Smoke sensor","Kitchen","Philips",20);
        Sensor motion = new MotionSensor("Motion sensor","Class room","Philips",20);
        Sensor motionCopy = new MotionSensor("Motion sensor","Class room","Philips",20);
        Sensor motionJr = new MotionSensor("Motion sensor","Playground","Philips",20);
        Sensor Smoky = new SmokeSensor("Smoke sensor","Laboratory","Philips",true);

        control.addSensor(Smoky);
        control.addSensor(CO1);
        control.addSensor(motion);
        control.addSensor(motionJr);

        control.addSensor(motionCopy);
        control.addSensor(CO1Copy);

        CO1.setActive(true);
        Smoky.setActive(true);

        control.testSensor(CO1);
        System.out.println(control.testAllSensors());
        //control.Overview();



    }
}

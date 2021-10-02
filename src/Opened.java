public class Opened implements State {

    @Override
    public void ClinicStatus(Clinic status) {
        System.out.println("Eyesight Clinic is Now Opened");
        status.setClinic(this);
    }

    @Override
    public String toString() {
        return "<--Opened Status-->";
    }
}
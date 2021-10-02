public class Closed implements State {

    @Override
    public void ClinicStatus(Clinic State) {
        System.out.println("Eyesight Clinic is Now Closed");
        State.setClinic(this);
    }

    @Override
    public String toString() {
        return "<--Closed Status-->";
    }
}
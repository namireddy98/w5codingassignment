public class EyeClinicDriver {

    public static void main(String[] args) {
        //Making Object for Clinic Class;
        Clinic clinic = new Clinic();

        //Object for Opened Class;
        Opened opened = new Opened();

        //Calling action method and passing Clinic class object;
        opened.ClinicStatus(clinic);
        System.out.println(clinic.getClinic().toString());
        System.out.println();

        //Object for Closed Class;
        Closed closed = new Closed();

        //Calling action method and passing Clinic class object;
        closed.ClinicStatus(clinic);
        System.out.println(clinic.getClinic().toString());
    }
}

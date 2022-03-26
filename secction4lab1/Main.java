package secction4lab1;

public class Main {
    public static void main(String[] args ){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("LPC","09876542");
        pb.insertPhone("LPC","09876532");
        pb.insertPhone("LPI","09876332");
        pb.insertPhone("VCNC","09876434");
        pb.insertPhone("LDD","098763784");
        pb.insertPhone("DHL","013763784");

        System.out.println("Insert");
        for (Phonenumber pn: pb.PhoneList) {
            System.out.println(pn.name);
            System.out.println(pn.phone);
        }
        System.out.println("Remove");
        pb.removePhone("LPC");
        for (Phonenumber pn: pb.PhoneList) {
            System.out.println(pn.name);
            System.out.println(pn.phone);
        }
        System.out.println("Update");
        pb.updatePhone("LPC","0966876014");
        for (Phonenumber pn: pb.PhoneList) {
            System.out.println(pn.name);
            System.out.println(pn.phone);
        }
        System.out.println("Search");
        pb.searchPhone("LPI");
        System.out.println("Sort");
        pb.sort();
    }
}

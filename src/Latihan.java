import java.util.ArrayList;

public class Latihan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Hewan\t\t\t: " + hewan);

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        hewan.removeAll(deleteHewan);

        System.out.println("Hewan yang dihapus\t: " + deleteHewan);
        System.out.println("Output Hewan\t\t: " + hewan);
    }
}
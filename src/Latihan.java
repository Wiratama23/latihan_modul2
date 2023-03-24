import java.util.ArrayList;
import java.util.Arrays;

public class Latihan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>(Arrays.asList("Sapi","Kelinci","Kambing","Unta","Domba"));
        System.out.println("Hewan\t\t\t: " + hewan);

        ArrayList<String> deleteHewan = new ArrayList<>(Arrays.asList("Kelinci","Kambing","Unta"));
        hewan.removeAll(deleteHewan);

        System.out.println("Hewan yang dihapus\t: " + deleteHewan);
        System.out.println("Output Hewan\t\t: " + hewan);
    }
}
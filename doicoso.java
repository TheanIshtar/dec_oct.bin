import java.util.*;

// Dangdeveloper_FPT
public class doicoso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao co so N (co so muon chuyen doi) = ");
        int n = in.nextInt();
        System.out.print("DEC: ");
        int dec = in.nextInt();
        int dem = (n);
        String bin = "";
        while (dec > 0) {
            bin = String.valueOf(dec % n) + bin;
            dec = dec / n;
        }
        if (dem == 2) {
            System.out.println("BIN: " + bin);
        } else if (dem == 8) {
            System.out.println("OCT: " + bin);
        } else if (dem == 10) {
            System.out.println("DEC: " + bin);
        } else {
            System.out.println("HEX: " + bin);
        }

        // System.out.println("Sau khi chuyen thanh so" + kq + " la: " + bin);
    }
}

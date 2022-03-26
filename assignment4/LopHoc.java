package assignment4;

import java.security.PublicKey;
import java.util.ArrayList;

public class LopHoc {
    String tenLop;
    int siSo;
    ArrayList<String> danhSachLop = new ArrayList<>();

    public LopHoc(String  name, int soluonghocsinh){
        tenLop = name;
        siSo = soluonghocsinh;
    }
    
    public void themHocSinh(String tenHocSinh, String tenLop){
        for (String ten:danhSachLop) {
            if (ten == tenHocSinh){
                System.out.println("Trùng tên ");
            }
        }
        kiemtrasiso(tenHocSinh,tenLop);
    }

    public void kiemtrasiso(String tenHocSinh,String tenLop){
        if (danhSachLop.size()>siSo){
            System.out.println("Lớp học đã đủ học sinh");
        }
        else {
            danhSachLop.add(tenHocSinh);
        }
    }
}

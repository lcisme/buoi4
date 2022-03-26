package assignment4;

public class Main {
    public static void main(String args[]){
        MonHocDaiCuong mhdc= new MonHocDaiCuong();
        // themLopHoc
        mhdc.themLopHoc("T2009E",19);
        mhdc.themLopHoc("T2109A",24);
        mhdc.themLopHoc("T2108M",18);
        mhdc.themLopHoc("T2201A",18);
        mhdc.themLopHoc("T2201A",11);
        mhdc.themLopHoc("T2109A",23);

        System.out.println("Thêm Lớp Học");
        for (LopHoc lh: mhdc.danhSachLopHoc) {
            System.out.println(lh.tenLop+" "+lh.siSo);
        }
        // xoaLopHoc
        System.out.println("Xóa Lớp Học");
        mhdc.xoaLopHoc("T2009E");
        for (LopHoc lh: mhdc.danhSachLopHoc){
            System.out.println(lh.tenLop+" "+lh.siSo);
        }
        // sapXep
        System.out.println("Sắp Xếp Lớp Học");
        mhdc.sapXep();

        //Thêm học sinh vào các lớp
        LopHoc T2108M = new LopHoc("T2108M",2);
        T2108M.themHocSinh("Le Ceng","T2108M");
        T2108M.themHocSinh("Li Cing","T2108M");
        T2108M.themHocSinh("Lê Cường","T2108M");
        T2108M.themHocSinh("La Cang","T2108M");
        mhdc.danhSachLopHoc.get(0).danhSachLop = T2108M.danhSachLop;

        LopHoc T2109A = new LopHoc("T2109A",4);
        T2109A.themHocSinh("Hòa","T2109A");
        T2109A.themHocSinh("Trường","T2109A");
        T2109A.themHocSinh("Thi","T2109A");
        T2109A.themHocSinh("Tuân","T2109A");
        mhdc.danhSachLopHoc.get(1).danhSachLop = T2109A.danhSachLop;

        LopHoc T2201A = new LopHoc("T2201A",1);
        T2201A.themHocSinh("Duy","T2201A");
        mhdc.danhSachLopHoc.get(2).danhSachLop = T2201A.danhSachLop;
        // inDanhSach
        mhdc.inDanhSach();
    }
}

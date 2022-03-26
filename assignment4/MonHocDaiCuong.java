package assignment4;

import java.util.ArrayList;

public class MonHocDaiCuong extends MonHoc{
    public ArrayList<LopHoc> danhSachLopHoc = new ArrayList<>();

    public void themLopHoc(String name, int soluonghocsinh) {
        for (LopHoc lh:danhSachLopHoc) {
            if (lh.tenLop == name){
                System.out.println("Lớp "+name+" đã có vui lòng đặt tên khác");
            return;
            }
        }
      danhSachLopHoc.add(new LopHoc(name, soluonghocsinh));
    }

    public void xoaLopHoc(String name) {
        for (LopHoc lh: danhSachLopHoc){
            if (lh.tenLop == name)
                danhSachLopHoc.remove(lh);
            System.out.println("Xóa lớp "+name+" thành công");
            return;
        }
    }

    public void sapXep() {
        if (danhSachLopHoc.size()==0){
            System.out.println("Không có lớp để xếp");
        }
        else {
            int sxSiSo;
            String sxTenLop;
            for (int i=0;i<danhSachLopHoc.size();i++){
                for (int j=i+1;j<danhSachLopHoc.size();j++){
                    if (danhSachLopHoc.get(i).siSo<danhSachLopHoc.get(j).siSo){
                        sxSiSo = danhSachLopHoc.get(i).siSo;
                        sxTenLop = danhSachLopHoc.get(i).tenLop;
                        danhSachLopHoc.get(i).siSo = danhSachLopHoc.get(j).siSo;
                        danhSachLopHoc.get(i).tenLop = danhSachLopHoc.get(j).tenLop;
                        danhSachLopHoc.get(j).siSo = sxSiSo;
                        danhSachLopHoc.get(j).tenLop = sxTenLop;
                    }
                }
            }
            System.out.println("Danh sách lớp sau khi sắp xếp");
            for(LopHoc lh:danhSachLopHoc){
                System.out.println(lh.tenLop+ " "+lh.siSo);
            }
        }
    }

    public void inDanhSach() {
        for(LopHoc lh:danhSachLopHoc) {
            System.out.println("Lớp: " + lh.tenLop);
            System.out.println("Sĩ số: " + lh.siSo);
            System.out.println("Danh sách học sinh: "+ lh.danhSachLop);

        }
    }
}

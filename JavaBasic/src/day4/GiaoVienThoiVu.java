package day4;

public class GiaoVienThoiVu extends GiaoVien{
    String loaiHopDong;
    //overriding
    public void printInfo(){
        System.out.print(maGv + " ");
        System.out.print(hoTen + " ");
        System.out.print(ngaySinh + " ");
        System.out.print(gioiTinh + " ");
        System.out.print(monDay + " ");
        System.out.println(loaiHopDong + " ");
        System.out.println();
    }
}

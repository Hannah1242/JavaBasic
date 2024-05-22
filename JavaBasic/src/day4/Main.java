package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        GiaoVienToan giaoVienToan1 = new GiaoVienToan();
//        giaoVienToan1.maGv = "GV01";
//        giaoVienToan1.hoTen ="Nguyen Thi A";
//        giaoVienToan1.gioiTinh = "Nữ";
//        giaoVienToan1.monDay = "Toán Cao Cấp 1";
//        giaoVienToan1.ngaySinh = "01/01/1990";
//
//        GiaoVienToan giaoVienToan2 = new GiaoVienToan();
//        giaoVienToan2.maGv = "GV02";
//        giaoVienToan2.hoTen ="Nguyen Thi B";
//        giaoVienToan2.gioiTinh = "Nam";
//        giaoVienToan2.monDay = "Toán Cao Cấp 1";
//        giaoVienToan2.ngaySinh = "01/01/1990";
//
//        GiaoVienToan giaoVienToan3 = new GiaoVienToan();
//        giaoVienToan3.maGv = "GV03";
//        giaoVienToan3.hoTen ="Nguyen Thi B";
//        giaoVienToan3.gioiTinh = "Nam";
//        giaoVienToan3.monDay = "Toán Cao Cấp 1";
//        giaoVienToan3.ngaySinh = "01/01/1990";
//
//        GiaoVienTiengAnh giaoVienTiengAnh1 = new GiaoVienTiengAnh();
//        giaoVienTiengAnh1.maGv = "GV04";
//        giaoVienTiengAnh1.hoTen ="Nguyen Thi B";
//        giaoVienTiengAnh1.gioiTinh = "Nam";
//        giaoVienTiengAnh1.monDay = "Tiếng Anh 1";
//        giaoVienTiengAnh1.ngaySinh = "02/02/1989";
//
//        GiaoVienTiengAnh giaoVienTiengAnh2 = new GiaoVienTiengAnh();
//        giaoVienTiengAnh2.maGv = "GV04";
//        giaoVienTiengAnh2.hoTen ="Nguyen Thi B";
//        giaoVienTiengAnh2.gioiTinh = "Nam";
//        giaoVienTiengAnh2.monDay = "Tiếng Anh 1";
//        giaoVienTiengAnh2.ngaySinh = "02/02/1989";
//
//        GiaoVienTiengAnh giaoVienTiengAnh3 = new GiaoVienTiengAnh();
//        giaoVienTiengAnh3.maGv = "GV05";
//        giaoVienTiengAnh3.hoTen ="Nguyen Thi B";
//        giaoVienTiengAnh3.gioiTinh = "Nam";
//        giaoVienTiengAnh3.monDay = "Tiếng Anh 1";
//        giaoVienTiengAnh3.ngaySinh = "02/02/1989";
//
//        GiaoVienTiengAnh giaoVienTiengAnh4 = new GiaoVienTiengAnh();
//        giaoVienTiengAnh4.maGv = "GV06";
//        giaoVienTiengAnh4.hoTen ="Nguyen Thi B";
//        giaoVienTiengAnh4.gioiTinh = "Nam";
//        giaoVienTiengAnh4.monDay = "Tiếng Anh 1";
//        giaoVienTiengAnh4.ngaySinh = "02/02/1989";
//
//        GiaoVienTiengAnh giaoVienTiengAnh5 = new GiaoVienTiengAnh();
//        giaoVienTiengAnh5.maGv = "GV07";
//        giaoVienTiengAnh5.hoTen ="Nguyen Thi B";
//        giaoVienTiengAnh5.gioiTinh = "Nam";
//        giaoVienTiengAnh5.monDay = "Tiếng Anh 1";
//        giaoVienTiengAnh5.ngaySinh = "02/02/1989";
//
//        ArrayList<GiaoVienToan> giaoVienToans = new ArrayList<GiaoVienToan>();
//        giaoVienToans.add(giaoVienToan1);
//        giaoVienToans.add(giaoVienToan2);
//        giaoVienToans.add(giaoVienToan3);
//        for (GiaoVienToan gv : giaoVienToans) {
//            gv.printInfo();
//        }
//
//        ArrayList<GiaoVienTiengAnh> giaoVienTiengAnhs = new ArrayList<GiaoVienTiengAnh>();
//        giaoVienTiengAnhs.add(giaoVienTiengAnh1);
//        giaoVienTiengAnhs.add(giaoVienTiengAnh2);
//        giaoVienTiengAnhs.add(giaoVienTiengAnh3);
//        giaoVienTiengAnhs.add(giaoVienTiengAnh4);
//        giaoVienTiengAnhs.add(giaoVienTiengAnh5);
//        for(GiaoVienTiengAnh gv : giaoVienTiengAnhs) {
//            gv.printInfo();
//        }
        // array - ex1;
        GradeAverage gradeAverage = new GradeAverage();
        gradeAverage.printStudents();
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Int Array: ");
        gradeAverage.printArray(intArray);

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Double Array: ");
        gradeAverage.printArray(doubleArray);

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.print("Float Array: ");
        gradeAverage.printArray(floatArray);

        int[] emptyArray = {};
        System.out.print("Empty Array: ");
        gradeAverage.printArray(emptyArray);

        int[] oneElementArray = {10};
        System.out.print("One-Element Array: ");
        gradeAverage.printArray(oneElementArray);

    }
}

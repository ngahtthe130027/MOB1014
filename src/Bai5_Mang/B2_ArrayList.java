package Bai5_Mang;

import Bai4_OOP.SinhVien;

import java.util.ArrayList;

public class B2_ArrayList {
    public static void main(String[] args) {
        /*
            Định nghĩa: là mảng danh sách, số lượng phần tử động,
                        có thể lưu các phần tử trùng giá trị
        */

        // Khai báo một mảng danh sách được xác định kiểu dữ liệu là Integer
        ArrayList<Integer> list = new ArrayList<>();

        // Khai báo một mảng danh sách với kiểu dữ liệu lưu trữ mặc đinh - Object
        ArrayList list2 = new ArrayList();

        //them gia tri vao mang danh sach
        list2.add(3);
        list2.add(true);
        list2.add(new SinhVien());

        //for each - java
        for(Object ob : list2){
            //System.out.println(ob.toString());
        }


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // lấy giá trị tại vị trí x
        list.get(0);

        // thay thế giá trị vị trị x
        list.set(4, 6);

        //System.out.println(list.get(4));

        // xoá phần tử tại vị trí x
        list.remove(2);

        list.add(4);

        // xoá phần tử với giá trị y đầu tiên trong mảng
        list.remove((Integer) 4);

        for(Integer element : list){
            System.out.println(element);
        }

        System.out.println("So luong phan tu trong list la: " + list.size());
        // xoá tất cả các phần tử
        list.clear();

        // lấy ra kích thước của mảng danh sách
        list.size();


    }
}

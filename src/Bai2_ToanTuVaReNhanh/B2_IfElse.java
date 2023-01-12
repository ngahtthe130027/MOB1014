package Bai2_ToanTuVaReNhanh;

public class B2_IfElse {
    /*
        1. Cấu trúc IF
            if (điều kiện){
                    //thực hiện công việc
            }
        2. Cấu trúc IF-ELSE
            if (điều kiện){
                    //thực hiện công việc 1
            }else{
                    //thực hiện công việc 2
            }
        2. Cấu trúc IF-ELSE-IF
            if (điều kiện 1){
                    //thực hiện công việc 1
            }else if (điều kiện 2){
                    //thực hiện công việc 2
            }else{
                    //thực hiện công việc n
            }
    */
    public static void main(String[] args) {
        double money= 4000;
        if (money > 4000){
            System.out.println("Mua Kim Cuong");
        }else if (money > 2000){
            System.out.println("Mua Hot Xoan");
        }else{
            System.out.println("Mua Vang");
        }
    }
}

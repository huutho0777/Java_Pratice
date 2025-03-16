package java1.code_java;

public class SinhVien {
    private String hoten;
    private double diem;
    public void setHoten(String hoten){
        this.hoten=hoten;
    }
    public String getHoten(){
        return this.hoten;
    }
    public void setDiem(double diem) {
        if (diem < 0 || diem > 10) {
            System.out.println("diem khong hop le : ");
        } else {
            this.diem = diem;
        }
    }
        public double getDiem() {
            return this.diem;
        }
    }
     class Myclass{
        public static void main(String[] args) {
            SinhVien sv = new SinhVien();
            sv.setHoten("nguyen van teo");
            sv.setDiem(5);
        }
    }




package Pratical_ADF2_NguyenThiThuy;

import java.util.Date;

public class InfoCustomer {
    public int ReservationID;
    public String PasbahName;
    public String Address;
    public String Phone;
    public String ngayKhoiHang;
    public String ngayComback;

    public InfoCustomer(int reservationID, String pasbahName, String address, String phone, String ngayKhoiHang, String ngayComback) {
        ReservationID = reservationID;
        PasbahName = pasbahName;
        Address = address;
        Phone = phone;
        this.ngayKhoiHang = ngayKhoiHang;
        this.ngayComback = ngayComback;
    }
}


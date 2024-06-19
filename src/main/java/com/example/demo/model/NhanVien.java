package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String MaNv;
    private String TenNv;
    private String Phai;
    private double Luong;
    private String NoiSinh;


    @ManyToOne
    @JoinColumn(name = "Ma_Phong")
    private PhongBan phongBan;;

    public String getImgUrl() {
        return ImgUrl;
    }
    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }
    private String ImgUrl;
}

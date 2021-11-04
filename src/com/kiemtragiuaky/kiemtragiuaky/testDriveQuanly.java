package com.nhutnl2008110101.kiemtragiuaky;

public class testDriveQuanly {
        public static void main(String[] args) {
            DanhSachQL ds = new DanhSachQL();
            HocVien sv = new HocVien();
            sv.setDiemMonhoc1(5);
            sv.setDiemMonhoc2(7);
            sv.setHoTen("Alex Chang");
            sv.setDiaChi("169 Bồng Sơn");
            sv.setSoLuongHv(300);
            ds.them(sv);
            NhanVien nv = new NhanVien();
            nv.setHeSoluong(5);
            nv.setHoTen("SunThe");
            nv.setDiaChi("146 Long An");
            ds.them(nv);
            Khachhang kh = new Khachhang();
            kh.setTenCongty("Leo");
            kh.setGiaTrihoaDon(5000);
            kh.setHoTen("ProNill");
            kh.setDiaChi("153 Discord");
            ds.them(kh);
            ds.inDanhSach();
    
    
    
        }
    
}

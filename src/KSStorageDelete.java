// Lớp lưu trữ cho chức năng xóa đặt phòng
public class KSStorageDelete {
    public boolean deleteDatPhong(int maDatPhong) {
        return MemoryKSDB.deleteKS(maDatPhong); // Xóa đặt phòng từ cơ sở dữ liệu
    }
}
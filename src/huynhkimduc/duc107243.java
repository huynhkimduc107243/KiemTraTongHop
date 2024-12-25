package huynhkimduc;
public class duc107243
{
    // Viết hàm tính tổng số tiền có trong ví. long tongTien(int vi[])
    public static long tongTien(int[] vi)
    {
        long tong = 0;
        for (int i = 0; i < vi.length; i++)
        {
            tong += vi[i];
        }
        return tong;
    }

    // Viết hàm tìm vị trí tờ tiền có mệnh giá nhỏ nhất đầu tiên trong ví. int viTriNhoNhatDau(int vi[])
    public static int viTriNhoNhatDau(int[] vi)
    {
        int nhoNhatDau = 0;
        for (int i = 1; i < vi.length; i++)
        {
            if (vi[i] < vi[nhoNhatDau]) nhoNhatDau = i;
        }
        return nhoNhatDau;
    }

    // Viết hàm tìm vị trí tờ tiền có mệnh giá nhỏ nhất cuối trong ví. int viTriNhoNhatCuoi(int vi[])
    public static int viTriNhoNhatCuoi(int[] vi)
    {
        int nhoNhatCuoi = 0;
        for (int i = 1; i < vi.length; i++)
        {
            if (vi[i] <= vi[nhoNhatCuoi]) nhoNhatCuoi = i;
        }
        return nhoNhatCuoi;
    }

    // Viết hàm tìm vị trí tờ tiền có mệnh giá lớn nhất đầu tiên trong ví. int viTriLonNhatDau(int vi[])
    public static int viTriLonNhatDau(int vi[])
    {
        int lonNhatDau = 0;
        for (int i = 1; i < vi.length; i++)
        {
            if (vi[i] > vi[lonNhatDau]) lonNhatDau = i;
        }
        return lonNhatDau;
    }

    // Viết hàm tìm vị trí tờ tiền có mệnh giá lớn nhất cuối trong ví. int viTriLonNhatCuoi(int vi[])
    public static int viTriLonNhatCuoi(int vi[])
    {
        int lonNhatCuoi = 0;
        for (int i = 1; i < vi.length; i++)
        {
            if (vi[i] >= vi[lonNhatCuoi]) lonNhatCuoi = i;
        }
        return lonNhatCuoi;
    }

    // Viết hàm sắp xếp các tờ tiền trong ví theo thứ tự tăng dần của mệnh giá. void sapXepTang(int vi[])
    public static void sapXepTang(int[] vi)
    {
        for (int i = 0; i < vi.length - 1; i++)
        {
            for (int j = i + 1; j < vi.length; j++)
            {
                if (vi[i] > vi[j])
                {
                    int tam = vi[i];
                    vi[i] = vi[j];
                    vi[j] = tam;
                }
            }
        }
        System.out.print("Cac to tien sau khi sap xep tang: ");
        for (int i = 0; i < vi.length; i++)
        {
            System.out.print(vi[i] + ", ");
        }
        System.out.println();
    }

    // Viết hàm sắp xếp các tờ tiền trong ví theo thứ tự giảm dần của mệnh giá. void sapXepGiảm(int vi[])
    public static void sapXepGiam(int[] vi)
    {
        for (int i = 0; i < vi.length - 1; i++)
        {
            for (int j = i + 1; j < vi.length; j++)
            {
                if (vi[i] < vi[j])
                {
                    int tam = vi[i];
                    vi[i] = vi[j];
                    vi[j] = tam;
                }
            }
        }
        System.out.print("Cac to tien sau khi sap xep giam: ");
        for (int i = 0; i < vi.length; i++)
        {
            System.out.print(vi[i] + ", ");
        }
        System.out.println();
    }

    // Viết hàm thống kê số tờ tiền có mệnh giá lớn hơn 50.000 có trong ví. int thongKe50(int vi[])
    public static int thongKe50(int[] vi)
    {
        int dem = 0;
        for (int i = 0; i < vi.length; i++)
        {
            if (vi[i] > 50000) dem++;
        }
        return dem;
    }

    // Viết hàm thống kê số tờ tiền có mệnh giá nhỏ hơn 100.000 trong ví. int thongKe100(int vi[])
    public static int thongKe100(int[] vi)
    {
        int dem = 0;
        for (int i = 0; i < vi.length; i++)
        {
            if (vi[i] < 100000) dem++;
        }
        return dem;
    }

    public static void main(String[] args)
    {
        int[] vi = {20000, 10000, 20000, 10000, 100000, 10000, 500000, 50000, 500000, 100000, 100000, 50000, 200000, 200000, 50000};
        System.out.println("Tong so tien li xi: " + tongTien(vi));
        System.out.println("Vi tri to tien co menh gia nho nhat dau tien: " + viTriNhoNhatDau(vi));
        System.out.println("Vi tri to tien co menh gia nho nhat cuoi cung: " + viTriNhoNhatCuoi(vi));
        System.out.println("Vi tri to tien co menh gia lon nhat dau tien: " + viTriLonNhatDau(vi));
        System.out.println("Vi tri to tien co menh gia lon nhat cuoi cung: " + viTriNhoNhatCuoi(vi));
        sapXepTang(vi);
        System.out.println("So to tien co menh gia lon hon 50.000: " + thongKe50(vi));
        System.out.println("So to tien co menh gia nho hon 100.000: " + thongKe100(vi));
    }
}
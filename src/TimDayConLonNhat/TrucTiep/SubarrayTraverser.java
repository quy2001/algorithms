package TimDayConLonNhat.TrucTiep;

public class SubarrayTraverser {
    /*
    - duyệt hết tất cả các dãy con có thể.
    Bài toán tìm dãy con lớn nhất:
    Cho dãy số
    a1, a2, … , an
    Dãy số ai, ai+1, …, aj với 1 ≤ i ≤ j ≤ n được gọi là dãy con của dãy
    đã cho và ∑jk=i ak được gọi là trọng lượng của dãy con này
    Bài toán đặt ra là: Hãy tìm trọng lượng lớn nhất của các dãy con, tức
    là tìm cực đại giá trị ∑jk=i ak. Để đơn giản ta gọi dãy con có trọng
    lượng lớn nhất là dãy con lớn nhất.
     */
    public static void main(String[] args) {
        int[] arr = { -2, 11, -4, 13, -5, 2};
        int maxSum = 0;
        int count = 0;
        for(int i=0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                    count ++;
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println("Số lần cộng " + count);
        System.out.println("Tổng trọng lượng " + maxSum);
    }
}

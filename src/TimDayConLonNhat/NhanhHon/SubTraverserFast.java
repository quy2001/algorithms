package TimDayConLonNhat.NhanhHon;

import java.util.ArrayList;
import java.util.List;

public class SubTraverserFast {
    public static void main(String[] args) {
        int[] arr = { -2, 11, -4, 13, -5, 2};
        int maxSum = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Số lần cộng " + count);
        System.out.println("Tổng trọng lượng " + maxSum);
    }
}

class Solution {
    public static void main(String[] args) {
            int[] l1 = { 2,4,3};
            int[] l2 = { 5,6,4};
            int le1 = l1.length;
            int le2 = l2.length;
            List<Integer> result = new ArrayList<>();
            int nguyen = 0;
            int le = Math.max(le1, le2);
            for(int i = 0; i < le; i++){
                int temp = 0;
                if(i >= le2){
                    temp = l1[i] + nguyen;
                }else if(i >= le1){
                    temp = l2[i] + nguyen;
                }else{
                    temp = l1[i] + l2[i] + nguyen;
                }
                if(temp/10 > 0 ){
                    nguyen = temp / 10;
                }else{
                    nguyen = 0;
                }
                result.add(temp%10);
            }
            if(nguyen != 0){
                result.add(nguyen);
            }
        System.out.println(result);
    }
}
package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

public class SmallestGoodBase {
  public static String findGoodBase(String n){
     long num = Long.parseLong(n);

        // Maximum possible number of digits - 1
        int maxM = (int) (Math.log(num) / Math.log(2));

        // Try from the longest representation to the shortest
        for (int m = maxM; m >= 1; m--) {

            long left = 2;
            long right = (long) Math.pow(num, 1.0 / m);

            while (left <= right) {

                long mid = left + (right - left) / 2;

                long sum = 1;
                long curr = 1;

                boolean overflow = false;

                // Compute:
                // 1 + mid + mid² + ... + mid^m
                for (int i = 1; i <= m; i++) {

                    if (curr > num / mid) {
                        overflow = true;
                        break;
                    }

                    curr *= mid;

                    if (sum > num - curr) {
                        overflow = true;
                        break;
                    }

                    sum += curr;
                }

                if (!overflow && sum == num) {
                    return String.valueOf(mid);
                }

                if (overflow || sum > num) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return String.valueOf(num - 1);
  }


  public static void main(String[] args) {
    String s = "13";
    System.out.println(findGoodBase(s));
  }
  
}

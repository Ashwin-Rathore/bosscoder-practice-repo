package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {

  private static boolean canPlaceBalls(int[] position, int m, int distance) {

        int ballsPlaced = 1;
        int lastPosition = position[0];

        for (int i = 1; i < position.length; i++) {

            if (position[i] - lastPosition >= distance) {
                ballsPlaced++;
                lastPosition = position[i];

                if (ballsPlaced == m) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
int n = position.length;
int low = 1;
int high = position[n - 1] - position[0];

int answer = 0;

while (low <= high) {

    int mid = low + (high - low) / 2;

    if (canPlaceBalls(position, m, mid)) {
        answer = mid;
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}

return answer;
    }

  public static void main(String[] args) {
    
    int[] position = {1,2,3,4,7};
    int m = 3;

    System.out.println(maxDistance(position,m));
  }
  
}

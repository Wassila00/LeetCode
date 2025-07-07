import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        // Step 1: Pair each car's position with its time to reach the target
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        // Step 2: Sort cars by position descending (farthest first)
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        // Step 3: Use a stack to track fleet arrival times
        Stack<Double> stack = new Stack<>();
        for (double[] car : cars) {
            double time = car[1];
            if (stack.isEmpty() || time > stack.peek()) {
                // New fleet
                stack.push(time);
            }
            // else: car joins the fleet on top (do nothing)
        }

        return stack.size();
    }
}

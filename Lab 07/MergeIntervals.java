import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        int[] temp = { intervals[0][0], intervals[0][0] };

        ans.add(temp);
        int last = 0;

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start <= ans.get(last)[1]) {
                if (end > ans.get(last)[1]) {
                    ans.get(last)[1] = end;
                }
            } else {
                temp[0] = start;
                temp[1] = end;
                ans.add(temp);
                last++;
            }
        }

        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < res.length; i++) {
            temp = ans.get(i);
            res[i][0] = temp[0];
            res[i][1] = temp[1];
        }
        return res;
    }
}
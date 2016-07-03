package dynamic_programming;

public class MaximalIncreasingSequence {
    public static int[] get(int[] v, int len) {
        int[] lengths = new int[len];
        for (int i = 0; i < len; i++)
            lengths[i] = 1;
        int maxLen = 0;

        while (true) {
            maxLen++;
            boolean changed = false;
            for (int i = 0; i < len - maxLen; i++) {
                if (v[i + maxLen] > v[i + maxLen - 1] && lengths[i] > 0) {
                    lengths[i]++;
                    changed = true;
                } else if (lengths[i] > 0)
                    lengths[i] *= -1;
            }
            if (!changed)
                break;
        }

        int[] result = new int[2];
        for (int i = 0; i < len; i++) {
            if (-lengths[i] == maxLen) {
                result[0] = i;
                result[1] = i + maxLen;
                break;
            }
        }

        return result;
    }
}

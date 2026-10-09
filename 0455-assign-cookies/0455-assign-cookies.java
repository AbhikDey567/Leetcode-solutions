import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g); // greed factors
        Arrays.sort(s); // cookie sizes

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {

            // If cookie can satisfy child
            if (s[cookie] >= g[child]) {
                child++;
            }

            // Move to next cookie
            cookie++;
        }

        return child;
    }
}
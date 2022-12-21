package mirea.siaod.s7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.random;

public class A {
    static String fdg(int n, int k) {
        Random random = new Random();

        int dp[]=new int[n+1];//fill
        dp[1]=0;
        for(int i=2;i<n;i++) {
            dp[i] = random.nextInt(2)+2;
        }
        var frog = dp;
        for(int i=2;i<=n;i++){
            System.out.print(dp[i]);
            System.out.print(' ');
        }
        System.out.println();
        for(int i=k+1;i<=n;i++){
            int nmin=1000;
            for(int j=1;j<=k;j++){
                nmin=min(dp[i-j],nmin);
            }
            frog[i] = nmin;
            dp[i]+=nmin;
        }
        for(int i=2;i<=n;i++){
            System.out.print(dp[i]);
            System.out.print(' ');

        }
        System.out.println();
        ArrayDeque<Integer> jumps = new ArrayDeque<>();
        int num=n;
        int cnt =0;
        jumps.addLast(num);
        while (num > 1) {
            num = frog[num];
            jumps.add(num);
            cnt++;
        }
        String ans;
        ans = dp[n] + "\n" + cnt + "\n";

        while (!jumps.isEmpty()) ans += jumps.removeLast() + " ";
        return ans;

    }
    /*
        static String VTraveSidelOgurechik(int n, int k, int a[]) {
        String ans = "";

        int dp[] = new int[n + 1];
        int monetki[] = new int[n + 1];

        dp[1] = 0;
        int nmax = 0;

        for (int i = 2; i <= n; i++) {
            nmax = i - 1;
            int max;
            if ((i - k) > 1) max = i - k;
            else max = 1;
            for (int j = max; j < i; j++) {
                if (dp[nmax] < dp[j]) nmax = j;
            }
            monetki[i] = nmax;
            dp[i] = dp[nmax] + a[i];
        }

        int cnt = 0;
        int num = n;

        ArrayDeque<Integer> jumps = new ArrayDeque<>();

        jumps.addLast(num);
        while (num > 1) {
            num = monetki[num];
            jumps.add(num);
            cnt++;
        }

        ans = dp[n] + "\n" + cnt + "\n";

        while (!jumps.isEmpty()) ans += jumps.removeLast() + " ";

        return ans;
    }
    */
    public static void main(String[] args) throws IOException {
        System.out.println(fdg(20,3));
    }
}

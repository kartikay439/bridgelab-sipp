package level_1;
import java.util.*;
public class TwoDtoOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        int[] b = new int[r * c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();
        int k = 0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[k++] = a[i][j];
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}

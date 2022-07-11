package chapter6;

/**
 * @author Mr.Xiao
 * @date 2022/04/30 21:46
 * @Contain 杨辉三角
 **/
public class YangHui {
    public static void main(String[] args) {
        int[][] yanghui = new int[12][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i+1];
            for (int j = 0; j < yanghui[i].length; j++) {
                if(j == 0 || j == yanghui[i].length - 1){
                    yanghui[i][j] = 1;
                }else {
                    yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
                }
            }
        }

        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
    String[] strs = {"a","b","c"};
    String strings[] = new String[]{"a"};
}

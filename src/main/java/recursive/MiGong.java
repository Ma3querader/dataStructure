package recursive;

/**
 * @Author: panyusheng
 * @Date: 2021/5/26
 * @Version 1.0
 * <p>
 * 递归回溯走迷宫
 */
public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        // 1表示墙 上下全墙
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 左右全墙
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        // 挡板设置
        map[3][1] = 1;
        map[3][2] = 1;
        // 初始化 map 情况
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        setWay(map, 1, 1);
//        setWay2(map, 1, 1);
        System.out.println("------------------");
        // 第一种策略情况
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }


    }

    /**
     * 递归回溯法走迷宫
     *
     * @param map 地图
     * @param i   出发横坐标
     * @param j   出发纵坐标
     *            当 map[i][j] 为 0 表示该点没有走过 当为 1 表示墙 ； 2 表示通路可以走 ； 3 表示该点已经走过，但是走不通
     *            在走迷宫时，需要确定一个策略(方法) 下->右->上->左 , 如果该点走不通，再回溯
     * @return 如果找到通路，就返回 true, 否则返回 false
     */
    private static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) { // 通路已经找到 ok
            return true;
        } else {
            if (map[i][j] == 0) { //如果当前这个点还没有走过
                //按照策略 下->右->上->左 走
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) { // 向下
                    return true;
                } else if (setWay(map, i, j + 1)) { // 向右
                    return true;
                } else if (setWay(map, i - 1, j)) { // 向上
                    return true;
                } else if (setWay(map, i, j - 1)) {  // 向左
                    return true;
                } else {
                    // 尝试过走不通
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }


    public static boolean setWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) { // 通路已经找到 ok
            return true;
        } else {
            if (map[i][j] == 0) { //如果当前这个点还没有走过
                //按照策略 上->右->下->左
                map[i][j] = 2; // 假定该点是可以走通.
                if (setWay2(map, i - 1, j)) {//向上走
                    return true;
                } else if (setWay2(map, i, j + 1)) { //向右走
                    return true;
                } else if (setWay2(map, i + 1, j)) { //向下
                    return true;
                } else if (setWay2(map, i, j - 1)) { // 向左走
                    return true;
                } else {
                    //说明该点是走不通，是死路
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

}

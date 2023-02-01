//矩阵中的路径
//深度优先搜索，可以理解为暴力法遍历矩阵中所有字符串可能性。DFS 通过递归，先朝一个方向搜到底，再回溯至上个节点，沿另一个方向搜索，以此类推。
//上下左右四个方向递归，标记已经遍历的，防止后面的递推回去（代表此元素已访问过，防止之后搜索时重复访问。）
//当k == word.length - 1 返回true
class Solution30 {
    public boolean exist(char[][] board, String word) {
        char[] Word = word.toCharArray();
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(dfs(board, Word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || board[i][j] != word[k]) {
            return false;
        }
        //符合条件，递归结束往回退
        if(k == word.length - 1) {
            return true;
        }
        //设置标记，防止重复访问
        board[i][j] = '\0';
        //用或连接，即一个方向确定后，其他方向就不用走了
        boolean tmp = dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i, j + 1,  + 1) ||
                dfs(board, word, i, j - 1, k + 1);
        //递归回退时恢复标记
        board[i][j] = word[k];
        return tmp;
    }
}
public class exist {
}

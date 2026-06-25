1// class Solution {
2//     public List<List<String>> solveNQueens(int n) {
3//         List<List<String>> ans=new ArrayList<>();
4//         char[][] board=new char[n][n];
5//         for(char ch[]:board) Arrays.fill(ch,'.');
6//         solve(0,board,ans,n);
7//         return ans;
8//     }
9//     public void solve(int col,char[][]board,List<List<String>> ans,int n){
10//         if(col==n){
11//             ArrayList<String> temp=new ArrayList<>();
12//             for(char c[]:board){
13//                 StringBuilder sb=new StringBuilder();
14//                 for(char ch:c)sb.append(ch);
15//                 temp.add(sb.toString());
16//             }
17//             ans.add(new ArrayList<>(temp));
18//             return;
19//         }
20//         for(int row=0;row<n;row++){
21//             if(isValid(row,col,board)){
22//                 board[row][col]='Q';
23//                 solve(col+1,board,ans,n);
24//                 board[row][col]='.';
25//             }
26//         }
27//     }
28//     public boolean isValid(int row,int col,char[][]board){
29//         int r=row;
30//         int c=col;
31//         while(r>=0 && c>=0){
32//             if(board[r][c]=='Q')return false;
33//             r--;
34//             c--;
35//         }
36//         r=row;
37//         c=col;
38//         while(c>=0){
39//             if(board[r][c]=='Q')return false;
40//             c--;
41//         }
42//         r=row;c=col;
43//         while(r<board.length && c>=0){
44//             if(board[r][c]=='Q')return false;
45//             r++;
46//             c--;
47//         }
48//         return true;
49//     }
50// }
51
52class Solution {
53    public List<List<String>> solveNQueens(int n) {
54        List<List<String>> ans=new ArrayList<>();
55        char[][] board=new char[n][n];
56        for(char ch[]:board) Arrays.fill(ch,'.');
57        boolean rows[]=new boolean[n];
58        boolean left[]=new boolean[2*n-1];
59        boolean right[]=new boolean[2*n-1];
60        solve(0,board,rows,left,right,ans,n);
61        return ans;
62    }
63    public void solve(int col,char[][]board,boolean[]rows,boolean[]left,boolean[]right,List<List<String>> ans,int n){
64        if(col==n){
65            ArrayList<String> temp=new ArrayList<>();
66            for(char ch[]:board){
67                StringBuilder sb=new StringBuilder();
68                for(char c:ch)sb.append(c);
69                temp.add(sb.toString());
70            }
71            ans.add(new ArrayList<>(temp));
72            return;
73        }
74        for(int row=0;row<n;row++){
75            int d1=row+col;
76            int d2=row-col+n-1;
77            if(rows[row]||left[d1]||right[d2]) continue;
78            board[row][col]='Q';
79            rows[row]=true;
80            left[d1]=true;
81            right[d2]=true;
82            solve(col+1,board,rows,left,right,ans,n);
83            board[row][col]='.';
84            rows[row]=false;
85            left[d1]=false;
86            right[d2]=false;
87        }
88    }
89}
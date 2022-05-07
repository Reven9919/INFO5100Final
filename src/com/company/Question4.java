package com.company;

class Question4 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int p = 0;
        if(n% 2 == 1){
            ans[p++] = 0;
        }
        for(int i = 1; i <= n / 2; i++){
            ans[p++] = i;
            ans[p++] = -i;
        }
        return ans;
    }
}

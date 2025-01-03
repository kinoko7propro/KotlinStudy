class rectail_fib {
    // tailrec关键字用于在递归最后一步时将过程转化为一个简单的循环，避免复杂情况下的计算
    tailrec fun fib(n: Int, sum: Int = 0, next: Int = 1): Int{
        /* 递归到0，返回总和
        递归过程：利用两个变量来存储当前值和下一值
         */
        if (n == 0) return sum else return fib(n - 1, next, sum + next)
    }
}

fun main() {
    println(rec.rec(10))
}

object rec {
    tailrec fun rec(n: Int, sum: Int = 0, next: Int = 1): Int {
        if (n == 0) return sum
        return rec(n - 1, next, sum + next)
    }
}

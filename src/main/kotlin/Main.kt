//laba1:Программная реализация расширенного алгоритма Евклида

fun main() {
    println("\nSTART.Получение обратного элемента на основе расширенного алгоритма Евклида")
    var a = 0
    while (a == 0)
        a = inputA()
    var n = 0
    while (n == 0)
        n = inputN()
    val u: Array<Int> = arrayOf(0, 1, n)
    val v: Array<Int> = arrayOf(1, 0, a)
    val t: Array<Int> = arrayOf(0, 0, 0)
    while (u[2] != 0 && u[2] != 1 && v[2] != 0) {
        val q = u[2] / v[2]
        for (i in 0..2) {
            t[i] = u[i] - v[i] * q
            u[i] = v[i]
            v[i] = t[i]
        }
    }
    if (u[2] != 1) {
        println("Обратный элемент не существует")
        main()
    } else if (u[2] == 1) {
        val uLit = u[0]
        if (uLit < 0) {
            val lit = uLit + n
            println("Значение обратного элемента = $lit")
            main()
        } else {
            println("Значение обратного элемента = $uLit")
            main()
        }
    }
}

fun inputA(): Int {
    var P: Int = 0
    println("Введите целое число a:")
    try {
        P = readln().toInt()
        return if (P < 1) {
            println("Некорректный ввод. Попробуйте ещё раз")
            0
        } else P
    } catch (e: NumberFormatException) {
        println("Некорректный ввод. Попробуйте ещё раз")
        return 0
    }
}  //ВВОДИМ ПРОСТОЕ ЧИСЛО P

fun inputN(): Int {
    var Q: Int = 0
    println("Введите простое число Q:")
    try {
        Q = readln().toInt()
        var flag = true
        for (i in 2..(Q / 2)) {
            if (Q % i == 0) {
                flag = false
                break
            }
        }
        return if (Q < 1 || !flag) {
            println("Некорректный ввод. Попробуйте ещё раз")
            0
        } else Q
    } catch (e: NumberFormatException) {
        println("Некорректный ввод. Попробуйте ещё раз")
        return 0
    }
}  //ВВОДИМ ПРОСТОЕ ЧИСЛО Q
fun main() {
    val array1: Array<Int> = arrayOf(1, 2, 3, 4)
    val array2: Array<Int> = arrayOf(1, 2, 3, 4)
    var arrayResult: String = ""
    // usando o withIndex() para recuperar o indice do array e como ambos tem o mesmo tamanho
    // so precisa fazer a operacao de multiplicacao interando sobre cada indice
    for (indice in array1.withIndex()) {
        arrayResult += (array1[indice.index] * array2[indice.index])
        arrayResult += " "
    }
    print(arrayResult)
}

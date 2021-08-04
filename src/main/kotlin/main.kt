import classes.Aposentadoria

fun main() {
    var aposentadoria = Aposentadoria(65, "masculino", 24)
    println(aposentadoria.aposentar())

    var multiplicacao = Multiplica(arrayOf(2,5,4,3))
    println(multiplicacao.multiplicar())
}
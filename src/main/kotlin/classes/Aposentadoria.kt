package classes

class Aposentadoria (var idade: Int, var sexo: String, var anosContribuicao: Int) {

    fun aposentar() {
        //mulheres
        if(sexo == "feminino") {
            if ((idade >= 60) && (anosContribuicao >= 30)) {
                println("verdadeiro, pode se aposentar")
            } else {
                println("falso, não pode se aposentar")
            }
        } else {
            // homens
            if (sexo == "masculino")
                if (idade >= 65 && anosContribuicao >= 30) {
                    println("verdadeiro, pode se aposentar")
                } else {
                    println("falso, não pode se aposentar")
                }
           }

    }
}
class Multiplica(val numeros: Array<Int>){

    fun multiplicar(): Int {
        var resultado = numeros[0] // resultado recebe o primeiro numero do vetor
        for(i in 1 .. (numeros.size - 1)) { // vetor começa de 1 pq posição 0 ja está resultado
            resultado *= numeros[i] //resultado recebe o valor dele multiplicado pelo próximo elemento do vetor
        }
        return resultado
    }
}
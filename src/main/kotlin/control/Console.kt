package control

class Console private constructor(){
    //Responsabilidade: ler informações e tratá-las

    companion object {
        fun readInt(msg: String): Int {
            var retorno: Int? = null
            do {
                print(msg)
                val info = readLine()

                //Se vier informação
                if (info != null && info != "") {
                    retorno = info.toIntOrNull()

                    //Se for inválido
                    if (retorno == null || retorno <= 0) {
                        println("Valor inválido")
                    }
                } else {
                    //Se não vier informação
                    println("Valor vazio")
                }
            } while (retorno == null || retorno <= 0) //Enquanto não vier certo

            return retorno //Retorna apenas um inteiro tratado
        }

        fun readString(msg: String): String {
            var retorno: String? = null

            do {
                print(msg)
                val info = readLine()

                if (info != null && info != "") {
                    retorno = info.lowercase()
                } else {
                    println("Valor inválido")
                }
            } while (retorno == null || retorno == "")

            return retorno

        }
    }

}
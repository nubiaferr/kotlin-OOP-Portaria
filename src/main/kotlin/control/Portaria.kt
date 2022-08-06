package control

import business.ConvidadoBusiness
import entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria inicializada.")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")
        val convidado = Convidado(idade = idade)
        if (!convidadoBusiness.validaIdade(convidado.idade)) {
            return "Negado. Menores de idade não são permitidos."
        }

        convidado.tipoConvite = Console.readString("Qual é o tipo de convite? ")
        if (!convidadoBusiness.validaTipo(convidado.tipoConvite)) {
            return "Negado. Convite inválido."
        }

        convidado.codigo = Console.readString("Qual é o código de convite? ")
        if (!convidadoBusiness.validaCodigo(convidado)) {
            return "Negado. Código inválido."
        }

        return "Welcome!"
    }
}

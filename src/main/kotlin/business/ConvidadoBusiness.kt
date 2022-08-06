package business

import entity.Convidado

class ConvidadoBusiness {
    fun validaIdade(idade: Int) = idade >= 18

    fun validaTipo(tipoConvite: String) =
        tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo"

    fun validaCodigo(convidado: Convidado) = when (convidado.tipoConvite) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xl")
        else -> false
    }
}
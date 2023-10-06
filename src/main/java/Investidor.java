public class Investidor {
    private CategoriaInvestimento categoriaInvestimento;
    private TipoConta tipoConta;

    public Investidor (FabricaAbstrata fabrica) {
        this.categoriaInvestimento = fabrica.createCategoriaInvestimento();
        this.tipoConta = fabrica.createTipoConta();
    }

    public String pegarTipoConta() {
        return this.tipoConta.pegar();
    }

    public String pegarCategoriaInvestimento() {
        return this.categoriaInvestimento.pegar();
    }
}
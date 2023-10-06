public class FabricaCorrente implements FabricaAbstrata {
    @Override
    public CategoriaInvestimento createCategoriaInvestimento() {
        return new CategoriaInvestimentoCorrente();
    }

    @Override
    public TipoConta createTipoConta() {
        return new TipoContaCorrente();
    }
}

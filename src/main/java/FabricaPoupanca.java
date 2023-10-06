public class FabricaPoupanca implements FabricaAbstrata{

    @Override
    public TipoContaPoupanca createTipoConta() {
        return new TipoContaPoupanca();
    }

    @Override
    public CategoriaInvestimentoPoupanca createCategoriaInvestimento() {
        return new CategoriaInvestimentoPoupanca();
    }
}

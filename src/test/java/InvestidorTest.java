import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvestidorTest {
    @Test
    void deveRetornarCategoriaInvestimentoCorrente() {
        FabricaAbstrata fabrica = new FabricaCorrente();
        Investidor investidor = new Investidor(fabrica);
        assertEquals("Categoria Investimento corrente", investidor.pegarCategoriaInvestimento());
    }

    @Test
    void deveRetornarCategoriaInvestimentoPoupanca() {
        FabricaAbstrata fabrica = new FabricaPoupanca();
        Investidor investidor = new Investidor(fabrica);
        assertEquals("Categoria Investimento poupança", investidor.pegarCategoriaInvestimento());
    }

    @Test
    void deveRetornarTipoContaCorrente() {
        FabricaAbstrata fabrica = new FabricaCorrente();
        Investidor investidor = new Investidor(fabrica);
        assertEquals("Conta tipo corrente", investidor.pegarTipoConta());
    }

    @Test
    void deveRetornarTipoContaPoupanca() {
        FabricaAbstrata fabrica = new FabricaPoupanca();
        Investidor investidor = new Investidor(fabrica);
        assertEquals("Conta tipo poupança", investidor.pegarTipoConta());
    }
}

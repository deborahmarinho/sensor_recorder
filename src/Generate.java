import dados.DadosCO2;
import dados.DadosTemperatura;
import dados.DadosUmidade;

public class Generate {
    public void temperatura() {
        Temperatura temperatura = new Temperatura();
        DadosTemperatura dadosTemperatura = new DadosTemperatura();
        for (int l = 0; l < 48; l++) {
            double momentoLeitura = dadosTemperatura.medidas[l][0];
            double valorLeitura = dadosTemperatura.medidas[l][1];
            temperatura.adicionaDado(momentoLeitura, valorLeitura);
        }
        temperatura.printOrdenadosCres();
    }

    public void umidade() {
        Umidade umidade = new Umidade();
        DadosUmidade dadosTemperatura = new DadosUmidade();
        for (int l = 0; l < 48; l++) {
            double momentoLeitura = dadosTemperatura.medidas[l][0];
            double valorLeitura = dadosTemperatura.medidas[l][1];
            umidade.adicionaDado(momentoLeitura, valorLeitura);
        }
        umidade.printOrdenadosDec();
    }

    public void co2() {
        GasCarbonico gasCarbonico = new GasCarbonico();
        DadosCO2 dadosTemperatura = new DadosCO2();
        for (int l = 0; l < 48; l++) {
            double momentoLeitura = dadosTemperatura.medidas[l][0];
            double valorLeitura = dadosTemperatura.medidas[l][1];
            gasCarbonico.adicionaDado(momentoLeitura, valorLeitura);
        }
        gasCarbonico.printOrdenadosCres();
    }
}

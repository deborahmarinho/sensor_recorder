import java.util.Arrays;

public abstract class Sensor {
    private double[][] dadosSensor;
    private int nextRead;


    public double[][] getDadosSensor(){
        return dadosSensor;
    }

    public void setDadosSensor(double[][] dadosSensor){
        this.dadosSensor = dadosSensor;
    }

    public int getNextRead(){
        return nextRead;
    }

    public void setNextRead(int nextRead){
        this.nextRead = nextRead;
    }

    public void adicionaDado(double momentoLeitura, double valorLeitura) {
        dadosSensor[getNextRead()][0] = momentoLeitura;
        dadosSensor[getNextRead()][1] = valorLeitura;
        nextRead++;
    }

    public void printDados() {
        System.out.println(Arrays.deepToString(this.dadosSensor));
    }

    public double[][] OrdenaDadosCres() {
        double[][] dadosOrdenados = getDadosSensor();
        double valor_aux;
        double temp_aux;
        for(int i = 0; i < 48; i++){
            for (int l = 0; l < 47; l++) {
                if (dadosOrdenados[l][1] < dadosOrdenados[l + 1][1]) {
                    valor_aux = dadosOrdenados[l + 1][1];
                    temp_aux = dadosOrdenados[l + 1][0];
                    dadosOrdenados[l + 1][1] = dadosOrdenados[l][1];
                    dadosOrdenados[l + 1][0] = dadosOrdenados[l][0];
                    dadosOrdenados[l][1] = valor_aux;
                    dadosOrdenados[l][0] = temp_aux;
                }
            }
        }
        return dadosOrdenados;
    }
    public double[][] OrdenadosDec() {
        double[][] dadosOrdenados = getDadosSensor();
        double valor_aux;
        double temp_aux;
        for(int i = 0; i < 48; i++){
            for (int l = 0; l < 47; l++) {
                if (dadosOrdenados[l][1] > dadosOrdenados[l + 1][1]) {
                    valor_aux = dadosOrdenados[l + 1][1];
                    temp_aux = dadosOrdenados[l + 1][0];
                    dadosOrdenados[l + 1][1] = dadosOrdenados[l][1];
                    dadosOrdenados[l + 1][0] = dadosOrdenados[l][0];
                    dadosOrdenados[l][1] = valor_aux;
                    dadosOrdenados[l][0] = temp_aux;
                }
            }
        }
        return dadosOrdenados;
    }
    public void printOrdenadosDec(){
        double[][] dadosSensor = OrdenadosDec();
        String className = this.getClass().getSimpleName();
        System.out.println("--------------------------------------");
        System.out.println("|          " + className + "               |");
        System.out.println("--------------------------------------");
        System.out.println("n.medição: hora - valor");
        for (int l = 0; l < 48; l++){
            double momento = dadosSensor[l][0];
            double valor = dadosSensor[l][1];
            System.out.println("medição " + l + ": " + momento + " - " + valor);
        }
    }
    public void printOrdenadosCres(){
        double[][] dadosSensor = OrdenaDadosCres();
        String className = this.getClass().getSimpleName();
        System.out.println("--------------------------------------");
        System.out.println("|          " + className + "               |");
        System.out.println("--------------------------------------");
        System.out.println("n.medição: hora - valor");
        for (int l = 0; l < 48; l++){
            double momento = dadosSensor[l][0];
            double valor = dadosSensor[l][1];
            System.out.println("medição " + l + ": " + momento + " - " + valor);
        }
    }
}



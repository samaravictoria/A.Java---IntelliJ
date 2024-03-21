
import br.com.tds.model.Carro;
import br.com.tds.model.Cor;
import br.com.tds.model.Aviao;
import br.com.tds.model.Lancha;
public class Main {
    public static void main(String[] args) {
    Cor verdeEscuro = new Cor ();
    verdeEscuro.alterarCor(10,20,30,"Verde Escuro");
        System.out.println();

    Carro volvo = new Carro ();
    volvo.setModelo("S60");
    volvo.setQuantidadeLugares(5);
    volvo.setQuantidadePortas(4);
    volvo.setComprimento(4);
    volvo.setAnoFabricacao(2023);
    volvo.setverdeEscuro(verdeEscuro);
    volvo.setPlaca("EQQ2048");
    volvo.setMotor(2.0f);

    Aviao phenom300 = new Aviao();
    phenom300.setModelo("Phenom 300 bimotor");
    phenom300.setQuantidadeLugares(11);
    phenom300.setPrefixo("Embraer");
    phenom300.setComprimento(16);
    phenom300.setAnoFabricacao(2022);
    phenom300.setverdeEscuro(verdeEscuro);
    phenom300.setQuantidadeTurbinas(2);

    Lancha powerBoats = new Lancha();
    powerBoats.setModelo("Real PowerBoats");
    powerBoats.setQuantidadeLugares(18);
    powerBoats.setComprimento(60);
    powerBoats.setAnoFabricacao(2023);
    powerBoats.setverdeEscuro(verdeEscuro);
    powerBoats.setQuantidadeMotores(1);

        System.out.println("O carro do modelo " + volvo.getModelo() + " possui " + volvo.getQuantidadeLugares()
                + " lugares e " + volvo.getQuantidadePortas() + " portas, além de " + volvo.getComprimento() + " metros de comprimento. Ele na cor "
                + volvo.getverdeEscuro().getNome()+" foi lançado em " + volvo.getAnoFabricacao() + " com o motor " + volvo.getMotor() + " e recebeu a placa " + volvo.getPlaca() + ".");

        System.out.println("O avião do modelo " + phenom300.getModelo() + " da " + phenom300.getPrefixo() + " lançado em "
        + phenom300.getAnoFabricacao() + ", possui " + phenom300.getQuantidadeLugares() + " lugares, além de " + phenom300.getComprimento() +
                " metros de comprimento, e carrega " + phenom300.getQuantidadeLugares() +". Esse modelo possui uma versão ilimitada na cor " + phenom300.getverdeEscuro().getNome() + " com " + phenom300.getQuantidadeTurbinas() + " turbinas.");

        System.out.println("A lancha mais vendida nos ultimos três anos é a " + powerBoats.getModelo() + ", lançada em " + powerBoats.getAnoFabricacao()
                + ". Ela possui " + powerBoats.getQuantidadeLugares() + " lugares e " + powerBoats.getQuantidadeMotores() + " motor super potente. Sua cor mais diferenciada é a " + powerBoats.getverdeEscuro().getNome() + " e seu maior modelo tem " + powerBoats.getComprimento() + " metros de comprimento.");
    }
        }


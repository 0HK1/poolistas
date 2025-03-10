package listacarnaval6;

class TesteAtleta {
    public static void main(String[] args) {
        Triatleta atleta = new Triatleta();
        atleta.correr();
        atleta.nadar();

        // O mesmo objeto pode ser visto como Corredor ou Nadador
        Corredor comoCorredor = atleta;
        Nadador comoNadador = atleta;
        comoCorredor.correr(); // via referência Corredor
        comoNadador.nadar();   // via referência Nadador
    }
}
package listacarnaval9;

class TesteThreads {
    public static void main(String[] args) {
        Runnable tarefa1 = new MinhaTarefa("A");
        Runnable tarefa2 = new MinhaTarefa("B");

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);

        t1.start();
        t2.start();

        System.out.println("Threads iniciadas!");
    }
}
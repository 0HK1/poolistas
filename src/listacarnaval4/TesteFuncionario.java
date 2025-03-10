package listacarnaval4;

class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario func1 = new Gerente(5000.0);
        Funcionario func2 = new Vendedor(3000.0);
        System.out.println("Salário total do Gerente: " + func1.calcularSalarioTotal());  // 5000 + 1000
        System.out.println("Salário total do Vendedor: " + func2.calcularSalarioTotal()); // 3000 + 300
    }
}
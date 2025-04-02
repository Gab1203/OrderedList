
public class ListasApp {

    public static void main(String[] args) {
        ListacomArrayOrdenada minhaLista=new ListacomArrayOrdenada();

        minhaLista.print();
        minhaLista.add(new Aluno("João Henrique"));
        minhaLista.add(new Aluno("Jesus"));
        minhaLista.add(new Aluno("barreto"));
        minhaLista.add(new Aluno("Astolfo"));
        minhaLista.add(new Aluno("CArLOs"));
        minhaLista.add(new Aluno("Arnaldo"));

        minhaLista.sort();
        minhaLista.print();

        ListaEncadeadaOrdenada lista = new ListaEncadeadaOrdenada();

        lista.print();
        lista.add(new Aluno("João Henrique"));
        lista.add(new Aluno("Jesus"));
        lista.add(new Aluno("barreto"));
        lista.add(new Aluno("Astolfo"));
        lista.add(new Aluno("CArLOs"));
        lista.add(new Aluno("carol"));
        lista.add(new Aluno("Arnaldo"));
        lista.sort();
        lista.print();
    }

}

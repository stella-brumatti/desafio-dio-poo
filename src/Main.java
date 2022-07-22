import br.co.dio.desafio.Curso;
import br.co.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTítulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTítulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }

}

import br.co.dio.desafio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso() ;
        Conteudo conteudo1 = new Mentoria() ;

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Discrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila"+ devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Camila"+ devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Camila"+ devCamila.getConteudoConcluidos());
        System.out.println("XP" + devCamila.calcularTotalXp());

        System.out.println("_____________");

        Dev devStella = new Dev();
        devStella.setNome("Stella");
        devStella.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Stella"+ devStella.getConteudoInscritos());
        devStella.progredir();
        devStella.progredir();
        devStella.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Stella"+ devStella.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Stella"+ devStella.getConteudoConcluidos());
        System.out.println("XP" + devStella.calcularTotalXp());

    }


}

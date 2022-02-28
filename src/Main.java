import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("descrição curso js");
        curso1.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devRenan = new Dev();
        devRenan.setNome("Renan");
        devRenan.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Renan" + devRenan.getConteudosInscritos());
        devRenan.progredir();
        System.out.println("Conteúdos Inscritos Renan" + devRenan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Renan" + devRenan.getConteudosConcluidos());
        System.out.println("XP: "+ devRenan.calcularTotalXp());

        System.out.println("<------------------------------------->");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}

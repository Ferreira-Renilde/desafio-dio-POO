import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" Curso Java/back end");
        curso1.setCargaHoraria( 8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso JavaScript");
        curso2.setDescricao(" Curso JS/front end");
        curso2.setCargaHoraria( 6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Mentoria Java");
        mentoria.setDescricao(" Mentoria curso Java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRenilde = new Dev();
        devRenilde.setNome("Renilde");
        devRenilde.inscreverBootcam(bootcamp);
        System.out.println("Conteudos Inscritos Renilde: " + devRenilde.getConteudosIncritos());
        devRenilde.progredir();
        devRenilde.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Renilde: " + devRenilde.getConteudosIncritos());
        System.out.println("Conteudos Concluídos Renilde: " + devRenilde.getConteudosConcluidos());
        System.out.println("XP: " + devRenilde.calcularTotalXp());

        System.out.println("---------");

        Dev devTaynan = new Dev();
        devTaynan.setNome("Taynan");
        devTaynan.inscreverBootcam(bootcamp);
        System.out.println("Conteudos Inscritos Taynan: " + devTaynan.getConteudosIncritos());
        devTaynan.progredir();
        devTaynan.progredir();
        devTaynan.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Taynan: " + devTaynan.getConteudosIncritos());
        System.out.println("Conteudos Concluídos Taynan: " + devTaynan.getConteudosConcluidos());
        System.out.println("Xp: " + devTaynan.calcularTotalXp());


    }
}

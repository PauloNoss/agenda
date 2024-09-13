package views;

import models.Eventos;
import models.Palestrante;
import models.Participante;
import models.Sessao;

import javax.swing.*;
import java.util.Locale;

public class Principal {
        public static void main(String[] args) {
        Eventos eventos=new Eventos();
        eventos.setId(1);
        eventos.setNome("qualquer");
        eventos.setDatainicial("05/10/2000");
        eventos.setDatafinal("07/10/2000");
        eventos.setLocal("chapao");

        Participante participante=new Participante();
        participante.setId(1);
        participante.setNome("qualquer");
        participante.setEmail("fjkdbfhjbfdjf");
        participante.setIdade(18);

        Palestrante palestrante=new Palestrante();
        palestrante.setId(1);
        palestrante.setNome("qualquer");
        palestrante.setEspecialidade("nfndjfnd");

        Sessao sessao=new Sessao();
        sessao.setNome("qualquer");
        sessao.setHorario("12:00");

                JOptionPane.showMessageDialog(null,eventos);



}
        }

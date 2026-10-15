package br.com.modules;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 5 ■ Métodos
 * <p> » » Passando Dados entre Variáveis Métodos
 * <p> » » » Retornando Objetos
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2;                          // tickets = 2
        String guests = "abc";                    // guests  = abc
        addTickets(tickets);                      // tickets = 2
        guests = addGuests(guests);               // guests  = abcd
        System.out.println(tickets + guests);     // 2abcd
    }
    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }
    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}

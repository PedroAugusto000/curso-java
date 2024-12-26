package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

    public static void main(String[] args) {

        // Cria um formato de data no estilo "dia/mês/ano" tipo 20/07/2022
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Cria um formato de data e hora tipo "20/07/2022 01:30"
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        // Pega a data de hoje na moral (sem hora) 
        LocalDate d01 = LocalDate.now();
        // Pega data e hora de agora
        LocalDateTime d02 = LocalDateTime.now();
        // Pega o instante de agora em UTC, sem fuso horário
        Instant d03 = Instant.now();
        
        // Converte uma string ISO pra LocalDate (data sem hora)
        LocalDate d04 = LocalDate.parse("2022-07-20");
        // Converte uma string ISO pra LocalDateTime (data com hora)
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        // Converte uma string ISO pra Instant (data e hora em UTC)
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        // Converte uma string ISO pra Instant com fuso horário específico
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        
        // Converte uma data no formato customizado "dd/MM/yyyy" pra LocalDate
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        // Converte uma data e hora no formato customizado pra LocalDateTime
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        // Cria uma data direta passando ano, mês e dia
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        // Cria uma data e hora direta passando ano, mês, dia, hora e minuto
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
        
        // Print das datas que foram criadas, no padrão ISO
        System.out.println("d01 = " + d01.toString()); // Mostra só a data de hoje
        System.out.println("d02 = " + d02.toString()); // Mostra data e hora de agora
        System.out.println("d03 = " + d03.toString()); // Mostra o instante em UTC
        System.out.println("d04 = " + d04.toString()); // Data convertida da string ISO
        System.out.println("d05 = " + d05.toString()); // Data e hora convertida da string ISO
        System.out.println("d06 = " + d06.toString()); // Instant convertida da string ISO
        System.out.println("d07 = " + d07.toString()); // Instant com fuso específico
        System.out.println("d08 = " + d08.toString()); // Data convertida do formato customizado
        System.out.println("d09 = " + d09.toString()); // Data e hora convertida do formato customizado
        System.out.println("d10 = " + d10.toString()); // Data criada direto
        System.out.println("d11 = " + d11.toString()); // Data e hora criada direto
    }
}

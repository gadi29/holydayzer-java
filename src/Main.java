import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Holyday> holydays = new ArrayList<>();
        holydays.add(new Holyday("01/01/2023", "Confraternização mundial"));
        holydays.add(new Holyday("21/02/2023", "Carnaval"));
        holydays.add(new Holyday("17/04/2023", "Páscoa"));
        holydays.add(new Holyday("21/04/2023", "Tiradentes"));
        holydays.add(new Holyday("01/05/2023", "Dia do trabalho"));
        holydays.add(new Holyday("08/06/2023", "Corpus Christi"));
        holydays.add(new Holyday("07/09/2023", "Independência do Brasil"));
        holydays.add(new Holyday("12/10/2023", "Nossa Senhora Aparecida"));
        holydays.add(new Holyday("02/11/2023", "Finados"));
        holydays.add(new Holyday("15/11/2023", "Proclamação da República"));
        holydays.add(new Holyday("25/12/2023", "Natal"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a data que você deseja buscar: ");
        String date = sc.next();

        int index = -1;

        for (int i = 0; i < holydays.size(); i++) {
            if (date.equals(holydays.get(i).getDate())) {
                index = i;
                break;
            };
        }

        if(index >= 0) {
            System.out.println((holydays.get(index)).getName());
        } else System.out.println("Não existe um feriado cadastrado para esta data");
    }
}
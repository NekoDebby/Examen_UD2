package org.example;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import net.datafaker.Faker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {
        Faker faker = new Faker();
        ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
                .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.BLUE)
                .build();

        for (int i = 0; i < 10; i++) {
            // Generar data
            String name = faker.name().fullName();
            String streetAddress = faker.address().streetAddress();

            // Mostrar data
            cp.println("Nombre: " + name, Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.WHITE);
            cp.println("Dirección: " + streetAddress, Ansi.Attribute.NONE, Ansi.FColor.BLACK, Ansi.BColor.GREEN);
        }
    }
}

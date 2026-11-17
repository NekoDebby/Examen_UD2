package org.example;

import com.diogonunes.jcdp.color.ColoredPrinter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++)
        {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
    ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
            .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.BLUE)
            .build();

        for (int i = 0; i < 10; i++)
        {
            // Generar data
            String name = "Juan Juánez"
            String streetAddress = "Calle falsa, 123"

            // Mostrar data
            cp.println("Nombre: " + name, Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.WHITE);
            cp.println("Dirección: " + streetAddress, Ansi.Attribute.NONE, Ansi.FColor.BLACK, Ansi.BColor.GREEN);
        }
}

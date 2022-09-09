public class EvaluacionTecnicaPil {

    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.
         ****/

        /****
         * CONSIGNAS:
         * 1. Declará al menos tres variables con tipos de datos primitivos.
         * 2. A las variables declaradas anteriormente asignales un valor
         *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
         * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
         ****/

        imprimirConsigna(1);

        // Desarrollo de la consigna 1.

        double areaCirculo;
        double radioCirculo;
        double numeroPi;

        imprimirConsigna(2);

        // Desarrollo de la consigna 2.

        areaCirculo = 0.0;
        radioCirculo = 52.7;
        numeroPi = Math.PI;

        // calculo 1
        areaCirculo = numeroPi * radioCirculo * radioCirculo;

        double circunferenciaCirculo = 0.0;

        // calculo 2
        circunferenciaCirculo = 2 * numeroPi * radioCirculo;

        imprimirConsigna(3);

        // Desarrollo de la consigna 3.
        boolean condicionA = false;

        // a.
        if (!condicionA) {
            System.out.println("Dado un círculo de radio R = " + radioCirculo + ", calculamos su área y su circunferencia.");
            System.out.println("Calculo 1. Area circulo = " + areaCirculo);
            System.out.println("Calculo 2. Circunferencia circulo = " + circunferenciaCirculo);
        } else {
            System.err.println("Mensaje de error, la condición es falsa.");
        }

        // b.
        int i = 500;
        System.out.println("Valor inicial de la variable i = " + i);

        while (i < 2*500) {
            i++;
        }
        System.out.println("Valor final de la variable i = " + i);

        i = 500;

        // c.
        for (int j = 0; j < i/3; j++ ) {
            System.out.println("Impresión nro = " + j);
        }



    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}

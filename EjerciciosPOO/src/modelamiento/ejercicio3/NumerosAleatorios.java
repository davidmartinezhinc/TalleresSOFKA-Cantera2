package modelamiento.ejercicio3;

import java.util.Arrays;

public class NumerosAleatorios {

   private double[] numerosReales;

    public void insertarNumerosReales(int nroElementos) {
        this.numerosReales = new double[nroElementos];
        for (int i = 0; i < nroElementos; i++) {
            this.numerosReales[i] = Math.random() * 100 + 1;
        }
        System.out.println(this.numerosReales);

    }

    public NumerosAleatorios() {
        this.numerosReales = null;
    }

    public double[] getNumerosReales() {
        return numerosReales;
    }

    public double[] metodoBurbuja() {
        double aux;
        int t = this.numerosReales.length;
        for (int i = 1; i < t; i++) {
            for (int j = t- 1; j >= i; j--) {
                if(this.numerosReales[j] < this.numerosReales[j-1]){
                    aux = this.numerosReales[j];
                    this.numerosReales[j] = this.numerosReales[j-1];
                    this.numerosReales[j-1]=  aux;
                }
            }
        }
        return this.numerosReales;
    }

    public double[] ordenarQuickSort() {
        this.numerosReales = quicksort1(numerosReales);
        return this.numerosReales;
    }

   public double[] quicksort1(double numeros[]) {
        return quicksort2(numeros,0,numeros.length-1);
    }

    public double[] quicksort2(double numeros[], int izquierda, int derecha) {
        if (izquierda > derecha)
            return numeros;
        int  i = izquierda;
        int d= derecha;
        if (izquierda!=derecha) {
            double pivote;
            double aux;
            pivote = izquierda;
            while (izquierda != derecha) {
                while ((numeros[derecha] >= numeros[(int) pivote]) && (izquierda < derecha))
                    derecha--;
                     while ((numeros[izquierda] < numeros[(int) pivote]) && (izquierda < derecha))
                    izquierda++;
                        if (derecha != izquierda) {
                    aux = numeros[derecha];
                    numeros[derecha] = numeros[izquierda];
                    numeros[izquierda] = aux;
                    }
                }
                    if (izquierda == derecha) {
                        quicksort2(numeros, i, izquierda - 1);
                        quicksort2(numeros, izquierda + 1, d);
                     }
            }
            else
                return numeros;
            return numeros;
        }


    @Override
    public String toString() {
        return "NumerosAleatorios{" +
                "numerosReales=" + Arrays.toString(this.numerosReales) +
                '}';
    }
}

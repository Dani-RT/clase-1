public class Main{

    public void meses(){
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("Los meses del año son: ");
        for (String mes : meses) {
            System.out.println(mes);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.meses();
    }
}
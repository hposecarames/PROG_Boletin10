package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Pose Carames
 */
public class Xogo {

    int xog1;
    int xog2;
    int intentos;

    public Xogo(int xog1, int xog2) {

        this.xog1 = xog1;
        this.xog2 = xog2;
    }

    public Xogo() {

    }

    public void datos() {

        xog1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador1 introduce un número entre 1 y 50"));

        while (xog1 > 50 || xog1 < 1) {

            JOptionPane.showMessageDialog(null, "Número erróneo");
            xog1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador1 introduce un número entre 1 y 50"));

        }

        intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos entre 1 y 10"));

        while (intentos > 10 || intentos < 1) {

            JOptionPane.showMessageDialog(null, "Número erróneo");
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos entre 1 y 10"));
        }

    }

    public void adivinar() {

        for (int i = 0; i < intentos; i++) {

            xog2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador2 introduce un número entre 1 y 50"));

            while (xog2 > 50 || xog2 < 1) {

                JOptionPane.showMessageDialog(null, "Número erróneo");
                xog2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador2 introduce un número entre 1 y 50"));
            }

            if (xog2 > xog1) {

                JOptionPane.showMessageDialog(null, "Tu número es mayor");

            } else if (xog2 < xog1) {

                JOptionPane.showMessageDialog(null, "Tu número es menor");
            } else {

                JOptionPane.showMessageDialog(null, "¡¡Enhorabuena, Has acertado!!");
            }

        }

    }

    public int getXog1() {
        return xog1;
    }

    public void setXog1(int xog1) {
        this.xog1 = xog1;
    }

    public int getXog2() {
        return xog2;
    }

    public void setXog2(int xog2) {
        this.xog2 = xog2;
    }

}

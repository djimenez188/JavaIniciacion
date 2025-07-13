import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

    // Tamaño de la pantalla y celdas del juego
    static final int ANCHO_PANTALLA = 600;
    static final int ALTO_PANTALLA = 600;
    static final int TAM_CELDA = 25;

    static final int UNIDADES = (ANCHO_PANTALLA * ALTO_PANTALLA) / (TAM_CELDA * TAM_CELDA);
    final int[] x = new int[UNIDADES]; // posiciones X de la serpiente
    final int[] y = new int[UNIDADES]; // posiciones Y de la serpiente

    int partesDelCuerpo = 6;
    int comidaX;
    int comidaY;
    char direccion = 'R'; // R = derecha, L = izquierda, U = arriba, D = abajo
    boolean corriendo = false;
    Timer timer;
    Random random;

    // Constructor del panel
    public GamePanel() {
        this.setPreferredSize(new Dimension(ANCHO_PANTALLA, ALTO_PANTALLA));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(this);
        random = new Random();
        iniciarJuego();
    }

    public void iniciarJuego() {
        nuevaComida();
        corriendo = true;
        timer = new Timer(75, this); // cada 75ms se llama actionPerformed()
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujar(g);
    }

    public void dibujar(Graphics g) {
        if (corriendo) {
            // Dibujar la comida
            g.setColor(Color.red);
            g.fillOval(comidaX, comidaY, TAM_CELDA, TAM_CELDA);

            // Dibujar la serpiente
            for (int i = 0; i < partesDelCuerpo; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                } else {
                    g.setColor(new Color(45, 180, 0));
                }
                g.fillRect(x[i], y[i], TAM_CELDA, TAM_CELDA);
            }
        } else {
            mostrarGameOver(g);
        }
    }

    public void nuevaComida() {
        comidaX = random.nextInt(ANCHO_PANTALLA / TAM_CELDA) * TAM_CELDA;
        comidaY = random.nextInt(ALTO_PANTALLA / TAM_CELDA) * TAM_CELDA;
    }

    public void mover() {
        for (int i = partesDelCuerpo; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direccion) {
            case 'U':
                y[0] -= TAM_CELDA;
                break;
            case 'D':
                y[0] += TAM_CELDA;
                break;
            case 'L':
                x[0] -= TAM_CELDA;
                break;
            case 'R':
                x[0] += TAM_CELDA;
                break;
        }
    }

    public void verificarComida() {
        if (x[0] == comidaX && y[0] == comidaY) {
            partesDelCuerpo++;
            nuevaComida();
        }
    }

    public void verificarColisiones() {
        // Choca contra sí mismo
        for (int i = partesDelCuerpo; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                corriendo = false;
                break;
            }
        }

        // Choca con los bordes
        if (x[0] < 0 || x[0] >= ANCHO_PANTALLA || y[0] < 0 || y[0] >= ALTO_PANTALLA) {
            corriendo = false;
        }

        if (!corriendo) {
            timer.stop();
        }
    }

    public void mostrarGameOver(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        FontMetrics fm = getFontMetrics(g.getFont());
        g.drawString("Game Over", (ANCHO_PANTALLA - fm.stringWidth("Game Over")) / 2, ALTO_PANTALLA / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (corriendo) {
            mover();
            verificarComida();
            verificarColisiones();
        }
        repaint(); // vuelve a dibujar el panel
    }

    // Métodos del teclado
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (direccion != 'R') direccion = 'L';
                break;
            case KeyEvent.VK_RIGHT:
                if (direccion != 'L') direccion = 'R';
                break;
            case KeyEvent.VK_UP:
                if (direccion != 'D') direccion = 'U';
                break;
            case KeyEvent.VK_DOWN:
                if (direccion != 'U') direccion = 'D';
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}

import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        this.setTitle("Sanke - Java Edition");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new GamePanel());
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}

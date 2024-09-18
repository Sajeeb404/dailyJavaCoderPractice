package com.mycompany.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private final int WIDTH = 600, HEIGHT = 400;
    private final int BOX_SIZE = 20;
    private LinkedList<Point> snake;
    private Point food;
    private int direction = KeyEvent.VK_RIGHT;
    private boolean gameOver = false;
    private Timer timer;

    public SnakeGame() {
        snake = new LinkedList<>();
        snake.add(new Point(5, 5)); // Starting position
        spawnFood();

        timer = new Timer(100, this);
        timer.start();

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
    }

    private void spawnFood() {
        Random rand = new Random();
        int x = rand.nextInt(WIDTH / BOX_SIZE);
        int y = rand.nextInt(HEIGHT / BOX_SIZE);
        food = new Point(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * BOX_SIZE, p.y * BOX_SIZE, BOX_SIZE, BOX_SIZE);
        }
        g.setColor(Color.RED);
        g.fillRect(food.x * BOX_SIZE, food.y * BOX_SIZE, BOX_SIZE, BOX_SIZE);

        if (gameOver) {
            g.setColor(Color.WHITE);
            g.drawString("Game Over!", WIDTH / 2 - 30, HEIGHT / 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            moveSnake();
            checkCollision();
            repaint();
        }
    }

    private void moveSnake() {
        Point head = new Point(snake.getFirst());
        switch (direction) {
            case KeyEvent.VK_UP -> head.y--;
            case KeyEvent.VK_DOWN -> head.y++;
            case KeyEvent.VK_LEFT -> head.x--;
            case KeyEvent.VK_RIGHT -> head.x++;
        }

        snake.addFirst(head);
        if (head.equals(food)) {
            spawnFood(); // Eat food and spawn new
        } else {
            snake.removeLast(); // Remove tail
        }
    }

    private void checkCollision() {
        Point head = snake.getFirst();
        // Check wall collision
        if (head.x < 0 || head.x >= WIDTH / BOX_SIZE || head.y < 0 || head.y >= HEIGHT / BOX_SIZE) {
            gameOver = true;
        }
        // Check self-collision
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver = true;
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int newDirection = e.getKeyCode();
        if ((newDirection == KeyEvent.VK_UP && direction != KeyEvent.VK_DOWN) ||
                (newDirection == KeyEvent.VK_DOWN && direction != KeyEvent.VK_UP) ||
                (newDirection == KeyEvent.VK_LEFT && direction != KeyEvent.VK_RIGHT) ||
                (newDirection == KeyEvent.VK_RIGHT && direction != KeyEvent.VK_LEFT)) {
            direction = newDirection;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

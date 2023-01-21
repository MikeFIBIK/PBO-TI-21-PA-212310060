package com.ibik.pbo.praktikum;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame {
    private static final long serialVersionUID = 1L;

    // Game board dimensions
    private static final int ROWS = 3;
    private static final int COLS = 3;

    // Game board buttons
    private JButton[][] buttons = new JButton[ROWS][COLS];

    // Scores
    private int playerXScore = 0;
    private int playerOScore = 0;
  
    // Score labels
    JLabel playerScoreLabel = new JLabel("Score X:" + playerXScore + "  O:" + playerOScore + " ");
        
    // Current player ("X" or "O")
    private String currentPlayer = "X";

    // Constructor
    public TicTacToe() {
    	
    	// Set up the game board
    	setLayout(new BorderLayout());
        setSize(400, 400);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Add the score labels to the top of the window
        JPanel topPanel = new JPanel();
        topPanel.add(playerScoreLabel);

        add(topPanel, BorderLayout.NORTH);
        
        // Initialize game board buttons
        JPanel gameBoardPanel = new JPanel(new GridLayout(ROWS, COLS));
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(new ButtonListener());
                gameBoardPanel.add(buttons[i][j]);
            }
        }
        add(gameBoardPanel, BorderLayout.CENTER);

        // Show the game window
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
    	new TicTacToe();
    }

    // Button listener class
    private class ButtonListener implements ActionListener {
    	@Override
        public void actionPerformed(ActionEvent e) {
            // Get the button that was clicked
            JButton button = (JButton) e.getSource();

            // Set the button text to the current player's symbol
            button.setText(currentPlayer);

            // Disable the button to prevent further clicks
            button.setEnabled(false);

            ImageIcon icon = new ImageIcon ("img/nice.png");
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(65, 50, Image.SCALE_DEFAULT);
            Icon scaledIcon = new ImageIcon( scaledImage );
            
            // Check if the current player has won
            if (checkForWin()) {
                // Display a message indicating that the current player has won
                JOptionPane.showMessageDialog(null, currentPlayer + " got point 1", "Message", JOptionPane.PLAIN_MESSAGE, scaledIcon);
                if (currentPlayer == "X") {
                	playerXScore += 1;
                }else {
                	playerOScore += 1;
                }

                // Reset the game board
                resetGame();
            } else if (checkForDraw() == true) {
                // Display a message indicating that the game is a draw
                JOptionPane.showMessageDialog(null, "Its a draw!");

                // Reset the game board
                resetGame();
            } else {
                // Switch to the other player
                if (currentPlayer.equals("X")) {
                    currentPlayer = "O";
                } else {
                    currentPlayer = "X";
                }
            }
        }
    }

    // Check if the current player has won
    private boolean checkForWin() {
        // Check rows
        for (int i = 0; i < ROWS; i++) {
            if (checkRowCol(i, 0, 0, 1)) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < COLS; i++) {
            if (checkRowCol(0, i, 1, 0)) {
                return true;
            }
        }

        // Check diagonal from top-left to bottom-right
        if (checkRowCol(0, 0, 1, 1)) {
            return true;
        }

        // Check diagonal from top-right to bottom-left
        if (checkRowCol(0, COLS - 1, 1, -1)) {
            return true;
        }

        // No win was found
        return false;
    }


    // Check for a win in the specified row or column
    private boolean checkRowCol(int startRow, int startCol, int rowIncrement, int colIncrement) {
        String symbol = buttons[startRow][startCol].getText();

        // Check all elements in the row or column
        for (int i = 0; i < ROWS; i++) {
            int row = startRow + i * rowIncrement;
            int col = startCol + i * colIncrement;
            String buttonText = buttons[row][col].getText();
            if (buttonText.isEmpty() || !buttonText.equals(symbol)) {
                return false;
            }
        }

        // All elements match
        return true;
    }


    // Check if all buttons have been clicked, indicating a draw
    private boolean checkForDraw() {
    	int draw = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (!buttons[i][j].getText().equals("")) {
                    draw += 1;
                }
            }
        }
        if (draw == 9) {
        	return true;
        }else {
        	return false;
        }
    }

    // Reset the game board
    private void resetGame() {
        currentPlayer = "X";
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
     // Reset the scores
        playerScoreLabel.setText("Score X:" + playerXScore + "  O:" + playerOScore + " ");
    }       
}
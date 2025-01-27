package developer.boltech.technologies.railfenceencryption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        final EditText inputText = findViewById(R.id.inputText);
        final Button encryptButton = findViewById(R.id.encryptButton);
        final Button decryptButton = findViewById(R.id.decryptButton); // Add this line
        final TextView outputText = findViewById(R.id.outputText);

        encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                String encryptedText = encryptRailFence(input, 3); // Change the second parameter for different levels
                outputText.setText("Encrypted Text: " + encryptedText);
            }
        });

        decryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                String decryptedText = decryptRailFence(input, 3); // Change the second parameter accordingly
                outputText.setText("Decrypted Text: " + decryptedText);
            }
        });
    }

    // Rail Fence Encryption Algorithm
    private String encryptRailFence(String text, int rails) {
        // Implementation remains the same as provided in the previous answer
    }

    // Rail Fence Decryption Algorithm
    private String decryptRailFence(String text, int rails) {
        StringBuilder result = new StringBuilder();

        // Create arrays for each rail
        StringBuilder[] railArrays = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            railArrays[i] = new StringBuilder();
        }

        // Calculate the length of each rail
        int[] railLengths = new int[rails];
        int fullCycle = 2 * (rails - 1);
        for (int i = 0; i < text.length(); i++) {
            int rail = i % fullCycle;
            railLengths[Math.min(rail, fullCycle - rail)]++;
        }

        // Populate the rail arrays
        int currentIndex = 0;
        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < railLengths[i]; j++) {
                railArrays[i].append(text.charAt(currentIndex++));
            }
        }

        // Reconstruct the original text
        int currentRail = 0;
        boolean down = true;
        for (int i = 0; i < text.length(); i++) {
            result.append(railArrays[currentRail].charAt(0));
            railArrays[currentRail].deleteCharAt(0);
            currentRail += down ? 1 : -1;
            if (currentRail == rails - 1 || currentRail == 0) {
                down = !down;
            }
        }

        return result.toString();

        */

        final EditText inputText = findViewById(R.id.inputText);
        final Button encryptButton = findViewById(R.id.encryptButton);
        final TextView outputText = findViewById(R.id.outputText);

        encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                String encryptedText = encryptRailFence(input, 3); // Change the second parameter for different levels
                outputText.setText("Encrypted Text: " + encryptedText);
            }
        });
    }

    // Rail Fence Encryption Algorithm
    private String encryptRailFence(String text, int rails) {
        StringBuilder result = new StringBuilder();

        // Create arrays for each rail
        StringBuilder[] railArrays = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            railArrays[i] = new StringBuilder();
        }

        // Populate the rail arrays
        int currentRail = 0;
        boolean down = true;
        for (char ch : text.toCharArray()) {
            railArrays[currentRail].append(ch);
            currentRail += down ? 1 : -1;
            if (currentRail == rails - 1 || currentRail == 0) {
                down = !down;
            }
        }

        // Concatenate the rail arrays
        for (StringBuilder rail : railArrays) {
            result.append(rail);
        }

        return result.toString();
    }
}
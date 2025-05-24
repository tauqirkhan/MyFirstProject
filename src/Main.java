import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // How to PLAY AUDIO with Java (.wav, .au, .aiff)
        String filePath = "src\\Sly Sky - Telecasted.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("******************");
                System.out.println("Press 'Q' To Quit");
                System.out.println("Press 'S' To Stop");
                System.out.println("Press 'R' To Reset");
                System.out.println("Press 'P' To Start");
                System.out.println("******************");

                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid option");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio File is not supported!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("BYE!");
        }
    }
}
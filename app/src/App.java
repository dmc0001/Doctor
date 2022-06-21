import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Eyes eye1 = new Eyes("Left Eye", "Short sighted", "Blue");
        Eyes eye2 = new Eyes("Right Eye", "Normal", "Blue");
        Heart heart = new Heart("Heart", "Normal", 65);
        Stomach stomach = new Stomach("Stomach", "PUD");
        Skin skin = new Skin("Skin", "Burned");
        boolean work = true;
        Human h1 = new Human("Lorenzo Medici", 20);
        System.out.println("\n");
        while (work) {
            System.out.println("1.Left Eye");
            System.out.println("2.Right Eye");
            System.out.println("3.Heart");
            System.out.println("4.Stomach");
            System.out.println("5.Skin");
            System.out.println("6.Quit\n");
            System.out.print("Your choice : ");
            int n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1: {
                    System.out.println("Name : " + eye1.getName());
                    System.out.println("Medical Condition: " + eye1.getMedicalCondition());
                    System.out.println("Color : " + eye1.getColor());
                    eye1.CloseEye();
                    int num;
                    do {
                        num = new Scanner(System.in).nextInt();
                    } while (num != 1);
                    System.out.println("\n");
                    break;
                }

                case 2: {
                    System.out.println("Name : " + eye2.getName());
                    System.out.println("Medical Condition : " + eye2.getMedicalCondition());
                    System.out.println("Color : " + eye2.getColor());
                    eye1.CloseEye();
                    int num;
                    do {
                        num = new Scanner(System.in).nextInt();
                    } while (num != 1);
                    System.out.println("\n");
                    break;

                }
                case 3: {
                    System.out.println("Name : " + heart.getName());
                    System.out.println("Medical Condition : " + heart.getMedicalCondition());
                    System.out.println("Rate : " + heart.getHeartRate());
                    System.out.print("\t\t\t Change the Heart rate : Yes press '1' / No press 'anykey': ");
                    int key = new Scanner(System.in).nextInt();

                    switch (key) {
                        case 1: {
                            System.out.print("Rate : ");
                            heart.setHeartRate(new Scanner(System.in).nextInt());
                            break;
                        }

                        default:
                            break;
                    }
                    System.out.println("\n");
                    break;
                }

                case 4: {
                    System.out.println("Name : " + stomach.getName());
                    System.out.println("Medical Condition : " + stomach.getMedicalCondition());
                    System.out.println("Need to be fed");
                    System.out.println("\t\t1.Disgest : Yes press '1' / No press 'anykey': ");
                    int key = new Scanner(System.in).nextInt();
                    switch (key) {
                        case 1: {
                            stomach.Disgest();
                            break;
                        }

                        default:
                            break;
                    }
                    System.out.println("\n");
                    break;
                }
                case 5: {
                    System.out.println("Name : " + skin.getName());
                    System.out.println("Medical Condition : " + skin.getMedicalCondition());
                    break;
                }

                case 6:
                    work = false;
                    break;

                default: 
                System.out.println("\n");
                    System.out.println("Choose just from those options !!");
                    System.out.println("\n");
                    break;
            }

        }
    }
}

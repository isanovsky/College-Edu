import java.util.Random;
import java.util.Scanner;
public class Hospital{
    /*
     Name   : Ichsan Ali Darmawan
     Number : 13
     Class  : 1I

    Iam very sorry if there's still a mistakes or a bug, in my code program, I will improve it better next time.
    And thank you so much for the reviews
     * */
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static int[] quotaAvailable = {
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
    };
    static String[] userData = new String[10];
    static String[] polyclinic = {
            "Children Polyclinic",
            "Internist Polyclinic",
            "Surgery Polyclinic",
            "ENT-KL Polyclinic",
            "Skin Polyclinic",
            "Psychiatric Polyclinic",
    };
    static String[][] polyService = {
            {"General Child Health", "Children Infection", "Metabolic Disease"},
            {"General Internal Medicine", "Elderly Clinic", "Diabetes"},
            {"General Surgery", "Oncology Surgery", "Digestive Children Surgery"},
            {"General ENT", "ENT-KL Allergies", "Head and Neck Surgery"},
            {"General Skin", "Bacteria and Parasite Infections", "Tumors Surgery"},
            {"General Psychiatric", "Child and Adolescent Psychiatry", "Adult Psychiatry"},
    };
    static String[] hospitalization = {
            "Class I, II Service",
            "Isolation Inpatient Services",
            "VIP Inpatient Services",
            "High Care Treatment Services",
            "Intensive Services",
    };
    static String[][] hospitalServices= {
            {"Class I Service", "Class II Service"},
            {"Infection Patient Service", "Covid-19 Isolation"},
            {"State Officials Service", "VVIP Executive Service"},
            {"Medical Intermediate Care ", "High Care Cardiac Unit"},
            {"GICU (General ICU)", "CICU (Cardiac ICU)"},
    };
    static String[][] doctorList1= {
            {"Prof. Dr.med John William ", "ENT & Child Specialist, MBBS"},
            {"Dr. Stephen M.D ", "ENT & Skin Specialist, MBBS"},
            {"Prof. Dr. Adams Ph.D", "Child Specialist, BIMS, MBBS"},
            {"Dr.med Jeff M.B.B.S", "ENT & Child Specialist, BIMS",},
            {"Dr. Daniel Hobs M.D", "ENT & Child Specialist, MBBS"},
            {"Prof. Dr. Steven K. B.H.M.S", "ENT & Child Specialist, BHMS"},
            {"Dr.med Thomas London Ph.D", "ENT & Child Specialist, BHMS"},
            {"Dr. Robert Donn M.D", "ENT & Child Specialist, MBBS"},
            {"Dr.med Jennifer Audrey", "Skin Specialist, BHMS, MBBS"},
            {"Dr. Mary Monroe M.B.B.S", "ENT & Skin Specialist, MBBS"}
    };
    static String[][] doctorList2= {
            {"Dr. Ichsan Ali Ph.D ", "Psychologist & Counseling"},
            {"Dr. Hans Kaspar M.S ", "Psychologist & Mental Health"},
            {"Prof. Dr. Anton Schneider", "Psychologist & Education"},
    };
    static String[][] doctorIntern= {
            {"Dr. Christoph Waltz Ph.D", "Class I,II, ICU"},
            {"Dr. Ana Rose Ph.D", "Class I,II, Surgery"},
            {"Prof. Dr. Alexander Fleming", "Class I II, VIP & VVIP"},
            {"Dr.med Tymothy M.B.B.S", "High Care Patient, MBBS"},
            {"Dr. Linda Evelyn M.D", "Class I II, VIP & VVIP"},
            {"Prof. Dr. Gabrielle Bosch", "ICU, Isolation Services"},
            {"Dr.med Heinz Romeo Ph.D", "Surgery, ICU, BHMS"},
            {"Dr. Anabelle Hinata M.D", "High Care Patient, MBBS"},
    };

    public static void identityRegistration() {
        String name = "", placeBirth = "", nation = "";
        int age = 0;
        int answer = 0;

        System.out.println("\n|--------------------- Patient Registration Menu ----------------------|");
        System.out.println("|----------------------------------------------------------------------|");

        while (answer == 0) {
            System.out.println("\n|------------------ Please Input The Patient Identity -----------------|");

            System.out.print("Enter Your Name \t\t: ");
            name = input.next();
            System.out.print("Enter Place of Birth \t: ");
            placeBirth = input.next();
            System.out.print("Enter Your Age \t\t\t: ");
            age = input.nextInt();
            System.out.print("Enter your Nationality \t: ");
            nation = input.next();

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("This is your summary Identity :");
            System.out.println("| Patient name \t\t: " + name);
            System.out.println("| Place of Birth \t: " + placeBirth);
            System.out.println("| Age \t\t\t\t: " + age);
            System.out.println("| Nationality \t\t: " + nation);

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("\n -Is your data correct? ");
            System.out.print(" -Yes = 1 / No = 0 : ");
            answer = input.nextInt();

            input.nextLine();

        }

        String choice ;
        System.out.print("Do You Want to do a Medical Care ? <Y/N> : ");
        choice = input.next();
        if ((choice.charAt(0) == 'Y') || choice.charAt(0) == 'y') {
            medicalMenu();
        } else {
            exit();
        }

        userData[0] = name;
        userData[1] = placeBirth;
        userData[2] = String.format("%d", age);
        userData[3] = nation;
    }

    private static void identityPatient(){
        String name = "", placeBirth = "", nation = "";
        int age = 0;
        int answer = 0;
        int upperbound = 10;
        int numberPatient = rand.nextInt(upperbound);

        while (answer == 0) {
            System.out.println("\n|------------------ Please Input The Patient Identity -----------------|");

            System.out.print("Enter Your Name \t\t: ");
            name = input.next();
            System.out.print("Enter Place of Birth \t: ");
            placeBirth = input.next();
            System.out.print("Enter Your Age \t\t\t: ");
            age = input.nextInt();
            System.out.print("Enter your Nationality \t: ");
            nation = input.next();

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("This is your summary Identity :");
            System.out.println("| Patient name \t\t: " + name);
            System.out.println("| Place of Birth \t: " + placeBirth);
            System.out.println("| Age \t\t\t\t: " + age);
            System.out.println("| Nationality \t\t: " + nation);

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("\n -Is your data correct? ");
            System.out.print(" -Yes = 1 / No = 0 : ");
            answer = input.nextInt();

            input.nextLine();
        }

        userData[0] = String.format("%d", numberPatient);
        userData[1] = name;
        userData[2] = placeBirth;
        userData[3] = String.format("%d", age);
        userData[4] = nation;
    }
  
    public static void medicalMenu(){
        System.out.println("\n--- Please Select Your Medical Care Below ---");
        String[] menu = {
        "Outpatient",
        "Inpatient"
        };
    
            for (int num = 0; num < menu.length; num++) {
                System.out.println(num+1 + ". |" + menu[num] );
        }

            int select;
            System.out.print("Select 1/2 : ");
            select = input.nextInt();

            if (select == 1) {
                outpatient();
            } else if (select == 2) {
                inpatient();
            }
   }

      private static void outpatient() {
          System.out.println("\nPlease Select the Polyclinic Below:");
          String LINE = "---------------------------------------";

          System.out.println(LINE);
          for (int row = 0; row < polyclinic.length; row++) {
              System.out.printf(row + 1 + ". " + polyclinic[row]);
              for (int col = 0; col < polyService[0].length; col++) {
                  System.out.printf(" \n\t\t|-" + polyService[row][col]);
              }
              System.out.print("\n");
              System.out.println(LINE);
          }

          int outpatientSelect;
          System.out.print("Select 1/2/3/4/5/6 : ");
          outpatientSelect = input.nextInt();
          userData[5] = String.format("%d",outpatientSelect - 1);

              switch (outpatientSelect) {
                  case 1, 2, 3, 4, 5 : polyChoice1();
                        break;
                  case 6 : polyChoice2();
                        break;
              }
    }
    public static void polyChoice1() {
        String LINE = "|-------------------------------------------------------------------------------------------------------------------|";
        String LINE1 = "-----------------------------------------------------------------------";

        int selectDoctor;
        int choose;

        while (true) {
            System.out.print("Enter the Time you Want to Book with Doctor [Please Select Between 2 o'clock - 23 o'clock] : ");
            int hour;
            hour = input.nextInt();

            System.out.println(LINE);
            System.out.println("|                                                   List Doctor for Booking                                         |");
            System.out.println(LINE);
            System.out.println("| No |        Doctor's Name        |         Specialist           | Available Time | Current Status | Booking Quota |");
            System.out.println(LINE);

            for (int i = 0; i < doctorList1.length; i++) {
                String status;
                int availableStart = 1;
                int availableUntil = 1;
                availableStart += (i + i + 1);
                availableUntil += (i + i + 4);

                if (hour >= availableStart && hour <= availableUntil && quotaAvailable[i] != 0) {
                    status = "Available";
                } else if (hour >= availableStart && hour <= availableUntil && quotaAvailable[i] == 0){
                    status = "Booking Full";
                } else {
                    status = "Unavailabe";
                }

                System.out.printf("| %-2d | %-27s | %-28s | %-14s | %-14s | %-13s |", (i + 1), doctorList1[i][0], doctorList1[i][1], availableStart + ":00 - " + availableUntil + ":00", status, quotaAvailable[i]);
                System.out.println();
            }
            System.out.println(LINE);

            System.out.print("Please Select the Available Doctor (Select From the List between 1 - " + doctorList1.length +": ");
            selectDoctor = input.nextInt();
            userData[6] = String.format("%d", selectDoctor - 1);

            System.out.print("Press 1 to confirm : ");
            choose = input.nextInt();

            System.out.println("Please Enter Your Patient Data Before Booking: ");
            identityPatient();
                for (int i = 1; i < quotaAvailable.length; i++) {
                    quotaAvailable[i] = 2;
                    if (choose == 1 ) {
                        quotaAvailable[i] = quotaAvailable[selectDoctor - 1]--;
                    }

                    System.out.println(LINE1);
                    System.out.println("-----------------------Patient Details-----------------------");
                    System.out.println("Patient Booking Number\t: " + userData[0]);
                    System.out.println("Name\t\t\t\t\t: " + userData[1]);
                    System.out.println("Place of Birth\t\t\t: " + userData[2]);
                    System.out.println("Age\t\t\t\t\t\t: " + userData[3]);
                    System.out.println("Nationality\t\t\t\t: " + userData[4]);
                    System.out.println("Polyclinic Selected\t\t: " + polyclinic[Integer.parseInt(userData[5])]);
                    System.out.println("Doctor Selected\t\t\t: " + doctorList1[Integer.parseInt(userData[6])][0]);
                    System.out.println(LINE1);

                    System.out.print("Do You Want another Booking? [Y/N] : ");
                    String answer = input.nextLine();
                    if (answer.equalsIgnoreCase("y")) {
                        polyChoice1();
                    } else if (answer.equalsIgnoreCase("n")) {
                        System.out.print("Please Enter Key to Exit...");
                        input.nextLine( );
                        exit();
                        break;
                    }
                } break;
        }
    }
    public static void polyChoice2() {
        String LINE = "|-------------------------------------------------------------------------------------------------------------------|";
        String LINE1 = "-----------------------------------------------------------------------";

        int selectDoctor;
        int choose;

        while (true) {
            System.out.print("Enter the Time you Want to Book with Doctor [Please Select Between 7 o'clock - 14 o'clock] : ");
            int hour;
            hour = input.nextInt();

            System.out.println(LINE);
            System.out.println("|                                                   List Doctor for Booking                                         |");
            System.out.println(LINE);
            System.out.println("| No |        Doctor's Name        |         Specialist           | Available Time | Current Status | Booking Quota |");
            System.out.println(LINE);

            for (int i = 0; i < doctorList2.length; i++) {
                String status;
                int availableStart = 3;
                int availableUntil = 3;
                availableStart += (i + i + 4);
                availableUntil += (i + i + 7);

                if (hour >= availableStart && hour <= availableUntil && quotaAvailable[i] != 0) {
                    status = "Available";
                } else if (hour >= availableStart && hour <= availableUntil && quotaAvailable[i] == 0){
                    status = "Booking Full";
                } else {
                    status = "Unavailabe";
                }

                System.out.printf("| %-2d | %-27s | %-28s | %-14s | %-14s | %-13s |", (i + 1), doctorList2[i][0], doctorList2[i][1], availableStart + ":00 - " + availableUntil + ":00", status, quotaAvailable[i]);
                System.out.println();
            }
            System.out.println(LINE);

            System.out.print("Please Select the Available Doctor (Select From the List between 1 - " + doctorList2.length +": ");
            selectDoctor = input.nextInt();
            System.out.println("How many quota that want you add to the doctors?");
            int addquota = input.nextInt();
            userData[6] = String.format("%d", selectDoctor - 1);

            System.out.print("Press 1 to confirm : ");
            choose = input.nextInt();

            System.out.println("Please Enter Your Patient Data Before Booking: ");
            identityPatient();
            for (int i = 1; i < quotaAvailable.length; i++) {
                quotaAvailable[i] = 2;
                if (choose == 1 ) {
                    quotaAvailable[i] = quotaAvailable[selectDoctor - 1]--;
                    quotaAvailable[i] = quotaAvailable[i] + addquota;
                }

                System.out.println(LINE1);
                System.out.println("-----------------------Patient Details-----------------------");
                System.out.println("Patient Booking Number\t: " + userData[0]);
                System.out.println("Name\t\t\t\t\t: " + userData[1]);
                System.out.println("Place of Birth\t\t\t: " + userData[2]);
                System.out.println("Age\t\t\t\t\t\t: " + userData[3]);
                System.out.println("Nationality\t\t\t\t: " + userData[4]);
                System.out.println("Polyclinic Selected\t\t: " + polyclinic[Integer.parseInt(userData[5])]);
                System.out.println("Doctor Selected\t\t\t: " + doctorList2[Integer.parseInt(userData[6])][0]);
                System.out.println(LINE1);

                System.out.print("Do You Want another Booking? [Y/N] : ");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    polyChoice2();
                } else if (answer.equalsIgnoreCase("n")) {
                    System.out.print("Please Enter Key to Exit...");
                    input.nextLine( );
                    exit();
                    break;
                }
            } break;
        }
    }

      private static void inpatient() {
          System.out.println("Please enter the data below :");
          System.out.println("\nPlease Select Hospital Services Below:");
          String LINE = "---------------------------------------";

          System.out.println(LINE);
          for (int row = 0; row < hospitalization.length; row++) {
              System.out.printf(row + 1 + ". " + hospitalization[row]);
              for (int col = 0; col < hospitalServices[0].length; col++) {
                  System.out.printf(" \n\t\t|-" + hospitalServices[row][col]);

              }
              System.out.print("\n");
              System.out.println(LINE);
          }

          int inpatientSelect;
          inpatientSelect = input.nextInt();
          userData[5] = String.format("%d",inpatientSelect - 1);

          switch (inpatientSelect) {
              case 1, 2, 3, 4, 5 -> hospitalService();
          }
      }
    public static void hospitalService() {
        String LINE = "|-------------------------------------------------------------------------------------------------------------------|";
        String LINE1 = "-----------------------------------------------------------------------";

        int selectDoctor;
        int choose;

        while (true) {
            System.out.print("Enter the Time you Want to Book with Doctor [Please Select Between 4 o'clock - 22 o'clock] : ");
            int hour;
            hour = input.nextInt();

            System.out.println(LINE);
            System.out.println("|                                                   List Doctor for Booking                                         |");
            System.out.println(LINE);
            System.out.println("| No |        Doctor's Name        |         Specialist           | Available Time | Current Status | Booking Quota |");
            System.out.println(LINE);

            for (int i = 0; i < doctorIntern.length; i++) {
                String status;
                int availableStart = 1;
                int availableUntil = 1;
                availableStart += (i + i + 3);
                availableUntil += (i + i + 7);

                if (hour >= availableStart && hour <= availableUntil && quotaAvailable[i] != 0) {
                    status = "Available";
                } else if (hour >= availableStart && hour <= availableUntil && quotaAvailable[i] == 0){
                    status = "Booking Full";
                } else {
                    status = "Unavailabe";
                }

                System.out.printf("| %-2d | %-27s | %-28s | %-14s | %-14s | %-13s |", (i + 1), doctorIntern[i][0], doctorIntern[i][1], availableStart + ":00 - " + availableUntil + ":00", status, quotaAvailable[i]);
                System.out.println();
            }
            System.out.println(LINE);

            System.out.print("Please Select the Available Doctor (Select From the List between 1 - " + doctorIntern.length +": ");
            selectDoctor = input.nextInt();
            userData[6] = String.format("%d", selectDoctor - 1);
            System.out.print("Press 1 to confirm : ");
            choose = input.nextInt();

            System.out.println("Please Enter Your Patient Data Before Booking: ");
            identityPatient();
            for (int i = 1; i < quotaAvailable.length; i++) {
                quotaAvailable[i] = 2;
                if (choose == 1 ) {
                    quotaAvailable[i] = quotaAvailable[selectDoctor - 1]--;
                }

                System.out.println(LINE1);
                System.out.println("-----------------------Patient Details-----------------------");
                System.out.println("Patient Booking Number\t: " + userData[0]);
                System.out.println("Name\t\t\t\t\t: " + userData[1]);
                System.out.println("Place of Birth\t\t\t: " + userData[2]);
                System.out.println("Age\t\t\t\t\t\t: " + userData[3]);
                System.out.println("Nationality\t\t\t\t: " + userData[4]);
                System.out.println("Polyclinic Selected\t\t: " + hospitalization[Integer.parseInt(userData[5])]);
                System.out.println("Doctor Selected\t\t\t: " + doctorIntern[Integer.parseInt(userData[6])][0]);
                System.out.println(LINE1);

                System.out.print("Do You Want another Booking? [Y/N] : ");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    hospitalService();
                } else if (answer.equalsIgnoreCase("n")) {
                    System.out.print("Please Enter Key to Exit...");
                    input.nextLine( );
                    exit();
                    break;
                }
            } break;
        }
    }

    private static void exit(){
        System.out.println("-----------------------------------------");
        System.out.println("Thank You for Your Choosing This Hospital");
        System.out.println("-----------Have a nice day---------------");
    }
    public static void main(String[] args) {
        System.out.println("|==================================*****==================================|");
        System.out.println("|-------------------- WELCOME TO ENTERPRISE HOSPITAL ---------------------|");
        System.out.println("|=========================================================================|");

        System.out.println("\n|---------------------- Select the Option Below ----------------------|");
        System.out.println("|---------------------------------------------------------------------|");

        int select;
        System.out.println("------------Menu Home------------");
        String [] menuHome = {
                "Patient Registration",
                "Medical Care",
                "Exit Menu",
        };

        for (int num = 0; num < menuHome.length; num++) {
            System.out.println(num + 1 + ". |" + menuHome[num]);
        }

        System.out.print("Select 1/2/3: ");
        select = input.nextInt();

        switch (select) {
            case 1 : identityRegistration();
                break;
            case 2 : medicalMenu();
                break;
            case 3 : exit();
                break;
        }
    }
}
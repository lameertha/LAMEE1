package javaprogram;

import java.util.Scanner;

/**
 * Created by User on 10/03/2017.
 */
public class UnderGroundStation
{
    public static void main(String[] args)
    {
        String station[] = ("Aldgate,Angle,Baker Street,Bank,Barbican,bayswater,blackfriars,bond street," +
                "Borough,cannon street,chancery lane,charing cross,covent garden,earl's court," +
                "Edgware road,elephant & castle,embankment,euston,euston square," +
                "Farringdon,gloucester road,Goodgs street,Great portland street,green park").split(",");

//        String[] bakerlooline = {"Baker Street","Charing Cross","Edgware Road","Elephant & Castle","Embankment"};
//        String[] circleline = {"Aldgate","Baker Street","Barbican","Bayswater","Blackfriars","Cannon Street","Edgware Road","Embankment","Euston Square","Farringdon","Gloucester Roud"};
//        String[] districtline ={"Bayswater","Blackfriars","Cannon Street","Earl's Court","Edgware Road","Embankment","Gloucester Roud"};
//        String[] hammersmithandcityline = {"Baker Street","Barbican","Edgware Road","Euston Square","Farringdon","Great Portland Street"};
//        String[] jubileeline = {"Baker Street","Bond Street","Green Park"};
//        String[] metropolitanline = {"Aldgate","Baker Street","Barbican","Euston Square","Farringdon","Great Portland Street"};
//        String[] northerline = {"Bank","Borough","Charing Cross","Elephant & Castle","Embankment","Euston","Goodgs Street"};
//        String[] piccadillyline = {"Covent Garden","Earl's Court","Gloucester Road","Green Park"};
//        String[] victorialine = {"Euston","Green Park"};
//        String[] centralline ={"Bank","Bond Street","Chancery lane"};
//        String[] waterlooandcityline = {"Bank",};

        String[][] alllines = new String[12][30];

        alllines[0][0] = "Bakerloo Line";
        alllines[0][1] = "Baker Street";
        alllines[0][2] = "Charing Cross";
        alllines[0][3] = "Edgware Road";
        alllines[0][4] = "Elephant & Castle";
        alllines[0][5] = "Embankment";

        alllines[1][0] = "Circle Line";
        alllines[1][1] = "Aldgate";
        alllines[1][2] = "Baker Street";
        alllines[1][3] = "Barbican";
        alllines[1][4] = "Bayswater";
        alllines[1][5] = "Blackfriars";
        alllines[1][6] = "Cannon Street";
        alllines[1][7] = "Edgware Road";
        alllines[1][8] = "Embankment";
        alllines[1][9] = "Euston Square";
        alllines[1][10] = "Farringdon";
        alllines[1][11] = "Gloucester Road";

        alllines[2][0] = "District Line";
        alllines[2][1] = "Bayswater";
        alllines[2][2] = "Blackfriars";
        alllines[2][3] = "Cannon Street";
        alllines[2][4] = "Earl's Court";
        alllines[2][5] = "Edgware Road";
        alllines[2][6] = "Embankment";
        alllines[2][7] = "Gloucester Road";

        alllines[3][0] = "Hammersmith & JavaPractice.City Line";
        alllines[3][1] = "Baker Street";
        alllines[3][2] = "Barbican";
        alllines[3][3] = "Edgware Road";
        alllines[3][4] = "Euston Square";
        alllines[3][5] = "Farringdon";
        alllines[3][6] = "Great Portland Street";

        alllines[4][0] = "Jubilee Line";
        alllines[4][1] = "Baker Street";
        alllines[4][2] = "Bond Street";
        alllines[4][3] = "Green Park";

        alllines[5][0] = "Metropolitan Line";
        alllines[5][1] = "Aldgate";
        alllines[5][2] = "Baker Street";
        alllines[5][3] = "Barbican";
        alllines[5][4] = "Euston Square";
        alllines[5][5] = "Farringdon";
        alllines[5][6] = "Great Portland Street";

        alllines[6][0] = "Northern Line";
        alllines[6][1] = "Angle";
        alllines[6][2] = "Bank";
        alllines[6][3] = "Borough";
        alllines[6][4] = "Charing Cross";
        alllines[6][5] = "Elephant & Castle";
        alllines[6][6] = "Embankment";
        alllines[6][7] = "Euston";
        alllines[6][8] = "Goodgs Street";

        alllines[7][0] = "Piccadilly Line";
        alllines[7][1] = "Covent Garden";
        alllines[7][2] = "Earl's Court";
        alllines[7][3] = "Gloucester Road";
        alllines[7][4] = "Green Park";

        alllines[8][0] = "Victoria Line";
        alllines[8][1] = "Euston";
        alllines[8][2] = "Green Park";

        alllines[9][0] = "Central Line";
        alllines[9][1] = "Bank";
        alllines[9][2] = "Bond Street";
        alllines[9][3] = "Chancery Lane";

        alllines[10][0] = "Waterloo & JavaPractice.City Line";
        alllines[10][1] = "Bank";

        Scanner sc = new Scanner(System.in);
        String b;
        do
        {
            System.out.println("Enter station Name Between A to G :");
            String str = sc.nextLine();
            String c="";
            for (int i = 0; i < station.length; i++)
            {
                if (str.equalsIgnoreCase(station[i]))
                {
                    c = station[i];
                }
            }
            if (str.equalsIgnoreCase(c))
            {
                System.out.println(str + " station is in Zone 1 ");
                System.out.println("\nThe lines passing through at "+ str+" Station are :");
                System.out.println("___________________________________________________");
                for (int k = 0; k < alllines.length; k++)
                {
                    for (int j = 1; j < alllines.length; j++)
                    {
                        String a = alllines[k][j];
                        if (str.equalsIgnoreCase(a))
                        {
                           System.out.println(alllines[k][0]);
                        }
                    }
                }
            }else
                {
                    System.out.println(str+" station is not in zone 1 or your station name is wrong");
                }
            System.out.println("\nDo you want to try again then please press Y");
            b = sc.nextLine().toLowerCase();
        }while(b.equals("y"));
    }
}



package javaprogram;

import java.util.Arrays;
import java.util.Scanner;


public class Tubelines
{
    public static void main(String[] args) {
        String[] zone1station = { "Aldgate East","Aldgate", "Angel", "Baker Street", "Bank", "Barbican", "Bayswater", "Blackfriars", "Blackfriars",
                "Bond Street", "Borough", "Cannon Street", "Cannon Street", "Chancery Lane", "Charing Cross", "Charing Cross",
                "JavaPractice.City Thameslink", "Covent Garden", "Earl's Court", "Edgware Road", "Elephant & Castle", "Elephant & Castle",
                "Embankment", "Euston", "Euston", "Euston Square", "Farringdon", "Fenchurch Street", "Gloucester Road", "Goodge Street",
                "Great Portland Street", "Green Park", "High Street Kensington", "Holborn", "Hoxton", "Hyde Park Corner", "King's Cross",
                "King's Cross St. Pancras", "Knightsbridge", "Lambeth North", "Lancaster Gate", "Leicester Square", "Liverpool Street",
                "London Bridge", "Mansion House", "Marble Arch", "Marylebone", "Monument", "Moorgate", "Notting Hill Gate", "Old Street",
                "Oxford Circus", "Paddington", "Piccadilly Circus", "Pimlico", "Queensway", "Regent's Park", "Russell Square",
                "Shoreditch High Street", "Sloane Square", "South Kensington", "Southwark", "St. James's Park", "St Pancras", "St. Paul's",
                "Temple", "Tottenham Court Road", "Tower Gateway", "Tower Hill", "Vauxhall", "Victoria", "Warren Street", "Waterloo East",
                "Waterloo", "Westminster"};


        String[] bakerlooline = {"Paddington", "Edgware Road", "Marylebone", "Baker Street", "Regent's Park", "Oxford Circus", "Piccadilly Circus", "Charing Cross", "Embankment", "Waterloo", "Lambeth North", "Elephant & Castle"};
        String[] circleline = {"Edgware Road", "Bayswater", "Notting Hill Gate", "Liverpool Street", "High Street Kensington", "South Kensington", "Gloucester Road", "Sloane Square", "Victoria", "Westminster", "St James's Park", "Embankment", "Blackfriars", "Temple", "Cannon Street", "Mansion House", "Aldgate", "Monument", "Tower Hill", "Barbican", "Farringdon", "Moorgate", "Euston Square", "King's Cross St Pancras", "Great Portland Street", "Baker Street", "Paddington LU"};
        String[] districtline = {"Edgware Road", "Bayswater", "Notting Hill Gate", "Aldgate East", "Earl's Court", "High Street Kensington", "South Kensington", "Gloucester Road", "Sloane Square", "Victoria", "Westminster", "St James's Park", "Embankment", "Blackfriars", "Temple", "Cannon Street", "Mansion House", "Paddington LU", "Monument", "Tower Hill"};
        String[] hammersmithandcityline = {"Paddington", "Edgware Road", "Baker Street", "Great Portland Street", "King's Cross St Pancras", "Euston Square", "Moorgate", "Farringdon", "Barbican", "Liverpool Street", "Aldgate East"};
        String[] jubileeline = {"Baker Street", "Bond Street", "Green Park", "Westminster", "Waterloo", "Southwark", "London Bridge"};
        String[] metropolitanline = {"Aldgate", "Moorgate", "Liverpool Street", "Barbican", "Farringdon", "King's Cross St Pancras", "Euston Square", "Great Portland Street", "Baker Street"};
        String[] northernline = {"Euston", "King's Cross St Pancras", "Angel", "Old Street", "Moorgate", "Bank", "London Bridge", "Borough", "Elephant & Castle", "Waterloo", "Embankment", "Charing Cross", "Leicester Square", "Tottenham Court Road", "Goodge Street", "Warren Street"};
        String[] piccadilyline = {"Earl's Court", "Gloucester Road", "South Kensington", "Knightsbridge", "Leicester Square", "HydePark Corner", "Green Park", "Piccadily Circus", "Covent Garden", "Holborn", "Russell Square", "King's Cross St Pancras"};
        String[] victorialine = {"Vauxhall", "Pimlico", "Victoria", "Green Park", "Oxford Circus", "Warren Street", "Euston", "King's Cross St Pancras"};
        String[] centralline = {"Bank", "Queensway", "Liverpool Street", "Notting Hill Gate", "Lancaster Gate", "Marble Arch", "Bond Street", "Oxford Street", "Tottenham Court Road", "Holborn", "Chancery Lane", "St. Paul's"};
        String[] londonoverground = {"Liverpool Street", "Euston", "Hoxton", "Shoreditch High Street"};
        String[] dlr = {"TowerGateWay", "Bank"};
        String[] tflrail = {"Liverpool Street"};


        String[][] alllines = new String[27][30];
        alllines[0][0] = "Bakerloo Line";
        alllines[0][1] = "Paddington";
        alllines[0][2] = "Edgware Road";
        alllines[0][3] = "Marylebone";
        alllines[0][4] = "Baker Street";
        alllines[0][5] = "Regent's Park";
        alllines[0][6] = "Oxford Circus";
        alllines[0][7] = "Piccadilly Circus";
        alllines[0][8] = "Charing Cross";
        alllines[0][9] = "Embankment";
        alllines[0][10] = "Waterloo";
        alllines[0][11] = "Lambeth North";
        alllines[0][12] = "Elephant & Castle";

        alllines[1][0] = "Cirlce Line";
        alllines[1][1] = "Edgware Road";
        alllines[1][2] = "Bayswater";
        alllines[1][3] = "Notting Hill Gate";
        alllines[1][4] = "Liverpool Street";
        alllines[1][5] = "High Street Kensington";
        alllines[1][6] = "South Kensington";
        alllines[1][7] = "Gloucester Road";
        alllines[1][8] = "Sloane Square";
        alllines[1][9] = "Victoria";
        alllines[1][10] = "Westminster";
        alllines[1][11] = "St James's Park";
        alllines[1][12] = "Embankment";
        alllines[1][13] = "Blackfriars";
        alllines[1][14] = "Temple";
        alllines[1][15] = "Cannon Street";
        alllines[1][16] = "Mansion House";
        alllines[1][17] = "Aldgate";
        alllines[1][18] = "Monument";
        alllines[1][19] = "Tower Hill";
        alllines[1][20] = "Barbican";
        alllines[1][21] = "Farringdon";
        alllines[1][22] = "Moorgate";
        alllines[1][23] = "Euston Square";
        alllines[1][24] = "King's Cross St Pancras";
        alllines[1][25] = "Great Portland Street";
        alllines[1][26] = "Baker Street";
        alllines[1][27] = "Paddington";


        alllines[2][0] = "District Line";
        alllines[2][1] = "Edgware Road";
        alllines[2][2] = "Bayswater";
        alllines[2][3] = "Notting Hill Gate";
        alllines[2][4] = "Aldgate East";
        alllines[2][5] = "Earl's Court";
        alllines[2][6] = "High Street Kensington";
        alllines[2][7] = "South Kensington";
        alllines[2][8] = "Gloucester Road";
        alllines[2][9] = "Sloane Square";
        alllines[2][10] = "Victoria";
        alllines[2][11] = "Westminster";
        alllines[2][12] = "St James's Park";
        alllines[2][13] = "Embankment";
        alllines[2][14] = "Blackfriars";
        alllines[2][15] = "Temple";
        alllines[2][16] = "Cannon Street";
        alllines[2][17] = "Mansion House";
        alllines[2][18] = "Paddington";
        alllines[2][19] = "Monument";
        alllines[2][20] = "Tower Hill";


        alllines[3][0] = "Hammersmith and JavaPractice.City Line";
        alllines[3][1] = "Paddington";
        alllines[3][2] = "Edgware Road";
        alllines[3][3] = "Baker Street";
        alllines[3][4] = "Great Portland Street";
        alllines[3][5] = "King's Cross St Pancras";
        alllines[3][6] = "Euston Square";
        alllines[3][7] = "Moorgate";
        alllines[3][8] = "Farringdon";
        alllines[3][9] = "Barbican";
        alllines[3][10] = "Liverpool Street";
        alllines[3][11] = "Aldgate East";

        alllines[4][0] = "Northern Line";
        alllines[4][1] = "Euston";
        alllines[4][2] = "King's Cross St Pancras";
        alllines[4][3] = "Angel";
        alllines[4][4] = "Moorgate";
        alllines[4][5] = "Old Street";
        alllines[4][6] = "Bank";
        alllines[4][7] = "London Bridge";
        alllines[4][8] = "Borough";
        alllines[4][9] = "Elephant & Castle";
        alllines[4][10] = "Waterloo";
        alllines[4][11] = "Embankment";
        alllines[4][12] = "Charing Cross";
        alllines[4][13] = "Leicester Square";
        alllines[4][14] = "Tottenham Court Road";
        alllines[4][15] = "Goodge Street";
        alllines[4][16] = "Warren Street";

        alllines[5][0] = "Jubilee Line";
        alllines[5][1] = "Baker Street";
        alllines[5][2] = "Bond Street";
        alllines[5][3] = "Green Park";
        alllines[5][4] = "Westminster";
        alllines[5][5] = "Waterloo";
        alllines[5][6] = "Southwark";
        alllines[5][7] = "London Bridge";

        alllines[6][0] = "Central Line";
        alllines[6][1] = "Bank";
        alllines[6][2] = "Queensway";
        alllines[6][3] = "Liverpool Street";
        alllines[6][4] = "Notting Hill Gate";
        alllines[6][5] = "Lancaster Gate";
        alllines[6][6] = "Marble Arch";
        alllines[6][7] = "Bond Street";
        alllines[6][8] = "Oxford Street";
        alllines[6][9] = "Tottenham Court Road";
        alllines[6][10] = "Holborn";
        alllines[6][11] = "Chancery Lane";
        alllines[6][12] = "St. Paul's";


        alllines[7][0] = "Piccadily Line";
        alllines[7][1] = "Earl's Court";
        alllines[7][2] = "Gloucester Road";
        alllines[7][3] = "South Kensington";
        alllines[7][4] = "Knightsbridge";
        alllines[7][5] = "Leicester Square";
        alllines[7][6] = "HydePark Corner";
        alllines[7][7] = "Green Park";
        alllines[7][8] = "Piccadily Circus";
        alllines[7][9] = "Covent Garden";
        alllines[7][10] = "Holborn";
        alllines[7][11] = "Russell Square";
        alllines[7][12] = "King's Cross St Pancras";

        alllines[8][0] = "Victoria Line";
        alllines[8][1] = "Vauxhall";
        alllines[8][1] = "Pimlico";
        alllines[8][3] = "Victoria";
        alllines[8][4] = "Green Park";
        alllines[8][5] = "Oxford Circus";
        alllines[8][6] = "Warren Street";
        alllines[8][7] = "Euston";
        alllines[8][8] = "King's Cross St Pancras";

        alllines[9][0] = "Waterloo And JavaPractice.City Line";
        alllines[9][1] = "Waterloo";
        alllines[9][2] = "Bank";

        alllines[10][0] = "London OverGround";
        alllines[10][1] = "Liverpool Street";
        alllines[10][2] = "Euston";
        alllines[10][3] = "Hoxton";
        alllines[10][4] = "Shoreditch High Street";

        alllines[11][0] = "TFL Rail Service";
        alllines[11][1] = "Liverpool Street";

        alllines[12][0] = "DLR";
        alllines[12][1] = "TowerGateWay";
        alllines[12][2] = "Bank";


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter station name:-");
        String name = scan.nextLine();

        while (true)
        {
               if (Arrays.asList(zone1station).contains(name))
                {
                    System.out.println(name + " station is coming in TFL Fare Zone 1");
                    System.out.println("The following Lines are coming to " + name + " station :-");
                    System.out.println("----------------------------------------------------------");
                    for (int i = 0; i < alllines.length; i++)
                        {
                            for (int j = 0; j < alllines.length; j++)
                                {
                                    if (name.equalsIgnoreCase(alllines[i][j]))
                                        {
                                            System.out.println("*  " + alllines[i][0]);
                                        }
                                }
                        }
                    return;
                }
            else
                {
                    System.out.println(name + " is not coming in TFL Fare Zone 1");
                    System.out.println("Please enter Valid station name:-");
                    name = scan.nextLine();
                }
        }
    }
}


/*
 * Name: Komal Vachhani
 * ID: 777905
 * July 24 2019
 * Purpose: To create a program that allows a user to purchase instrument(s) or item(s) from Clout's Music Store
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class MusicStore {
    Scanner sc = new Scanner (System.in);
    Scanner scr = new Scanner (System.in);
    DecimalFormat obj = new DecimalFormat ("$#,###.00");
    
    //Declare a variable so they can be used
    //Declared variable to show cost of each instrument/book
    double costviolin = 407.02;
    double costpiano = 5087.00;
    double costviola = 499.00;
    double costcello = 1045.00;
    double costdoublebass = 4000.00;
    double costguitar = 340.00;
    double costclarinet = 315.00;
    double costflute = 223.70;
    double costrecorder = 15.00;
    double costaltosax = 450.00;
    double costtenorsax = 700.00;
    double costtrombone = 2000.00;
    double costtrumpet = 1000.00;
    double costtuba = 4597.03;
    double costdrumset = 2500.00;
    double costxylophone = 149.99;
    double costmethodbook = 14.93;
    
    //Declared variables to calculate how many of each instrument/book user buys
    int violin;
    int piano;
    int viola;
    int cello;
    int doublebass;
    int clarinet;
    int guitar;
    int flute;
    int recorder;
    int altosax;
    int tenorsax;
    int trombone;
    int trumpet;
    int tuba;
    int drumset;
    int xylophone;
    int methodbook;
    
    //Declared variables to calculate final number of each instrument/book
    int numviolin = 0;
    int numpiano= 0;
    int numviola= 0;
    int numcello = 0;
    int numdoublebass = 0;
    int numguitar = 0;
    int numclarinet = 0;
    int numflute = 0;
    int numrecorder = 0;
    int numaltosax = 0;
    int numtenorsax = 0;
    int numtrombone = 0;
    int numtrumpet = 0;
    int numtuba = 0;
    int numdrumset = 0;
    int numxylophone = 0;
    int nummethodbook = 0;
    
    //Declared variable for total cost of each instrument/book
    double totalviolincost;
    double totalpianocost;
    double totalviolacost;
    double totalcellocost;
    double totaldoublebasscost;
    double totalguitarcost;
    double totalclarinetcost;
    double totalflutecost;
    double totalrecordercost;
    double totalaltosaxcost;
    double totaltenorsaxcost;
    double totaltrombonecost;
    double totaltrumpetcost;
    double totaltubacost;
    double totaldrumsetcost;
    double totalxylophonecost;
    double totalmethodbookcost;
    
    //Declared variables regarding user to make a choice or type in a string
    String name;
    String percentoff;
    String percentoffcode = "MUSICROCKS";
    String emailaddress;
    int option;
    int option2;
    int option4;
    int paymentmethod;
    int cardnumber;
    int pin;
    int bookchoice;
    char member;
    char order;
    char donation;
    char email;
    char continues;
    
    //Declared variables regarding final bill
    double cost;
    double costbeforetax;
    double tax;
    double donations;
    double finalfee;
    double newpricewithcode;
    double tendered;
    double stillpay;
    double change;
    
    //Scanner questions for adding different instrument families/method books
    int stringsadd;
    int brassadd;
    int woodwindsadd;
    int keyboardadd;
    int percussionadd;
    
    // Scanner questions for removing different instrument families/method books
    int stringsremove;
    int brassremove;
    int woodwindsremove;
    int keyboardremove;
    int percussionremove;
        
    //Miscellaneous declared variables
    int MINIMUM_INSTRUMENTS = 0;
    int MINIMUM_DONATIONS = 0;
    double taxes = 0.13;

    //Constructor
    public static void main (String [] args) {
        new MusicStore();
    }
    
    //Where all the methods are stored
    public MusicStore() {
        title();
        name();
        option();
        titlebeforebill();
        bill();
        closing();
    }
    
    //Method for printing title
    public static void title() {
        //Display title user sees when opening the program
        System.out.println("   _____ _             _   _       __  __           _         _____ _                 \n" +
"  / ____| |           | | ( )     |  \\/  |         (_)       / ____| |                \n" +
" | |    | | ___  _   _| |_|/ ___  | \\  / |_   _ ___ _  ___  | (___ | |_ ___  _ __ ___ \n" +
" | |    | |/ _ \\| | | | __| / __| | |\\/| | | | / __| |/ __|  \\___ \\| __/ _ \\| '__/ _ \\\n" +
" | |____| | (_) | |_| | |_  \\__ \\ | |  | | |_| \\__ \\ | (__   ____) | || (_) | | |  __/\n" +
"  \\_____|_|\\___/ \\__,_|\\__| |___/ |_|  |_|\\__,_|___/_|\\___| |_____/ \\__\\___/|_|  \\___|\n" +
"                                                                                      \n" +
"                                                                                      ");
    }
    
    //Method for asking user's name
    public void name() {
        //Asks user for name 
        System.out.println("Enter your name: ");
        name = sc.nextLine();
    }

    //Method for giving user the option to purchase
    public void option() {
        do {
        do {
        //Allows user to add or remove instruments/books from cart
    	System.out.println("\nWould you like to add or remove instruments/books?");
    	System.out.println("Type in 'A' to add");
        System.out.println("Type in 'R' to remove");
    	System.out.println("Type in 'N' for no");
    	order=sc.next().charAt(0);
        
    	System.out.println("Which instrument family/method books are you interested in purchasing?");

        // Shows available options in store to add instruments
        if (order == 'a' || order == 'A') {
    	System.out.println("Here are the options we offer: ");
    	System.out.println("1. Strings \n2. Brass \n3. Woodwinds \n4. Keyboards \n5. Percussion \n6. Method Books");
    	option2 = sc.nextInt();
    	
    	// Directs user to the information they need based on their choice above
        switch (option2) {
    	case 1: stringsadd();
    		break;
    	case 2: brassadd();
    		break;
    	case 3: woodwindsadd();
    		break;
    	case 4: keyboardadd();
    		break;
    	case 5: percussionadd();
    		break;
    	case 6: methodbookadd();
                break;
    	default:
    		System.out.println("Invalid Entry.. Please enter a number from 1-6");
    		option2 = sc.nextInt();
    	}
        }
        
        //Allows user to remove items from the cart
        else if (order == 'r' || order == 'R') {
        System.out.println("Here are the options to remove: ");
    	System.out.println("1. Strings \n2. Brass \n3. Woodwinds \n4. Keyboards \n5. Percussion \n6. Method Books");
    	option4 = sc.nextInt();
            
            switch (option4) { 
    	case 1: stringsremove();
    		break;
    	case 2: brassremove();
    		break;
    	case 3: woodwindsremove();
    		break;
    	case 4: keyboardremove();
    		break;
    	case 5: percussionremove();
    		break;
    	case 6: methodbookremove();
                break;
    	default:
    		System.out.println("Invalid Entry.. Please enter a number from 1-6");
    		option4 = sc.nextInt();
    	}
        }
        }
        //Loops until user does not want to add or remove from cart
        while (order=='A'|| order=='a'||order=='r'||order=='R');
        
        //Prevents user from getting less than what they purchased
        if (numviolin<MINIMUM_INSTRUMENTS||numpiano<MINIMUM_INSTRUMENTS||numviola<MINIMUM_INSTRUMENTS||numcello<MINIMUM_INSTRUMENTS||numdoublebass<MINIMUM_INSTRUMENTS||numguitar<MINIMUM_INSTRUMENTS||numclarinet<MINIMUM_INSTRUMENTS||numflute<MINIMUM_INSTRUMENTS||numaltosax<MINIMUM_INSTRUMENTS||numtenorsax<MINIMUM_INSTRUMENTS||numtrombone<MINIMUM_INSTRUMENTS||numtrumpet<MINIMUM_INSTRUMENTS||numtuba<MINIMUM_INSTRUMENTS||numdrumset<MINIMUM_INSTRUMENTS||numxylophone<MINIMUM_INSTRUMENTS||nummethodbook<MINIMUM_INSTRUMENTS) {
            System.out.println("\n\nInvalid reponse. Negative number of instruments purchased.");
        }
        }
        while (numviolin<MINIMUM_INSTRUMENTS||numpiano<MINIMUM_INSTRUMENTS||numviola<MINIMUM_INSTRUMENTS||numcello<MINIMUM_INSTRUMENTS||numdoublebass<MINIMUM_INSTRUMENTS||numguitar<MINIMUM_INSTRUMENTS||numclarinet<MINIMUM_INSTRUMENTS||numflute<MINIMUM_INSTRUMENTS||numaltosax<MINIMUM_INSTRUMENTS||numtenorsax<MINIMUM_INSTRUMENTS||numtrombone<MINIMUM_INSTRUMENTS||numtrumpet<MINIMUM_INSTRUMENTS||numtuba<MINIMUM_INSTRUMENTS||numdrumset<MINIMUM_INSTRUMENTS||numxylophone<MINIMUM_INSTRUMENTS||nummethodbook<MINIMUM_INSTRUMENTS);
    }
    
    //Method to choose to add string instruments
    public void stringsadd() {
    	
    	System.out.println("Which strings instrument would you like? \n1. Violin \n2. Viola \n3. Cello \n4. Double Bass \n5. Guitar");
    	stringsadd = sc.nextInt();
    	
    	switch (stringsadd) {
    	case 1: violinadd();
    		break;
    	case 2: violaadd();
    		break;
    	case 3: celloadd();
    		break;
    	case 4: doublebassadd();
    		break;
    	case 5: guitaradd();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number from 1-5.");
    		stringsadd = sc.nextInt();
    	}
    }
    
    //Method to choose to add brass instruments
    public void brassadd() {
    	
    	System.out.println("Which brass instrument would you like? \n1. Alto Saxophone \n2. Tenor Saxophone \n3. Tuba \n4. Trombone \n5. Trumpet");
    	brassadd = sc.nextInt();
    	
    	switch (brassadd) {
    	case 1: altosaxadd();
    		break;
    	case 2: tenorsaxadd();
    		break;
    	case 3: tubaadd();
    		break;
    	case 4: tromboneadd();
    		break;
    	case 5: trumpetadd();
    		break;
    	default:
    		System.out.println("Invalid Entry... Enter a number from 1-5.");
    		brassadd = sc.nextInt();
    	}
    }
    
    //Method to choose to add woodwind instruments 
    public void woodwindsadd() {
    	
    	System.out.println("Which woodwind instrument would you like? \n1. Clarinet \n2. Flute \n3. Recorder");
    	woodwindsadd = sc.nextInt();
    	
    	switch (woodwindsadd) {
    	case 1: clarinetadd();
    		break;
    	case 2: fluteadd();
    		break;
    	case 3: recorderadd();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number from 1-2.");
    		woodwindsadd = sc.nextInt();
    	}
    }
    
    //Method to choose to add keyboard instruments
    public void keyboardadd() {
    	
    	System.out.println("Which keyboard instrument would you like? \n1. Piano");
    	keyboardadd = sc.nextInt();
    	
    	switch (keyboardadd) {
    	case 1: pianoadd();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number 1.");
    		keyboardadd = sc.nextInt();
    	}
    }
    
    //Method to choose to add percussion instruments
    public void percussionadd() {
    	
    	System.out.println("Which percussion instrument would you like? \n1. Drumset \n2. Xylophone");
    	percussionadd = sc.nextInt();
    	
    	switch (percussionadd) {
    	case 1: drumsetadd();
    		break;
    	case 2: xylophoneadd();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number from 1-2.");
    		percussionadd = sc.nextInt();
    	}
    }
    //Method to choose to remove string instruments
    public void stringsremove() {
    	
    	System.out.println("Which strings instrument would you like? \n1. Violin \n2. Viola \n3. Cello \n4. Double Bass \n5. Guitar");
    	stringsremove = sc.nextInt();
    	
    	switch (stringsremove) {
    	case 1: violinremove();
    		break;
    	case 2: violaremove();
    		break;
    	case 3: celloremove();
    		break;
    	case 4: doublebassremove();
    		break;
    	case 5: guitarremove();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number from 1-5.");
    		stringsremove = sc.nextInt();
    	}
    }
    
    //Method to choose to remove brass instruments
    public void brassremove() {
    	
    	System.out.println("Which brass instrument would you like? \n1. Alto Saxophone \n2. Tenor Saxophone \n3. Tuba \n4. Trombone \n5. Trumpet");
    	brassremove = sc.nextInt();
    	
    	switch (brassremove) {
    	case 1: altosaxremove();
    		break;
    	case 2: tenorsaxremove();
    		break;
    	case 3: tubaremove();
    		break;
    	case 4: tromboneremove();
    		break;
    	case 5: trumpetremove();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number from 1-5.");
    		brassremove = sc.nextInt();
    	}
    }
    
    //Method to choose to remove woodwind instruments    
    public void woodwindsremove() {
    	
    	System.out.println("Which woodwind instrument would you like? \n1. Clarinet \n2. Flute \n3. Recorder");
    	woodwindsremove = sc.nextInt();
    	
    	switch (woodwindsremove) {
    	case 1: clarinetremove();
    		break;
    	case 2: fluteremove();
    		break;
    	case 3: recorderremove();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number from 1-2.");
    		woodwindsremove = sc.nextInt();
    	}
    }
    
    //Method to choose to remove keyboard instruments
    public void keyboardremove() {
    	
    	System.out.println("Which keyboard instrument would you like? \n1. Piano");
    	keyboardremove = sc.nextInt();
    	
    	switch (keyboardremove) {
    	case 1: pianoremove();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number 1.");
    		keyboardremove = sc.nextInt();
    	}
    }
    
    //Method to choose to remove percussion instruments
    public void percussionremove() {
    	
    	System.out.println("Which percussion instrument would you like? \n1. Drumset \n2. Xylophone");
    	percussionremove = sc.nextInt();
    	
    	switch (percussionremove) {
    	case 1: drumsetremove();
    		break;
    	case 2: xylophoneremove();
    		break;
    	default:
    		System.out.println("Invalid Entry.. Enter a number from 1-2.");
    		percussionremove = sc.nextInt();
    	}
    }
    
    //Method used if user wants to purchase a violin
    public void violinadd() {
        System.out.println("\nThe cost of a violin is "+obj.format(costviolin));
        System.out.println("Please enter how many violins you want.");
        violin = sc.nextInt();
        numviolin+=violin;
        totalviolincost = costviolin*numviolin;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of violins bought: "+numviolin);
        System.out.println("The total cost of all the violins is: "+obj.format(totalviolincost));
    }
    
    //Method used if user wants to purchase a piano
    public void pianoadd() {
        System.out.println("\nThe cost of a piano is "+obj.format(costpiano));
        System.out.println("Please enter how many pianos you want.");
        piano = sc.nextInt();
        numpiano+=piano;
        totalpianocost = costpiano*numpiano; 
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of pianos bought: "+numpiano);
        System.out.println("The total cost of all the pianos is: "+obj.format(totalpianocost));
    }
    
    //Method used if user wants to purchase a viola
    public void violaadd() {
        System.out.println("\nThe cost of a viola is "+obj.format(costviola));
        System.out.println("Please enter how many violas you want.");
        viola = sc.nextInt();
        numviola+=viola;
        totalviolacost = costviola*numviola;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of violas bought: "+numviola);
        System.out.println("The total cost of all the violas is: "+obj.format(totalviolacost));
    }
    
    //Method used if user wants to purchase a cello
    public void celloadd() {
        System.out.println("\nThe cost of a cello is "+obj.format(costcello));
        System.out.println("Please enter how many cellos you want.");
        cello = sc.nextInt();
        numcello+=cello;
        totalcellocost = costcello*numcello;  
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of cellos bought: "+numcello);
        System.out.println("The total cost of all the cellos is: "+obj.format(totalcellocost));
    }
    
    //Method used if user wants to purchase a double bass
    public void doublebassadd() {
        System.out.println("\nThe cost of a double bass is "+obj.format(costdoublebass));
        System.out.println("Please enter how many double basses you want.");
        doublebass = sc.nextInt();
        numdoublebass+=doublebass;
        totaldoublebasscost = costcello*numdoublebass; 
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of double basses bought: "+numdoublebass);
        System.out.println("The total cost of all the double basses is: "+obj.format(totaldoublebasscost));
    }
    
    //Method used if user wants to purchase a guitar
    public void guitaradd() {
        System.out.println("\nThe cost of an acoustic guitar is "+obj.format(costguitar));
        System.out.println("Please enter how many acoustic guitars you want.");
        guitar = sc.nextInt();
        numguitar+=guitar;
        totalguitarcost = costguitar*numguitar;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of acoustic guitars bought: "+numguitar);
        System.out.println("The total cost of all the acoustic guitars is: "+obj.format(totalguitarcost));
    }
    
    //Method used if user wants to purchase a clarinet
    public void clarinetadd() {
        System.out.println("\nThe cost of a clarinet is "+obj.format(costclarinet));
        System.out.println("Please enter how many clarinets you want.");
        clarinet = sc.nextInt();
        numclarinet+=clarinet;
        totalclarinetcost = costclarinet*numclarinet;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of clarinets bought: "+numclarinet);
        System.out.println("The total cost of all the clarinets is: "+obj.format(totalclarinetcost));
    }
    
    //Method used if user wants to purchase a flute
    public void fluteadd() {
    	System.out.println("\nThe cost of a flute is "+obj.format(costflute));
        System.out.println("Please enter how many flutes you want.");
        flute = sc.nextInt();
        numflute+=flute;
        totalflutecost = costflute*numflute;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of flutes bought: "+numflute);
        System.out.println("The total cost of all the flutes is: "+obj.format(totalflutecost));
    }
    
    //Method used if user wants to purchase a recorder
    public void recorderadd() {
    	System.out.println("\nThe cost of a recorder is "+obj.format(costrecorder));
        System.out.println("Please enter how many recorders you want.");
        recorder = sc.nextInt();
        numrecorder+=recorder;
        totalrecordercost = costrecorder*numrecorder;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of recorders bought: "+numrecorder);
        System.out.println("The total cost of all the recorders is: "+obj.format(totalrecordercost));
    }
    
    //Method used if user wants to purchase a alto saxophone
    public void altosaxadd() {
        System.out.println("\nThe cost of an alto saxophone is "+obj.format(costaltosax));
        System.out.println("Please enter how many alto saxophones you want.");
        altosax = sc.nextInt();
        numaltosax+=altosax;
        totalaltosaxcost = costaltosax*numaltosax;  
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of alto saxophones bought: "+numaltosax);
        System.out.println("The total cost of all the alto saxophones is: "+obj.format(totalaltosaxcost));
    }
    
    //Method used if user wants to purchase a tenor saxophone
    public void tenorsaxadd() {
        System.out.println("\nThe cost of an tenor saxophone is "+obj.format(costtenorsax));
        System.out.println("Please enter how many tenor saxophones you want.");
        tenorsax = sc.nextInt();
        numtenorsax+=tenorsax;
        totaltenorsaxcost = costtenorsax*numtenorsax;  
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of tenor saxophones bought: "+numtenorsax);
        System.out.println("The total cost of all the tenor saxophones is: "+obj.format(totaltenorsaxcost));
    }
    
    //Method used if user wants to purchase a trombone
    public void tromboneadd() {
        System.out.println("\nThe cost of a trombone is "+obj.format(costtrombone));
        System.out.println("Please enter how many trombones you want.");
        trombone = sc.nextInt();
        numtrombone+=trombone;
        //Shows user the cost and number of instruments they bought in that round
        totaltrombonecost = costtrombone*numtrombone;   
        System.out.println("Number of trombones bought: "+numtrombone);
        System.out.println("The total cost of all the trombones is: "+obj.format(totaltrombonecost));
    }
    
    //Method used if user wants to purchase a trumpet
    public void trumpetadd() {
        System.out.println("\nThe cost of a trumpet is "+obj.format(costtrumpet));
        System.out.println("Please enter how many trumpets you want.");
        trumpet = sc.nextInt();
        numtrumpet+=trumpet;
        totaltrumpetcost = costtrumpet*numtrumpet;
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of trumpets bought: "+numtrumpet);
        System.out.println("The total cost of all the trumpets is: "+obj.format(totaltrumpetcost));
    }
    
    //Method used if user wants to purchase a tuba
    public void tubaadd() {
    	System.out.println("\nThe cost of a tuba is "+obj.format(costtuba));
        System.out.println("Please enter how many tubas you want.");
        tuba = sc.nextInt();
        numtuba+=tuba;
        totaltubacost = costtuba*numtuba;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of tubas bought: "+numtuba);
        System.out.println("The total cost of all the tubas is: "+obj.format(totaltubacost));
    }
    
    //Method used if user wants to purchase a drum set
    public void drumsetadd() {
        System.out.println("\nThe cost of a drumset is "+obj.format(costdrumset));
        System.out.println("Please enter how many drumsets you want.");
        drumset = sc.nextInt();
        numdrumset+=drumset;
        totaldrumsetcost = costdrumset*numdrumset;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of drumsets bought: "+numdrumset);
        System.out.println("The total cost of all the drumsets is: "+obj.format(totaldrumsetcost));
    }
    
    //Method used if user wants to purchase a xylophone
    public void xylophoneadd() {
    	System.out.println("\nThe cost of a xylophone is "+obj.format(costxylophone));
        System.out.println("Please enter how many xylophones you want.");
        xylophone = sc.nextInt();
        numxylophone+=xylophone;
        totalxylophonecost = costxylophone*numxylophone;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of xylophones bought: "+numxylophone);
        System.out.println("The total cost of all the xylophones is: "+obj.format(totalxylophonecost));
    }
    
    //Method used if user wants to remove a violin
    public void violinremove() {
        System.out.println("\nThe cost of a violin is "+obj.format(costviolin));
        System.out.println("Please enter how many violins you want to remove.");
        violin = sc.nextInt();
        numviolin-=violin;
        totalviolincost = costviolin*numviolin;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of violins bought: "+numviolin);
        System.out.println("The total cost of all the violins is: "+obj.format(totalviolincost));
    }
    
    //Method used if user wants to remove a piano
    public void pianoremove() {
        System.out.println("\nThe cost of a piano is "+obj.format(costpiano));
        System.out.println("Please enter how many pianos you want to remove.");
        piano = sc.nextInt();
        numpiano-=piano;
        totalpianocost = costpiano*numpiano; 
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of pianos bought: "+numpiano);
        System.out.println("The total cost of all the pianos is: "+obj.format(totalpianocost));
    }
    
    //Method used if user wants to remove a viola
    public void violaremove() {
        System.out.println("\nThe cost of a viola is "+obj.format(costviola));
        System.out.println("Please enter how many violas you want to remove.");
        viola = sc.nextInt();
        numviola-=viola;
        totalviolacost = costviola*numviola;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of violas bought: "+numviola);
        System.out.println("The total cost of all the violas is: "+obj.format(totalviolacost));
    }
    
    //Method used if user wants to remove a cello
    public void celloremove() {
        System.out.println("\nThe cost of a cello is "+obj.format(costcello));
        System.out.println("Please enter how many cellos you want to remove.");
        cello = sc.nextInt();
        numcello-=cello;
        totalcellocost = costcello*numcello;  
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of cellos bought: "+numcello);
        System.out.println("The total cost of all the cellos is: "+obj.format(totalcellocost));
    }
    
    //Method used if user wants to remove a double bass
    public void doublebassremove() {
        System.out.println("\nThe cost of a double bass is "+obj.format(costdoublebass));
        System.out.println("Please enter how many double basses you want to remove.");
        doublebass = sc.nextInt();
        numdoublebass-=doublebass;
        totaldoublebasscost = costcello*numdoublebass; 
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of double basses bought: "+numdoublebass);
        System.out.println("The total cost of all the double basses is: "+obj.format(totaldoublebasscost));
    }
    
    //Method used if user wants to remove a guitar
    public void guitarremove() {
        System.out.println("\nThe cost of an acoustic guitar is "+obj.format(costguitar));
        System.out.println("Please enter how many acoustic guitars you want to remove.");
        guitar = sc.nextInt();
        numguitar-=guitar;
        totalguitarcost = costguitar*numguitar;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of acoustic guitars bought: "+numguitar);
        System.out.println("The total cost of all the acoustic guitars is: "+obj.format(totalguitarcost));
    }
    
    //Method used if user wants to remove a clarinet
    public void clarinetremove() {
        System.out.println("\nThe cost of a clarinet is "+obj.format(costclarinet));
        System.out.println("Please enter how many clarinets you want to remove.");
        clarinet = sc.nextInt();
        numclarinet-=clarinet;
        totalclarinetcost = costclarinet*numclarinet;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of clarinets bought: "+numclarinet);
        System.out.println("The total cost of all the clarinets is: "+obj.format(totalclarinetcost));
    }
    
    //Method used if user wants to remove a flute
    public void fluteremove() {
    	System.out.println("\nThe cost of a flute is "+obj.format(costflute));
        System.out.println("Please enter how many flutes you want to remove.");
        flute = sc.nextInt();
        numflute-=flute;
        totalflutecost = costflute*numflute;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of flutes bought: "+numflute);
        System.out.println("The total cost of all the flutes is: "+obj.format(totalflutecost));
    }
    
    //Method used if user wants to remove a recorder
    public void recorderremove() {
    	System.out.println("\nThe cost of a recorder is "+obj.format(costrecorder));
        System.out.println("Please enter how many recorders you want to remove.");
        recorder = sc.nextInt();
        numrecorder-=recorder;
        totalrecordercost = costrecorder*numrecorder;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of recorders bought: "+numrecorder);
        System.out.println("The total cost of all the recorders is: "+obj.format(totalrecordercost));
    }
    
    //Method used if user wants to remove a alto saxophone
    public void altosaxremove() {
        System.out.println("\nThe cost of an alto saxophone is "+obj.format(costaltosax));
        System.out.println("Please enter how many alto saxophones you want to remove.");
        altosax = sc.nextInt();
        numaltosax-=altosax;
        totalaltosaxcost = costaltosax*numaltosax;  
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of alto saxophones bought: "+numaltosax);
        System.out.println("The total cost of all the alto saxophones is: "+obj.format(totalaltosaxcost));
    }
    
    //Method used if user wants to remove a tenor saxophone
    public void tenorsaxremove() {
        System.out.println("\nThe cost of an tenor saxophone is "+obj.format(costtenorsax));
        System.out.println("Please enter how many tenor saxophones you want to remove.");
        tenorsax = sc.nextInt();
        numtenorsax-=tenorsax;
        totaltenorsaxcost = costtenorsax*numtenorsax;  
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of tenor saxophones bought: "+numtenorsax);
        System.out.println("The total cost of all the tenor saxophones is: "+obj.format(totaltenorsaxcost));
    }
    
    //Method used if user wants to remove a trombone
    public void tromboneremove() {
        System.out.println("\nThe cost of a trombone is "+obj.format(costtrombone));
        System.out.println("Please enter how many trombones you want to remove.");
        trombone = sc.nextInt();
        numtrombone-=trombone;
        //Shows user the cost and number of instruments they bought in that round
        totaltrombonecost = costtrombone*numtrombone;   
        System.out.println("Number of trombones bought: "+numtrombone);
        System.out.println("The total cost of all the trombones is: "+obj.format(totaltrombonecost));
    }
    
    //Method used if user wants to remove a trumpet
    public void trumpetremove() {
        System.out.println("\nThe cost of a trumpet is "+obj.format(costtrumpet));
        System.out.println("Please enter how many trumpets you want to remove.");
        trumpet = sc.nextInt();
        numtrumpet-=trumpet;
        totaltrumpetcost = costtrumpet*numtrumpet;
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of trumpets bought: "+numtrumpet);
        System.out.println("The total cost of all the trumpets is: "+obj.format(totaltrumpetcost));
    }
    
    //Method used if user wants to remove a tuba
    public void tubaremove() {
    	System.out.println("\nThe cost of a tuba is "+obj.format(costtuba));
        System.out.println("Please enter how many tubas you want to remove.");
        tuba = sc.nextInt();
        numtuba-=tuba;
        totaltubacost = costtuba*numtuba;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of tubas bought: "+numtuba);
        System.out.println("The total cost of all the tubas is: "+obj.format(totaltubacost));
    }
    
    //Method used if user wants to remove a drum set
    public void drumsetremove() {
        System.out.println("\nThe cost of a drumset is "+obj.format(costdrumset));
        System.out.println("Please enter how many drumsets you want to remove.");
        drumset = sc.nextInt();
        numdrumset-=drumset;
        totaldrumsetcost = costdrumset*numdrumset;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of drumsets bought: "+numdrumset);
        System.out.println("The total cost of all the drumsets is: "+obj.format(totaldrumsetcost));
    }
    
    //Method used if user wants to remove a xylophone
    public void xylophoneremove() {
    	System.out.println("\nThe cost of a xylophone is "+obj.format(costxylophone));
        System.out.println("Please enter how many xylophones you want to remove.");
        xylophone = sc.nextInt();
        numxylophone-=xylophone;
        totalxylophonecost = costxylophone*numxylophone;   
        //Shows user the cost and number of instruments they bought in that round
        System.out.println("Number of xylophones bought: "+numxylophone);
        System.out.println("The total cost of all the xylophones is: "+obj.format(totalxylophonecost));
    }
    
    //Method used if user wants to purchase a method book
    //Allows user to choose which method book they want
    public void methodbookadd() {
        System.out.println("\nPlease select the method book for your instrument");
        System.out.println("1. Essential Elements Violin Method Book");
        System.out.println("2. RCM Piano");
        System.out.println("3. Essential Elements Viola Method Book");
        System.out.println("4. Essential Elements Cello Method Book");
        System.out.println("5. Essential Elements Double bass Method Book");
        System.out.println("6. Essential Elements Acoustic Guitar Method Book");
        System.out.println("7. Essential Elements Clarinet Method Book");
        System.out.println("8. Essential Elements Flute Method Book");
        System.out.println("9. Essential Elements Alto Saxophone Method Book");
        System.out.println("10. Essential Elements Tenor Saxophone Method Book");
        System.out.println("11. Essential Elements Trombone Method Book");
        System.out.println("12. Essential Elements Trumpet Method Book");
        System.out.println("13. Essential Elements Tuba Method Book");
        System.out.println("14. Essential Elements Drumset Method Book");
        System.out.println("15. Essential Elements Xylophone Method Book");
        bookchoice = sc.nextInt();
        
        if (bookchoice>=1 && bookchoice<=15) {
            //Allow the user to know the price of their book
            System.out.println("\nThe cost of the method book is: "+obj.format(costmethodbook));
            System.out.println("Please enter how many method books of the category you chose do you want.");
            methodbook = sc.nextInt();
            nummethodbook+=methodbook;
            totalmethodbookcost = costmethodbook*nummethodbook;   
            System.out.println("Number of method books bought: "+nummethodbook);
            System.out.println("The total cost of all the method books is: "+obj.format(totalmethodbookcost));
        }
        else {
            //Prevents user for inputing an Invalid Entry.
            System.out.println("Invalid Entry.");
        }  
    }
    
    //Method used if user wants to remove a method book
    //Allows user to choose which method book they want to remove
     public void methodbookremove() {
        System.out.println("\nPlease select the method book you would like to remove.");
        System.out.println("1. Essential Elements Violin Method Book");
        System.out.println("2. RCM Piano");
        System.out.println("3. Essential Elements Viola Method Book");
        System.out.println("4. Essential Elements Cello Method Book");
        System.out.println("5. Essential Elements Double bass Method Book");
        System.out.println("6. Essential Elements Acoustic Guitar Method Book");
        System.out.println("7. Essential Elements Clarinet Method Book");
        System.out.println("8. Essential Elements Flute Method Book");
        System.out.println("9. Essential Elements Alto Saxophone Method Book");
        System.out.println("10. Essential Elements Tenor Saxophone Method Book");
        System.out.println("11. Essential Elements Trombone Method Book");
        System.out.println("12. Essential Elements Trumpet Method Book");
        System.out.println("13. Essential Elements Tuba Method Book");
        System.out.println("14. Essential Elements Drumset Method Book");
        System.out.println("15. Essential Elements Xylophone Method Book");
        bookchoice = sc.nextInt();
        
        if (bookchoice>=1 && bookchoice<=15) {
            //Allow the user to know the price of their book
            System.out.println("\nThe cost of the method book is: "+obj.format(costmethodbook));
            System.out.println("Please enter how many method books of the category you chose you want to remove.");
            methodbook = sc.nextInt();
            nummethodbook-=methodbook;
            totalmethodbookcost = costmethodbook*nummethodbook;   
            System.out.println("Number of method books bought: "+nummethodbook);
            System.out.println("The total cost of all the method books is: "+obj.format(totalmethodbookcost));
        }
        else {
            //Prevents user for inputing an Invalid Entry.
            System.out.println("Invalid Entry.");
        }  
    }
    
     //Prints the title of the store before the bill is displayed
    public void titlebeforebill() {
        System.out.println("\n*********************** \n* Clout's Music Store * \n***********************");
    }
    
    //This method helps to calculate the final bill for the user
    public void bill() {
        Scanner scs = new Scanner (System.in);
       //Tells user how much of each item they bought
        System.out.println("\nInstruments/Method Books        Quantity     Cost");
        System.out.println("\nNumber of violins bought:           "+numviolin+"        "+obj.format(totalviolincost));
        System.out.println("Number of pianos bought:            "+numpiano+"        "+obj.format(totalpianocost));
        System.out.println("Number of violas bought:            "+numviola+"        "+obj.format(totalviolacost));
        System.out.println("Number of cellos bought:            "+numcello+"        "+obj.format(totalcellocost));
        System.out.println("Number of double basses bought:     "+numdoublebass+"        "+obj.format(totaldoublebasscost));
        System.out.println("Number of guitars bought:           "+numguitar+"        "+obj.format(totalguitarcost));
        System.out.println("Number of clarinets bought:         "+numclarinet+"        "+obj.format(totalclarinetcost));
        System.out.println("Number of flutes bought:            "+numflute+"        "+obj.format(totalflutecost));
        System.out.println("Number of recorders bought:         "+numrecorder+"        "+obj.format(totalrecordercost));
        System.out.println("Number of alto saxophones bought:   "+numaltosax+"        "+obj.format(totalaltosaxcost));
        System.out.println("Number of tenor saxophones bought:  "+numtenorsax+"        "+obj.format(totaltenorsaxcost));
        System.out.println("Number of trombones bought:         "+numtrombone+"        "+obj.format(totaltrombonecost));
        System.out.println("Number of trumpets bought:          "+numtrumpet+"        "+obj.format(totaltrumpetcost));
        System.out.println("Number of tubas bought:             "+numtuba+"        "+obj.format(totaltubacost));
        System.out.println("Number of drumsets bought:          "+numdrumset+"        "+obj.format(totaldrumsetcost));
        System.out.println("Number of xylophones bought:        "+numxylophone+"        "+obj.format(totalxylophonecost));
        System.out.println("Number of method books bought:      "+nummethodbook+"        "+obj.format(totalmethodbookcost));
        
        //Finds the total before tax
        costbeforetax = totalmethodbookcost+totalxylophonecost+totaldrumsetcost+totaltubacost+totaltrumpetcost+totaltrombonecost+totaltenorsaxcost+totalaltosaxcost+totalflutecost+totalrecordercost+totalclarinetcost+totalguitarcost+totaldoublebasscost+totalcellocost+totalviolacost+totalpianocost+totalviolincost;
        
        System.out.println("\nYour total before tax is: "+obj.format(costbeforetax));
        
        //Allows members to get a discount for entering the special code
        System.out.println("\nAre you a member? Type 'y' for yes and 'n' for no");
        member = sc.next().charAt(0);
       
        switch (member) {
            case 'y':
            case 'Y':
                System.out.println("Please enter the code to receive 15% off your purchase");
                percentoff = scs.nextLine();
                
                if(percentoff.equalsIgnoreCase(percentoffcode)) {
                    System.out.println("That is the correct code. You got 15% off your purchase");
                    newpricewithcode = costbeforetax-costbeforetax*0.15;
                }
                
                else {
                    newpricewithcode = costbeforetax;
                    System.out.println("Sorry, that is not the correct code. You will not get 15% off your purchase.");
                }   break;

            case 'n':
            case 'N':
                newpricewithcode = costbeforetax;
                break;
                
            default:
                System.out.println("Invalid Entry.");
                newpricewithcode = costbeforetax;
                break;
        }
        
        //Ask user if they want to join the email list at the store
        System.out.println("\nWould you like to be emailed about future sales and contests at the store? Type in 'Y' for yes and 'N' for no.");
        email = sc.next().charAt(0);
        
        switch (email) {
            case 'y':
            case 'Y':
                System.out.println("Please enter your email address below:");
                emailaddress = scr.nextLine();
                System.out.println("Thank you for signing up!");
                break;
                
            case 'n':
            case 'N':
                System.out.println("Perhaps next time.");
                break;
                
            default: 
                System.out.println("Invalid reponse. Please enter either 'Y' or 'N'.");
                email = sc.next().charAt(0);
                break;
        }
        
        //Finds the total for the user including tax and discounts
        tax = newpricewithcode+newpricewithcode*taxes;
        System.out.println("\nYour total before tax is: "+obj.format(costbeforetax));
        System.out.println("Your total with 13% tax is: "+obj.format(tax));
        
        //Allows user to donate money to help the shop and its programs
        System.out.println("\nWould you like to donate to our store today? Type in 'Y' for yes and 'N' for no.");
        donation = sc.next().charAt(0);
        switch (donation) {
            case 'y':
            case 'Y':
                System.out.println("Please enter how much you would like to donate, "+ name+ ": ");
                donations = sc.nextDouble();
                
                //User must enter more than $0.00 of donations to be valid
                if (donations>MINIMUM_DONATIONS)
                    System.out.println("Thank you. Your donation has been of great value.");
                else
                    donations=MINIMUM_DONATIONS;
                    System.out.println("Invalid Entry.");
            break;

            case 'n':
            case 'N':
                donations=MINIMUM_DONATIONS;
                break;
                
            default:
                System.out.println("Invalid Entry.");
                break;
        }
       
        //Final bill that the user pays
        finalfee = donations+tax;
        System.out.println("\n"+ name+ ", your bill is: "+ obj.format(finalfee));
        do {
        System.out.println("\nWhat is your payment method? \n1. Cash/Cheque \n2. Visa \n3. Mastercard \n4. American Express \n5. Cancel order");
        paymentmethod = sc.nextInt();
        
        if (paymentmethod == 2 || paymentmethod == 3 || paymentmethod == 4) {
            System.out.println("Please enter your card number: ");
            cardnumber = sc.nextInt();
            
            System.out.println("Are you sure you want to continue (Type in 'Y' for yes or 'N' for no): ");
            continues = sc.next().charAt(0);
            
            if (continues == 'N' || continues == 'n') {
            }
            
            else if (continues == 'Y' || continues == 'y') {
            
            System.out.println("Please enter your pin: ");
            pin = sc.nextInt();
        }
        
    }
        else if (paymentmethod != 1 && paymentmethod != 2 && paymentmethod != 3 && paymentmethod != 4 && paymentmethod != 5) {
            System.out.println("Invalid Entry. Please enter your payment method again.");
            paymentmethod = sc.nextInt();
        }
        else if (paymentmethod == 5) {
                System.out.println("Your order is canceled. Please visit Clout's Music Store again!");
                System.exit(0);
        }
        else if (paymentmethod == 1) {
        
        //Asks user for bill to pay for purchase
        System.out.println("\nPlease enter your money.");
        tendered = sc.nextDouble();
        
        //If money tendered is less than the final total, it loops until they pay the amount that they owe
        while (tendered < finalfee) {
			stillpay = finalfee - tendered;
			System.out.println("Insufficient amount. You owe "+ obj.format(stillpay)+ " more.");
			tendered += sc.nextDouble();		
		}
        
        //Gives user their change if the money tendered is greater than the final total
        if (tendered > finalfee) {
            change = tendered-finalfee;
            System.out.println("\nYour change is: "+obj.format(change));
        }
        closing();
        }
        }
        while (continues=='N'||continues=='n');
        }
    
    public void closing() {
        //Thank you statement to remind the user to come again soon
        System.out.println(" ___|)___________________________________________________________\n" +
"|___/____________________________________________________________\n" +
"|__/|__________________No returns or refunds!____________________\n" +
"|_/(|,\\__________________________________________________________\n" +
"|_\\_|_/__________________________________________________________\n" +
"|   |\n" +
"| (_|\n" +
"|\n" +
"|________________________________________________________________\n" +
"|__/___\\_.____Thank you for shopping at Clout's Music Store._____\n" +
"|__\\___|_._____________Please play with us again.________________\n" +
"|_____/__________________________________________________________\n" +
"|____/___________________________________________________________");
        System.exit(0);
    }
}
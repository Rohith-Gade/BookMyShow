import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Color
{
	 static final String def = "\u001b[0;1m";
	static final String bgmagneta = "\u001B[45m";
	static final String bgcyan = "\u001B[46m";	
	static final String white = "\u001B[46m";	
	static final String magneta = "\u001B[35;1m";
	static final String cyan = "\u001B[36;1m";	
	static final String blink = "\u001b[5m";
	static final String red =  "\u001b[31;1m";
	static final String green = "\u001b[32;1m";
	static final String yellow = "\u001b[33;1m";
	static final String blue = "\u001b[34;1m";
	static final String purple = "\u001b[35;1m";
	static final String skblue = "\u001b[36;1m";
	static final String bgred =  "\u001b[101;1m";
	static final String bggreen = "\u001b[102;1m";
	static final String bgyellow = "\u001b[103;1m";
	static final String bgblue = "\u001b[104;1m";
	static final String bgpurple = "\u001b[105;1m";
	static final String bgskblue = "\u001b[106;1m";
	static final String reset = "\u001B[0m";
	static final String bgwhite = "\u001B[47m";

}
class Register 
{
	static Scanner sc=new Scanner(System.in);
	private String username;  
	private String password;  
	private long phonenumber; 
	public String pattern;
	
	Register()
	{

		System.out.println(Color.yellow+Color.blink+"                        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                   ");
        	System.out.println("                        *                  " +Color.reset+Color.cyan +"   Welcome To Book My Show           "+ Color.blink+Color.yellow+"                  *         "+Color.def);
		System.out.println(Color.yellow+Color.blink+"                        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                   "+Color.def);
		System.out.println();
		System.out.println(Color.green+"Register Now..!"+Color.def);
		System.out.println();		
		System.out.print( Color.purple+"Enter UserName :"+Color.yellow);
		setUsername(sc.next());
		System.out.println();
		System.out.print(Color.purple+"Enter password :"+Color.yellow);
		setPassword(sc.next());
		System.out.println();
		System.out.print(Color.purple+"Enter PhoneNumber :"+Color.yellow);
		setPhone(sc.nextLong());
		
	}


	public void setUsername(String username)
	{
		pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@_])[A-Za-z0-9@_]{8,}$";

		if(username.matches(pattern))
		{
			this.username = username;
		}
		else
		{
			System.out.println(Color.red+"Invalid Username : "+ username +Color.reset);
			if (!username.matches(".*[A-Z].*")) 
			{
				System.out.println(Color.purple+"Username must contain 1 Uppercase Alphabet"+Color.reset);
        		}
	        	if (!username.matches(".*[a-z].*")) 
			{
		            System.out.println(Color.purple+"Username must contain 1 Lowercase Alphabet"+Color.reset);
        		}
		        if (!username.matches(".*\\d.*")) 
			{
		            System.out.println(Color.purple+"Username name must contain atleast 1 Digit"+Color.reset);
	        	}
		        if (!username.matches(".*[@_].*")) 
			{
	        	    System.out.println(Color.purple+"Username must contain Special Character either '@' OR '_'"+Color.reset);
		        }
		        if (username.length() < 8) 
			{
		            System.out.println(Color.purple+"Username must contain atleast 8 Characters"+Color.reset);
		        }
			System.out.println(Color.yellow+"Enter a valid Username: "+Color.cyan);
			setUsername(sc.next());
		}
	}
	public void setPassword(String password)
	{
		pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*?])[A-Za-z0-9!@#$%^&*?]{8,20}$";
		
		if(password.matches(pattern))
		{
			this.password = password;
		}
		else
		{
			System.out.println(Color.red+"Invalid Password : "+password+Color.reset);
			if (!password.matches(".*[A-Z].*")) 
			{
           			 System.out.println(Color.purple+"Password must contain 1 Uppercase Alphabet"+Color.reset);
		        }
		        if (!password.matches(".*[a-z].*")) 
			{
		            System.out.println(Color.purple+"Password must contain 1 Lowercase Alphabet"+Color.reset);
		        }
		        if (!password.matches(".*\\d.*")) 
			{
		            System.out.println(Color.purple+"Passowrd name must contain atleast 1 Digit"+Color.reset);
	        	}
	        	if (!password.matches(".*[!@#$%^&*?].*")) 
			{
	        	    System.out.println(Color.purple+"Password must contain Special characters like '@' or '!' or '$' ..."+Color.reset);
	        	}
		        if (password.length() < 8) 	
			{
		            System.out.println(Color.purple+"Password must contain atleast 8 Characters"+Color.reset);
		        }
			else if(password.length() > 20) 
			{
			    System.out.println(Color.purple+"Password can contain maximum 20 Characters"+Color.reset);
			}
			System.out.println(Color.yellow+"Enter a valid Password : "+Color.cyan);
			setPassword(sc.next());
		}
	}
	void setPhone(long phone)
	{
		pattern = "^[6-9][0-9]{9}$";
		
		if((phone+"").matches(pattern))
		{
			this.phonenumber = phone;
		}
		else
		{
			
			System.out.println(Color.red+"Invalid Phone Number : "+ phone +Color.reset);
			if(!(phone+"").matches("[6-9].*")) 
			{
		            System.out.println(Color.purple+"Phone Number must start with the digits 6 to 9"+Color.reset);
		        }
		        if((phone+"").length()!=10)
			{
				System.out.println(Color.purple+"Phone must contain exactly 10 digits"+Color.reset);
			}
			System.out.println(Color.yellow+"Enter a valid Phone Number : "+Color.cyan);
			setPhone(sc.nextLong());

		}
	}



	String getu() 
	{
        	return username;
	}

	String getp()
	{
        	return password;
	}

	long getmno() 
	{
        	return phonenumber;
    	}
}
class User 
{
	static Scanner sc = new Scanner(System.in);
	static Register obj;
	int genOtp() 
	{
        	Random rd = new Random();
	        for (int i = 0; i < 1; i++) 
		{
        		int y = rd.nextInt(999);
			int x = rd.nextInt(9);
			if (x == 0) 
			{
				x = 1;
            		}
			int a = y + x * 1000;
			return a;
		}
		return 0;
        }
	void login()
	{
	
	        System.out.println(Color.purple+" Enter your login credentials "+Color.def);
		System.out.println();
	        System.out.print(Color.purple+" Enter Username : "+Color.yellow);
        	String username =  sc.next();
	        System.out.print(Color.purple+" Enter Password : "+Color.yellow);
	        String password =  sc.next();

	        if (username.equals(obj.getu()) && password.equals(obj.getp()))
		{
			System.out.println();	
			System.out.print("Logging in ");
			
			try
			{
				for(int i=0;i<3;i++)
				{
					Thread.sleep(1000);
					System.out.print(".");
				}
			}
			catch(InterruptedException e) {}
			System.out.println();
        		System.out.println(Color.green+" Login Successful "+Color.def);
	        } 
		else if (!username.equals(obj.getu()) && !password.equals(obj.getp()))
		{
        		while (true)
			{
		                System.out.println(Color.red+" Your Credentials are incorrect !!"+Color.def);
				System.out.println();
		                System.out.print(Color.purple+" Enter your PhoneNumber: "+Color.yellow);
		  		long phonenumber = sc.nextLong();
	        	        if (phonenumber == obj.getmno()) 
				{
					System.out.println();
	                   
					int otp = genOtp();
					System.out.print("Generating OTP");
					try
					{
						for(int i=0;i<3;i++)
						{
							Thread.sleep(1000);
							System.out.print(".");
						}
					}	
					catch(InterruptedException e) {}

			                System.out.println(Color.purple+" Your OTP for verification is : "+Color.blue + otp);
						System.out.println();
					System.out.print(Color.purple+" Enter OTP : "+Color.yellow);
		                    	int userOtp = sc.nextInt();

			                if (userOtp == otp)
					{
						System.out.println();
						System.out.println(Color.cyan+" Your username is : " +Color.yellow+ obj.getu());
		                        	System.out.println(Color.green+" OTP verified successfully.Please login again.."+Color.def);			 

	                		        login();
			                        break;
                			}
					else
					{
		                        	System.out.println(Color.red+"Invalid OTP."+Color.green+" Please try again."+Color.def);
	                		}
        	        	}
				else
				{
					System.out.println();
			                System.out.println(Color.cyan+" You are not an existing user "+Color.def);
		                        System.out.println();
	        	                System.out.println(Color.red+" Type Re-enter for login or Exit for terminating "+Color.yellow);
					
	                		String n = sc.next();
					if(n.equalsIgnoreCase("Re-enter"))
					{
						login();
					}
	                        	if (n.equalsIgnoreCase("Exit")) 
					{	
			                        System.out.println(Color.red+"  Your Session is terminated"+Color.def);
                			        break;
		        	        }	
	                	}
        	    	}
        	} 
		else if (!username.equals(obj.getu()) && password.equals(obj.getp())) 
		{
			while (true)
			{
		                System.out.println(Color.red+" Your Username is incorrect !!"+Color.def);
				System.out.println();
		                System.out.print(Color.purple+" Enter your PhoneNumber: "+Color.yellow);
		  		long phonenumber = sc.nextLong();
	        	        if (phonenumber == obj.getmno()) 
				{
					System.out.println();
	                   
					int otp = genOtp();
					System.out.print("Generating OTP");
					try
					{
						for(int i=0;i<3;i++)
						{
							Thread.sleep(1000);
							System.out.print(".");
						}
					}	
					catch(InterruptedException e) {}

			                System.out.println(Color.cyan+" Your OTP for verification is : "+Color.blue + otp);
						System.out.println();
					System.out.print(Color.purple+" Enter OTP : "+Color.yellow);
		                    	int userOtp = sc.nextInt();

			                if (userOtp == otp)
					{
						System.out.println();
						System.out.println(Color.green+" OTP verified successfully");
						System.out.println();
						System.out.println(Color.cyan+" Your username is : " +Color.yellow+ obj.getu());
						System.out.println();
		                        	System.out.println(Color.green+ "Please login again.");
			 

	                		        login();
			                        break;
                			}
					else
					{
		                        	System.out.println(Color.red+"Invalid OTP Please try again.");
	                		}
        	        	}
				else
				{
					System.out.println();
			                System.out.println(Color.red+" You are not an existing user "+Color.def);
		                        System.out.println();
	        	                System.out.println(Color.red+" Type Re-enter for login or Exit for terminating "+Color.yellow);
	                		String n = sc.next();
					if(n.equalsIgnoreCase("Re-enter"))
					{
						login();
					}
	                        	if (n.equalsIgnoreCase("Exit")) 
					{	
			                        System.out.println(Color.red+"  Your Session is terminated ");
                			        break;
		        	        }	
	                	}
        	    	}
        			
			
      	        } 
		else if (username.equals(obj.getu()) && !password.equals(obj.getp())) 
		{
			while (true)
			{
		                System.out.println(Color.red+" Your password is incorrect !!"+Color.def);
				System.out.println();
		                System.out.print(Color.purple+" Enter your PhoneNumber: "+Color.yellow);
		  		long phonenumber = sc.nextLong();
	        	        if (phonenumber == obj.getmno()) 
				{
					System.out.println();
	                   
					int otp = genOtp();
			                System.out.println(Color.cyan+" Your OTP for verification is : "+Color.blue + otp);
						System.out.println();
					System.out.print(Color.purple+" Enter OTP : "+Color.yellow);
		                    	int userOtp = sc.nextInt();

			                if (userOtp == otp)
					{
						System.out.println();
						System.out.println(Color.green+"  OTP verified successfully."+Color.def);
						System.out.println();
						System.out.println(Color.cyan+" Your password is : " +Color.blue+ obj.getp());
						System.out.println();
		                        	 System.out.println(Color.green+"Please login again.");
			 

	                		        login();
			                        break;
                			}
					else
					{
		                        	System.out.println(Color.red+"Invalid OTP. Please try again.");
	                		}
        	        	}
				else
				{
					System.out.println();
			                System.out.println(Color.red+" You are not an existing user "+Color.def);
		                        System.out.println();
	        	                System.out.println(Color.red+" Type Re-enter for login or Exit for terminating "+Color.yellow);
	                		String n = sc.next();	
					if (n.equalsIgnoreCase("Re-enter")) 
					{
						login();
					}
	                        	if (n.equalsIgnoreCase("Exit")) 
					{	
			                        System.out.println(Color.red+"  Your Session is terminated ");
                			        break;
		        	        }	
	                	}
        	    	}
	        }
	}
}

class Movies {
    static String[] movies = {"Salaar-2", "Saripodha Sanivaraam", "Pushpa-2", "Devara"};
    static double ticketPrice = 299.00; 

    static void Movies_name() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(Color.cyan + "The list of movies we provided" + Color.def);
        System.out.println();
        for (int i = 0; i < movies.length; i++) {
            System.out.println(Color.cyan + (i + 1) + ". " + movies[i] + " Rating - " + (8 + i * 0.5) + "/10" + Color.def);
        }
	System.out.println("Please Select the movies from 1 to 4");
        int n = sc.nextInt();
        String selectedMovie = "";

        while (true) {
            if (n >= 1 && n <= 4) {
                selectedMovie = movies[n - 1];
                Theater.selection(selectedMovie);  // Pass the movie name to the Theater
                break;
            } else {
                System.out.println("Please select a valid movie in the given range..!");
                n = sc.nextInt();
            }
        }
    }
}

class Theater  extends Banking{
	static int n;
    static String[] theaters = {"PVR Cinemas", "INOX", "Carnival Cinemas", "Cinepolis"};
    static LocalTime[][] showTimes = {
        {LocalTime.of(10, 0), LocalTime.of(12, 0), LocalTime.of(14, 0), LocalTime.of(16, 0)},
        {LocalTime.of(11, 0), LocalTime.of(13, 0), LocalTime.of(15, 0), LocalTime.of(17, 0)},
        {LocalTime.of(10, 30), LocalTime.of(12, 30), LocalTime.of(14, 30), LocalTime.of(16, 30)},
        {LocalTime.of(11, 30), LocalTime.of(13, 30), LocalTime.of(15, 30), LocalTime.of(17, 30)}
    };

    static void selection(String movieName) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Color.blue + "Available Theaters:");
        
        // Displaying Theaters
        for (int i = 0; i < theaters.length; i++) {
            System.out.println((i + 1) + ". " + theaters[i]);
        }

        // Theater Selection
        System.out.print(Color.purple + "Please select a theater (1 to 4): " + Color.yellow);
        int theaterChoice = sc.nextInt();
        if (theaterChoice < 1 || theaterChoice > 4) {
            System.out.println(Color.red + "Invalid theater selection.");
            selection(movieName);
            return;
        }

        // Display dates
        LocalDate today = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("\nShow timings for " + theaters[theaterChoice - 1] + " (Next 5 days):");
        
        for (int i = 0; i < 5; i++) {
            LocalDate showDate = today.plusDays(i);
            System.out.println(Color.cyan + "Date: " + showDate.format(dateFormatter));
            for (int j = 0; j < 4; j++) {
                System.out.println("  Show: " + showTimes[theaterChoice - 1][j].format(timeFormatter));
            }
            System.out.println();
        }

        // Date selection
        System.out.print(Color.purple + "Please select a date (1-5): " + Color.yellow);
        int dateChoice = sc.nextInt();
        while (dateChoice < 1 || dateChoice > 5) {
            System.out.println(Color.red + "Invalid date selection.");
            dateChoice = sc.nextInt();
        }

        // Show timing selection
        System.out.print(Color.purple + "Please select a show timing (1-4): " + Color.yellow);
        int showChoice = sc.nextInt();
        while (showChoice < 1 || showChoice > 4) {
            System.out.println(Color.red + "Invalid show timing selection.");
            showChoice = sc.nextInt();
        }

        LocalDate selectedDate = today.plusDays(dateChoice - 1);
        LocalTime selectedTime = showTimes[theaterChoice - 1][showChoice - 1];

        // Seat Booking
        SeatBooking.initializeSeats(); // Ensure seats are initialized
        SeatBooking.displaySeats();
	String bookedSeat = "";
	System.out.println("Enter the number of seats you want : ");
      	n = sc.nextInt();
        for(int i=1;i<=n;i++)
           bookedSeat = bookedSeat + SeatBooking.bookSeat()+"   ";
		while(true)
		{
			System.out.println("Select Mode of Payment");
			System.out.println("1 for Debit Card");
			System.out.println("2 for UPI");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
				debitcard();
				break;
			}
			else if(n==2)
			{
				upi();
				break;
			}
			else
			{
				System.out.println("Invalid Payment Option");
			}
		}
	 
	Payment.processPayment(movieName, theaters[theaterChoice - 1], selectedDate, selectedTime, bookedSeat);

     }
}
class SeatBooking  {
    static Scanner sc = new Scanner(System.in);
    static String[][] seats = new String[5][10];
    static boolean[][] bookedSeats = new boolean[5][10]; 
    static void initializeSeats() {
        char row = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                seats[i][j] = row + "" + (j + 1);
            }
            row++;
        }
    }

    public static boolean isSeatBooked(String seat) {
        int row = seat.charAt(0) - 'A';
        int column = Integer.parseInt(seat.substring(1)) - 1; 
        return bookedSeats[row][column]; 
    }

    public static String getValidSeat() {
        String seat;
        while (true) {
            System.out.print(Color.purple + "Enter Seat Label: " + Color.yellow);
            seat = sc.next();
            if (isValidSeat(seat) && !isSeatBooked(seat)) {
                return seat;
            }
            System.out.println(Color.red + "Invalid or already booked seat. Please try again." + Color.def);
        }
    }

    public static boolean isValidSeat(String seat) {
        return seat.length() == 2 && seat.charAt(0) >= 'A' && seat.charAt(0) <= 'E'
                && Integer.parseInt(seat.substring(1)) >= 1 && Integer.parseInt(seat.substring(1)) <= 10;
    }

    public static String bookSeat() {
        String seat = getValidSeat();
        int row = seat.charAt(0) - 'A'; // Convert row character to index
        int column = Integer.parseInt(seat.substring(1)) - 1; // Convert column to index
        bookedSeats[row][column] = true; // Mark seat as booked
        System.out.println(Color.green + "Seat " + seat + " has been booked successfully!" + Color.def);
        return seat; // Return the booked seat
    }

    public static void displaySeats()
	{
        System.out.println(Color.blue + "Available Seats:" + Color.def);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                String seatLabel = seats[i][j];
                if (isSeatBooked(seatLabel)) {
                    System.out.print(Color.red + " X " + Color.def); 
                } else {
                    System.out.print(Color.green + " " + seatLabel + " " + Color.def); 
                }
            }
            System.out.println();
        }
    }
}
class HDFC
{
	static double balance = 2000;
	private static int pin = 1234;
	static void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient Balance!");
		}
		else
		{
			balance = balance - amount;
		}
	}
	static void deposit(double amount)
	{
		balance = balance + amount;
	}
	static double viewBalance()
	{
		return balance;
	}
	int getPIN()
	{
		return pin;
	}
	
}

class KOTAK
{
	static double balance = 2000;
	private static int pin = 1234;

	static void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient Balance!");
		}
		else
		{
			balance = balance - amount;
		}
	}
	static void deposit(double amount)
	{
		balance = balance + amount;
	}
	static double viewBalance()
	{
		return balance;
	}
	int getPIN()
	{
		return pin;
	}
	
}

class SBI
{
	static double balance = 2000;
	private static int pin = 1234;

	static void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient Balance!");
		}
		else
		{
			balance = balance - amount;
		}
	}
	static void deposit(double amount)
	{
		balance = balance + amount;
	}
	static double viewBalance()
	{
		return balance;
	}
	int getPIN()
	{
		return pin;
	}
	
}
class Loading
{
	public static void loading() 
	{
        	int totalTasks = 100;
	        int currentTask = 0;
	        int progressBarWidth = 50;
		
		System.out.println();
		System.out.println();

        	System.out.println("					Payment Processing....");
		System.out.print(Color.white);
		
	
        	StringBuilder progressStringBuilder = new StringBuilder();
	        for (int i = 0; i < progressBarWidth; i++) 
		{
        	    progressStringBuilder.append(" ");
	        }

	        while (currentTask <= totalTasks) 
		{
        	    int progress = (int) (currentTask / (float) totalTasks * progressBarWidth);
	            StringBuffer progressBarBuffer = new StringBuffer(progressBarWidth + 10);
        	    progressBarBuffer.append("			[");
	            for (int i = 0; i < progressBarWidth; i++) 
		    {
        	        if (i < progress) 
			{
	                    progressBarBuffer.append('=');
        		}
			else if (i == progress) 
			{
		            progressBarBuffer.append('>');
                	}
			else 
			{
		            progressBarBuffer.append(' ');
               		}
		    }
            	    progressBarBuffer.append("] ").append(progress * 100 / progressBarWidth).append('%');
	            String progressBarWithBuffer = progressBarBuffer.toString();

        	    System.out.print(Color.def + "\r" + progressBarWithBuffer);

	            try 
		    {
	                Thread.sleep(50);
        	    } 
		    catch (Exception e) 
		    {
	                e.printStackTrace();
        	    }
	            currentTask++;
        	}
		System.out.println();
	        System.out.println(Color.green + "					Payment processed successfully!" + Color.def);

		System.out.println();
		System.out.println();


    	}

}
class Payment 
{
    static void processPayment(String movieName, String theater, LocalDate date, LocalTime time, String seat) {
        double totalPrice = Movies.ticketPrice; // Here, you could calculate the total price based on the number of seats booked
	System.out.println(Color.yellow+Color.blink+"                        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                   ");
        	System.out.println("                                        " +Color.reset+Color.cyan +"           Booking Details         "+ Color.blink+Color.yellow+"                           "+Color.def);
		System.out.println(Color.yellow+Color.blink+"                        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                   "+Color.def);
		System.out.println();

        System.out.println(Color.cyan + "					Movie: " + movieName);
        System.out.println("					Theater: " + theater);
        System.out.println("					Show Date: " + date);
        System.out.println("					Show Time: " + time);
        System.out.println("					Booked Seat: " + seat);
        System.out.println("					Total Price: INR " + (Theater.n*totalPrice));
		System.out.println();
		System.out.println();
		
	System.out.println("					COPYRIGHTS@2024  All Righths Are Reserved  ");
	
    }
}

class Banking 
{
	static Scanner sc=new Scanner(System.in);
	static int generateOTP()
	{
		Random random = new Random();
		return random.nextInt(9)+8999;
	}
	static void debitcard()
	{
		System.out.println("Select Bank Account");
		System.out.println("Enter \n1 for HDFC");
		System.out.println("2 for KOTAK");
		System.out.println("3 for SBI");
		int n = sc.nextInt();
		sc.nextLine();
		String pattern = "";
		if(n==1)
		{
			System.out.println("Selected HDFC");
			HDFC hdfc = new HDFC();

			while(true)
			{
				System.out.println("Enter Debit Card Number");
				long debitNum = sc.nextLong();
				sc.nextLine();
				
				pattern = "^[1-9][0-9]{11}$";
				if((debitNum+"").matches(pattern))
				{
					while(true)
					{
						System.out.println("Enter CVV : ");
						int cvv = sc.nextInt();
						sc.nextLine();
	
						pattern = "^[1-9][0-9]{2}$";
					
						if((cvv+"").matches(pattern))
						{
							int otp = Banking.generateOTP();
							while(true)
							{
								System.out.println("You OTP is : "+otp);
								System.out.println("Enter OTP : ");
								int inputOTP = sc.nextInt();
								sc.nextLine();
								if(inputOTP==otp)
								{
									
									//make payment
									Loading.loading();
									 

									break;
								}
								else
								{
									System.out.println("Incorrect OTP!");
								}
							}	
							
							
						
							break; //break for correct cvv 	
						}
						else
						{
							System.out.println("Invalid CVV : "+cvv);
							System.out.println("CVV must contain exactly 3 digits and should not start with 0");
							/*
							if(!(cvv+"").matches("[1-9].*")) 
							{
								System.out.println("CVV should not start with 0");
						        }
						        if((cvv+"").length()!=3)
							{
								System.out.println("CVV must contain exactly 3 digits");
							}
							*/
		
						}
					}
					break;//break for correct debit number
					
				}
				else 
				{
					System.out.println("Invalid Debit Card Number : "+debitNum);
					System.out.println("Debit Card Number must contain exactly 12 digits and should not start with 0");
					/*
					if(!(debitNum+"").matches("[1-9].*")) 
					{
						System.out.println("Debit Card Number should not start with 0");
				        }
				        if((debitNum+"").length()!=12)
					{
						System.out.println("Debit Card Number must contain exactly 12 digits");
					}
					*/
				}
			}	
			
		}
		else if(n==2)
		{
			System.out.println("Selected KOTAK");
			KOTAK kotak = new KOTAK();

			while(true)
			{
				System.out.println("Enter Debit Card Number");
				long debitNum = sc.nextLong();
				sc.nextLine();
				
				pattern = "^[1-9][0-9]{11}$";
				if((debitNum+"").matches(pattern))
				{
					while(true)
					{
						System.out.println("Enter CVV : ");
						int cvv = sc.nextInt();
						sc.nextLine();
	
						pattern = "^[1-9][0-9]{2}$";
					
						if((cvv+"").matches(pattern))
						{
							int otp = Banking.generateOTP();
							while(true)
							{
								System.out.println("You OTP is : "+otp);
								System.out.println("Enter OTP : ");
								int inputOTP = sc.nextInt();
								sc.nextLine();
								if(inputOTP==otp)
								{
									
									//make payment
									Loading.loading();
									break;
								}
								else
								{
									System.out.println("Incorrect OTP!");
								}
							}
													
							break; //break for correct cvv 	
						}
						else
						{
							System.out.println("Invalid CVV : "+cvv);
							System.out.println("CVV must contain exactly 3 digits and should not start with 0");
							/*
							if(!(cvv+"").matches("[1-9].*")) 
							{
								System.out.println("CVV should not start with 0");
						        }
						        if((cvv+"").length()!=3)
							{
								System.out.println("CVV must contain exactly 3 digits");
							}
							*/
		
						}
					}
					break;//break for correct debit number
					
				}
				else 
				{
					System.out.println("Invalid Debit Card Number : "+debitNum);
					System.out.println("Debit Card Number must contain exactly 12 digits and should not start with 0");
					/*
					if(!(debitNum+"").matches("[1-9].*")) 
					{
						System.out.println("Debit Card Number should not start with 0");
				        }
				        if((debitNum+"").length()!=12)
					{
						System.out.println("Debit Card Number must contain exactly 12 digits");
					}
					*/
				}
			}	
			
		}
		else if(n==3)
		{
			System.out.println("Selected HDFC");
			SBI sbi = new SBI();

			while(true)
			{
				System.out.println("Enter Debit Card Number");
				long debitNum = sc.nextLong();
				sc.nextLine();
				
				pattern = "^[1-9][0-9]{11}$";
				if((debitNum+"").matches(pattern))
				{
					while(true)
					{
						System.out.println("Enter CVV : ");
						int cvv = sc.nextInt();
						sc.nextLine();
	
						pattern = "^[1-9][0-9]{2}$";
					
						if((cvv+"").matches(pattern))
						{
							int otp = Banking.generateOTP();
							while(true)
							{
								System.out.println("You OTP is : "+otp);
								System.out.println("Enter OTP : ");
								int inputOTP = sc.nextInt();
								sc.nextLine();
								if(inputOTP==otp)
								{
									
									//make payment
									Loading.loading();
									break;
								}
								else
								{
									System.out.println("Incorrect OTP!");
								}
							}

						
							break; //break for correct cvv 	
						}
						else
						{
							System.out.println("Invalid CVV : "+cvv);
							System.out.println("CVV must contain exactly 3 digits and should not start with 0");
							/*
							if(!(cvv+"").matches("[1-9].*")) 
							{
								System.out.println("CVV should not start with 0");
						        }
						        if((cvv+"").length()!=3)
							{
								System.out.println("CVV must contain exactly 3 digits");
							}
							*/
		
						}
					}
					break;//break for correct debit number
					
				}
				else 
				{
					System.out.println("Invalid Debit Card Number : "+debitNum);
					System.out.println("Debit Card Number must contain exactly 12 digits and should not start with 0");
					/*
					if(!(debitNum+"").matches("[1-9].*")) 
					{
						System.out.println("Debit Card Number should not start with 0");
				        }
				        if((debitNum+"").length()!=12)
					{
						System.out.println("Debit Card Number must contain exactly 12 digits");
					}
					*/
				}
			}	
			
		}
		else
		{
			System.out.println("Invalid Bank Coice");
			Banking.debitcard();
		}
	}
	static void upi()
	{
		
		while(true)
		{
			System.out.println("Select UPI Platform");
			System.out.println("1 for PhonePe");
			System.out.println("2 for GPay");
			System.out.println("3 for PayTM");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
					System.out.println("Select UPI Platform : PhonePe");
					Banking.phonepe();
					break;
			}
			else if(n==2)
			{
					System.out.println("Select UPI Platform : GPay");
					Banking.gpay();
					break;
			}
			else if(n==3)
			{
					System.out.println("Select UPI Platform : PayTM");
					Banking.paytm();
					break;
			}
			else
			{
				System.out.println("Invalid UPI Platform!");
			}
		}
		
		
	}
	static void phonepe()
	{
		System.out.println("Select Bank");
		System.out.println("Enter \n1 for HDFC");
		System.out.println("2 for KOTAK");
		System.out.println("3 for SBI");
		int n = sc.nextInt();
		sc.nextLine();
		String pattern = "";
		while(true)
		{
			if(n==1)
			{
				int count = 0;
				System.out.println("Selected HDFC");
				HDFC hdfc = new HDFC();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==hdfc.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+hdfc.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+hdfc.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else if(n==2)
			{
				int count = 0;
				System.out.println("Selected KOTAK");
				KOTAK kotak = new KOTAK();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==kotak.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+kotak.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+kotak.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else if(n==3)
			{
				int count = 0;
				System.out.println("Selected SBI");
				SBI sbi = new SBI();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==sbi.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+sbi.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+sbi.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else
			{
				System.out.println("Invalid Bank");
			}
		}
	}

	static void gpay()
	{
		System.out.println("Select Bank");
		System.out.println("Enter \n1 for HDFC");
		System.out.println("2 for KOTAK");
		System.out.println("3 for SBI");
		int n = sc.nextInt();
		sc.nextLine();
		String pattern = "";
		while(true)
		{
			if(n==1)
			{
				int count = 0;
				System.out.println("Selected HDFC");
				HDFC hdfc = new HDFC();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==hdfc.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+hdfc.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+hdfc.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else if(n==2)
			{
				int count = 0;
				System.out.println("Selected KOTAK");
				KOTAK kotak = new KOTAK();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==kotak.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+kotak.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+kotak.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else if(n==3)
			{
				int count = 0;
				System.out.println("Selected SBI");
				SBI sbi = new SBI();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==sbi.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+sbi.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+sbi.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else
			{
				System.out.println("Invalid Bank");
			}
		}
	}
	static void paytm()
	{
		System.out.println("Select Bank");
		System.out.println("Enter \n1 for HDFC");
		System.out.println("2 for KOTAK");
		System.out.println("3 for SBI");
		int n = sc.nextInt();
		sc.nextLine();
		String pattern = "";
		while(true)
		{
			if(n==1)
			{
				int count = 0;
				System.out.println("Selected HDFC");
				HDFC hdfc = new HDFC();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==hdfc.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+hdfc.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+hdfc.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else if(n==2)
			{
				int count = 0;
				System.out.println("Selected KOTAK");
				KOTAK kotak = new KOTAK();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==kotak.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+kotak.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+kotak.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else if(n==3)
			{
				int count = 0;
				System.out.println("Selected SBI");
				SBI sbi = new SBI();
				
				while(true)
				{
					System.out.println("Enter PIN : ");
					int pin = sc.nextInt();
					sc.nextLine();
					count++;
						
					if(pin==sbi.getPIN())
					{
						//make payment
						Loading.loading();
						break;
					}
					else
					{
						if(count==1)
						{
							int otp = generateOTP();
							while(true)
							{
								System.out.println("Invalid PIN: "+pin);
								System.out.println("Enter Phone Number");
								long phone = sc.nextLong();
								if(phone==getPhone())
								{
									while(true)
									{
										System.out.println("Your OTP is : "+ otp);
										System.out.println("Enter OTP : ");
										if(otp==sc.nextInt())
										{
											System.out.println("Your PIN is : "+sbi.getPIN());
											break;
										}
										else
										{
											System.out.println("Incorrect OTP");
										}
									}
									break;
								}
								else
								{
									System.out.println("User Not Found");
									System.out.println("Enter \n 1. for Re-enter phone Number \n 2. for exit");
									int n1 = sc.nextInt();
									if(n1==1)
									{
										
									}
									else
									{
										System.out.println("Exit Successfull!");
										System.exit(0);
									}
								}
							}
						}
						else
						{
							System.out.println("Your PIN is : "+sbi.getPIN());
						
						}
					}
					
				}
	
				break;
			}
			else
			{
				System.out.println("Invalid Bank");
			}
		}
	}
	static long getPhone()
	{
		return 9876543210L;
	}
	
}
class Test 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		User.obj=new Register();
        	new User().login();
        	Movies.Movies_name();

   	 }
		
}




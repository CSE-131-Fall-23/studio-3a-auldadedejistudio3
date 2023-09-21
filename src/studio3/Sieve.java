package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int startingvalue = 100;
		

		int [] primes = new int [startingvalue + 1];

		//actual hard stuff
		
		for (int index = 0; index <= startingvalue; index++)
		{
			primes[index] = index;
		}
		
		for (int round = 0; round <= startingvalue; round++)
		{
 

			

			if ( round >= 2)
			{

				for (int startround = 2* round; startround <= startingvalue; startround += round)
				{
				
					primes[startround] = 0;
					
		


				}


			}
			
			
		}

//displaying
		for (int position = 0; position <= startingvalue; position++)
		{
			if (primes[position] != 0 && primes[position] != 1 )
			{
				System.out.println(primes[position]);
			}
		}


	}

}

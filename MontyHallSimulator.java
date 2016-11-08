public class MontyHallSimulator
{

	public static void main(String[] args)
	
	{
		String input = args[0];
		
		int sims = Integer.parseInt(input);
		System.out.println(sims);
		
		int switched = 0;
		for(int i = 0; i< sims; i++)
			switched += game();
		
		double switchpercent = format((double) switched/ sims * 100);
		double staypercent = format(100 - switchpercent);
		System.out.println("win % when switched:" + switchpercent);
		System.out.println("win % when stayed" + staypercent);
	}

	public static double format(double d)
	{
		int index = (int) (d * 100);
		return index / 100.0;
	}

	public static int game()
	{
		int car = (int) (Math.random() * 3 + 1);
		int userPick = (int) (Math.random() * 3 + 1);
		if(car == userPick)
			return 0;
		else
			return 1;
	}

}
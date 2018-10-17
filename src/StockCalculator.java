import java.util.Scanner;

/**
 * 
 * @author Steven DeYoung
 *
 */
public class StockCalculator
{

	public static void main(String[] args)
	{
		System.out.print("STOCK CALCULATOR");
		Scanner user = new Scanner(System.in);
		System.out.print("\nNumber of shares purchased:  ");
		String shareNumStr = user.nextLine();
		int shareNum = Integer.parseInt(shareNumStr);
		System.out.print("Price per share:  ");
		String shareAmountStr = user.nextLine();
		double shareAmount = Double.parseDouble(shareAmountStr);
		System.out.print("Commission rate for the purchase:  ");
		String comRatePStr = user.nextLine();
		double comRateP = Double.parseDouble(comRatePStr);
		System.out.print("Sell price of stock:  ");
		String sellStockStr = user.nextLine();
		double sellStock = Double.parseDouble(sellStockStr);
		System.out.print("Commision rate for sale:  ");
		String comRateSStr = user.nextLine();
		double comRateS = Double.parseDouble(comRateSStr);
		double buy = shareNum*shareAmount;
		double sell = shareNum*sellStock;
		double com1 = buy/comRateP;
		double com2 = sell/comRateS;
		double net = sell-buy-com1-com2;
		System.out.println("Total paid for " + shareNum + " shares: $" + buy);
		System.out.println("Commission on purchase: $" + com1);
		System.out.println("Total sale price for " + shareNum + " shares: $" + sell);
		System.out.println("Commission on sale: $" + com2);
		System.out.println("Net gain/loss: $" + net);
		

	}

}

package Model;

import java.text.NumberFormat;
import java.util.Locale;

public class Calculation {
	private double totalAmount;
	private double amountBet;
	private String betType;
	private double totalBetAmount;
	private int rollCount;

	public Calculation() {

	}

	public Calculation(Double totalAmount, Double amountBet, String betType, Integer rollCount) {
		super();
		this.totalAmount = totalAmount;
		this.amountBet = amountBet;
		this.betType = betType;
		this.rollCount = rollCount;

	}

	public String Cal1(Double sum, Double amount, String option, int rollCount) {
		NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		String url = "";
		ft.format(amountBet);
		if (option.equals("low")) {
			if (sum <= 6) {
				ft.format(totalBetAmount = amountBet * 1);
				ft.format(totalAmount += totalBetAmount);
				url = "RollWinView.jsp";
			} else {
				ft.format(totalAmount -= amountBet);
				ft.format(totalBetAmount = amountBet);
				url = "RollLossView.jsp";
			}
		}
		if (option.equals("seven")) {
			if (sum == 7) {
				ft.format(totalBetAmount = amountBet * 4);
				ft.format(totalAmount += totalBetAmount);
				url = "RollWinView.jsp";
			} else {
				ft.format(totalAmount -= amountBet);
				ft.format(totalBetAmount = amountBet);
				url = "RollLossView.jsp";
			}
		}
		if (option.equals("high")) {
			if (sum > 7) {
				ft.format(totalBetAmount = amountBet * 1);
				ft.format(totalAmount += totalBetAmount);
				url = "RollWinView.jsp";
			} else {
				ft.format(totalAmount -= amountBet);
				ft.format(totalBetAmount = amountBet);
				url = "RollLossView.jsp";
			}
		}
		return url;

	}

	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the amountBet
	 */
	public Double getAmountBet() {
		return amountBet;
	}

	/**
	 * @param amountBet the amountBet to set
	 */
	public void setAmountBet(Double amountBet) {
		this.amountBet = amountBet;
	}

	/**
	 * @return the betType
	 */
	public String getBetType() {
		return betType;
	}

	/**
	 * @param betType the betType to set
	 */
	public void setBetType(String betType) {
		this.betType = betType;
	}

	/**
	 * @return the totalBetAmount
	 */
	public Double getTotalBetAmount() {
		return totalBetAmount;
	}

	/**
	 * @param totalBetAmount the totalBetAmount to set
	 */
	public void setTotalBetAmount(Double totalBetAmount) {
		this.totalBetAmount = totalBetAmount;
	}

	/**
	 * @return the betType
	 */
	public Integer getRollCount() {
		return rollCount;
	}

	/**
	 * @param betType the betType to set
	 */
	public void setRollCount(Integer rollCount) {
		this.rollCount = rollCount;
	}

	public String showDiceImages(int dice1, int dice2) {
		String diceImage = " ";
		for (int i = 1; i <= 6; i++) {
			if ((dice1 == 1) && (dice1 == i)) {
				diceImage += "<img src=\"images/Dice-1.png\">&nbsp";
			}
			if ((dice1 == 2) && (dice1 == i)) {
				diceImage += "<img src=\"images/Dice-2.png\">&nbsp";
			}

			if ((dice1 == 3) && (dice1 == i)) {
				diceImage += "<img src=\"images/Dice-3.png\">&nbsp";
			}

			if ((dice1 == 4) && (dice1 == i)) {
				diceImage += "<img src=\"images/Dice-4.png\">&nbsp";
			}

			if ((dice1 == 5) && (dice1 == i)) {
				diceImage += "<img src=\"images/Dice-5.png\">&nbsp";
			}

			if ((dice1 == 6) && (dice1 == i)) {
				diceImage += "<img src=\"images/Dice-6.png\">&nbsp";
			}
		}

		for (int i = 1; i <= 6; i++) {
			if ((dice2 == 1) && (dice2 == i)) {
				diceImage += "<img src=\"images/Dice-1.png\" alt=\"dice2\">";
			}
			if ((dice2 == 2) && (dice2 == i)) {
				diceImage += "<img src=\"images/Dice-2.png\" alt=\"dice2\">";
			}

			if ((dice2 == 3) && (dice2 == i)) {
				diceImage += "<img src=\"images/Dice-3.png\" alt=\"dice2\">";
			}

			if ((dice2 == 4) && (dice2 == i)) {
				diceImage += "<img src=\"images/Dice-4.png\" alt=\"dice2\">";
			}
			if ((dice2 == 5) && (dice2 == i)) {
				diceImage += "<img src=\"images/Dice-5.png\" alt=\"dice2\">";
			}
			if ((dice2 == 6) && (dice2 == i)) {
				diceImage += "<img src=\"images/Dice-6.png\" alt=\"dice2\">";
			}
		}

		return diceImage;
	}

	public int rollCount() {
		rollCount++;
		return rollCount;
	}

}

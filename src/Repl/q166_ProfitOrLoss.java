package Repl;

public class q166_ProfitOrLoss {
	
	public String c_profits (int buyPrice,int sellPrice)
	  {
	    if(buyPrice<sellPrice){
	      return "profit";
	    }else if(buyPrice>sellPrice){
	      return "loss";
	    }else{
	      return "no loss";
	    }
	   
	   
	   
	  }

}

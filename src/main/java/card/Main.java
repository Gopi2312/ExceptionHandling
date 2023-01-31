package assignment.card;
import java.util.*;
import java.util.logging.*;
public class Main 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger("hi");
        log.info("Enter Card Holder Name:");
        String cardname = sc.nextLine();
        log.info("Enter Card Number:");
        Long cardnum = sc.nextLong();
        log.info("Enter Expire Date:");
        String exdate = sc.next();
        
        TestCard tc = new TestCard(cardname,cardnum,exdate);
        TestCard tc1 = tc.clo();
        
        Long valnum = 97889122l;
        log.info(tc1.test(valnum));
        boolean x = tc1.test(valnum);
        if(x==1)
        {
        	log.fine("Card Name: {} \n Card number: {} cardnum \n {} Expiry Date: {}" ,cardname,cardnum,exdate);
        }
        else
        {
            log.info("invalid");
        }
    }


}

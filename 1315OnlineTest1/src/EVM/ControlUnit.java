package EVM;
import java.util.ArrayList;
import java.util.List;
public class ControlUnit {
BusyLamp busy = new BusyLamp();
TotalButton total = new TotalButton();
BallotButton ballot = new BallotButton();

int totalvotes;

public void voting(BallotingUnit BU,int no){
	ballot.press();
	busy.setState("on");
	BU.r.setState("ready");
	if(BU.vote(no)==1){
		totalvotes++;
	}
	busy.setState("off");
	BU.r.setState("off");
}
public int getVotes()
{
	return totalvotes;
}

}
package EVM;
import java.util.ArrayList;
import java.util.List;

public class BallotingUnit {
List<Ballotmachine> slot = new ArrayList<Ballotmachine>();
ReadyLamp r = new ReadyLamp();
BallotingUnit(int NoOfCandidates){
	for(int i=0;i<NoOfCandidates;i++)
	slot.add(new Ballotmachine());
}
public void addCandidate(String name,int index){
	slot.get(index).c.setName(name);
}
public int vote(int no){
	if (r.getState().equals("ready")){
		slot.get(no).b.press();
		return 1;
	}
	return 0;
	
}
}

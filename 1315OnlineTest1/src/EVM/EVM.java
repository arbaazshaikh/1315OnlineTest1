package EVM;

public class EVM {
ControlUnit CU;
BallotingUnit BU;
EVM(int NoOfCandidates){
	CU = new ControlUnit();
	BU = new BallotingUnit(NoOfCandidates);
}
public void addCandidates(String name,int index){
	BU.addCandidate(name, index);
}
public void voting(int no){
	CU.voting(BU, no);
}
public int totalvotes()
{
	return CU.getVotes();
}
}

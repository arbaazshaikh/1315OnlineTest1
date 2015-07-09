package EVM;

import static org.junit.Assert.*;

import org.junit.Test;

public class EVMTest {
EVM e = new EVM(2);
@Test
public void testtotalvotes(){
	e.addCandidates("arbaaz", 1);
	e.addCandidates("clyde", 2);

	e.voting(1);
	e.voting(2);
	assertEquals(4,e.totalvotes());
}
}	
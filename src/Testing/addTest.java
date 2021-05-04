package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	
	void test() {
		Add test=new Add();
		int output=test.add(15, 25);
		assertEquals(40,output);
	}

}

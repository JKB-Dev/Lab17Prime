package com.primes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeTester {

	@Test
	void prime1() {
		assertEquals(PrimeMethod.prime(0), 2);
		//fail("Not yet implemented");
	}

	@Test
	void prime2() {
		assertEquals(PrimeMethod.prime(1), 3);
		//fail("Not yet implemented");
	}
	
	@Test
	void prime3() {
		assertEquals(PrimeMethod.prime(2), 5);
		//fail("Not yet implemented");
	}
	
	@Test
	void prime4() {
		assertEquals(PrimeMethod.prime(3), 7);
		//fail("Not yet implemented");
	}
	
	@Test
	void prime17() {
		assertEquals(PrimeMethod.prime(16), 53);
	}
	
	@Test
	void prime32() {
		assertEquals(PrimeMethod.prime(31), 127);
	}
	
	@Test
	void prime47() {
		assertEquals(PrimeMethod.prime(46), 199);
	}
}

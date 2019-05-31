package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(7).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(0).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(5).max(10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(0).max(2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new OpenIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenIntervalBuilder().min(16).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
}

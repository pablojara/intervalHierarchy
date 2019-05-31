package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;

public class ClosedIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(1).max(7).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(3).max(7).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(7).max(17).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(0).max(17).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(5).max(10).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(0).max(2).openFEP(false).openUEP(false).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(16).max(22).openFEP(false).openUEP(false).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByOne() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(14).max(22).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	
}

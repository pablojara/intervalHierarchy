package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OpenClosedIntervalTest {
	
	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(14).max(18).openFEP(true).openUEP(false).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(true).openUEP(true).build();
		Interval another = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(false).build();
		Interval another = new IntervalBuilder().min(7).max(17).openFEP(true).openUEP(false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().min(3).max(14).openFEP(false).openUEP(true).build();
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
		Interval another = new IntervalBuilder().min(0).max(2).openFEP(true).openUEP(false).build();
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
	
	@Test
	public void testIsIntersectedOneEmptyInterval() {
		Interval one = new IntervalBuilder().min(3).max(3).openFEP(true).openUEP(true).build();
		Interval another = new IntervalBuilder().min(2).max(6).openFEP(true).openUEP(true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedTwoEmptyInterval() {
		Interval one = new IntervalBuilder().min(3).max(3).openFEP(true).openUEP(true).build();
		Interval another = new IntervalBuilder().min(3).max(3).openFEP(true).openUEP(true).build();
		assertFalse(one.isIntersected(another));
	}
	
}

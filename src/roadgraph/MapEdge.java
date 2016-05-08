package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
	public String streetName;
	public String streetType;
	public double distance;
	public GeographicPoint start;
	public GeographicPoint goal;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetType() {
		return streetType;
	}
	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public GeographicPoint getStart() {
		return start;
	}
	public void setStart(GeographicPoint start) {
		this.start = start;
	}
	public GeographicPoint getGoal() {
		return goal;
	}
	public void setGoal(GeographicPoint goal) {
		this.goal = goal;
	}
	
	
	
}

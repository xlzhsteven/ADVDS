package roadgraph;

import java.util.List;

import geography.GeographicPoint;

public class MapNode {
	public GeographicPoint node;
	public List<MapEdge> edges;
	public GeographicPoint getNode() {
		return node;
	}
	public void setNode(GeographicPoint node) {
		this.node = node;
	}
	public List<MapEdge> getEdges() {
		return edges;
	}
	public void setEdges(List<MapEdge> edges) {
		this.edges = edges;
	}
	
}

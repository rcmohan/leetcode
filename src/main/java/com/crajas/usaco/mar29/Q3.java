package com.crajas.usaco.mar29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q3 {
	BufferedReader br;
	PrintWriter pw;

	boolean debug = true;
	
	class Particle {
		public int x, y;
		Set<Particle> neighbors = new HashSet();
		public String neighbors () { StringBuilder str = new StringBuilder(); neighbors.forEach(n -> str.append("[n.x:" + n.x + ", n.y:" + n.y + "]")); return str.toString(); }
		public String toString() { return "[x:" + x + ", y:" + y + "; " + neighbors() + "]"; }
	}
	
	public static void main(String[] args) throws IOException {
		Q3 q1 = new Q3();
		q1.process();
	}
	
	public void process() throws IOException {
		
		setIO("q1");
		
		List<Particle> particles = getParticles(br);
		if(debug) System.out.println("Befor sort:" + particles);
		particles.sort((a, b) -> (a.x - b.x) == 0 ? (a.y - b.y) : (a.x - b.x));
//		if(debug) System.out.println("After sort:" + particles);
		discoverNeighbors(particles);
		Set<Particle> longestMap = new HashSet<Particle>();
		particles.sort((a, b) -> a.neighbors.size() - b.neighbors.size());
		if(debug) System.out.println(particles);
		boolean toAdd = true;
		Set<Particle> longest = new HashSet<>();
		longest.add(particles.get(particles.size() - 1));
		if(debug) System.out.println("Start at: " + longest);
		while(toAdd) {
			Set<Particle> newSet = new HashSet<>();
			int size = longest.size();
			for(Particle p : longest) {
				newSet.add(p);
				if(debug) System.out.println("Between: " + newSet);
				newSet.addAll(p.neighbors);
			}
			toAdd = newSet.size() != size;
			if(debug) System.out.println("Between: " + newSet + "; " + toAdd);
			longest = newSet;
		}
		if(debug) System.out.println("End at: " + longest);
		if(debug) System.out.println(particles.size() - longest.size() + 1);
		pw.println(particles.size() - longest.size() + 1);
		pw.close();
	}
	

	private void discoverNeighbors(List<Particle> ps) {
		for(int i = 0; i < ps.size(); ++i) {
			for(int j = i + 1; j < ps.size(); ++j) {
				compare(ps.get(i), ps.get(j));
			}
			System.out.println(i + ": " + ps.get(i));
		}
	}
	


	private boolean compare(Particle particle, Particle particle2) {
		boolean toConnect = particle.x <= particle2.x && particle.y <= particle2.y;
		if(toConnect) {
			particle.neighbors.add(particle2);
			particle2.neighbors.add(particle);
		}
		return toConnect;
	}




	private List<Particle> getParticles(BufferedReader br2) throws IOException {
		Integer total = Integer.parseInt(br2.readLine());
		List<Particle> ps = new ArrayList<Particle>();
		while(total -- > 0) {
			String[] s = br.readLine().split(" ");
			Particle p = new Particle();
			p.x = Integer.parseInt(s[0]);
			p.y = Integer.parseInt(s[1]);
			ps.add(p);
		}
		return ps;
	}

	public void setIO() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(System.out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void setIO(String s) {
		try {
			br = new BufferedReader(new FileReader(s + ".in"));
			pw = new PrintWriter(new BufferedWriter(new FileWriter(s + ".out")));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}


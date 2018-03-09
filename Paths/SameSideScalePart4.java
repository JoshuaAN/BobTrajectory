package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScalePart4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	
    public SameSideScalePart4() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideScalePart4(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.000,0.000,0.010,0.000},
				{0.000,0.000,0.010,0.829},
				{0.000,0.000,0.010,1.658},
				{0.000,0.000,0.010,2.487},
				{0.000,0.000,0.010,3.317},
				{0.000,0.000,0.010,4.146},
				{0.000,0.000,0.010,4.975},
				{0.000,0.000,0.010,5.804},
				{0.000,0.000,0.010,6.633},
				{0.000,0.000,0.010,7.462},
				{0.000,0.000,0.010,8.291},
				{0.000,0.000,0.010,9.121},
				{0.000,0.000,0.010,9.950},
				{0.000,0.000,0.010,10.779},
				{0.000,0.000,0.010,11.608},
				{0.000,0.000,0.010,12.437},
				{0.000,0.000,0.010,13.266},
				{0.000,0.000,0.010,14.095},
				{0.000,0.000,0.010,14.925},
				{0.000,0.000,0.010,15.754},
				{0.000,0.000,0.010,16.583},
				{0.000,0.000,0.010,17.412},
				{0.000,0.000,0.010,18.241},
				{0.000,0.000,0.010,19.070},
				{0.000,0.000,0.010,19.899},
				{0.000,0.000,0.010,20.729},
				{0.000,0.000,0.010,21.558},
				{0.000,0.000,0.010,22.387},
				{0.000,0.000,0.010,23.216},
				{0.000,0.000,0.010,24.045},
				{0.000,0.000,0.010,24.874},
				{0.000,0.000,0.010,25.704},
				{0.000,0.000,0.010,26.533},
				{0.000,0.000,0.010,27.362},
				{0.000,0.000,0.010,28.191},
				{0.000,0.000,0.010,29.020},
				{0.000,0.000,0.010,29.849},
				{0.000,0.000,0.010,30.678},
				{0.000,0.000,0.010,31.508},
				{0.000,0.000,0.010,32.337},
				{0.000,0.000,0.010,33.166},
				{0.000,0.000,0.010,33.995},
				{0.000,0.000,0.010,34.824},
				{0.000,0.000,0.010,35.653},
				{0.000,0.000,0.010,36.482},
				{0.000,0.000,0.010,37.312},
				{0.000,0.000,0.010,38.141},
				{0.000,0.000,0.010,38.970},
				{0.000,0.000,0.010,39.799},
				{0.000,0.000,0.010,40.628},
				{0.000,0.000,0.010,41.457},
				{0.000,0.000,0.010,42.286},
				{0.000,0.000,0.010,43.116},
				{0.000,0.000,0.010,43.945},
				{0.000,0.000,0.010,44.774},
				{0.000,0.000,0.010,45.603},
				{0.000,0.000,0.010,46.432},
				{0.000,0.000,0.010,47.261},
				{0.000,0.000,0.010,48.090},
				{0.000,0.000,0.010,48.920},
				{0.000,0.000,0.010,49.749},
				{0.000,0.000,0.010,50.578},
				{0.000,0.000,0.010,51.407},
				{0.000,0.000,0.010,52.236},
				{0.000,0.000,0.010,53.065},
				{0.000,0.000,0.010,53.894},
				{0.000,0.000,0.010,54.724},
				{0.000,0.000,0.010,55.553},
				{0.000,0.000,0.010,56.382},
				{0.000,0.000,0.010,57.211},
				{0.000,0.000,0.010,58.040},
				{0.000,0.000,0.010,58.869},
				{0.000,0.000,0.010,59.698},
				{0.000,0.000,0.010,60.528},
				{0.000,0.000,0.010,61.357},
				{0.000,0.000,0.010,62.186},
				{0.000,0.000,0.010,63.015},
				{0.000,0.000,0.010,63.844},
				{0.000,0.000,0.010,64.673},
				{0.000,0.000,0.010,65.503},
				{0.000,0.000,0.010,66.332},
				{0.000,0.000,0.010,67.161},
				{0.000,0.000,0.010,67.990},
				{0.000,0.000,0.010,68.819},
				{0.000,0.000,0.010,69.648},
				{0.000,0.000,0.010,70.477},
				{0.000,0.000,0.010,71.307},
				{0.000,0.000,0.010,72.136},
				{0.000,0.000,0.010,72.965},
				{0.000,0.000,0.010,73.794},
				{0.000,0.000,0.010,74.623},
				{0.000,0.000,0.010,75.452},
				{0.000,0.000,0.010,76.281},
				{0.000,0.000,0.010,77.111},
				{0.000,0.000,0.010,77.940},
				{0.000,0.000,0.010,78.769},
				{0.000,0.000,0.010,79.598},
				{0.000,0.000,0.010,80.427},
				{0.000,0.000,0.010,81.256},
				{0.000,0.000,0.010,82.085},
				{0.000,0.000,0.010,82.915},
				{0.000,0.000,0.010,83.744},
				{0.000,0.000,0.010,84.573},
				{0.000,0.000,0.010,85.402},
				{0.000,0.000,0.010,86.231},
				{0.000,0.000,0.010,87.060},
				{0.000,0.000,0.010,87.889},
				{0.000,0.000,0.010,88.719},
				{0.000,0.000,0.010,89.548},
				{0.000,0.000,0.010,90.377},
				{0.000,0.000,0.010,91.206},
				{0.000,0.000,0.010,92.035},
				{0.000,0.000,0.010,92.864},
				{0.000,0.000,0.010,93.693},
				{0.000,0.000,0.010,94.523},
				{0.000,0.000,0.010,95.352},
				{0.000,0.000,0.010,96.181},
				{0.000,0.000,0.010,97.010},
				{0.000,0.000,0.010,97.839},
				{0.000,0.000,0.010,98.668},
				{0.000,0.000,0.010,99.497},
				{0.000,0.000,0.010,100.327},
				{0.000,0.000,0.010,101.156},
				{0.000,0.000,0.010,101.985},
				{0.000,0.000,0.010,102.814},
				{0.000,0.000,0.010,103.643},
				{0.000,0.000,0.010,104.472},
				{0.000,0.000,0.010,105.302},
				{0.000,0.000,0.010,106.131},
				{0.000,0.000,0.010,106.960},
				{0.000,0.000,0.010,107.789},
				{0.000,0.000,0.010,108.618},
				{0.000,0.000,0.010,109.447},
				{0.000,0.000,0.010,110.276},
				{0.000,0.000,0.010,111.106},
				{0.000,0.000,0.010,111.935},
				{0.000,0.000,0.010,112.764},
				{0.000,0.000,0.010,113.593},
				{0.000,0.000,0.010,114.422},
				{0.000,0.000,0.010,115.251},
				{0.000,0.000,0.010,116.080},
				{0.000,0.000,0.010,116.910},
				{0.000,0.000,0.010,117.739},
				{0.000,0.000,0.010,118.568},
				{0.000,0.000,0.010,119.397},
				{0.000,0.000,0.010,120.226},
				{0.000,0.000,0.010,121.055},
				{0.000,0.000,0.010,121.884},
				{0.000,0.000,0.010,122.714},
				{0.000,0.000,0.010,123.543},
				{0.000,0.000,0.010,124.372},
				{0.000,0.000,0.010,125.201},
				{0.000,0.000,0.010,126.030},
				{0.000,0.000,0.010,126.859},
				{0.000,0.000,0.010,127.688},
				{0.000,0.000,0.010,128.518},
				{0.000,0.000,0.010,129.347},
				{0.000,0.000,0.010,130.176},
				{0.000,0.000,0.010,131.005},
				{0.000,0.000,0.010,131.834},
				{0.000,0.000,0.010,132.663},
				{0.000,0.000,0.010,133.492},
				{0.000,0.000,0.010,134.322},
				{0.000,0.000,0.010,135.151},
				{0.000,0.000,0.010,135.980},
				{0.000,0.000,0.010,136.809},
				{0.000,0.000,0.010,137.638},
				{0.000,0.000,0.010,138.467},
				{0.000,0.000,0.010,139.296},
				{0.000,0.000,0.010,140.126},
				{0.000,0.000,0.010,140.955},
				{0.000,0.000,0.010,141.784},
				{0.000,0.000,0.010,142.613},
				{0.000,0.000,0.010,143.442},
				{0.000,0.000,0.010,144.271},
				{0.000,0.000,0.010,145.101},
				{0.000,0.000,0.010,145.930},
				{0.000,0.000,0.010,146.759},
				{0.000,0.000,0.010,147.588},
				{0.000,0.000,0.010,148.417},
				{0.000,0.000,0.010,149.246},
				{0.000,0.000,0.010,150.075},
				{0.000,0.000,0.010,150.905},
				{0.000,0.000,0.010,151.734},
				{0.000,0.000,0.010,152.563},
				{0.000,0.000,0.010,153.392},
				{0.000,0.000,0.010,154.221},
				{0.000,0.000,0.010,155.050},
				{0.000,0.000,0.010,155.879},
				{0.000,0.000,0.010,156.709},
				{0.000,0.000,0.010,157.538},
				{0.000,0.000,0.010,158.367},
				{0.000,0.000,0.010,159.196},
				{0.000,0.000,0.010,160.025},
				{0.000,0.000,0.010,160.854},
				{0.000,0.000,0.010,161.683},
				{0.000,0.000,0.010,162.513},
				{0.000,0.000,0.010,163.342},
				{0.000,0.000,0.010,164.171},
				{0.000,0.000,0.010,165.000}		};

}
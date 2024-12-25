package com.getrosoft.teleport.controller;

import java.util.Random;

public class SSPO {
	// Number of sharks (solutions)
	private int numSharks;
	// Number of iterations
	private int numIterations;
	// Dimensionality of the search space
	private int numDimensions;
	// Bounds of the search space
	private double[] lowerBounds;
	private double[] upperBounds;
	// Fitness function
	private FitnessFunction fitnessFunction;
	
	public SSPO(int numSharks, int numIterations, int numDimensions, double[] lowerBounds, double[] upperBounds, FitnessFunction fitnessFunction) {
		this.numSharks = numSharks;
		this.numIterations = numIterations;
		this.numDimensions = numDimensions;
		this.lowerBounds = lowerBounds;
		this.upperBounds = upperBounds;
		this.fitnessFunction = fitnessFunction;
	}
	
	public void run() {
		// Initialize sharks (solutions)
		double[][] sharks = new double[numSharks][numDimensions];
		Random random = new Random();
		for (int i = 0; i < numSharks; i++) {
			for (int j = 0; j < numDimensions; j++) {
				sharks[i][j] = lowerBounds[j] + random.nextDouble() * (upperBounds[j] - lowerBounds[j]);
			}
		}
		
		// Evaluate initial sharks
		double[] fitnessValues = new double[numSharks];
		for (int i = 0; i < numSharks; i++) {
			fitnessValues[i] = fitnessFunction.evaluate(sharks[i]);
		}
		
		// Main loop
		for (int iteration = 0; iteration < numIterations; iteration++) {
			// Exploration phase
			for (int i = 0; i < numSharks; i++) {
				// Randomly select a dimension to perturb
				int dimension = random.nextInt(numDimensions);
				// Perturb the selected dimension using Gaussian distribution
				sharks[i][dimension] += random.nextGaussian() * 0.1;
				// Ensure the perturbed value is within bounds
				sharks[i][dimension] = Math.max(lowerBounds[dimension], Math.min(upperBounds[dimension], sharks[i][dimension]));
			}
			
			// Evaluate perturbed sharks
			for (int i = 0; i < numSharks; i++) {
				fitnessValues[i] = fitnessFunction.evaluate(sharks[i]);
			}
			
			// Exploitation phase
			for (int i = 0; i < numSharks; i++) {
				// Find the best shark in the neighborhood
				int bestNeighbor = i;
				for (int j = 0; j < numSharks; j++) {
					if (fitnessValues[j] > fitnessValues[bestNeighbor]) {
						bestNeighbor = j;
					}
				}
				// Update the current shark using the best neighbor
				for (int j = 0; j < numDimensions; j++) {
					sharks[i][j] += 0.1 * (sharks[bestNeighbor][j] - sharks[i][j]);
				}
			}
		}
		
		// Print the best shark (solution)
		int bestShark = 0;
		for (int i = 0; i < numSharks; i++) {
			if (fitnessValues[i] > fitnessValues[bestShark]) {
				bestShark = i;
			}
		}
		System.out.println("Best shark (solution):");
		for (int i = 0; i < numDimensions; i++) {
			System.out.print(sharks[bestShark][i] + " ");
		}
		System.out.println();
	}
	
	public interface FitnessFunction {
		double evaluate(double[] solution);
	}
	
	public static void main(String[] args) {
		// Define the fitness function
		SSPO.FitnessFunction fitnessFunction = new SSPO.FitnessFunction() {
			@Override
			public double evaluate(double[] solution) {
				// Replace this with your actual fitness function
				return solution[0] + solution[1];
			}
		};
		
		// Define the bounds of the search space
		double[] lowerBounds = new double[] { 0.0, 0.0 };
		double[] upperBounds = new double[] { 10.0, 10.0 };
		
		// Create an instance of the SSPO algorithm
		SSPO sspo = new SSPO(10, 100, 2, lowerBounds, upperBounds, fitnessFunction);
		
		// Run the SSPO algorithm
		sspo.run();
	}
}
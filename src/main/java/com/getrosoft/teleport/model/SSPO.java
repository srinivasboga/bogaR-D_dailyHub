package com.getrosoft.teleport.model;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class SSPO {
	private final int numSharks;
	private final int numIterations;
	private final int numDimensions;
	private final double[] lowerBounds;
	private final double[] upperBounds;
	private final FitnessFunction fitnessFunction;
	
	public SSPO(int numSharks, int numIterations, int numDimensions, double[] lowerBounds, double[] upperBounds, FitnessFunction fitnessFunction) {
		this.numSharks = numSharks;
		this.numIterations = numIterations;
		this.numDimensions = numDimensions;
		this.lowerBounds = lowerBounds;
		this.upperBounds = upperBounds;
		this.fitnessFunction = fitnessFunction;
	}
	
	public void run() {
		double[][] sharks = new double[numSharks][numDimensions];
		Random random = ThreadLocalRandom.current();
		initializeSharks(sharks, random);
		
		double[] fitnessValues = evaluateFitness(sharks);
		
		for (int iteration = 0; iteration < numIterations; iteration++) {
			exploreSharks(sharks, random);
			
			fitnessValues = evaluateFitness(sharks);
			
			exploitBestSharks(sharks, fitnessValues);
		}
		
		printBestShark(sharks, fitnessValues);
	}
	
	private void initializeSharks(double[][] sharks, Random random) {
		IntStream.range(0, numSharks).parallel().forEach(i -> {
			for (int j = 0; j < numDimensions; j++) {
				sharks[i][j] = lowerBounds[j] + random.nextDouble() * (upperBounds[j] - lowerBounds[j]);
			}
		});
	}
	
	private double[] evaluateFitness(double[][] sharks) {
		return IntStream.range(0, numSharks).parallel()
				.mapToDouble(i -> fitnessFunction.evaluate(sharks[i]))
				.toArray();
	}
	
	private void exploreSharks(double[][] sharks, Random random) {
		IntStream.range(0, numSharks).parallel().forEach(i -> {
			int dimension = random.nextInt(numDimensions);
			sharks[i][dimension] += random.nextGaussian() * 0.1;
			
			sharks[i][dimension] = Math.max(lowerBounds[dimension], Math.min(upperBounds[dimension], sharks[i][dimension]));
		});
	}
	
	private void exploitBestSharks(double[][] sharks, double[] fitnessValues) {
		int bestSharkIndex = IntStream.range(0, numSharks)
				.reduce((i, j) -> fitnessValues[i] > fitnessValues[j] ? i : j)
				.orElse(0);
		
		double[] bestShark = sharks[bestSharkIndex];
		IntStream.range(0, numSharks).parallel().forEach(i -> {
			for (int j = 0; j < numDimensions; j++) {
				sharks[i][j] += 0.1 * (bestShark[j] - sharks[i][j]);            }
		});
	}
	
	private void printBestShark(double[][] sharks, double[] fitnessValues) {
		int bestSharkIndex = IntStream.range(0, numSharks)
				.reduce((i, j) -> fitnessValues[i] > fitnessValues[j] ? i : j)
				.orElse(0);
		
		System.out.println("Best shark (solution) found:");
		for (int j = 0; j < numDimensions; j++) {
			System.out.print(sharks[bestSharkIndex][j] + " ");
		}
		System.out.println("\nFitness: " + fitnessValues[bestSharkIndex]);
	}
	
	public interface FitnessFunction {
		double evaluate(double[] solution);
	}
	
	public static void main(String[] args) {
		FitnessFunction fitnessFunction = solution -> solution[0] + solution[1];
		
		double[] lowerBounds = {0.0, 0.0};
		double[] upperBounds = {10.0, 10.0};
		
		SSPO sspo = new SSPO(10, 100, 2, lowerBounds, upperBounds, fitnessFunction);
		sspo.run();
	}
}

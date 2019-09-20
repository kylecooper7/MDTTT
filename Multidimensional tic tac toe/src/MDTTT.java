import java.util.Scanner;

public class MDTTT {
	public static void main(String[] args) {
		Scanner intInput = new Scanner(System.in);
		int[] inputPositions = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[][] inputPositions2 = new int[10][10];
		int digit;
		int counter = 0;
		int moveCounterCounter = 0;
		boolean zeFlag = false;
		boolean isNegative = false;
		int theKValue = 0;
		System.out.println(
				"Welcome to logical, multidimensional tic tac toe. Normal rules Apply, except there are no diagonals. . Play Up to 10 dimensions.");
		System.out.println("How many dimensions will you be playing in today?");
		int dimensions = intInput.nextInt();
		System.out.println("How many in a row to win?");
		int inARow = intInput.nextInt();
		System.out.println("How big of a board? (one integer please)");
		int boardSize = intInput.nextInt();
		boardSize = boardSize + 1;
		String[][][][][][][][][][] board = new String[boardSize][boardSize][boardSize][boardSize][boardSize][boardSize][boardSize][boardSize][boardSize][boardSize];
		for (int a = 0; a < board.length; a++) {
			for (int b = 0; b < board[a].length; b++) {
				for (int c = 0; c < board[a][b].length; c++) {
					for (int d = 0; d < board[a][b][c].length; d++) {
						for (int e = 0; e < board[a][b][c][d].length; e++) {
							for (int f = 0; f < board[a][b][c][d][e].length; f++) {
								for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
									for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
										for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
											for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

												board[a][b][c][d][e][f][g][h][i][j] = a + ", " + b + ", " + c + ", " + d
														+ ", " + e + ", " + f + ", " + g + ", " + h + ", " + i + ", "
														+ j + ": " + "empty";

											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Please input a " + dimensions
				+ " digit integer corresponding to the position you want to play. \nIf at any time you would like to see the list of positions, type a zero.");
		boolean playing = true;
		while (playing) {
			counter++;
			if (counter > 1) {
				System.out.println("Please input a " + dimensions
						+ " digit integer corresponding to the position you want to play.");
			}
			int input = intInput.nextInt();
			if (input == 0) {
				
				if(dimensions == 10) {
				for (int a = 0; a < board.length; a++) {
					for (int b = 0; b < board[a].length; b++) {
						for (int c = 0; c < board[a][b].length; c++) {
							for (int d = 0; d < board[a][b][c].length; d++) {
								for (int e = 0; e < board[a][b][c][d].length; e++) {
									for (int f = 0; f < board[a][b][c][d][e].length; f++) {
										for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
											for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
												for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
													
													for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

														System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
													

													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
			
				if(dimensions == 9) {
					int a = 0;
						for (int b = 0; b < board[a].length; b++) {
							for (int c = 0; c < board[a][b].length; c++) {
								for (int d = 0; d < board[a][b][c].length; d++) {
									for (int e = 0; e < board[a][b][c][d].length; e++) {
										for (int f = 0; f < board[a][b][c][d][e].length; f++) {
											for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
												for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												}
											}
										}
									}
								}
							}
						}
					
					
				}
				
				if(dimensions == 8) {
					int a = 0;
					int b = 0;
							for (int c = 0; c < board[a][b].length; c++) {
								for (int d = 0; d < board[a][b][c].length; d++) {
									for (int e = 0; e < board[a][b][c][d].length; e++) {
										for (int f = 0; f < board[a][b][c][d][e].length; f++) {
											for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
												for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												}
											}
										}
									}
								}
							}
						
					
					
				}
				
				if(dimensions == 7) {
					int a = 0;
					int b = 0;
					int c = 0;
								for (int d = 0; d < board[a][b][c].length; d++) {
									for (int e = 0; e < board[a][b][c][d].length; e++) {
										for (int f = 0; f < board[a][b][c][d][e].length; f++) {
											for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
												for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												}
											}
										}
									}
								}
							
						
					
					
				}
				
				if(dimensions == 6) {
					int a = 0;
					int b = 0;
					int c = 0;
					int d = 0;
									for (int e = 0; e < board[a][b][c][d].length; e++) {
										for (int f = 0; f < board[a][b][c][d][e].length; f++) {
											for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
												for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												}
											}
										}
									}
								
							
						
					
					
				}
				
				if(dimensions == 5) {
					int a = 0;
					int b = 0;
					int c = 0;
					int d = 0;
					int e = 0;
										for (int f = 0; f < board[a][b][c][d][e].length; f++) {
											for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
												for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												}
											}
										}
									
								
							
						
					
					
				}
				
				if(dimensions == 4) {
					int a = 0;
					int b = 0;
					int c = 0;
					int d = 0;
					int e = 0;
					int f = 0;
											for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
												for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												}
											}
										
									
								
							
						
					
					
				}
				
				if(dimensions == 3) {
					int a = 0;
					int b = 0;
					int c = 0;
					int d = 0;
					int e = 0;
					int f = 0;
					int g = 0;
												for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												}
											
										
									
								
							
						
					
					
				}
				
				if(dimensions == 2) {
					int a = 0;
					int b = 0;
					int c = 0;
					int d = 0;
					int e = 0;
					int f = 0;
					int g = 0;
					int h = 0;
													for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													}
												
											
										
									
								
							
						
					
					
				}
				
				if(dimensions == 1) {
					int a = 0;
					int b = 0;
					int c = 0;
					int d = 0;
					int e = 0;
					int f = 0;
					int g = 0;
					int h = 0;
					int i = 0;
													
														
														for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

															System.out.println(board[a][b][c][d][e][f][g][h][i][j]);
														

														}
													
												
											
										
									
								
							
						
					
					
				}
				
			} 
			
			else {
				for (int i = 0; i < 10; i++) {
					inputPositions[i] = 0;
				}
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						inputPositions2[i][j] = 0;
					}
				}

				String number = String.valueOf(input);
				for (int i = 0; i < dimensions; i++) {
					digit = Character.digit(number.charAt(i), 10);
					inputPositions[i] = digit;
				}
				board[inputPositions[9]][inputPositions[8]][inputPositions[7]][inputPositions[6]][inputPositions[5]][inputPositions[4]][inputPositions[3]][inputPositions[2]][inputPositions[1]][inputPositions[0]] = inputPositions[9]
						+ ", " + inputPositions[8] + ", " + inputPositions[7] + ", " + inputPositions[6] + ", "
						+ inputPositions[5] + ", " + inputPositions[4] + ", " + inputPositions[3] + ", "
						+ inputPositions[2] + ", " + inputPositions[1] + ", " + inputPositions[0] + ": " + "you";
				/////////// Check if won
				for (int a = 0; a < board.length; a++) {
					for (int b = 0; b < board[a].length; b++) {
						for (int c = 0; c < board[a][b].length; c++) {
							for (int d = 0; d < board[a][b][c].length; d++) {
								for (int e = 0; e < board[a][b][c][d].length; e++) {
									for (int f = 0; f < board[a][b][c][d][e].length; f++) {
										for (int g = 0; g < board[a][b][c][d][e][f].length; g++) {
											for (int h = 0; h < board[a][b][c][d][e][f][g].length; h++) {
												for (int i = 0; i < board[a][b][c][d][e][f][g][h].length; i++) {
													for (int j = 0; j < board[a][b][c][d][e][f][g][h][i].length; j++) {

														if (board[a][b][c][d][e][f][g][h][i][j].equals(a + ", " + b
																+ ", " + c + ", " + d + ", " + e + ", " + f + ", " + g
																+ ", " + h + ", " + i + ", " + j + ": " + "you")) {
															moveCounterCounter++;
															if (moveCounterCounter == inARow) {
																zeFlag = true;
															} else {
																for (int x = 0; x < 10; x++) {
																	inputPositions2[x][x] = moveCounterCounter;

																
															}
															for (int k = 0; k < 9; k++) {

																if (board[a + inputPositions2[k][9]][b
																		+ inputPositions2[k][9]][c
																				+ inputPositions2[k][9]][d
																						+ inputPositions2[k][9]][e
																								+ inputPositions2[k][9]][f
																										+ inputPositions2[k][9]][g
																												+ inputPositions2[k][9]][h
																														+ inputPositions2[k][9]][i
																																+ inputPositions2[k][9]][j
																																		+ inputPositions2[k][9]]
																																				.equals(a
																																						+ ", "
																																						+ b
																																						+ ", "
																																						+ c
																																						+ ", "
																																						+ d
																																						+ ", "
																																						+ e
																																						+ ", "
																																						+ f
																																						+ ", "
																																						+ g
																																						+ ", "
																																						+ h
																																						+ ", "
																																						+ i
																																						+ ", "
																																						+ j
																																						+ ": "
																																						+ "you")) {
																	moveCounterCounter++;
																	if (moveCounterCounter == inARow) {
																		zeFlag = true;
																	} else {

																		for (int x = 0; x < 10; x++) {
																			inputPositions2[x][x] = moveCounterCounter;
																			
																		}

																		if (board[a + inputPositions2[k][9]][b
																				+ inputPositions2[k][9]][c
																						+ inputPositions2[k][9]][d
																								+ inputPositions2[k][9]][e
																										+ inputPositions2[k][9]][f
																												+ inputPositions2[k][9]][g
																														+ inputPositions2[k][9]][h
																																+ inputPositions2[k][9]][i
																																		+ inputPositions2[k][9]][j
																																				+ inputPositions2[k][9]]
																																						.equals(a
																																								+ ", "
																																								+ b
																																								+ ", "
																																								+ c
																																								+ ", "
																																								+ d
																																								+ ", "
																																								+ e
																																								+ ", "
																																								+ f
																																								+ ", "
																																								+ g
																																								+ ", "
																																								+ h
																																								+ ", "
																																								+ i
																																								+ ", "
																																								+ j
																																								+ ": "
																																								+ "you")) {
																			moveCounterCounter++;
																			if (moveCounterCounter == inARow) {
																				zeFlag = true;
																			} else {
																				for (int x = 0; x < 10; x++) {
																					inputPositions2[x][x] = moveCounterCounter;

																				}

																				if (board[a + inputPositions2[k][9]][b
																						+ inputPositions2[k][9]][c
																								+ inputPositions2[k][9]][d
																										+ inputPositions2[k][9]][e
																												+ inputPositions2[k][9]][f
																														+ inputPositions2[k][9]][g
																																+ inputPositions2[k][9]][h
																																		+ inputPositions2[k][9]][i
																																				+ inputPositions2[k][9]][j
																																						+ inputPositions2[k][9]]
																																								.equals(a
																																										+ ", "
																																										+ b
																																										+ ", "
																																										+ c
																																										+ ", "
																																										+ d
																																										+ ", "
																																										+ e
																																										+ ", "
																																										+ f
																																										+ ", "
																																										+ g
																																										+ ", "
																																										+ h
																																										+ ", "
																																										+ i
																																										+ ", "
																																										+ j
																																										+ ": "
																																										+ "you")) {
																					moveCounterCounter++;
																					if (moveCounterCounter == inARow) {
																						zeFlag = true;
																					} else {
																						for (int x = 0; x < 10; x++) {
																							inputPositions2[x][x] = moveCounterCounter;

																						}

																						if (board[a
																								+ inputPositions2[k][9]][b
																										+ inputPositions2[k][9]][c
																												+ inputPositions2[k][9]][d
																														+ inputPositions2[k][9]][e
																																+ inputPositions2[k][9]][f
																																		+ inputPositions2[k][9]][g
																																				+ inputPositions2[k][9]][h
																																						+ inputPositions2[k][9]][i
																																								+ inputPositions2[k][9]][j
																																										+ inputPositions2[k][9]]
																																												.equals(a
																																														+ ", "
																																														+ b
																																														+ ", "
																																														+ c
																																														+ ", "
																																														+ d
																																														+ ", "
																																														+ e
																																														+ ", "
																																														+ f
																																														+ ", "
																																														+ g
																																														+ ", "
																																														+ h
																																														+ ", "
																																														+ i
																																														+ ", "
																																														+ j
																																														+ ": "
																																														+ "you")) {
																							moveCounterCounter++;
																							if (moveCounterCounter == inARow) {
																								zeFlag = true;
																							} else {
																								for (int x = 0; x < 10; x++) {
																									inputPositions2[x][x] = moveCounterCounter;

																								}

																								if (board[a
																										+ inputPositions2[k][9]][b
																												+ inputPositions2[k][9]][c
																														+ inputPositions2[k][9]][d
																																+ inputPositions2[k][9]][e
																																		+ inputPositions2[k][9]][f
																																				+ inputPositions2[k][9]][g
																																						+ inputPositions2[k][9]][h
																																								+ inputPositions2[k][9]][i
																																										+ inputPositions2[k][9]][j
																																												+ inputPositions2[k][9]]
																																														.equals(a
																																																+ ", "
																																																+ b
																																																+ ", "
																																																+ c
																																																+ ", "
																																																+ d
																																																+ ", "
																																																+ e
																																																+ ", "
																																																+ f
																																																+ ", "
																																																+ g
																																																+ ", "
																																																+ h
																																																+ ", "
																																																+ i
																																																+ ", "
																																																+ j
																																																+ ": "
																																																+ "you")) {
																									moveCounterCounter++;
																									if (moveCounterCounter == inARow) {
																										zeFlag = true;
																									} else {
																										for (int x = 0; x < 10; x++) {
																											inputPositions2[x][x] = moveCounterCounter;

																										}

																										if (board[a
																												+ inputPositions2[k][9]][b
																														+ inputPositions2[k][9]][c
																																+ inputPositions2[k][9]][d
																																		+ inputPositions2[k][9]][e
																																				+ inputPositions2[k][9]][f
																																						+ inputPositions2[k][9]][g
																																								+ inputPositions2[k][9]][h
																																										+ inputPositions2[k][9]][i
																																												+ inputPositions2[k][9]][j
																																														+ inputPositions2[k][9]]
																																																.equals(a
																																																		+ ", "
																																																		+ b
																																																		+ ", "
																																																		+ c
																																																		+ ", "
																																																		+ d
																																																		+ ", "
																																																		+ e
																																																		+ ", "
																																																		+ f
																																																		+ ", "
																																																		+ g
																																																		+ ", "
																																																		+ h
																																																		+ ", "
																																																		+ i
																																																		+ ", "
																																																		+ j
																																																		+ ": "
																																																		+ "you")) {
																											moveCounterCounter++;
																											if (moveCounterCounter == inARow) {
																												zeFlag = true;
																											} else {
																												for (int x = 0; x < 10; x++) {
																													inputPositions2[x][x] = moveCounterCounter;

																												}

																												if (board[a
																														+ inputPositions2[k][9]][b
																																+ inputPositions2[k][9]][c
																																		+ inputPositions2[k][9]][d
																																				+ inputPositions2[k][9]][e
																																						+ inputPositions2[k][9]][f
																																								+ inputPositions2[k][9]][g
																																										+ inputPositions2[k][9]][h
																																												+ inputPositions2[k][9]][i
																																														+ inputPositions2[k][9]][j
																																																+ inputPositions2[k][9]]
																																																		.equals(a
																																																				+ ", "
																																																				+ b
																																																				+ ", "
																																																				+ c
																																																				+ ", "
																																																				+ d
																																																				+ ", "
																																																				+ e
																																																				+ ", "
																																																				+ f
																																																				+ ", "
																																																				+ g
																																																				+ ", "
																																																				+ h
																																																				+ ", "
																																																				+ i
																																																				+ ", "
																																																				+ j
																																																				+ ": "
																																																				+ "you")) {
																													moveCounterCounter++;
																													if (moveCounterCounter == inARow) {
																														zeFlag = true;
																													} else {
																														for (int x = 0; x < 10; x++) {
																															inputPositions2[x][x] = moveCounterCounter;

																														}

																														if (board[a
																																+ inputPositions2[k][9]][b
																																		+ inputPositions2[k][9]][c
																																				+ inputPositions2[k][9]][d
																																						+ inputPositions2[k][9]][e
																																								+ inputPositions2[k][9]][f
																																										+ inputPositions2[k][9]][g
																																												+ inputPositions2[k][9]][h
																																														+ inputPositions2[k][9]][i
																																																+ inputPositions2[k][9]][j
																																																		+ inputPositions2[k][9]]
																																																				.equals(a
																																																						+ ", "
																																																						+ b
																																																						+ ", "
																																																						+ c
																																																						+ ", "
																																																						+ d
																																																						+ ", "
																																																						+ e
																																																						+ ", "
																																																						+ f
																																																						+ ", "
																																																						+ g
																																																						+ ", "
																																																						+ h
																																																						+ ", "
																																																						+ i
																																																						+ ", "
																																																						+ j
																																																						+ ": "
																																																						+ "you")) {
																															moveCounterCounter++;
																															if (moveCounterCounter == inARow) {
																																zeFlag = true;
																															} else {
																																for (int x = 0; x < 10; x++) {
																																	inputPositions2[x][x] = moveCounterCounter;

																																}

																																if (board[a
																																		+ inputPositions2[k][9]][b
																																				+ inputPositions2[k][9]][c
																																						+ inputPositions2[k][9]][d
																																								+ inputPositions2[k][9]][e
																																										+ inputPositions2[k][9]][f
																																												+ inputPositions2[k][9]][g
																																														+ inputPositions2[k][9]][h
																																																+ inputPositions2[k][9]][i
																																																		+ inputPositions2[k][9]][j
																																																				+ inputPositions2[k][9]]
																																																						.equals(a
																																																								+ ", "
																																																								+ b
																																																								+ ", "
																																																								+ c
																																																								+ ", "
																																																								+ d
																																																								+ ", "
																																																								+ e
																																																								+ ", "
																																																								+ f
																																																								+ ", "
																																																								+ g
																																																								+ ", "
																																																								+ h
																																																								+ ", "
																																																								+ i
																																																								+ ", "
																																																								+ j
																																																								+ ": "
																																																								+ "you")) {
																																	moveCounterCounter++;
																																	if (moveCounterCounter == inARow) {
																																		zeFlag = true;
																																	} else {
																																		for (int x = 0; x < 10; x++) {
																																			inputPositions2[x][x] = moveCounterCounter;

																																		}

																																		if (board[a
																																				+ inputPositions2[k][9]][b
																																						+ inputPositions2[k][9]][c
																																								+ inputPositions2[k][9]][d
																																										+ inputPositions2[k][9]][e
																																												+ inputPositions2[k][9]][f
																																														+ inputPositions2[k][9]][g
																																																+ inputPositions2[k][9]][h
																																																		+ inputPositions2[k][9]][i
																																																				+ inputPositions2[k][9]][j
																																																						+ inputPositions2[k][9]]
																																																								.equals(a
																																																										+ ", "
																																																										+ b
																																																										+ ", "
																																																										+ c
																																																										+ ", "
																																																										+ d
																																																										+ ", "
																																																										+ e
																																																										+ ", "
																																																										+ f
																																																										+ ", "
																																																										+ g
																																																										+ ", "
																																																										+ h
																																																										+ ", "
																																																										+ i
																																																										+ ", "
																																																										+ j
																																																										+ ": "
																																																										+ "you")) {
																																			moveCounterCounter++;
																																			if (moveCounterCounter == inARow) {
																																				zeFlag = true;
																																			} else {
																																				for (int x = 0; x < 10; x++) {
																																					inputPositions2[x][x] = moveCounterCounter;

																																				}

																																				if (board[a
																																						+ inputPositions2[k][9]][b
																																								+ inputPositions2[k][9]][c
																																										+ inputPositions2[k][9]][d
																																												+ inputPositions2[k][9]][e
																																														+ inputPositions2[k][9]][f
																																																+ inputPositions2[k][9]][g
																																																		+ inputPositions2[k][9]][h
																																																				+ inputPositions2[k][9]][i
																																																						+ inputPositions2[k][9]][j
																																																								+ inputPositions2[k][9]]
																																																										.equals(a
																																																												+ ", "
																																																												+ b
																																																												+ ", "
																																																												+ c
																																																												+ ", "
																																																												+ d
																																																												+ ", "
																																																												+ e
																																																												+ ", "
																																																												+ f
																																																												+ ", "
																																																												+ g
																																																												+ ", "
																																																												+ h
																																																												+ ", "
																																																												+ i
																																																												+ ", "
																																																												+ j
																																																												+ ": "
																																																												+ "you")) {
																																					moveCounterCounter++;
																																					if (moveCounterCounter == inARow) {
																																						zeFlag = true;
																																					} else {
																																						for (int x = 0; x < 10; x++) {
																																							inputPositions2[x][x] = moveCounterCounter;

																																						}

																																						if (board[a
																																								+ inputPositions2[k][9]][b
																																										+ inputPositions2[k][9]][c
																																												+ inputPositions2[k][9]][d
																																														+ inputPositions2[k][9]][e
																																																+ inputPositions2[k][9]][f
																																																		+ inputPositions2[k][9]][g
																																																				+ inputPositions2[k][9]][h
																																																						+ inputPositions2[k][9]][i
																																																								+ inputPositions2[k][9]][j
																																																										+ inputPositions2[k][9]]
																																																												.equals(a
																																																														+ ", "
																																																														+ b
																																																														+ ", "
																																																														+ c
																																																														+ ", "
																																																														+ d
																																																														+ ", "
																																																														+ e
																																																														+ ", "
																																																														+ f
																																																														+ ", "
																																																														+ g
																																																														+ ", "
																																																														+ h
																																																														+ ", "
																																																														+ i
																																																														+ ", "
																																																														+ j
																																																														+ ": "
																																																														+ "you")) {
																																							moveCounterCounter++;
																																							if (moveCounterCounter == inARow) {
																																								zeFlag = true;
																																							} else {
																																								for (int x = 0; x < 10; x++) {
																																									inputPositions2[x][x] = moveCounterCounter;

																																								}

																																								if (board[a
																																										+ inputPositions2[k][9]][b
																																												+ inputPositions2[k][9]][c
																																														+ inputPositions2[k][9]][d
																																																+ inputPositions2[k][9]][e
																																																		+ inputPositions2[k][9]][f
																																																				+ inputPositions2[k][9]][g
																																																						+ inputPositions2[k][9]][h
																																																								+ inputPositions2[k][9]][i
																																																										+ inputPositions2[k][9]][j
																																																												+ inputPositions2[k][9]]
																																																														.equals(a
																																																																+ ", "
																																																																+ b
																																																																+ ", "
																																																																+ c
																																																																+ ", "
																																																																+ d
																																																																+ ", "
																																																																+ e
																																																																+ ", "
																																																																+ f
																																																																+ ", "
																																																																+ g
																																																																+ ", "
																																																																+ h
																																																																+ ", "
																																																																+ i
																																																																+ ", "
																																																																+ j
																																																																+ ": "
																																																																+ "you")) {
																																									moveCounterCounter++;
																																									if (moveCounterCounter == inARow) {
																																										zeFlag = true;
																																									} else {
																																										for (int x = 0; x < 10; x++) {
																																											inputPositions2[x][x] = moveCounterCounter;

																																										}

																																										if (board[a
																																												+ inputPositions2[k][9]][b
																																														+ inputPositions2[k][9]][c
																																																+ inputPositions2[k][9]][d
																																																		+ inputPositions2[k][9]][e
																																																				+ inputPositions2[k][9]][f
																																																						+ inputPositions2[k][9]][g
																																																								+ inputPositions2[k][9]][h
																																																										+ inputPositions2[k][9]][i
																																																												+ inputPositions2[k][9]][j
																																																														+ inputPositions2[k][9]]
																																																																.equals(a
																																																																		+ ", "
																																																																		+ b
																																																																		+ ", "
																																																																		+ c
																																																																		+ ", "
																																																																		+ d
																																																																		+ ", "
																																																																		+ e
																																																																		+ ", "
																																																																		+ f
																																																																		+ ", "
																																																																		+ g
																																																																		+ ", "
																																																																		+ h
																																																																		+ ", "
																																																																		+ i
																																																																		+ ", "
																																																																		+ j
																																																																		+ ": "
																																																																		+ "you")) {
																																											moveCounterCounter++;
																																											if (moveCounterCounter == inARow) {
																																												zeFlag = true;
																																											} else {
																																												for (int x = 0; x < 10; x++) {
																																													inputPositions2[x][x] = moveCounterCounter;

																																												}

																																												if (board[a
																																														+ inputPositions2[k][9]][b
																																																+ inputPositions2[k][9]][c
																																																		+ inputPositions2[k][9]][d
																																																				+ inputPositions2[k][9]][e
																																																						+ inputPositions2[k][9]][f
																																																								+ inputPositions2[k][9]][g
																																																										+ inputPositions2[k][9]][h
																																																												+ inputPositions2[k][9]][i
																																																														+ inputPositions2[k][9]][j
																																																																+ inputPositions2[k][9]]
																																																																		.equals(a
																																																																				+ ", "
																																																																				+ b
																																																																				+ ", "
																																																																				+ c
																																																																				+ ", "
																																																																				+ d
																																																																				+ ", "
																																																																				+ e
																																																																				+ ", "
																																																																				+ f
																																																																				+ ", "
																																																																				+ g
																																																																				+ ", "
																																																																				+ h
																																																																				+ ", "
																																																																				+ i
																																																																				+ ", "
																																																																				+ j
																																																																				+ ": "
																																																																				+ "you")) {
																																													moveCounterCounter++;
																																													if (moveCounterCounter == inARow) {
																																														zeFlag = true;
																																													} else {
																																														for (int x = 0; x < 10; x++) {
																																															inputPositions2[x][x] = moveCounterCounter;

																																														}

																																														if (board[a
																																																+ inputPositions2[k][9]][b
																																																		+ inputPositions2[k][9]][c
																																																				+ inputPositions2[k][9]][d
																																																						+ inputPositions2[k][9]][e
																																																								+ inputPositions2[k][9]][f
																																																										+ inputPositions2[k][9]][g
																																																												+ inputPositions2[k][9]][h
																																																														+ inputPositions2[k][9]][i
																																																																+ inputPositions2[k][9]][j
																																																																		+ inputPositions2[k][9]]
																																																																				.equals(a
																																																																						+ ", "
																																																																						+ b
																																																																						+ ", "
																																																																						+ c
																																																																						+ ", "
																																																																						+ d
																																																																						+ ", "
																																																																						+ e
																																																																						+ ", "
																																																																						+ f
																																																																						+ ", "
																																																																						+ g
																																																																						+ ", "
																																																																						+ h
																																																																						+ ", "
																																																																						+ i
																																																																						+ ", "
																																																																						+ j
																																																																						+ ": "
																																																																						+ "you")) {
																																															moveCounterCounter++;
																																															if (moveCounterCounter == inARow) {
																																																zeFlag = true;
																																															} else {
																																																for (int x = 0; x < 10; x++) {
																																																	inputPositions2[x][x] = moveCounterCounter;

																																																}

																																																if (board[a
																																																		+ inputPositions2[k][9]][b
																																																				+ inputPositions2[k][9]][c
																																																						+ inputPositions2[k][9]][d
																																																								+ inputPositions2[k][9]][e
																																																										+ inputPositions2[k][9]][f
																																																												+ inputPositions2[k][9]][g
																																																														+ inputPositions2[k][9]][h
																																																																+ inputPositions2[k][9]][i
																																																																		+ inputPositions2[k][9]][j
																																																																				+ inputPositions2[k][9]]
																																																																						.equals(a
																																																																								+ ", "
																																																																								+ b
																																																																								+ ", "
																																																																								+ c
																																																																								+ ", "
																																																																								+ d
																																																																								+ ", "
																																																																								+ e
																																																																								+ ", "
																																																																								+ f
																																																																								+ ", "
																																																																								+ g
																																																																								+ ", "
																																																																								+ h
																																																																								+ ", "
																																																																								+ i
																																																																								+ ", "
																																																																								+ j
																																																																								+ ": "
																																																																								+ "you")) {
																																																	moveCounterCounter++;
																																																	if (moveCounterCounter == inARow) {
																																																		zeFlag = true;
																																																	} else {
																																																		for (int x = 0; x < 10; x++) {
																																																			inputPositions2[x][x] = moveCounterCounter;

																																																		}

																																																		if (board[a
																																																				+ inputPositions2[k][9]][b
																																																						+ inputPositions2[k][9]][c
																																																								+ inputPositions2[k][9]][d
																																																										+ inputPositions2[k][9]][e
																																																												+ inputPositions2[k][9]][f
																																																														+ inputPositions2[k][9]][g
																																																																+ inputPositions2[k][9]][h
																																																																		+ inputPositions2[k][9]][i
																																																																				+ inputPositions2[k][9]][j
																																																																						+ inputPositions2[k][9]]
																																																																								.equals(a
																																																																										+ ", "
																																																																										+ b
																																																																										+ ", "
																																																																										+ c
																																																																										+ ", "
																																																																										+ d
																																																																										+ ", "
																																																																										+ e
																																																																										+ ", "
																																																																										+ f
																																																																										+ ", "
																																																																										+ g
																																																																										+ ", "
																																																																										+ h
																																																																										+ ", "
																																																																										+ i
																																																																										+ ", "
																																																																										+ j
																																																																										+ ": "
																																																																										+ "you")) {
																																																			moveCounterCounter++;
																																																			if (moveCounterCounter == inARow) {
																																																				zeFlag = true;
																																																			} else {
																																																				for (int x = 0; x < 10; x++) {
																																																					inputPositions2[x][x] = moveCounterCounter;

																																																				}

																																																				if (board[a
																																																						+ inputPositions2[k][9]][b
																																																								+ inputPositions2[k][9]][c
																																																										+ inputPositions2[k][9]][d
																																																												+ inputPositions2[k][9]][e
																																																														+ inputPositions2[k][9]][f
																																																																+ inputPositions2[k][9]][g
																																																																		+ inputPositions2[k][9]][h
																																																																				+ inputPositions2[k][9]][i
																																																																						+ inputPositions2[k][9]][j
																																																																								+ inputPositions2[k][9]]
																																																																										.equals(a
																																																																												+ ", "
																																																																												+ b
																																																																												+ ", "
																																																																												+ c
																																																																												+ ", "
																																																																												+ d
																																																																												+ ", "
																																																																												+ e
																																																																												+ ", "
																																																																												+ f
																																																																												+ ", "
																																																																												+ g
																																																																												+ ", "
																																																																												+ h
																																																																												+ ", "
																																																																												+ i
																																																																												+ ", "
																																																																												+ j
																																																																												+ ": "
																																																																												+ "you")) {
																																																					moveCounterCounter++;
																																																					if (moveCounterCounter == inARow) {

																																																					} else {
																																																						for (int x = 0; x < 10; x++) {
																																																							inputPositions2[x][x] = moveCounterCounter;

																																																						}

																																																						if (board[a
																																																								+ inputPositions2[k][9]][b
																																																										+ inputPositions2[k][9]][c
																																																												+ inputPositions2[k][9]][d
																																																														+ inputPositions2[k][9]][e
																																																																+ inputPositions2[k][9]][f
																																																																		+ inputPositions2[k][9]][g
																																																																				+ inputPositions2[k][9]][h
																																																																						+ inputPositions2[k][9]][i
																																																																								+ inputPositions2[k][9]][j
																																																																										+ inputPositions2[k][9]]
																																																																												.equals(a
																																																																														+ ", "
																																																																														+ b
																																																																														+ ", "
																																																																														+ c
																																																																														+ ", "
																																																																														+ d
																																																																														+ ", "
																																																																														+ e
																																																																														+ ", "
																																																																														+ f
																																																																														+ ", "
																																																																														+ g
																																																																														+ ", "
																																																																														+ h
																																																																														+ ", "
																																																																														+ i
																																																																														+ ", "
																																																																														+ j
																																																																														+ ": "
																																																																														+ "you")) {
																																																							moveCounterCounter++;
																																																							if (moveCounterCounter == inARow) {

																																																							} else {
																																																								for (int x = 0; x < 10; x++) {
																																																									inputPositions2[x][x] = moveCounterCounter;

																																																								}

																																																								if (board[a
																																																										+ inputPositions2[k][9]][b
																																																												+ inputPositions2[k][9]][c
																																																														+ inputPositions2[k][9]][d
																																																																+ inputPositions2[k][9]][e
																																																																		+ inputPositions2[k][9]][f
																																																																				+ inputPositions2[k][9]][g
																																																																						+ inputPositions2[k][9]][h
																																																																								+ inputPositions2[k][9]][i
																																																																										+ inputPositions2[k][9]][j
																																																																												+ inputPositions2[k][9]]
																																																																														.equals(a
																																																																																+ ", "
																																																																																+ b
																																																																																+ ", "
																																																																																+ c
																																																																																+ ", "
																																																																																+ d
																																																																																+ ", "
																																																																																+ e
																																																																																+ ", "
																																																																																+ f
																																																																																+ ", "
																																																																																+ g
																																																																																+ ", "
																																																																																+ h
																																																																																+ ", "
																																																																																+ i
																																																																																+ ", "
																																																																																+ j
																																																																																+ ": "
																																																																																+ "you")) {
																																																									moveCounterCounter++;
																																																									if (moveCounterCounter == inARow) {

																																																									} else {
																																																										for (int x = 0; x < 10; x++) {
																																																											inputPositions2[x][x] = moveCounterCounter;

																																																										}

																																																										if (board[a
																																																												+ inputPositions2[k][9]][b
																																																														+ inputPositions2[k][9]][c
																																																																+ inputPositions2[k][9]][d
																																																																		+ inputPositions2[k][9]][e
																																																																				+ inputPositions2[k][9]][f
																																																																						+ inputPositions2[k][9]][g
																																																																								+ inputPositions2[k][9]][h
																																																																										+ inputPositions2[k][9]][i
																																																																												+ inputPositions2[k][9]][j
																																																																														+ inputPositions2[k][9]]
																																																																																.equals(a
																																																																																		+ ", "
																																																																																		+ b
																																																																																		+ ", "
																																																																																		+ c
																																																																																		+ ", "
																																																																																		+ d
																																																																																		+ ", "
																																																																																		+ e
																																																																																		+ ", "
																																																																																		+ f
																																																																																		+ ", "
																																																																																		+ g
																																																																																		+ ", "
																																																																																		+ h
																																																																																		+ ", "
																																																																																		+ i
																																																																																		+ ", "
																																																																																		+ j
																																																																																		+ ": "
																																																																																		+ "you")) {
																																																											moveCounterCounter++;
																																																											if (moveCounterCounter == inARow) {

																																																											} else {
																																																												for (int x = 0; x < 10; x++) {
																																																													inputPositions2[x][x] = moveCounterCounter;

																																																												}

																																																												if (board[a
																																																														+ inputPositions2[k][9]][b
																																																																+ inputPositions2[k][9]][c
																																																																		+ inputPositions2[k][9]][d
																																																																				+ inputPositions2[k][9]][e
																																																																						+ inputPositions2[k][9]][f
																																																																								+ inputPositions2[k][9]][g
																																																																										+ inputPositions2[k][9]][h
																																																																												+ inputPositions2[k][9]][i
																																																																														+ inputPositions2[k][9]][j
																																																																																+ inputPositions2[k][9]]
																																																																																		.equals(a
																																																																																				+ ", "
																																																																																				+ b
																																																																																				+ ", "
																																																																																				+ c
																																																																																				+ ", "
																																																																																				+ d
																																																																																				+ ", "
																																																																																				+ e
																																																																																				+ ", "
																																																																																				+ f
																																																																																				+ ", "
																																																																																				+ g
																																																																																				+ ", "
																																																																																				+ h
																																																																																				+ ", "
																																																																																				+ i
																																																																																				+ ", "
																																																																																				+ j
																																																																																				+ ": "
																																																																																				+ "you")) {
																																																													moveCounterCounter++;
																																																													if (moveCounterCounter == inARow) {

																																																													} else {
																																																														for (int x = 0; x < 10; x++) {
																																																															inputPositions2[x][x] = moveCounterCounter;

																																																														}

																																																														if (board[a
																																																																+ inputPositions2[k][9]][b
																																																																		+ inputPositions2[k][9]][c
																																																																				+ inputPositions2[k][9]][d
																																																																						+ inputPositions2[k][9]][e
																																																																								+ inputPositions2[k][9]][f
																																																																										+ inputPositions2[k][9]][g
																																																																												+ inputPositions2[k][9]][h
																																																																														+ inputPositions2[k][9]][i
																																																																																+ inputPositions2[k][9]][j
																																																																																		+ inputPositions2[k][9]]
																																																																																				.equals(a
																																																																																						+ ", "
																																																																																						+ b
																																																																																						+ ", "
																																																																																						+ c
																																																																																						+ ", "
																																																																																						+ d
																																																																																						+ ", "
																																																																																						+ e
																																																																																						+ ", "
																																																																																						+ f
																																																																																						+ ", "
																																																																																						+ g
																																																																																						+ ", "
																																																																																						+ h
																																																																																						+ ", "
																																																																																						+ i
																																																																																						+ ", "
																																																																																						+ j
																																																																																						+ ": "
																																																																																						+ "you")) {
																																																															moveCounterCounter++;
																																																															if (moveCounterCounter == inARow) {

																																																															} else {
																																																																for (int x = 0; x < 10; x++) {
																																																																	inputPositions2[x][x] = moveCounterCounter;

																																																																}

																																																																if (board[a
																																																																		+ inputPositions2[k][9]][b
																																																																				+ inputPositions2[k][9]][c
																																																																						+ inputPositions2[k][9]][d
																																																																								+ inputPositions2[k][9]][e
																																																																										+ inputPositions2[k][9]][f
																																																																												+ inputPositions2[k][9]][g
																																																																														+ inputPositions2[k][9]][h
																																																																																+ inputPositions2[k][9]][i
																																																																																		+ inputPositions2[k][9]][j
																																																																																				+ inputPositions2[k][9]]
																																																																																						.equals(a
																																																																																								+ ", "
																																																																																								+ b
																																																																																								+ ", "
																																																																																								+ c
																																																																																								+ ", "
																																																																																								+ d
																																																																																								+ ", "
																																																																																								+ e
																																																																																								+ ", "
																																																																																								+ f
																																																																																								+ ", "
																																																																																								+ g
																																																																																								+ ", "
																																																																																								+ h
																																																																																								+ ", "
																																																																																								+ i
																																																																																								+ ", "
																																																																																								+ j
																																																																																								+ ": "
																																																																																								+ "you")) {
																																																																	moveCounterCounter++;
																																																																	if (moveCounterCounter == inARow) {

																																																																	} else {
																																																																		for (int x = 0; x < 10; x++) {
																																																																			inputPositions2[x][x] = moveCounterCounter;

																																																																		}

																																																																		if (board[a
																																																																				+ inputPositions2[k][9]][b
																																																																						+ inputPositions2[k][9]][c
																																																																								+ inputPositions2[k][9]][d
																																																																										+ inputPositions2[k][9]][e
																																																																												+ inputPositions2[k][9]][f
																																																																														+ inputPositions2[k][9]][g
																																																																																+ inputPositions2[k][9]][h
																																																																																		+ inputPositions2[k][9]][i
																																																																																				+ inputPositions2[k][9]][j
																																																																																						+ inputPositions2[k][9]]
																																																																																								.equals(a
																																																																																										+ ", "
																																																																																										+ b
																																																																																										+ ", "
																																																																																										+ c
																																																																																										+ ", "
																																																																																										+ d
																																																																																										+ ", "
																																																																																										+ e
																																																																																										+ ", "
																																																																																										+ f
																																																																																										+ ", "
																																																																																										+ g
																																																																																										+ ", "
																																																																																										+ h
																																																																																										+ ", "
																																																																																										+ i
																																																																																										+ ", "
																																																																																										+ j
																																																																																										+ ": "
																																																																																										+ "you")) {
																																																																			moveCounterCounter++;
																																																																			if (moveCounterCounter == inARow) {

																																																																			} else {
																																																																				for (int x = 0; x < 10; x++) {
																																																																					inputPositions2[x][x] = moveCounterCounter;

																																																																				}

																																																																				if (board[a
																																																																						+ inputPositions2[k][9]][b
																																																																								+ inputPositions2[k][9]][c
																																																																										+ inputPositions2[k][9]][d
																																																																												+ inputPositions2[k][9]][e
																																																																														+ inputPositions2[k][9]][f
																																																																																+ inputPositions2[k][9]][g
																																																																																		+ inputPositions2[k][9]][h
																																																																																				+ inputPositions2[k][9]][i
																																																																																						+ inputPositions2[k][9]][j
																																																																																								+ inputPositions2[k][9]]
																																																																																										.equals(a
																																																																																												+ ", "
																																																																																												+ b
																																																																																												+ ", "
																																																																																												+ c
																																																																																												+ ", "
																																																																																												+ d
																																																																																												+ ", "
																																																																																												+ e
																																																																																												+ ", "
																																																																																												+ f
																																																																																												+ ", "
																																																																																												+ g
																																																																																												+ ", "
																																																																																												+ h
																																																																																												+ ", "
																																																																																												+ i
																																																																																												+ ", "
																																																																																												+ j
																																																																																												+ ": "
																																																																																												+ "you")) {
																																																																					moveCounterCounter++;
																																																																					if (moveCounterCounter == inARow) {

																																																																					} else {

																																																																					}

																																																																				}

																																																																			}

																																																																		}

																																																																	}

																																																																}

																																																															}

																																																														}

																																																													}

																																																												}

																																																											}

																																																										}

																																																									}

																																																								}

																																																							}

																																																						}

																																																					}

																																																				}

																																																			}

																																																		}

																																																	}

																																																}

																																															}

																																														}

																																													}

																																												}

																																											}

																																										}

																																									}

																																								}

																																							}

																																						}

																																					}

																																				}

																																			}

																																		}

																																	}

																																}

																															}

																														}

																													}

																												}

																											}

																										}

																									}

																								}

																							}

																						}

																					}

																				}

																			}

																		}

																	}

																}

																if (board[a - inputPositions2[k][9]][b
																		- inputPositions2[k][9]][c
																				- inputPositions2[k][9]][d
																						- inputPositions2[k][9]][e
																								- inputPositions2[k][9]][f
																										- inputPositions2[k][9]][g
																												- inputPositions2[k][9]][h
																														- inputPositions2[k][9]][i
																																- inputPositions2[k][9]][j
																																		- inputPositions2[k][9]]
																																				.equals(a
																																						+ ", "
																																						+ b
																																						+ ", "
																																						+ c
																																						+ ", "
																																						+ d
																																						+ ", "
																																						+ e
																																						+ ", "
																																						+ f
																																						+ ", "
																																						+ g
																																						+ ", "
																																						+ h
																																						+ ", "
																																						+ i
																																						+ ", "
																																						+ j
																																						+ ": "
																																						+ "you")) {
																	moveCounterCounter++;
																	if (moveCounterCounter == inARow) {
																		zeFlag = true;
																	} else {
																		for (int x = 0; x < 10; x++) {
																			inputPositions2[x][x] = moveCounterCounter;

																		}

																		if (board[a - inputPositions2[k][9]][b
																				- inputPositions2[k][9]][c
																						- inputPositions2[k][9]][d
																								- inputPositions2[k][9]][e
																										- inputPositions2[k][9]][f
																												- inputPositions2[k][9]][g
																														- inputPositions2[k][9]][h
																																- inputPositions2[k][9]][i
																																		- inputPositions2[k][9]][j
																																				- inputPositions2[k][9]]
																																						.equals(a
																																								+ ", "
																																								+ b
																																								+ ", "
																																								+ c
																																								+ ", "
																																								+ d
																																								+ ", "
																																								+ e
																																								+ ", "
																																								+ f
																																								+ ", "
																																								+ g
																																								+ ", "
																																								+ h
																																								+ ", "
																																								+ i
																																								+ ", "
																																								+ j
																																								+ ": "
																																								+ "you")) {
																			moveCounterCounter++;
																			if (moveCounterCounter == inARow) {
																				zeFlag = true;
																			} else {
																				for (int x = 0; x < 10; x++) {
																					inputPositions2[x][x] = moveCounterCounter;

																				}

																				if (board[a - inputPositions2[k][9]][b
																						- inputPositions2[k][9]][c
																								- inputPositions2[k][9]][d
																										- inputPositions2[k][9]][e
																												- inputPositions2[k][9]][f
																														- inputPositions2[k][9]][g
																																- inputPositions2[k][9]][h
																																		- inputPositions2[k][9]][i
																																				- inputPositions2[k][9]][j
																																						- inputPositions2[k][9]]
																																								.equals(a
																																										+ ", "
																																										+ b
																																										+ ", "
																																										+ c
																																										+ ", "
																																										+ d
																																										+ ", "
																																										+ e
																																										+ ", "
																																										+ f
																																										+ ", "
																																										+ g
																																										+ ", "
																																										+ h
																																										+ ", "
																																										+ i
																																										+ ", "
																																										+ j
																																										+ ": "
																																										+ "you")) {
																					moveCounterCounter++;
																					if (moveCounterCounter == inARow) {
																						zeFlag = true;
																					} else {
																						for (int x = 0; x < 10; x++) {
																							inputPositions2[x][x] = moveCounterCounter;

																						}

																						if (board[a
																								- inputPositions2[k][9]][b
																										- inputPositions2[k][9]][c
																												- inputPositions2[k][9]][d
																														- inputPositions2[k][9]][e
																																- inputPositions2[k][9]][f
																																		- inputPositions2[k][9]][g
																																				- inputPositions2[k][9]][h
																																						- inputPositions2[k][9]][i
																																								- inputPositions2[k][9]][j
																																										- inputPositions2[k][9]]
																																												.equals(a
																																														+ ", "
																																														+ b
																																														+ ", "
																																														+ c
																																														+ ", "
																																														+ d
																																														+ ", "
																																														+ e
																																														+ ", "
																																														+ f
																																														+ ", "
																																														+ g
																																														+ ", "
																																														+ h
																																														+ ", "
																																														+ i
																																														+ ", "
																																														+ j
																																														+ ": "
																																														+ "you")) {
																							moveCounterCounter++;
																							if (moveCounterCounter == inARow) {
																								zeFlag = true;
																							} else {
																								for (int x = 0; x < 10; x++) {
																									inputPositions2[x][x] = moveCounterCounter;

																								}

																								if (board[a
																										- inputPositions2[k][9]][b
																												- inputPositions2[k][9]][c
																														- inputPositions2[k][9]][d
																																- inputPositions2[k][9]][e
																																		- inputPositions2[k][9]][f
																																				- inputPositions2[k][9]][g
																																						- inputPositions2[k][9]][h
																																								- inputPositions2[k][9]][i
																																										- inputPositions2[k][9]][j
																																												- inputPositions2[k][9]]
																																														.equals(a
																																																+ ", "
																																																+ b
																																																+ ", "
																																																+ c
																																																+ ", "
																																																+ d
																																																+ ", "
																																																+ e
																																																+ ", "
																																																+ f
																																																+ ", "
																																																+ g
																																																+ ", "
																																																+ h
																																																+ ", "
																																																+ i
																																																+ ", "
																																																+ j
																																																+ ": "
																																																+ "you")) {
																									moveCounterCounter++;
																									if (moveCounterCounter == inARow) {
																										zeFlag = true;
																									} else {
																										for (int x = 0; x < 10; x++) {
																											inputPositions2[x][x] = moveCounterCounter;

																										}

																										if (board[a
																												- inputPositions2[k][9]][b
																														- inputPositions2[k][9]][c
																																- inputPositions2[k][9]][d
																																		- inputPositions2[k][9]][e
																																				- inputPositions2[k][9]][f
																																						- inputPositions2[k][9]][g
																																								- inputPositions2[k][9]][h
																																										- inputPositions2[k][9]][i
																																												- inputPositions2[k][9]][j
																																														- inputPositions2[k][9]]
																																																.equals(a
																																																		+ ", "
																																																		+ b
																																																		+ ", "
																																																		+ c
																																																		+ ", "
																																																		+ d
																																																		+ ", "
																																																		+ e
																																																		+ ", "
																																																		+ f
																																																		+ ", "
																																																		+ g
																																																		+ ", "
																																																		+ h
																																																		+ ", "
																																																		+ i
																																																		+ ", "
																																																		+ j
																																																		+ ": "
																																																		+ "you")) {
																											moveCounterCounter++;
																											if (moveCounterCounter == inARow) {
																												zeFlag = true;
																											} else {
																												for (int x = 0; x < 10; x++) {
																													inputPositions2[x][x] = moveCounterCounter;

																												}

																												if (board[a
																														- inputPositions2[k][9]][b
																																- inputPositions2[k][9]][c
																																		- inputPositions2[k][9]][d
																																				- inputPositions2[k][9]][e
																																						- inputPositions2[k][9]][f
																																								- inputPositions2[k][9]][g
																																										- inputPositions2[k][9]][h
																																												- inputPositions2[k][9]][i
																																														- inputPositions2[k][9]][j
																																																- inputPositions2[k][9]]
																																																		.equals(a
																																																				+ ", "
																																																				+ b
																																																				+ ", "
																																																				+ c
																																																				+ ", "
																																																				+ d
																																																				+ ", "
																																																				+ e
																																																				+ ", "
																																																				+ f
																																																				+ ", "
																																																				+ g
																																																				+ ", "
																																																				+ h
																																																				+ ", "
																																																				+ i
																																																				+ ", "
																																																				+ j
																																																				+ ": "
																																																				+ "you")) {
																													moveCounterCounter++;
																													if (moveCounterCounter == inARow) {
																														zeFlag = true;
																													} else {
																														for (int x = 0; x < 10; x++) {
																															inputPositions2[x][x] = moveCounterCounter;

																														}

																														if (board[a
																																- inputPositions2[k][9]][b
																																		- inputPositions2[k][9]][c
																																				- inputPositions2[k][9]][d
																																						- inputPositions2[k][9]][e
																																								- inputPositions2[k][9]][f
																																										- inputPositions2[k][9]][g
																																												- inputPositions2[k][9]][h
																																														- inputPositions2[k][9]][i
																																																- inputPositions2[k][9]][j
																																																		- inputPositions2[k][9]]
																																																				.equals(a
																																																						+ ", "
																																																						+ b
																																																						+ ", "
																																																						+ c
																																																						+ ", "
																																																						+ d
																																																						+ ", "
																																																						+ e
																																																						+ ", "
																																																						+ f
																																																						+ ", "
																																																						+ g
																																																						+ ", "
																																																						+ h
																																																						+ ", "
																																																						+ i
																																																						+ ", "
																																																						+ j
																																																						+ ": "
																																																						+ "you")) {
																															moveCounterCounter++;
																															if (moveCounterCounter == inARow) {
																																zeFlag = true;
																															} else {
																																for (int x = 0; x < 10; x++) {
																																	inputPositions2[x][x] = moveCounterCounter;

																																}

																																if (board[a
																																		- inputPositions2[k][9]][b
																																				- inputPositions2[k][9]][c
																																						- inputPositions2[k][9]][d
																																								- inputPositions2[k][9]][e
																																										- inputPositions2[k][9]][f
																																												- inputPositions2[k][9]][g
																																														- inputPositions2[k][9]][h
																																																- inputPositions2[k][9]][i
																																																		- inputPositions2[k][9]][j
																																																				- inputPositions2[k][9]]
																																																						.equals(a
																																																								+ ", "
																																																								+ b
																																																								+ ", "
																																																								+ c
																																																								+ ", "
																																																								+ d
																																																								+ ", "
																																																								+ e
																																																								+ ", "
																																																								+ f
																																																								+ ", "
																																																								+ g
																																																								+ ", "
																																																								+ h
																																																								+ ", "
																																																								+ i
																																																								+ ", "
																																																								+ j
																																																								+ ": "
																																																								+ "you")) {
																																	moveCounterCounter++;
																																	if (moveCounterCounter == inARow) {
																																		zeFlag = true;
																																	} else {
																																		for (int x = 0; x < 10; x++) {
																																			inputPositions2[x][x] = moveCounterCounter;

																																		}

																																		if (board[a
																																				- inputPositions2[k][9]][b
																																						- inputPositions2[k][9]][c
																																								- inputPositions2[k][9]][d
																																										- inputPositions2[k][9]][e
																																												- inputPositions2[k][9]][f
																																														- inputPositions2[k][9]][g
																																																- inputPositions2[k][9]][h
																																																		- inputPositions2[k][9]][i
																																																				- inputPositions2[k][9]][j
																																																						- inputPositions2[k][9]]
																																																								.equals(a
																																																										+ ", "
																																																										+ b
																																																										+ ", "
																																																										+ c
																																																										+ ", "
																																																										+ d
																																																										+ ", "
																																																										+ e
																																																										+ ", "
																																																										+ f
																																																										+ ", "
																																																										+ g
																																																										+ ", "
																																																										+ h
																																																										+ ", "
																																																										+ i
																																																										+ ", "
																																																										+ j
																																																										+ ": "
																																																										+ "you")) {
																																			moveCounterCounter++;
																																			if (moveCounterCounter == inARow) {
																																				zeFlag = true;
																																			} else {
																																				for (int x = 0; x < 10; x++) {
																																					inputPositions2[x][x] = moveCounterCounter;

																																				}

																																				if (board[a
																																						- inputPositions2[k][9]][b
																																								- inputPositions2[k][9]][c
																																										- inputPositions2[k][9]][d
																																												- inputPositions2[k][9]][e
																																														- inputPositions2[k][9]][f
																																																- inputPositions2[k][9]][g
																																																		- inputPositions2[k][9]][h
																																																				- inputPositions2[k][9]][i
																																																						- inputPositions2[k][9]][j
																																																								- inputPositions2[k][9]]
																																																										.equals(a
																																																												+ ", "
																																																												+ b
																																																												+ ", "
																																																												+ c
																																																												+ ", "
																																																												+ d
																																																												+ ", "
																																																												+ e
																																																												+ ", "
																																																												+ f
																																																												+ ", "
																																																												+ g
																																																												+ ", "
																																																												+ h
																																																												+ ", "
																																																												+ i
																																																												+ ", "
																																																												+ j
																																																												+ ": "
																																																												+ "you")) {
																																					moveCounterCounter++;
																																					if (moveCounterCounter == inARow) {
																																						zeFlag = true;
																																					} else {
																																						for (int x = 0; x < 10; x++) {
																																							inputPositions2[x][x] = moveCounterCounter;

																																						}

																																						if (board[a
																																								- inputPositions2[k][9]][b
																																										- inputPositions2[k][9]][c
																																												- inputPositions2[k][9]][d
																																														- inputPositions2[k][9]][e
																																																- inputPositions2[k][9]][f
																																																		- inputPositions2[k][9]][g
																																																				- inputPositions2[k][9]][h
																																																						- inputPositions2[k][9]][i
																																																								- inputPositions2[k][9]][j
																																																										- inputPositions2[k][9]]
																																																												.equals(a
																																																														+ ", "
																																																														+ b
																																																														+ ", "
																																																														+ c
																																																														+ ", "
																																																														+ d
																																																														+ ", "
																																																														+ e
																																																														+ ", "
																																																														+ f
																																																														+ ", "
																																																														+ g
																																																														+ ", "
																																																														+ h
																																																														+ ", "
																																																														+ i
																																																														+ ", "
																																																														+ j
																																																														+ ": "
																																																														+ "you")) {
																																							moveCounterCounter++;
																																							if (moveCounterCounter == inARow) {
																																								zeFlag = true;
																																							} else {
																																								for (int x = 0; x < 10; x++) {
																																									inputPositions2[x][x] = moveCounterCounter;

																																								}

																																								if (board[a
																																										- inputPositions2[k][9]][b
																																												- inputPositions2[k][9]][c
																																														- inputPositions2[k][9]][d
																																																- inputPositions2[k][9]][e
																																																		- inputPositions2[k][9]][f
																																																				- inputPositions2[k][9]][g
																																																						- inputPositions2[k][9]][h
																																																								- inputPositions2[k][9]][i
																																																										- inputPositions2[k][9]][j
																																																												- inputPositions2[k][9]]
																																																														.equals(a
																																																																+ ", "
																																																																+ b
																																																																+ ", "
																																																																+ c
																																																																+ ", "
																																																																+ d
																																																																+ ", "
																																																																+ e
																																																																+ ", "
																																																																+ f
																																																																+ ", "
																																																																+ g
																																																																+ ", "
																																																																+ h
																																																																+ ", "
																																																																+ i
																																																																+ ", "
																																																																+ j
																																																																+ ": "
																																																																+ "you")) {
																																									moveCounterCounter++;
																																									if (moveCounterCounter == inARow) {

																																									} else {
																																										for (int x = 0; x < 10; x++) {
																																											inputPositions2[x][x] = moveCounterCounter;

																																										}

																																										if (board[a
																																												- inputPositions2[k][9]][b
																																														- inputPositions2[k][9]][c
																																																- inputPositions2[k][9]][d
																																																		- inputPositions2[k][9]][e
																																																				- inputPositions2[k][9]][f
																																																						- inputPositions2[k][9]][g
																																																								- inputPositions2[k][9]][h
																																																										- inputPositions2[k][9]][i
																																																												- inputPositions2[k][9]][j
																																																														- inputPositions2[k][9]]
																																																																.equals(a
																																																																		+ ", "
																																																																		+ b
																																																																		+ ", "
																																																																		+ c
																																																																		+ ", "
																																																																		+ d
																																																																		+ ", "
																																																																		+ e
																																																																		+ ", "
																																																																		+ f
																																																																		+ ", "
																																																																		+ g
																																																																		+ ", "
																																																																		+ h
																																																																		+ ", "
																																																																		+ i
																																																																		+ ", "
																																																																		+ j
																																																																		+ ": "
																																																																		+ "you")) {
																																											moveCounterCounter++;
																																											if (moveCounterCounter == inARow) {

																																											} else {
																																												for (int x = 0; x < 10; x++) {
																																													inputPositions2[x][x] = moveCounterCounter;

																																												}

																																												if (board[a
																																														- inputPositions2[k][9]][b
																																																- inputPositions2[k][9]][c
																																																		- inputPositions2[k][9]][d
																																																				- inputPositions2[k][9]][e
																																																						- inputPositions2[k][9]][f
																																																								- inputPositions2[k][9]][g
																																																										- inputPositions2[k][9]][h
																																																												- inputPositions2[k][9]][i
																																																														- inputPositions2[k][9]][j
																																																																- inputPositions2[k][9]]
																																																																		.equals(a
																																																																				+ ", "
																																																																				+ b
																																																																				+ ", "
																																																																				+ c
																																																																				+ ", "
																																																																				+ d
																																																																				+ ", "
																																																																				+ e
																																																																				+ ", "
																																																																				+ f
																																																																				+ ", "
																																																																				+ g
																																																																				+ ", "
																																																																				+ h
																																																																				+ ", "
																																																																				+ i
																																																																				+ ", "
																																																																				+ j
																																																																				+ ": "
																																																																				+ "you")) {
																																													moveCounterCounter++;
																																													if (moveCounterCounter == inARow) {

																																													} else {
																																														for (int x = 0; x < 10; x++) {
																																															inputPositions2[x][x] = moveCounterCounter;

																																														}

																																														if (board[a
																																																- inputPositions2[k][9]][b
																																																		- inputPositions2[k][9]][c
																																																				- inputPositions2[k][9]][d
																																																						- inputPositions2[k][9]][e
																																																								- inputPositions2[k][9]][f
																																																										- inputPositions2[k][9]][g
																																																												- inputPositions2[k][9]][h
																																																														- inputPositions2[k][9]][i
																																																																- inputPositions2[k][9]][j
																																																																		- inputPositions2[k][9]]
																																																																				.equals(a
																																																																						+ ", "
																																																																						+ b
																																																																						+ ", "
																																																																						+ c
																																																																						+ ", "
																																																																						+ d
																																																																						+ ", "
																																																																						+ e
																																																																						+ ", "
																																																																						+ f
																																																																						+ ", "
																																																																						+ g
																																																																						+ ", "
																																																																						+ h
																																																																						+ ", "
																																																																						+ i
																																																																						+ ", "
																																																																						+ j
																																																																						+ ": "
																																																																						+ "you")) {
																																															moveCounterCounter++;
																																															if (moveCounterCounter == inARow) {

																																															} else {
																																																for (int x = 0; x < 10; x++) {
																																																	inputPositions2[x][x] = moveCounterCounter;

																																																}

																																																if (board[a
																																																		- inputPositions2[k][9]][b
																																																				- inputPositions2[k][9]][c
																																																						- inputPositions2[k][9]][d
																																																								- inputPositions2[k][9]][e
																																																										- inputPositions2[k][9]][f
																																																												- inputPositions2[k][9]][g
																																																														- inputPositions2[k][9]][h
																																																																- inputPositions2[k][9]][i
																																																																		- inputPositions2[k][9]][j
																																																																				- inputPositions2[k][9]]
																																																																						.equals(a
																																																																								+ ", "
																																																																								+ b
																																																																								+ ", "
																																																																								+ c
																																																																								+ ", "
																																																																								+ d
																																																																								+ ", "
																																																																								+ e
																																																																								+ ", "
																																																																								+ f
																																																																								+ ", "
																																																																								+ g
																																																																								+ ", "
																																																																								+ h
																																																																								+ ", "
																																																																								+ i
																																																																								+ ", "
																																																																								+ j
																																																																								+ ": "
																																																																								+ "you")) {
																																																	moveCounterCounter++;
																																																	if (moveCounterCounter == inARow) {

																																																	} else {
																																																		for (int x = 0; x < 10; x++) {
																																																			inputPositions2[x][x] = moveCounterCounter;

																																																		}

																																																		if (board[a
																																																				- inputPositions2[k][9]][b
																																																						- inputPositions2[k][9]][c
																																																								- inputPositions2[k][9]][d
																																																										- inputPositions2[k][9]][e
																																																												- inputPositions2[k][9]][f
																																																														- inputPositions2[k][9]][g
																																																																- inputPositions2[k][9]][h
																																																																		- inputPositions2[k][9]][i
																																																																				- inputPositions2[k][9]][j
																																																																						- inputPositions2[k][9]]
																																																																								.equals(a
																																																																										+ ", "
																																																																										+ b
																																																																										+ ", "
																																																																										+ c
																																																																										+ ", "
																																																																										+ d
																																																																										+ ", "
																																																																										+ e
																																																																										+ ", "
																																																																										+ f
																																																																										+ ", "
																																																																										+ g
																																																																										+ ", "
																																																																										+ h
																																																																										+ ", "
																																																																										+ i
																																																																										+ ", "
																																																																										+ j
																																																																										+ ": "
																																																																										+ "you")) {
																																																			moveCounterCounter++;
																																																			if (moveCounterCounter == inARow) {

																																																			} else {
																																																				for (int x = 0; x < 10; x++) {
																																																					inputPositions2[x][x] = moveCounterCounter;

																																																				}

																																																				if (board[a
																																																						- inputPositions2[k][9]][b
																																																								- inputPositions2[k][9]][c
																																																										- inputPositions2[k][9]][d
																																																												- inputPositions2[k][9]][e
																																																														- inputPositions2[k][9]][f
																																																																- inputPositions2[k][9]][g
																																																																		- inputPositions2[k][9]][h
																																																																				- inputPositions2[k][9]][i
																																																																						- inputPositions2[k][9]][j
																																																																								- inputPositions2[k][9]]
																																																																										.equals(a
																																																																												+ ", "
																																																																												+ b
																																																																												+ ", "
																																																																												+ c
																																																																												+ ", "
																																																																												+ d
																																																																												+ ", "
																																																																												+ e
																																																																												+ ", "
																																																																												+ f
																																																																												+ ", "
																																																																												+ g
																																																																												+ ", "
																																																																												+ h
																																																																												+ ", "
																																																																												+ i
																																																																												+ ", "
																																																																												+ j
																																																																												+ ": "
																																																																												+ "you")) {
																																																					moveCounterCounter++;
																																																					if (moveCounterCounter == inARow) {

																																																					} else {
																																																						for (int x = 0; x < 10; x++) {
																																																							inputPositions2[x][x] = moveCounterCounter;

																																																						}

																																																						if (board[a
																																																								- inputPositions2[k][9]][b
																																																										- inputPositions2[k][9]][c
																																																												- inputPositions2[k][9]][d
																																																														- inputPositions2[k][9]][e
																																																																- inputPositions2[k][9]][f
																																																																		- inputPositions2[k][9]][g
																																																																				- inputPositions2[k][9]][h
																																																																						- inputPositions2[k][9]][i
																																																																								- inputPositions2[k][9]][j
																																																																										- inputPositions2[k][9]]
																																																																												.equals(a
																																																																														+ ", "
																																																																														+ b
																																																																														+ ", "
																																																																														+ c
																																																																														+ ", "
																																																																														+ d
																																																																														+ ", "
																																																																														+ e
																																																																														+ ", "
																																																																														+ f
																																																																														+ ", "
																																																																														+ g
																																																																														+ ", "
																																																																														+ h
																																																																														+ ", "
																																																																														+ i
																																																																														+ ", "
																																																																														+ j
																																																																														+ ": "
																																																																														+ "you")) {
																																																							moveCounterCounter++;
																																																							if (moveCounterCounter == inARow) {

																																																							} else {
																																																								for (int x = 0; x < 10; x++) {
																																																									inputPositions2[x][x] = moveCounterCounter;

																																																								}

																																																								if (board[a
																																																										- inputPositions2[k][9]][b
																																																												- inputPositions2[k][9]][c
																																																														- inputPositions2[k][9]][d
																																																																- inputPositions2[k][9]][e
																																																																		- inputPositions2[k][9]][f
																																																																				- inputPositions2[k][9]][g
																																																																						- inputPositions2[k][9]][h
																																																																								- inputPositions2[k][9]][i
																																																																										- inputPositions2[k][9]][j
																																																																												- inputPositions2[k][9]]
																																																																														.equals(a
																																																																																+ ", "
																																																																																+ b
																																																																																+ ", "
																																																																																+ c
																																																																																+ ", "
																																																																																+ d
																																																																																+ ", "
																																																																																+ e
																																																																																+ ", "
																																																																																+ f
																																																																																+ ", "
																																																																																+ g
																																																																																+ ", "
																																																																																+ h
																																																																																+ ", "
																																																																																+ i
																																																																																+ ", "
																																																																																+ j
																																																																																+ ": "
																																																																																+ "you")) {
																																																									moveCounterCounter++;
																																																									if (moveCounterCounter == inARow) {

																																																									} else {
																																																										for (int x = 0; x < 10; x++) {
																																																											inputPositions2[x][x] = moveCounterCounter;

																																																										}

																																																										if (board[a
																																																												- inputPositions2[k][9]][b
																																																														- inputPositions2[k][9]][c
																																																																- inputPositions2[k][9]][d
																																																																		- inputPositions2[k][9]][e
																																																																				- inputPositions2[k][9]][f
																																																																						- inputPositions2[k][9]][g
																																																																								- inputPositions2[k][9]][h
																																																																										- inputPositions2[k][9]][i
																																																																												- inputPositions2[k][9]][j
																																																																														- inputPositions2[k][9]]
																																																																																.equals(a
																																																																																		+ ", "
																																																																																		+ b
																																																																																		+ ", "
																																																																																		+ c
																																																																																		+ ", "
																																																																																		+ d
																																																																																		+ ", "
																																																																																		+ e
																																																																																		+ ", "
																																																																																		+ f
																																																																																		+ ", "
																																																																																		+ g
																																																																																		+ ", "
																																																																																		+ h
																																																																																		+ ", "
																																																																																		+ i
																																																																																		+ ", "
																																																																																		+ j
																																																																																		+ ": "
																																																																																		+ "you")) {
																																																											moveCounterCounter++;
																																																											if (moveCounterCounter == inARow) {

																																																											} else {
																																																												for (int x = 0; x < 10; x++) {
																																																													inputPositions2[x][x] = moveCounterCounter;

																																																												}

																																																												if (board[a
																																																														- inputPositions2[k][9]][b
																																																																- inputPositions2[k][9]][c
																																																																		- inputPositions2[k][9]][d
																																																																				- inputPositions2[k][9]][e
																																																																						- inputPositions2[k][9]][f
																																																																								- inputPositions2[k][9]][g
																																																																										- inputPositions2[k][9]][h
																																																																												- inputPositions2[k][9]][i
																																																																														- inputPositions2[k][9]][j
																																																																																- inputPositions2[k][9]]
																																																																																		.equals(a
																																																																																				+ ", "
																																																																																				+ b
																																																																																				+ ", "
																																																																																				+ c
																																																																																				+ ", "
																																																																																				+ d
																																																																																				+ ", "
																																																																																				+ e
																																																																																				+ ", "
																																																																																				+ f
																																																																																				+ ", "
																																																																																				+ g
																																																																																				+ ", "
																																																																																				+ h
																																																																																				+ ", "
																																																																																				+ i
																																																																																				+ ", "
																																																																																				+ j
																																																																																				+ ": "
																																																																																				+ "you")) {
																																																													moveCounterCounter++;
																																																													if (moveCounterCounter == inARow) {

																																																													} else {
																																																														for (int x = 0; x < 10; x++) {
																																																															inputPositions2[x][x] = moveCounterCounter;

																																																														}

																																																														if (board[a
																																																																- inputPositions2[k][9]][b
																																																																		- inputPositions2[k][9]][c
																																																																				- inputPositions2[k][9]][d
																																																																						- inputPositions2[k][9]][e
																																																																								- inputPositions2[k][9]][f
																																																																										- inputPositions2[k][9]][g
																																																																												- inputPositions2[k][9]][h
																																																																														- inputPositions2[k][9]][i
																																																																																- inputPositions2[k][9]][j
																																																																																		- inputPositions2[k][9]]
																																																																																				.equals(a
																																																																																						+ ", "
																																																																																						+ b
																																																																																						+ ", "
																																																																																						+ c
																																																																																						+ ", "
																																																																																						+ d
																																																																																						+ ", "
																																																																																						+ e
																																																																																						+ ", "
																																																																																						+ f
																																																																																						+ ", "
																																																																																						+ g
																																																																																						+ ", "
																																																																																						+ h
																																																																																						+ ", "
																																																																																						+ i
																																																																																						+ ", "
																																																																																						+ j
																																																																																						+ ": "
																																																																																						+ "you")) {
																																																															moveCounterCounter++;
																																																															if (moveCounterCounter == inARow) {

																																																															} else {
																																																																for (int x = 0; x < 10; x++) {
																																																																	inputPositions2[x][x] = moveCounterCounter;

																																																																}

																																																																if (board[a
																																																																		- inputPositions2[k][9]][b
																																																																				- inputPositions2[k][9]][c
																																																																						- inputPositions2[k][9]][d
																																																																								- inputPositions2[k][9]][e
																																																																										- inputPositions2[k][9]][f
																																																																												- inputPositions2[k][9]][g
																																																																														- inputPositions2[k][9]][h
																																																																																- inputPositions2[k][9]][i
																																																																																		- inputPositions2[k][9]][j
																																																																																				- inputPositions2[k][9]]
																																																																																						.equals(a
																																																																																								+ ", "
																																																																																								+ b
																																																																																								+ ", "
																																																																																								+ c
																																																																																								+ ", "
																																																																																								+ d
																																																																																								+ ", "
																																																																																								+ e
																																																																																								+ ", "
																																																																																								+ f
																																																																																								+ ", "
																																																																																								+ g
																																																																																								+ ", "
																																																																																								+ h
																																																																																								+ ", "
																																																																																								+ i
																																																																																								+ ", "
																																																																																								+ j
																																																																																								+ ": "
																																																																																								+ "you")) {
																																																																	moveCounterCounter++;
																																																																	if (moveCounterCounter == inARow) {

																																																																	} else {

																																																																	}

																																																																}

																																																															}

																																																														}

																																																													}

																																																												}

																																																											}

																																																										}

																																																									}

																																																								}

																																																							}

																																																						}

																																																					}

																																																				}

																																																			}

																																																		}

																																																	}

																																																}

																																															}

																																														}

																																													}

																																												}

																																											}

																																										}

																																									}

																																								}

																																							}

																																						}

																																					}

																																				}

																																			}

																																		}

																																	}

																																}

																															}

																														}

																													}

																												}

																											}

																										}

																									}

																								}

																							}

																						}

																					}

																				}

																			}

																		}

																	}

																}
															}

														}

													}
												}
											}
										}
									}
								}
							}
						}
					}
					}
				}
				
				if(zeFlag) {
					System.out.println("Congrats, you won!");
					playing = false;
				}
				
				
				
			}

		}
	}

}

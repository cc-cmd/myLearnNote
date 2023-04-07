//#include <stdio.h>
//
//const int size = 3;
//int board[size][size];
//int i, j;
//int numOfO;
//int numOfX;
//int result = -1;//result = -1没人赢，0：o赢，1：x赢
//
////读入矩阵
//void read(){
//	for (i = 0; i < size; i++) {
//		for (j = 0; j < size; j++) {
//		scanf("%d", &board[i][j]);
//		}
//	}
//}
//
////检查行
//void line() {
//	for (i = 0; i < size; i++) {
//		for (j = 0; j < size; j++) {
//			if (board[i][j] == 1)numOfX++;
//		}
//		if (numOfX == 3)result = 1;
//		else if (numOfX == 0)result = 0;
//		else result = -1;
//	}
//}
//
////检查列
//void column() {
//	for (j = 0; j < size; j++) {
//		for (i = 0; i < size; i++) {
//			if (board[i][j] == 1)numOfX++;
//		}
//		if (numOfX == 3)result = 1;
//		else if (numOfX == 0)result = 0;
//		else result = -1;
//	}
//}
//
//////检查对角线
////void diagonal() {
////	for 
////}
//

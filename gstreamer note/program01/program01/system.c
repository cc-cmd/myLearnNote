#include <stdlib.h>
#include <stdio.h>

int main(void) {
	//cmd命令：calc计算器 notepad记事本  mspaint画图版
	int value;
	value = 
	system("calc");//有返回值，成功为0，否则为任意数字
	printf("%d\n",value);//%d代表一个占位符，表示输出一个整形数据
	return 0;
}
#include <stdlib.h>
#include <stdio.h>

int main(void) {
	//cmd���calc������ notepad���±�  mspaint��ͼ��
	int value = 
	system("calc");//System�����з���ֵ���ɹ�Ϊ0������Ϊ��������
	printf("%d\n",value);//%d����һ��ռλ������ʾ���һ����������
	return 0;
}
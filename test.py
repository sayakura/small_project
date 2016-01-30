def nchoices(iterable,integer):
	lis = []
	while integer:
		lis.append(randomchoice(iterable))
		integer -= 1
	return lis
int count = 0;
		for(int i = 0; i < word.length(); i++) {
		if(word.charAt(i) != ' ' && (i == 0 || word.charAt(i-1) == ' ')) count++;
		}
		System.out.println(count);

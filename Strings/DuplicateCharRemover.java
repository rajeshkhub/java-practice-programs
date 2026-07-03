String word = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder(word);
		for(int i = 0; i < sb.length(); i++) {
			for(int j = i+1; j < sb.length(); j++) {
				if(Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(j))) {
					sb.deleteCharAt(j);
					j--;
				}
			}
		}
		System.out.print(sb);

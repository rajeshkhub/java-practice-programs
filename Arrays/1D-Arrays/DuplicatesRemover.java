// Remove duplicates
		int[] arr2 = new int[arr.length];
		int fill = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean found = false;
			for(int j = 0; j < fill; j++) {
				if(arr[i] == arr2[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				arr2[fill] = arr[i];
				System.out.print(arr2[fill]+" ");
				fill++;
			}
		}

// Right rotation
		int rotations = sc.nextInt();
		rotations = rotations % size;
		int[] arr2 = new int[size];
		for(int num : arr) {
			if(rotations == size) {
				rotations = 0;
				arr2[rotations] = num;
			}
			else if(rotations < size) {
				arr2[rotations] = num;
			}
			rotations++;
		}

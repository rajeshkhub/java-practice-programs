//First non repeating character
		BOOLEAN FOUND = FALSE;
		FOR(INT I = 0; I < WORD.LENGTH(); I++) {
			FOUND = FALSE;
			FOR(INT J = 0; J < WORD.LENGTH(); J++) {
				IF(I == J) CONTINUE;
					IF(CHARACTER.TOLOWERCASE(WORD.CHARAT(I)) == CHARACTER.TOLOWERCASE(WORD.CHARAT(J))) {
						FOUND = TRUE;
						BREAK;
					}
			}
			IF(!FOUND) {
				SYSTEM.OUT.PRINT(WORD.CHARAT(I));
				BREAK;
			}
		}
		if(found) System.out.print("No non repeating character found");
